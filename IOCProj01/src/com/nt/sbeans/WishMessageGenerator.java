package com.nt.sbeans;
import java.time.LocalTime;

public class WishMessageGenerator {
	 	private LocalTime time;
		public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0-param constructor");
		 	
		}
		public void setTime(LocalTime time) {
			System.out.println("WishMessageGenerator.setTime()");
			this.time = time;
		}
		public String showWishMessage(String user) {
			System.out.println("WishMessageGenerator.showWishMessage()");
		int hour= time.getHour();
		if(hour<12)
			return "good Morning:"+user;
		else if(hour<16)
			return"Good AfterNoon:"+user;
		else if(hour<20)
			return"Good evening:"+user;
		else
			return"Good Night:"+user;
		 
 	}
 }
