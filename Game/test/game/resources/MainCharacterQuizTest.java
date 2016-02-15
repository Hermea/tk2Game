package game.resources;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class MainCharacterQuizTest {

	MainCharacterQuiz quiz;
	ArrayList<Object> survey;
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void test() {
		quiz = new MainCharacterQuiz();
		survey = quiz.getCharacterQuiz();
		QuizQuestions q1 = (QuizQuestions) survey.get(0);
		System.out.println(q1.getQuestionText());
		for(int i=1; i < 5; i++) {
			String i1 = String.valueOf(i);
			System.out.println(q1.getAnswerOptions().get(i1).toString());
		}
	}

}
