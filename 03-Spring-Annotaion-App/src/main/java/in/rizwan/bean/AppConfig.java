package in.rizwan.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"in.rizwan"})
public class AppConfig {
	
public 	AppConfig ()
	{
		System.out.println("appconfig constructor");
	}
@Bean
 public Robot robotObj()
 {
	   return new Robot();
 }
}
