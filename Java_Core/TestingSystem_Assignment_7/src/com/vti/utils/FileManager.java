package com.vti.utils;

import java.io.File;

public class FileManager {

    private static final String FILE_EXISTS = "File exists";
    private static final String CREATE_FILE_SUCCESFULLY = "Create file succesfully";
    private static final String CREATE_FILE_FAIL = "Create file fail";
    private static final String FILE_NOT_EXISTS = "Error! File Not Exist.";
    private static final String DELETE_FILE_SUCCESFULLY = "Delete file succesfully";
    private static final String PATH_NOT_FOLDER = "Path is not a folder";

    // Question 1:Check File exits
    public static boolean isFileExists(String filePath){
        return new File(filePath).exists();
    }

    public static boolean isFolderExists(String pathFolder){
        return new File(pathFolder).isDirectory();
    }

    // Question 2: Create new File
    public static void createNewFile(String pathFile) throws Exception {
        if (isFileExists(pathFile)){
            throw new Exception(FILE_EXISTS);
        }

        System.out.println(new File(pathFile).createNewFile() ? CREATE_FILE_SUCCESFULLY : CREATE_FILE_FAIL);
    }

    // Question 4: Delete File
    public static void deleteFile(String pathFile) throws Exception {
        if (!isFileExists(pathFile)){
            throw new Exception(FILE_NOT_EXISTS);
        }

        System.out.println(new File(pathFile).delete() ? DELETE_FILE_SUCCESFULLY : FILE_EXISTS);
    }

    // Question 5: Check Folder exists
    public static boolean isFolder(String pathFolder) throws Exception{
        return new File(pathFolder).isDirectory();
    }

    // Question 6: Get all File name of Folder
    public static String getAllFileOfFolder(String pathFolder) throws Exception{
        File file = new File(pathFolder);

        if(isFolder(pathFolder)){
            throw new Exception(PATH_NOT_FOLDER);
        }

        return "s";
    }
}
