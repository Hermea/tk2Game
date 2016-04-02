package quiz;

import java.util.HashMap;

public class QuizQuestions {

	private String questionText;
	private HashMap<String, String> answerOptions;
	
	public QuizQuestions(String questionText, HashMap<String, String> answerOptions){
		setQuestionText(questionText);
		setAnswerOptions(answerOptions);
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public HashMap<String, String> getAnswerOptions() {
		return answerOptions;
	}

	public void setAnswerOptions(HashMap<String, String> answerOptions) {
		this.answerOptions = answerOptions;
	}

	@Override
	public String toString() {
		return "\n" + questionText + "\n" + answerOptions;
	}
	

}
