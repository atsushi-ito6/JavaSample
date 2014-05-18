package javaSample;

import mockit.Mocked;

import org.junit.Test;


public class ChildTest {

    @Mocked
    private Child child;

    @Test
    public void test() {
        System.out.println("instanceMethod() = " + child.instanceMethod());
        System.out.println("parentInstanceMethod() = " + child.parentInstanceMethod());
        System.out.println("classMethod() = " + Child.classMethod());
        System.out.println("Child.parentClassMethod() = " + Child.parentClassMethod());
        System.out.println("Parent.parentClassMethod() = " + Parent.parentClassMethod());
    }
//	@Test
//	public void testClassMethod() {
//		fail("まだ実装されていません");
//	}
//
//	@Test
//	public void testInstanceMethod() {
//		fail("まだ実装されていません");
//	}
//
//	@Test
//	public void testFinalInstanceMethod() {
//		fail("まだ実装されていません");
//	}

}
