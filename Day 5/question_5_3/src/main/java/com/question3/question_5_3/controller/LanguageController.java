package com.question3.question_5_3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.question3.question_5_3.model.Language;
import com.question3.question_5_3.service.LanguageService;


@RestController
public class LanguageController {
    @Autowired
    public LanguageService languageService;
    @PostMapping("/language")
    public Language postMethodName(@RequestBody Language language) {
        return languageService.saveLanguage(language);
    }
    @GetMapping("/language")
    public List<Language> getMethodName() {
        List<Language> list =  languageService.getLanguages();
        return list;
    }
    @GetMapping("/language/{languageId}")
    public Language getlangauge(@PathVariable("languageId") int id) {
        Language l =  languageService.getLanguageById(id);
        return l;
    }
    
    @PutMapping("/language/{languageId}")
    public Language putMethodName(@PathVariable int id, @RequestBody Language language) {
        return languageService.updateLanguage(id,language);
    }

    @DeleteMapping("/language/{languageId}")
    public void delete(@PathVariable("languageId") int id)
    {
        languageService.deleteLanguage(id);
    }
    

}
