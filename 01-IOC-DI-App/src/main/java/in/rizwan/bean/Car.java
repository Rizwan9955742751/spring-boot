package in.rizwan.bean;

public class Car {
	 private Iengine eng;
	  
	 
	 public void setEng(Iengine eng)
	 {
		 System.out.println("set Engine method is called ");
		 this.eng = eng;
	 }
	 public Car(Iengine eng)
	 {
		 this.eng = eng;
	 }
	  public void drive()
	  {
		  int status = eng.start();
		  if(status>=1)
		  {
			  System.out.println("You are ready to drive the car ->");
		  }
		  else {
			  System.out.println("Trouble in the engine ");
		  }
	  }

}
