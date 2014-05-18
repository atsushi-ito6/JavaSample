package javaSample.mockito;

public class BusinessContextImpl implements BusinessContext {

	private String yoto;

	public void setYoto(String yoto) {
		this.yoto = yoto;
	}

	@Override
	public String getYoto() {
		return yoto;
	}

}
