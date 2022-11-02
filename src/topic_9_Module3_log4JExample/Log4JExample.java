package topic_9_Module3_log4JExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

public class Log4JExample {
	
  @Test
  public void f(){
	  Logger logger=Logger.getLogger(Log4JExample.class);
        // configure log4j properties file
      PropertyConfigurator.configure("Log4j.properties");
      
      logger.info("Log 4j Example 1");
      
    /*  logger.info("Log 4j Example 2");
      
      logger.info("Log 4j Example 3");*/
	
  }

}
