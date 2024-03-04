package com.charadesvk.charadesdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.charadesvk.charadesdemo.models.Word;
import com.charadesvk.charadesdemo.models.dtos.WordInnerDto;
import com.charadesvk.charadesdemo.services.interfaces.IWordService;

@RestController
@RequestMapping("/api/v1/words")
public class WordController {
    @Autowired
    private IWordService service;

    @PostMapping("/add")
    public Word addWord(
        @RequestBody() WordInnerDto dto
    ) {
        return service.create(dto.getWord(), dto.getDescription());
    } 

    @PutMapping("/modify-description")
    public Word modifyDescription(
        @RequestBody() WordInnerDto dto
    ) {
        return service.update(dto.getWord(), dto.getDescription());
    }
}
