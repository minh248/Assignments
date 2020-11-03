package com.vti.backend;

import com.vti.entity.abstraction.question1.News;

import java.util.ArrayList;
import java.util.Scanner;

public class MyNews {
    private ArrayList<News> newsList;

    public MyNews() {
        newsList = new ArrayList<>();
    }

    public void insertNews() {
        News news = new News();
        int[] rates = new int[3];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Title: ");
        news.setTitle(scanner.nextLine());

        System.out.println("Publish Date: ");
        news.setPublishDate(scanner.nextLine());

        System.out.println("Author: ");
        news.setAuthor(scanner.nextLine());

        System.out.println("Content: ");
        news.setContent(scanner.nextLine());

        System.out.println("Ddd 3 reviews: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Review " + (i + 1) + ": ");
            rates[i] = scanner.nextInt();
        }
        news.setRates(rates);

        newsList.add(news);
    }

    public void viewListNews() {
        for (News news : newsList) {
            news.display();
        }
    }

    public void averageRate() {
        for (News news : newsList) {
            System.out.println("Title: " + news.getTitle() + " / Average Rate: " + news.calculate());
        }
    }
}
