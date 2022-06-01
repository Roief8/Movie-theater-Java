package Movie_theater;

public final class ActionMovie extends Movie {
	
	//Constructor
	public ActionMovie(String movieName, int leanght) {
			
			super(movieName,leanght);
			this.minAge=16;
		}
	
		@Override
		public boolean AgeCheck(Customer Client) {
			
			if (Client.age>minAge) {
				return true;
			}
			else return false;
	}

}
