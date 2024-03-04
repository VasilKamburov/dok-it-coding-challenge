package com.charadesvk.charadesdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.charadesvk.charadesdemo.models.Word;
import com.charadesvk.charadesdemo.repositories.IWordRepository;
import com.charadesvk.charadesdemo.services.interfaces.IWordService;

@Service
public class WordService implements IWordService {
    @Autowired
    private IWordRepository repository;

    @Override
    public Word create(String word, String description) {
        Word newWord = new Word(word, description);
        return repository.save(newWord);
    }
}
