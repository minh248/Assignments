package com.vti.frontend;

import com.vti.utils.IOManger;

import java.util.ArrayList;

public class Program4 {
    public static void main(String[] args) throws Exception {
        String path1 = "src\\com\\vti\\frontend\\data1.txt";
        String path2 = "src\\com\\vti\\frontend\\data2.txt";

        // read File
        System.out.println(IOManger.readFile(path1));

        // write File
        IOManger.writeFile(path1, "1234567890", true);

        // create Object
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        // read Object
        System.out.println(IOManger.readObject(path2));

        // write Object
        IOManger.writeObject(arr, path2);

    }
}