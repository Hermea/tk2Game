package game.resources;
import java.util.ArrayList;
import java.util.HashMap;

public class MainCharacterQuiz {
	
	public MainCharacterQuiz(){
	String q1 = "At work you have a habit of:/n";
	String q2 = "You wake up in a dark room. You see that you have been restrained in a chair. "
			+ "/nA man stands in front of you wielding a knife cackling."
			+ "/nHe glares at you asking if you have any last words. "
			+ "/nHow do you respond?:/n";
	String q3 = "Someone close to you is having a difficult time./n"
			+ " What would you do to help them out?";
	String q4 ="What color do you identify with?";
	String q5 ="If you had to pick a weapon it would be";
	String q6 = "The first thing I look for in a love interest is:";
	
	//key 1 = cunning answer, 2 = intelligence, 3 = speed, 4 = strength
	HashMap<String, Object> q1Answers = new HashMap<String, Object>();
	QuizAnswers answer11 = new QuizAnswers("Over Socializing");
	QuizAnswers answer12 = new QuizAnswers("Being a Workaholic and over achiever");
	QuizAnswers answer13 = new QuizAnswers("Finding ways to not be at your desk");
	QuizAnswers answer14 = new QuizAnswers("Constantly fidgeting because you can’t stay still too long");
	q1Answers.put("1", answer11);
	q1Answers.put("2", answer12);
	q1Answers.put("3", answer13);
	q1Answers.put("4", answer14);
	QuizQuestions quiz1 = new QuizQuestions(q1, q1Answers);
	
	HashMap<String, Object> q2Answers = new HashMap<String, Object>();
	QuizAnswers answer21 = new QuizAnswers("Spit in the man’s face");
	QuizAnswers answer22 = new QuizAnswers("Beg for your life");
	QuizAnswers answer23 = new QuizAnswers("Try to break your restraints");
	QuizAnswers answer24 = new QuizAnswers("Attempt to knock over the chair to release yourself");
	q2Answers.put("1", answer21);
	q2Answers.put("2", answer22);
	q2Answers.put("3", answer24);
	q2Answers.put("4", answer23);
	QuizQuestions quiz2 = new QuizQuestions(q2, q2Answers);
	
	HashMap<String, Object> q3Answers = new HashMap<String, Object>();
	QuizAnswers answer32 = new QuizAnswers("Analyze their situation and come up with possible solutions");
	QuizAnswers answer34 = new QuizAnswers("Tell them that though things are bad now, they will improve if they just persevere");
	QuizAnswers answer33 = new QuizAnswers("Come up with a short term solution to make things a little bit better for them in the meantime.");
	QuizAnswers answer31 = new QuizAnswers("Let that person know that no matter what you will be there for them.");
	q3Answers.put("1", answer31);
	q3Answers.put("2", answer32);
	q3Answers.put("3", answer33);
	q3Answers.put("4", answer34);
	QuizQuestions quiz3 = new QuizQuestions(q3, q3Answers);
	
	HashMap<String, Object> q4Answers = new HashMap<String, Object>();
	QuizAnswers answer41 = new QuizAnswers("Gold");
	QuizAnswers answer42 = new QuizAnswers("Blue");
	QuizAnswers answer43 = new QuizAnswers("Green");
	QuizAnswers answer44 = new QuizAnswers("Red");
	q2Answers.put("1", answer41);
	q2Answers.put("2", answer42);
	q2Answers.put("3", answer43);
	q2Answers.put("4", answer44);
	QuizQuestions quiz4 = new QuizQuestions(q4, q4Answers);
	
	HashMap<String, Object> q5Answers = new HashMap<String, Object>();
	QuizAnswers answer51 = new QuizAnswers("Sword or Knives");
	QuizAnswers answer52 = new QuizAnswers("Bow and Arrows");
	QuizAnswers answer53 = new QuizAnswers("Gun");
	QuizAnswers answer54 = new QuizAnswers("My fists");
	q2Answers.put("1", answer51);
	q2Answers.put("2", answer52);
	q2Answers.put("3", answer53);
	q2Answers.put("4", answer54);
	QuizQuestions quiz5 = new QuizQuestions(q5, q5Answers);
	
	HashMap<String, Object> q6Answers = new HashMap<String, Object>();
	QuizAnswers answer61 = new QuizAnswers("A witty person who I can laugh with");
	QuizAnswers answer62 = new QuizAnswers("Someone who is stable and is able to support me");
	QuizAnswers answer63 = new QuizAnswers("Anyone who instantly clicks with my awesome personality");
	QuizAnswers answer64 = new QuizAnswers("Strong Arms to hold me tight");
	q2Answers.put("1", answer61);
	q2Answers.put("2", answer62);
	q2Answers.put("3", answer63);
	q2Answers.put("4", answer64);
	QuizQuestions quiz6 = new QuizQuestions(q6, q6Answers);
			
	ArrayList<Object> questions = new ArrayList<Object>();
	questions.add(quiz1);
	questions.add(quiz2);
	questions.add(quiz3);
	questions.add(quiz4);
	questions.add(quiz5);
	questions.add(quiz6);
	}
	
	public int generateQuestion() {
    int statPoint = 0;
    return statPoint;
	}

}
