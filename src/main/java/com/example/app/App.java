package com.example.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.StringUtils;

public class App {

    private static final Logger logger =
            LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        logger.info("Application Started");

        try {

            String name = "DevOps Engineer";

            String message = greet(name);

            logger.info("Generated Message: {}", message);

            System.out.println(message);

        } catch (IllegalArgumentException e) {

            logger.error("Exception Occurred: {}", e.getMessage());

        } finally {

            logger.info("Application Finished");
        }
    }

    public static String greet(String name) {

        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException(
                    "Name cannot be null or empty"
            );
        }

        return String.format(
                "Hello, %s! Welcome to Advanced Maven CI/CD Demo.",
                name
        );
    }
}
