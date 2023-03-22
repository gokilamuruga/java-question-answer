package org.org;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class convertstringtoDat75 {
	
public static void main(String[] args)	{

	 try {
			String dateString = "25-Mar-2023";
			  DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
			  Date date = df.parse(dateString);
			  System.out.println("Date: " + date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	  
	
}
}
	 
	 
 

	

