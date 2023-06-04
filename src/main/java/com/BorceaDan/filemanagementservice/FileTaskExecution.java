package com.BorceaDan.filemanagementservice;

import java.io.File;

public class FileTaskExecution {
    public static void main(String[] args) {
        File fileObject = new File("src/main/java/com/BorceaDan/filemanagementservice/test.txt");

        FileManager.informIfTheFileExists(fileObject);
        FileManager.createTheFileIfDoesNotExist(fileObject);
        FileManager.informIfTheFileExists(fileObject);
        FileManager.printIfTheFileIsADirectoryOrNot(fileObject);
        FileManager.printTheFileAbsolutPath(fileObject);
        FileManager.printTheFileName(fileObject);
        FileManager.deleteTheFileIfExists(fileObject);

        String filePath = "src/main/java/com/BorceaDan/filemanagementservice/testOutput.txt";
        OutputFileWriterManager.writeContentIntoFileUsingFileWriter(filePath, "Continut 1");
        OutputFileWriterManager.writeContentIntoFileUsingBufferWriter(filePath, "Continut 2");

        File fileObjectUsedForReading = new File(filePath);
        InputFileReadManager.printDataFromAFileUsingBufferReader(fileObjectUsedForReading);
        InputFileReadManager.printDataFromAFileUsingFiles(fileObjectUsedForReading);
        InputFileReadManager.printDataFromAFile(fileObjectUsedForReading);
    }
}
