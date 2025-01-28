
public class Competition {
	String name;
	Organizer organizier;
	int maxParticipants;
	Athlete [] Athlete= new Athlete [10];
	
	public Competition(String name, Organizer organizier, int maxParticipants, Athlete[] athlete) {
		super();
		this.name = name;
		this.organizier = organizier;
		this.maxParticipants = maxParticipants;
		Athlete = athlete;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Organizer getOrganizier() {
		return organizier;
	}

	public void setOrganizier(Organizer organizier) {
		this.organizier = organizier;
	}

	public int getMaxParticipants() {
		return maxParticipants;
	}

	public void setMaxParticipants(int maxParticipants) {
		this.maxParticipants = maxParticipants;
	}

	public Athlete[] getAthlete() {
		return Athlete;
	}

	public void setAthlete(Athlete[] athlete) {
		Athlete = athlete;
	}
	


}
