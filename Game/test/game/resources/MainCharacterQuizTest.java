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
		quiz = new MainCharacterQuiz();
	}

	@Test
	public void test() {
		survey = quiz.getCharacterQuiz();
		survey.get(0);
	}

}
