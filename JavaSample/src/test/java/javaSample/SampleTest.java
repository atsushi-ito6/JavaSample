package javaSample;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest {

	@Test
	public void testNum() {
		int result = Sample.num();
		assertEquals(10, result);
	}

}
