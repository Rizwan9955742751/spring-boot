package in.rizwan.bean;

public class PetrolEngine implements Iengine {
	public PetrolEngine ()
	{
		System.out.println("Petrol engine :: Constructor ");
	}

	@Override
	public int start() {
		System.out.println("Petrol engine Started.......");
		return 1;
	}

}
