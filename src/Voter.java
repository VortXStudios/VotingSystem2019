public class Voter {
	int id;
	boolean voted;
	String name, surname;
	boolean eligible; // whether the voter is allowed to vote or not

	public Voter(boolean voted, int id, String name, String surname) {
		this.voted = voted;
		this.id = id;
		this.name = name;
		this.surname = surname;
	}

	public void setVoted(boolean voted) {
		this.voted = voted;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getVoted() {
		return voted;
	}

	public int getId() {
		return id;
	}

	public String getSurname() {
		return surname;
	}

	public String getName() {
		return name;
	}

}
