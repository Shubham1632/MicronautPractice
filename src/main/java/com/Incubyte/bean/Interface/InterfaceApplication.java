package com.Incubyte.bean.Interface;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
public class InterfaceApplication {
    private final Logger logger;

    InterfaceApplication(Logger logger) {
        this.logger = logger;
    }

    public void process() {
        System.out.println("Processing");
        logger.log();
    }

}
