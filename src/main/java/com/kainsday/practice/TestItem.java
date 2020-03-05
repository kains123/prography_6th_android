package com.kainsday.practice;


public class TestItem {

    int num;
    String title;
    String director;
    String release_date;

    public TestItem(int num, String title, String director, String release_date) {
        this.num = num;
        this.title = title;
        this.director = director;
        this.release_date = release_date;
    }


    public  int getNum() {return num; }

    public  void setNum(int num) {this.num = num;}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }
}

