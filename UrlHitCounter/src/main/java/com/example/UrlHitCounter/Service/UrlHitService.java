package com.example.UrlHitCounter.Service;

import com.example.UrlHitCounter.Model.Model;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlHitService {
    static Map<String,Integer> map=new HashMap<>();
    public Model getModel(String username) { // business logic

        int count=map.getOrDefault(username,0)+1;
        map.put(username,count);

        Model model=new Model(username,count);
        return model;
    }
}

