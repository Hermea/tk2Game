
public class SideCharacter {
	private String firstName;
	private String lastName;
	private boolean gender;
	private int strength;
	private int cunning;
	private int intellect;
	private int affection = 30;
	private int speed;
	

	public String getFirstName() {
	    return firstName;
	}
	public void setFirstName(String firstName) {
	    this.firstName = firstName;
	}
	public String getLastName() {
	    return lastName;
	}
	public void setLastName(String lastName) {
	    this.lastName = lastName;
	}
	public boolean isGender() {
	    return gender;
	}
	public void setGender(boolean gender) {
	    this.gender = gender;
	}
	public int getStrength() {
	    return strength;
	}
	public void setStrength(int strength) {
	    this.strength = strength;
	}
	public int getCunning() {
	    return cunning;
	}
	public void setCunning(int charisma) {
	    this.cunning = charisma;
	}
	public int getIntellect() {
	    return intellect;
	}
	public void setIntellect(int intellect) {
	    this.intellect = intellect;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getAffection() {
		return affection;
	}
	public void setAffection(int affection) {
		this.affection = affection;
	}
	
}
