package com.springbootpractice.quizgame.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Response {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String response;
}
