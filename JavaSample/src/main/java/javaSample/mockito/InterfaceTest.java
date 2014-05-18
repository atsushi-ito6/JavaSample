package javaSample.mockito;

public class InterfaceTest {

	public String exec(BusinessContext bc) {
		String yote = bc.getYoto();
		System.out.println("用途："+yote);
		return yote;
	}
}
