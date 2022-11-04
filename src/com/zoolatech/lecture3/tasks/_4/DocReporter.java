package com.zoolatech.lecture3.tasks._4;

public class DocReporter extends Reporter {

    public DocReporter(String headerData, String fileData, String fileName) {
        super(headerData, fileData, fileName);
    }

    @Override
    void createNewFile() {
        System.out.println("\nCreate a new file: " + fileName + ".doc");
    }

    @Override
    void addHeaderData() {
        System.out.println("Add header: \"" + headerData + "\" to file: " + fileName + ".doc");
    }

    @Override
    void addFileData() {
        System.out.println("Add file details: \"" + fileData + "\" in " + "DOC" + " format");
    }

    @Override
    void close() {
        System.out.println("Close file " + fileName + ".doc");
    }
}