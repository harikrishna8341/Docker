package com.nt.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("df")
public class DayFinder {
	
private LocalDate date;

public DayFinder() {
	
	System.out.println("DayFinder.DayFinder()");
	
}
@Autowired
public void setDate(LocalDate date) {
System.out.print("set method");
this.date=date;
}
	
public String showDayName()
{
	System.out.println("DayFinder.showDayName()");
    DayOfWeek day=date.getDayOfWeek();
    
    
    if(day==DayOfWeek.SATURDAY || day==DayOfWeek.SUNDAY)
      return"is a weekend";
    else
    	return "is a weekday";
    	 
	
    
}
}
