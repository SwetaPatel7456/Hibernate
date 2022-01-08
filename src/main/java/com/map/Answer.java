package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	private int answeId;
	private String answer;
	
	@ManyToOne
	private Question question;

	public int getAnsweId() {
		return answeId;
	}

	public void setAnsweId(int answeId) {
		this.answeId = answeId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Answer [answeId=" + answeId + ", answer=" + answer + ", question=" + question + "]";
	}

	public Answer(int answeId, String answer, Question question) {
		super();
		this.answeId = answeId;
		this.answer = answer;
		this.question = question;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
    

}
