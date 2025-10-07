package in.rizwan.it.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.rizwan.bean.AppConfig;
import in.rizwan.bean.Motor;

public class MyApp {
	public static void main(String[] args) {
		 ApplicationContext contxt = new AnnotationConfigApplicationContext(AppConfig.class);
	Motor m1  = contxt.getBean(Motor.class);
	System.out.println(m1.hashCode());
	Motor m2  = contxt.getBean(Motor.class);
	System.out.println(m2.hashCode());
	
	}

}
