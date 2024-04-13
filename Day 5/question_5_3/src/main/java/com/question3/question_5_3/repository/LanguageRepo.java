package com.question3.question_5_3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.question3.question_5_3.model.Language;

public interface LanguageRepo extends JpaRepository<Language,Integer>{
    
}
