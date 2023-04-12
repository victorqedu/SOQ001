package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Subject {
    private String text = "TEST";
    public String getText() {return text;}
    public void setText(String text) {this.text = text;}
}
