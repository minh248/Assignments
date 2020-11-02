package com.vti.frontend;

import com.vti.backend.MyNews;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class AbstractionProgram_1 {
    public static void main(String[] args) {
        // Question 1
        Scanner scanner = new Scanner(System.in);

        MyNews myNews = new MyNews();

        int c = 0;
        do{
            System.out.println("Menu");
            System.out.println("1. Insert news|2. View list news|3. Average rate| 4. Exit");
            c = scanner.nextInt();

            switch (c){
                case 1:
                    myNews.insertNews();
                    break;
                case 2:
                    myNews.viewListNews();
                    break;
                case 3:
                    myNews.averageRate();
                    break;
                default:
                    System.exit(1);
                    break;
            }

        } while(c != 0);
    }
}
