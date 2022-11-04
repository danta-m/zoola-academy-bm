package com.zoolatech.lecture3.tasks._4;

public abstract class Reporter {
    String headerData;
    String fileData;
    String fileName;

    public Reporter(String headerData, String fileData, String fileName) {
        this.headerData = headerData;
        this.fileData = fileData;
        this.fileName = fileName;
    }

    void generate() {
        createNewFile();
        addHeaderData();
        addFileData();
        close();
    }

    abstract void createNewFile();

    abstract void addHeaderData();

    abstract void addFileData();

    abstract void close();
}