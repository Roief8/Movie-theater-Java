package Movie_theater;

public class ComedyMovie extends Movie{
	
	//Constructor
	public ComedyMovie(String movieName, int leanght) {
			
			super(movieName,leanght);
			this.minAge=0;
		}
	
		@Override
		public boolean AgeCheck(Customer Client) {
			
			if (Client.age>minAge) {
				return true;
			}
			else return false;
	}

}
