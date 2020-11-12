package com.vti.utils;

import java.io.FileInputStream;

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
            fileInputStream.close();
        }

//        try (FileInputStream fileInputStream = new FileInputStream(pathFile)) {
//            byte[] b = new byte[1024];
//            int length = fileInputStream.read(b);
//
//            String content = "";
//            while (length != -1) {
//                content = new String(b, 0, length);
//
//                length = fileInputStream.read(b);
//            }
//
//            return content;
//        }
    }
}
