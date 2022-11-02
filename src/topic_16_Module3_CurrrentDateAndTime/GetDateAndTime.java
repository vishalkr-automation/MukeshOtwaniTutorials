package topic_16_Module3_CurrrentDateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class GetDateAndTime {

	@Test
	public void f(){
		Date date=new Date();
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String CurrentdateAndTime=df.format(date);
		System.out.println("Current Date in System: "+ CurrentdateAndTime);
	}
}
