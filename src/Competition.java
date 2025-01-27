
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
	
	public String findWinner(Athlete a1, double time1, 
			Athlete a2, double time2, 
			Athlete a3, double time3) {

		double bestTime = Math.min(Math.min(time1, time2), time3);

			if (bestTime == time1) {
				return a1 + " è il vincitore con un tempo di " + time1 + " secondi";
			} else if (bestTime == time2) {
				return a2 + " è il vincitore con un tempo di " + time2 + " secondi";
			} else {
				return a3 + " è il vincitore con un tempo di " + time3 + " secondi";
	}
}

}
