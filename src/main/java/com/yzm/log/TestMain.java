package com.yzm.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMain {

    public static void main(String[] args) {

    //    Logger log = LoggerFactory.getLogger("MY_LOGGER");

        Logger log = LoggerFactory.getLogger("com.testlog");

        log.info("info-log");

        log.error("error-log");


    }

}
