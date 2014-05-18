package javaSample.jmockit;

import static org.junit.Assert.*;
import mockit.Deencapsulation;
import mockit.Expectations;
import mockit.Mocked;

import org.junit.Before;
import org.junit.Test;

public class PersonServiceImplTest {

    // テスト対象クラス
    PersonServiceImpl target = new PersonServiceImpl();

    // テスト対象クラスの動作に必要なフィクスチャ

    // PersonDaoのモックフィールド
    // モックオブジェクトは自動的に生成されてこのフィールドにインジェクションされる。
    @Mocked
    PersonDao personDao;

    // モック化されない普通のオブジェクト
    Person person = new Person();

    @Before
    public void setUp() throws Exception {
        // テスト対象クラスにモックDAOをインジェクションする。
        // ここではJMockitのリフレクションユーティリティを使ってprivateフィールドに設定している。
        Deencapsulation.setField(target, personDao);

        // パラメーターオブジェクトを初期化
        person.setAge(30);
        person.setName("test");
    }

    @Test
    public void persistPerson() {
        // モックオブジェクトに対して期待動作を宣言
        new Expectations() {{
            personDao.persist(person); result = 1L;
        }};

        // テスト対象クラスの呼び出し
        target.persistPerson(person);

        // テスト呼出し後の確認
        assertEquals(1L, (long)person.getId());

        // モックオブジェクトが期待通り呼び出されたことは自動的にベリファイされる。
    }
}