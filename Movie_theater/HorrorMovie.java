package Movie_theater;

public final class HorrorMovie extends Movie {

	//Constructor
	public HorrorMovie(String movieName, int leanght) {
		
		super(movieName,leanght);
		this.minAge=18;
	}

	@Override
	public boolean AgeCheck(Customer Client) {
		
		if (Client.age>minAge) {
			return true;
		}
		else return false;
	}
	
	
}
