package com.vti.utils;

import java.io.*;

public class IOManger {
    public static String readFile(String pathFile) throws Exception {
        if(!FileManager.isFileExists(pathFile)){
            throw new Exception(FileManager.FILE_NOT_EXISTS);
        }

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(pathFile);
            byte[] b = new byte[1024];
            int length = fileInputStream.read(b);

            String content = "";
            while (length != -1){
                content = new String(b, 0 , length);
                length = fileInputStream.read(b);
            }

            return content;
        }finally {
            // close
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }
    }

    public static void writeFile(String pathFile, String content, boolean isContinuing) throws Exception {

        // Check file exists
        if (!FileManager.isFileExists(pathFile)) {
            throw new Exception(FileManager.FILE_NOT_EXISTS);
        }

        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(pathFile, isContinuing);
            fileOutputStream.write(content.getBytes());

        } finally {
            // close file
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }

    // read object
    public static Object readObject(String pathFile) throws Exception {

        // Check file exists
        if (!FileManager.isFileExists(pathFile)) {
            throw new Exception(FileManager.FILE_NOT_EXISTS);
        }

        // Read File
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            fileInputStream = new FileInputStream(new File(pathFile));
            objectInputStream = new ObjectInputStream(fileInputStream);

            return objectInputStream.readObject();

        } finally {
            // close file
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (objectInputStream != null) {
                objectInputStream.close();
            }
        }
    }

    // write object
    public static void writeObject(Object object, String pathFile) throws Exception {

        // Write file
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(pathFile);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(object);

        } finally {
            // Close file
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
        }
    }
}
