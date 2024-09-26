package com.example.demo.model;
import java.io.Serializable;

public class Message implements Serializable {

    private final String text;
    public Message (String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
}