
public class SideCharacter {
	private String firstName;
	private String lastName;
	private boolean gender;
	private int strength;
	private int cunning;
	private int intellect;
	private int affection = 30;
	private int speed;
	private String specialAbility;

	public SideCharacter(String firstName, String lastName, boolean gender, int strength, int cunning, int intellect,
			int speed, String specialAbility) {
		setFirstName(firstName);
		setLastName(lastName);
		isFemale(gender);
		setStrength(strength);
		setCunning(cunning);
		setIntellect(intellect);
		setSpeed(speed);
		setSpecialAbility(specialAbility);
	}

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

	public void isFemale(boolean gender) {
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

	public String getSpecialAbility() {
		return specialAbility;
	}

	public void setSpecialAbility(String specialAbility) {
		if (specialAbility.equals(SpecialAbility.values())) {
			this.specialAbility = specialAbility;
		} else {
			this.specialAbility = "None";
		}
	}

}
