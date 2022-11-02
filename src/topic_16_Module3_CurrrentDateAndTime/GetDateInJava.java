package topic_16_Module3_CurrrentDateAndTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class GetDateInJava {
	
	@Test
	public void f(){
		Date date=new Date();
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		String Currentdate=df.format(date);
		System.out.println("Current Date in System: "+ Currentdate);
	}

}
