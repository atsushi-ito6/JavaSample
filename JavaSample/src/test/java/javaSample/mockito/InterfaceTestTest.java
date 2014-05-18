package javaSample.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class InterfaceTestTest {

	InterfaceTest target = new InterfaceTest();

	@Test
	public void testExec001() {

		String yoto = target.exec(createBusinessContext());
		assertEquals("A", yoto);
	}

	private BusinessContext createBusinessContext(){
		// モック作成
		BusinessContext bc = mock(BusinessContextImpl.class);
		when(bc.getYoto()).thenReturn("A");
		return bc;
	}

}
