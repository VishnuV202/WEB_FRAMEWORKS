package com.question3.question_5_3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question3.question_5_3.model.Language;
import com.question3.question_5_3.repository.LanguageRepo;



@Service
public class LanguageService {
    @Autowired
    public LanguageRepo languageRepo;

    public Language saveLanguage(Language language)
    {
        return languageRepo.save(language);

    }
    public List<Language> getLanguages()
    {
        return languageRepo.findAll();
    }
    public Language updateLanguage(int id,Language language)
    {
        return languageRepo.save(language); 
    }
    public void deleteLanguage(int id)
    {
        languageRepo.deleteById(id);
    }
    public Language getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }

}
