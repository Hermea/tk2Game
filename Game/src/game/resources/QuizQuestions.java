package game.resources;
import java.util.HashMap;

public class QuizQuestions {
// REFACTOR ANSWERS YOU FUCKER!
	private String questionText;
	private HashMap<String, Object> answerOptions;
	
	public QuizQuestions(String questionText, HashMap<String, Object> answerOptions){
		setQuestionText(questionText);
		setAnswerOptions(answerOptions);
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public HashMap<String, Object> getAnswerOptions() {
		return answerOptions;
	}

	public void setAnswerOptions(HashMap<String, Object> answerOptions) {
		this.answerOptions = answerOptions;
	}

}
