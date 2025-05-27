package com.nt.main;

import java.time.LocalTime;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DepedencyInjectionTest {
	public static void main(String args[]) {
		
		 
			//FileSystemXmlApplicationContext ctx=
					//new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
			
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
			
			
			
			//Object obj=ctx.getBean("wmg");
			WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
			LocalTime time=ctx.getBean("ltime",LocalTime.class);
			
			String msg=generator.showWishMessage("raja");
			System.out.println(msg);
			System.out.println(time.toString());
			
			ctx.close();
		 
	}

}
