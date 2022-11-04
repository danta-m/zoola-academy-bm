package com.zoolatech.lecture3.tasks._4;

public class CsvReporter extends Reporter {
    public CsvReporter(String headerData, String fileData, String fileName) {
        super(headerData, fileData, fileName);
    }

    @Override
    void createNewFile() {
        System.out.println("\nCreate a new file: " + fileName + ".csv");
    }

    @Override
    void addHeaderData() {
        System.out.println("Add header: \"" + headerData + "\" to file: " + fileName + ".csv");
    }

    @Override
    void addFileData() {
        System.out.println("Add file details: \"" + fileData + "\" in " + "CSV" + " format");
    }

    @Override
    void close() {
        System.out.println("Close file " + fileName + ".csv");
    }
}