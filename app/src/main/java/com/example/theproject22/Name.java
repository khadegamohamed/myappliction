package com.example.theproject22;

import java.util.ArrayList;

public class Name {
 private String sub_name;

private ArrayList<String>lectures;
private ArrayList<byte[]>picture;

    public Name(String sub_name) {
        this.sub_name = sub_name;
    }

    public Name(String sub_name, ArrayList<String> lectures, ArrayList<byte[]> picture) {
      this.sub_name=sub_name;
        this.lectures = lectures;
        this.picture = picture;
    }

    public String getSub_name() {
        return sub_name;
    }

    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }

    public ArrayList<String> getLectures() {
        return lectures;
    }

    public void setLectures(ArrayList<String> lectures) {
        this.lectures = lectures;
    }

    public ArrayList<Integer> getPicture() {
        return picture;
    }

    public void setPicture(ArrayList<Integer> picture) {
        this.picture = picture;
    }
}
