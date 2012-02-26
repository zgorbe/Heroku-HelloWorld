package com.epam.heroku;

import org.apache.log4j.Logger;

public class OneOffProcess {
	
	private static Logger logger = Logger.getLogger(OneOffProcess.class);
	
	public static void main(String[] args) {
		logger.info("OneOffProcess executed.");
	}
}
