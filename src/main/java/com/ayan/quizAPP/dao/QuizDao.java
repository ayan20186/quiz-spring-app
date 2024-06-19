package com.ayan.quizAPP.dao;



import com.ayan.quizAPP.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}