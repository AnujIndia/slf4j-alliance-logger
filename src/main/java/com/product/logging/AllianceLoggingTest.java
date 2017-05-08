package com.product.logging;

import org.slf4j.Logger;

import com.product.logging.slf4j.impl.AllianceLoggerFactory;
import com.product.logging.slf4j.impl.VersionUtil;

public class AllianceLoggingTest {

	 public static void main(String[] args){
		 AllianceLoggerFactory objAllianceLoggerFactory = new AllianceLoggerFactory();
		 Logger logger = objAllianceLoggerFactory.getLogger("AllianceLoggerFactory");
		 logger.info("Java version is: " + VersionUtil.getJavaMajorVersion());
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				logger.info("This is successful division");
			else
				logger.info("This is unsuccessful division");
		}
	 }
}
