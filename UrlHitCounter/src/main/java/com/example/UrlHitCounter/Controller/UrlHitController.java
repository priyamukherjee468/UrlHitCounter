package com.example.UrlHitCounter.Controller;

import com.example.UrlHitCounter.Service.UrlHitService;
import com.example.UrlHitCounter.Model.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping("api/v1/visitor-count-app")
    public class UrlHitController {
        private  UrlHitService urlHitService; // dependency injection

        public UrlHitController(UrlHitService urlHitService) {
            this.urlHitService=urlHitService;
        }
        @GetMapping("/username/{username}/count")
        public Model getCount(@PathVariable String username) {
            Model model=urlHitService.getModel(username);
            return model;
        }
    }



