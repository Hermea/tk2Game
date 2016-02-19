package game.resources;
import java.util.HashMap;

public class QuizQuestions {
// REFACTOR ANSWERS YOU FUCKER!
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

}
