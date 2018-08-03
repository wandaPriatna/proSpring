package com.chap2.coretask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chap2part1.coretask.Battery;

public class MainCh2 {
	
	 public static void main(String[] args) {
	        ApplicationContext context = 
	            new ClassPathXmlApplicationContext("beans.xml");

	        SequenceGenerator generator =
	            (SequenceGenerator) context.getBean("sequenceGenerator");

	        System.out.println(generator.getSequence());
	        System.out.println(generator.getSequence());
	        System.out.println(generator.getSequence());
	        System.out.println(generator.getSequence());
	        System.out.println(generator.getSequence());
	        
	        Battery bat = (Battery) context.getBean("aaa");
	        System.out.println(bat);
	 }

}
