package utils;

//package com.dmi.qa.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties properties;

    public Properties initProperties() {

        properties = new Properties();

        try {
            FileInputStream ip = new FileInputStream(
                    System.getProperty("user.dir") +
                    "/src/main/resources/config/config.properties");

            properties.load(ip);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;
    }
}

