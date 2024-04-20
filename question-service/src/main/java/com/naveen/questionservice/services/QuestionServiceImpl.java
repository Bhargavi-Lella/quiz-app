package com.naveen.questionservice.services;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.naveen.questionservice.dtos.QuestionWrapperDto;
import com.naveen.questionservice.entities.Question;
import com.naveen.questionservice.utils.exceptions.QuestionAlreadyExistsException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {
	private final ModelMapper modelMapper;
	private final QuestionRepository questionRepo;

	@Override
	public List<QuestionWrapperDto> getAllQuestions(String category) {
		List<Question> questions = questionRepo.findByCategoryOrAll(category);
		List<QuestionWrapperDto> questionDtos = questions.stream()
				.map(question -> modelMapper.map(question, QuestionWrapperDto.class)).toList();
		return questionDtos;
	}

	@Override
	public Question addQuestion(Question questionToBeAdded) {
		Optional<Integer> optionalQuestion = questionRepo.findByTitle(questionToBeAdded.getTitle());
		if (optionalQuestion.isPresent()) {
			throw new QuestionAlreadyExistsException("Question with the same title already exists");
		}
		Question questionAdded = questionRepo.save(questionToBeAdded);
		return questionAdded;
	}

}
