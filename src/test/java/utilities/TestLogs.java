package utilities;

import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLogs {

	public static Logger log = Logger.getLogger(TestLogs.class.getName());
	
	public static void main(String[] args) {
		
		Date d = new Date();
		String dd = d.toString().replace(":","_").replace(" ", "_");
		System.out.println(dd);
		
		System.out.println(d);
		
		System.setProperty("current.date", dd);
		PropertyConfigurator.configure("C:/Users/kia.heydari/eclipse-workspace/Log4j1/src/test/resources/properties/log4j.properties");
		log.info("Logger started ......");
		log.error("here is an error occured!!");
		log.info("this is the test for jenkins");
		
		
		
	}
}
