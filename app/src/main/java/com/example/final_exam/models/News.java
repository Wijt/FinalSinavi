package com.example.final_exam.models;

import java.util.Date;

public class News {

    private String title;
    private String description;
    private String url;
    private Date date;

    public News() {

    }

    public News(String title, String description, String url, Date date) {
        this.title = title;
        this.description = description;
        this.url = url;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date=date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
