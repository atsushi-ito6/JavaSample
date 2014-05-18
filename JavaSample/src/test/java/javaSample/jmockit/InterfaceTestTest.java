package javaSample.jmockit;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterfaceTestTest {
    // テスト対象クラス
	InterfaceTest target = new InterfaceTest();

	@Test
	public void testExec() {
		target.exec(null);
		fail("まだ実装されていません");
	}

}
