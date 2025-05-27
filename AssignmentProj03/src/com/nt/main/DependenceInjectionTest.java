package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.DayFinder;



public class DependenceInjectionTest {

	public static void main(String args[]) {
		
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
	   Object obj=ctx.getBean("df");
	   DayFinder df=(DayFinder)obj;
	   String msg=df.showDayName();
	   System.out.println( "Day::"+msg);
	   
	   
	   ctx.close();
	   
	   
	   
	}
	
}
