package in.rizwan.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import in.rizwan.bean.Car;

public class App {
	public static void main(String[] args) {
		
		
	
		 ApplicationContext contxt = new  ClassPathXmlApplicationContext("Beans.xml");
	 Car b1= contxt.getBean(Car.class);
	 b1.drive();
	
	}

}
