package com.study.restapi.controler;

import com.study.restapi.apiclass.BestLanguages;
import com.study.restapi.repository.BestLanguagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller {

    @Autowired
    BestLanguagesRepository myBestLanguages;

    @GetMapping("/")
    public Iterable<BestLanguages> ListAllData(){
        var languagesInData = myBestLanguages.findAll();
        return languagesInData;
    }

    @PostMapping("/")
    public void addLanguage(@RequestBody ArrayList<BestLanguages> language){
        myBestLanguages.save(language.get(0));
    }
}
