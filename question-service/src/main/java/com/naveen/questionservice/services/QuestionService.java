package com.naveen.questionservice.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.naveen.questionservice.dtos.QuestionWrapperDto;
import com.naveen.questionservice.entities.Question;

public interface QuestionService {

	List<QuestionWrapperDto> getAllQuestions(String category);

	Question addQuestion(Question question);

}
