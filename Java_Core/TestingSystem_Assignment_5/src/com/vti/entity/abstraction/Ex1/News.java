package com.vti.entity.abstraction.Ex1;

public class News implements INews{
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    private int[] rates;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String pulishDate) {
        this.publishDate = pulishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public void setRates(int[] rates) {
        this.rates = rates;
    }

    @Override
    public void display() {
        System.out.println("title='" + title + '\'' +
                ", pulishDate='" + publishDate + '\'' +
                ", content='" + content + '\'' +
                ", averageRate=" + averageRate);
    }

    @Override
    public float calculate() {
        averageRate = (float) (rates[0] + rates[1] + rates[2]) / 3;
        return averageRate;
    }
}
