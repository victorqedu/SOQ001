package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    public String test(SearchTest st) {
        return st.runTest();
    }
}
