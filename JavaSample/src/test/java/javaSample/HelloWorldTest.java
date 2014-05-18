package javaSample;

import java.io.PrintStream;

import mockit.Expectations;
import mockit.Mocked;

import org.junit.Test;

public class HelloWorldTest {
	@Mocked
	PrintStream mock;

	@Test
	public void test() throws Exception {
		new Expectations() {
			{
				mock.println("Hello, World!");
			}
		};
		HelloWorld.main(new String[0]);
	}
}