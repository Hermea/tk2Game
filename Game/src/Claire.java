public class Claire extends SideCharacter {

	private String specialAbility = "hacking";
	
	public Claire() {
		this.setCunning(10);
		this.setFirstName("Claire");
		this.setLastName("Ellis");
		this.setStrength(15);
		this.setGender(true);
		this.setIntellect(45);
		this.setSpeed(40);
	}

	public String getSpecialAbility() {
		return specialAbility;
	}

}
