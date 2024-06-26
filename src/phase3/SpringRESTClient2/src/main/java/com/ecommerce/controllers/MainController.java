package com.ecommerce.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.beans.Quote;

@Controller
public class MainController {

         @RequestMapping("/")
          @ResponseBody
          public String index() {
                 
                 RestTemplate restTemplate = new RestTemplate();
             String response = restTemplate.getForObject("https://type.fit/api/quotes", String.class);
                
            return response.toString();
          }
           
        
}
