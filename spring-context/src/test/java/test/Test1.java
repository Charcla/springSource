package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext("org.springframework.context.config");
		applicationContext.getBean("");
	}
}
