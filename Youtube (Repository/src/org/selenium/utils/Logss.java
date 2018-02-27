package org.selenium.utils;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Logss {
	
	public static void take_logs(String message, String classname)
	{
		DOMConfigurator.configure(".\\logss.xml");
		Logger l = Logger.getLogger(classname);
		l.info(message);		
	}

}
