 
package com.nt.sbeans;
import java.time.LocalDate;
 

public class SeasionMessageGenarator {
	 	private LocalDate monthvalue;
		public SeasionMessageGenarator() {
		System.out.println("SessionMessageGenerator::0-param constructor");
		 	
		}
		 
		public void setMonthvalue(LocalDate monthvalue) {
			this.monthvalue = monthvalue;
		}

		
		public String showWishMessage(String user) {
			System.out.println("SessionMessageGenarator.showWishMessage()");
		//LocalDate date=LocalDate.now();
			int month=  monthvalue.getMonthValue();
		if(month>=12 || month<=2)
			return "winter Session"+user;
		else if(month>=3||month<=6)
			return"summer Session"+user;
		else if(month>=7||month<=10)
			return"rain Sessio"+user;
		else
			return"snoge Session"+user;
		 
 	}
 }
