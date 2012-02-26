package com.epam.heroku;

import org.apache.log4j.Logger;

public class WorkerProcess {

	private static Logger logger = Logger.getLogger(WorkerProcess.class);

	private static void executeJob() {
		logger.info("Executing job...");
	}
	
	public static void main(String[] args) {
		while (true) {
			try {
				executeJob();
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				logger.error("Exception: " + e);
			}
		}
	}
}
