package Movie_theater;

public abstract class Movie {
	
	//Attributes 
	protected String movieName;
	protected int minAge,leanght;
	
	//Constructor
	public Movie(String movieName, int leanght) {
		
		this.movieName = movieName;
		this.leanght = leanght;
	}
	
	//Setters And Getters
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public int getLeanght() {
		return leanght;
	}

	public void setLeanght(int leanght) {
		this.leanght = leanght;
	}

	@Override
	public String toString() {
		return "Movie Name : " +movieName + ", Min Age : "+minAge + ", Leanght : " + leanght;
	}
	
	
	
	
	
	//Methods
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		return true;
	}

	public abstract boolean AgeCheck (Customer Client) ;

}
