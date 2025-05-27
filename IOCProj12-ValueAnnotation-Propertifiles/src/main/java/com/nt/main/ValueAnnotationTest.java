package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.config.AppConfig;
import com.nt.sbeans.PersonalInfo;

public class ValueAnnotationTest {

	public static void main(String[] args) {
	 
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		PersonalInfo info=ctx.getBean("pInfo",PersonalInfo.class);
		System.out.println(info);
		
		
		Environment env=ctx.getEnvironment();
		System.out.println("os.name::"+env.getProperty("os.name"));
		
		
		

		ctx.close();
		
	}

}
