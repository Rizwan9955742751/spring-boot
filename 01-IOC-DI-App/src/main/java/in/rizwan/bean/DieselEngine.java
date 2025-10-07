package in.rizwan.bean;

public class DieselEngine implements Iengine {
	public DieselEngine()
	{
		System.out.println("Diesel Engine Constructor");
	}

	@Override
	public int start() {
		System.out.println("Diesel Engine Started ");
		return 1;
	}

}
