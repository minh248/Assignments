package com.vti.entity;

public class News implements INews{
    private int id;
    private String title;
    private String pulishDate;
    private String author;
    private String content;
    private float averageRate;

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

    public String getPulishDate() {
        return pulishDate;
    }

    public void setPulishDate(String pulishDate) {
        this.pulishDate = pulishDate;
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

    @Override
    public void Display() {
        System.out.println("title='" + title + '\'' +
                ", pulishDate='" + pulishDate + '\'' +
                ", content='" + content + '\'' +
                ", averageRate=" + averageRate);
    }

    @Override
    public float Calculate() {

        return 0;
    }
}
