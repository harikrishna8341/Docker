
package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasionMessageGenarator;

public class DependencyInjectionTest {
	public static void main(String args[]) {
		
		 
			FileSystemXmlApplicationContext ctx=
					new FileSystemXmlApplicationContext("src/com/nt/cfgs/NewFile.xml");
			Object obj=ctx.getBean("smg");
			SeasionMessageGenarator generator=(SeasionMessageGenarator)obj;
			String msg=generator.showWishMessage("");
			System.out.println(msg);
			ctx.close();
		 
	}

}
