
public class Athlete extends Person{

	public Athlete(String firstName, String lastName, String category, double time) {
		super(firstName, lastName);
		this.category = category;
		this.time = time;
	}

	String category;
	double time;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	
	
}
