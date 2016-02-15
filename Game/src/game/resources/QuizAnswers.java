package game.resources;

public class QuizAnswers {

	private String answerText;
	private int statBoost = 10;
	
	public QuizAnswers(String answerText) {
		setAnswerText(answerText);
	}

	public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	public int getStatBoost() {
		return statBoost;
	}

	@Override
	public String toString() {
		return answerText; 
	}

}
