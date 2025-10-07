package in.rizwan.bean;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext contxt= new ClassPathXmlApplicationContext("spring-beans.xml");
	
	  Motor motor = contxt.getBean(Motor.class);
	  motor.doWork();
	
	 ConfigurableApplicationContext cfgcontxt=(ConfigurableApplicationContext)contxt;
	// cfgcontxt.registerShutdownHook();
	 cfgcontxt.close();
	}

}
