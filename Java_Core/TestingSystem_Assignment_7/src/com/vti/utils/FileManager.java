package com.vti.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class FileManager {

    private static final String FILE_EXISTS = "File Exists.";
    private static final String CREATE_FILE_SUCCESSFULLY = "Create File Successfully.";
    private static final String CREATE_FILE_FAIL = "Create File Fail.";
    private static final String FILE_NOT_EXISTS = "Error! File Not Exist.";
    private static final String DELETE_FILE_SUCCESSFULLY = "Delete File Successfully.";
    private static final String PATH_NOT_FOLDER = "Error! Path Is Not Folder.";
    private static final String SOURCE_FILE_NOT_EXISTS = "Error! Source File Does Not Exist.";
    private static final String DESTINATION_FILE_EXISTS = "Error! Destination File Exist.";
    private static final String FILE_NAME_EXISTS = "Error! Name is Exist.";
    private static final String RENAME_FILE_SUCCESSFULLY = "Rename File Successfully.";
    private static final String RENAME_FILE_FAIL = "Rename File Fail.";
    private static final String FOLDER_EXISTS = "Folder Exists.";
    private static final String CREATE_FOLDER_SUCCESSFULLY = "Create Folder Successfully.";
    private static final String CREATE_FOLDER_FAIL = "Create Folder Fail.";
    ;

    // Question 1:Check File exits
    public static boolean isFileExists(String filePath) {
        return new File(filePath).exists();
    }

    public static boolean isFolderExists(String pathFolder) {
        return new File(pathFolder).isDirectory();
    }

    // Question 2: Create new File
    public static void createNewFile(String pathFile) throws Exception {
        if (isFileExists(pathFile)) {
            throw new Exception(FILE_EXISTS);
        }

        System.out.println(new File(pathFile).createNewFile() ? CREATE_FILE_SUCCESSFULLY : CREATE_FILE_FAIL);
    }

    // Question 4: Delete File
    public static void deleteFile(String pathFile) throws Exception {
        if (!isFileExists(pathFile)) {
            throw new Exception(FILE_NOT_EXISTS);
        }

        System.out.println(new File(pathFile).delete() ? DELETE_FILE_SUCCESSFULLY : FILE_EXISTS);
    }

    // Question 5: Check Folder exists
    public static boolean isFolder(String pathFolder) throws Exception {
        return new File(pathFolder).isDirectory();
    }

    // Question 6: Get all File name of Folder
    public static List<String> getAllFileOfFolder(String pathFolder) throws Exception {
        File file = new File(pathFolder);

        if (isFolder(pathFolder)) {
            throw new Exception(PATH_NOT_FOLDER);
        }
        // TODO check this
        return Arrays.asList(file.list());
    }

    // Questino 7: Copy File
    // with new name
    public static void copyFile(String sourceFile, String destinationPath) throws Exception {
        if (!isFileExists(sourceFile)) {
            throw new Exception(SOURCE_FILE_NOT_EXISTS);
        }

        String destinationFile = destinationPath + "//" + new File(sourceFile).getName();

        if (isFileExists(destinationFile)) {
            throw new Exception(DESTINATION_FILE_EXISTS);
        }

        Files.copy(new File(sourceFile).toPath(), new File(destinationPath).toPath());
    }

    // with current name
    public static void copyFile(String sourceFile, String destinationPath, String newName) throws Exception {
        if (!isFileExists(sourceFile)) {
            throw new Exception(SOURCE_FILE_NOT_EXISTS);
        }

        String destinationFile = destinationPath + "//" + newName;

        if (isFileExists(destinationFile)) {
            throw new Exception(DESTINATION_FILE_EXISTS);
        }

        Files.copy(new File(sourceFile).toPath(), new File(destinationPath).toPath());
    }

    // Question 8: Moving File
    public static void moveFile(String sourceFile, String destinationPath) throws Exception {
        if (!isFileExists(sourceFile)) {
            throw new Exception(SOURCE_FILE_NOT_EXISTS);
        }

        String[] s = sourceFile.split("/");
        String nameFile = s[s.length - 1];

        String destinationFile = destinationPath + "//" + nameFile;

        if (isFileExists(destinationFile)) {
            throw new Exception(DESTINATION_FILE_EXISTS);
        }

        Files.move(new File(sourceFile).toPath(), new File(destinationPath).toPath());

    }

    // Question 9: Rename File
    public static void renameFile(String pathFile, String newName) throws Exception {
        if (!isFileExists(pathFile)) {
            throw new Exception(SOURCE_FILE_NOT_EXISTS);
        }

        if (!isFileExists(newName)) {
            throw new Exception(FILE_NAME_EXISTS);
        }

        File oldFile = new File(pathFile);
        File newFile = new File(newName);

        System.out.println(oldFile.renameTo(newFile) ? RENAME_FILE_SUCCESSFULLY : RENAME_FILE_FAIL);
    }

    // Question 10: Create new Folder
    public static void createNewFolder(String newPathFolder) throws Exception {
        if (isFolderExists(newPathFolder)) {
            throw new Exception(FOLDER_EXISTS);
        }

        System.out.println(new File(newPathFolder).mkdir() ? CREATE_FOLDER_SUCCESSFULLY : CREATE_FOLDER_FAIL);
    }

    // Question 11: Download File
    public static void downloadFile(String fileLink, String pathFolder) throws Exception {

        if (!isFolderExists(pathFolder)) {
            createNewFolder(pathFolder);
        }

        // get name file
        String s[] = fileLink.split("/");
        String name = s[s.length - 1];

        String pathFile = pathFolder + "//" + name;

        // connect to URL
        URL url = new URL(fileLink);
        URLConnection connection = url.openConnection();

        // get size of file
        int size = connection.getContentLength();

        // read file from internet
        InputStream inputStream = connection.getInputStream();

        // save file
        FileOutputStream output = new FileOutputStream(pathFile);
        int byteDownload = 0;
        byte[] b = new byte[1024];
        // get length
        int length = inputStream.read(b);
        while (length != -1) {

            byteDownload += length;
            System.out.println(byteDownload * 100f / size + "%");

            // write content downloaded from 0 -> length to ouput
            output.write(b, 0, length);
            length = inputStream.read(b);
        }

        // close
        output.close();
        inputStream.close();
        System.out.println("Download success");
    }
}
