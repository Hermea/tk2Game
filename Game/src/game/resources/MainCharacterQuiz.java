package game.resources;

import java.util.ArrayList;
import java.util.HashMap;

public class MainCharacterQuiz {

	private ArrayList<Object> characterQuiz = new ArrayList<Object>();
	
	public MainCharacterQuiz() {
		String q1 = "At work you have a habit of:\n";
		String q2 = "You wake up in a dark room. You see that you have been restrained in a chair. "
				+ "\nA man stands in front of you wielding a knife cackling."
				+ "\nHe glares at you asking if you have any last words. " + "\nHow do you respond?:\n";
		String q3 = "Someone close to you is having a difficult time.\n" + " What would you do to help them out?";
		String q4 = "What color do you identify with?\n";
		String q5 = "If you had to pick a weapon it would be\n";
		String q6 = "The first thing I look for in a love interest is:\n";

		// key 1 = cunning answer, 2 = intelligence, 3 = speed, 4 = strength
		HashMap<String, String> q1Answers = new HashMap<String, String>();
		q1Answers.put("1", "Over Socializing\n");
		q1Answers.put("2", "Being a Workaholic and over achiever\n");
		q1Answers.put("3", "Finding ways to not be at your desk\n");
		q1Answers.put("4", "Constantly fidgeting because you can’t stay still too long\n");
		QuizQuestions quiz1 = new QuizQuestions(q1, q1Answers);

		HashMap<String, String> q2Answers = new HashMap<String, String>();
		q2Answers.put("1", "Spit in the man’s face\n");
		q2Answers.put("2", "Beg for your life\n");
		q2Answers.put("3", "Try to break your restraints\n");
		q2Answers.put("4", "Attempt to knock over the chair to release yourself\n");
		QuizQuestions quiz2 = new QuizQuestions(q2, q2Answers);

		HashMap<String, String> q3Answers = new HashMap<String, String>();
		q3Answers.put("1", "Analyze their situation and come up with possible solutions\n");
		q3Answers.put("2", "Tell them that though things are bad now, they will improve if they just persevere\n");
		q3Answers.put("3", "Come up with a short term solution to make things a little bit better for them in the meantime.\n");
		q3Answers.put("4", "Let that person know that no matter what you will be there for them.\n");
		QuizQuestions quiz3 = new QuizQuestions(q3, q3Answers);

		HashMap<String, String> q4Answers = new HashMap<String, String>();
		q2Answers.put("1", "Gold\n");
		q2Answers.put("2", "Blue\n");
		q2Answers.put("3", "Green\n");
		q2Answers.put("4", "Red\n");
		QuizQuestions quiz4 = new QuizQuestions(q4, q4Answers);

		HashMap<String, String> q5Answers = new HashMap<String, String>();
		q2Answers.put("1", "Sword or Knives\n");
		q2Answers.put("2", "Bow and Arrows\n");
		q2Answers.put("3", "Gun\n");
		q2Answers.put("4", "My fists\n");
		QuizQuestions quiz5 = new QuizQuestions(q5, q5Answers);

		HashMap<String, String> q6Answers = new HashMap<String, String>();
		q2Answers.put("1", "A witty person who I can laugh with\n");
		q2Answers.put("2", "Someone who is stable and is able to support me\n");
		q2Answers.put("3", "Anyone who instantly clicks with my awesome personality\n");
		q2Answers.put("4", "Strong Arms to hold me tight\n");
		QuizQuestions quiz6 = new QuizQuestions(q6, q6Answers);

		ArrayList<Object> questions = new ArrayList<Object>();
		questions.add(quiz1);
		questions.add(quiz2);
		questions.add(quiz3);
		questions.add(quiz4);
		questions.add(quiz5);
		questions.add(quiz6);
		questions.iterator();
		setCharacterQuiz(questions);
	}

	public ArrayList<Object> getCharacterQuiz() {
		return characterQuiz;
	}

	private void setCharacterQuiz(ArrayList<Object> characterQuiz) {
		this.characterQuiz = characterQuiz;
	}

}
