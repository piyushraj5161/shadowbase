package com.shadowbase;

public class DatabaseConfig {

    public static final String DATABASE_NAME = "shadowbase";

    public static void showConfig() {
        System.out.println("Database: " + DATABASE_NAME);
        System.out.println("Schema Migration Ready!");
    }
}
