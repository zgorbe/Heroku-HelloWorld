package com.epam.heroku;

import org.apache.log4j.Logger;

public class WorkerProcess {

	private static final Logger LOGGER = Logger.getLogger(WorkerProcess.class);

	private static void executeJob() {
		LOGGER.info("Executing job...");
	}
	
	public static void main(String[] args) {
		while (true) {
			try {
				executeJob();
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				LOGGER.error("Exception: " + e);
			}
		}
	}
}
