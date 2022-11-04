package com.zoolatech.lecture3.tasks._4;

public class PdfReporter extends Reporter {

    public PdfReporter(String headerData, String fileData, String fileName) {
        super(headerData, fileData, fileName);
    }

    @Override
    void createNewFile() {
        System.out.println("\nCreate a new file: " + fileName + ".pdf");
    }

    void addHeaderData() {
        System.out.println("Add header: \"" + headerData + "\" to file: " + fileName + ".pdf");
    }

    @Override
    void addFileData() {
        System.out.println("Add file details: \"" + fileData + "\" in " + "PDF" + " format");
    }

    @Override
    void close() {
        System.out.println("Close file " + fileName + ".pdf");
    }
}