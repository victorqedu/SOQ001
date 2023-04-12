package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SearchBase {
    Subject subject;
    
    @Autowired
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String runTest() {
        return subject.getText();
    }
}
