package in.rizwan.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Motor  implements InitializingBean,DisposableBean{
	public Motor()
	{
		System.out.println("Motor Constructor");
	}
	@Override
	 public void afterPropertiesSet() throws Exception {
		System.out.println("motor started ");
		
	 }

 public void doWork()
 {
	 System.out.println("Water Pulling ");
 }

 @Override
 public void destroy() throws Exception {
	System.out.println("Motor stop now ");
	
 }

 
}
