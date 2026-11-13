package com.shadowbase;

public class MigrationService {

    public void migrateSchema() {
        System.out.println("Starting Schema Migration...");

        System.out.println("Old Schema -> New Schema");

        System.out.println("Migration Completed Successfully!");
    }

    public static void main(String[] args) {
        MigrationService service = new MigrationService();
        service.migrateSchema();
    }
}
