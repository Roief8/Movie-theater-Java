package Movie_theater;

public abstract class Theater{
	
	//Attributes 
	protected int theaterNum;
	protected Movie shownMovie;
	protected int[][] seats;
	
	//Constructor
	public Theater (int theaterNum) {
		setShownMovie(shownMovie);
		this.theaterNum=theaterNum;
		
	}

	/**
	 * @return the theaterNum
	 */
	public int getTheaterNum() {
		return theaterNum;
	}

	/**
	 * @param theaterNum the theaterNum to set
	 */
	public void setTheaterNum(int theaterNum) {
		this.theaterNum = theaterNum;
	}

	/**
	 * @return the shownMovie
	 */
	public Movie getShownMovie() {
		return shownMovie;
	}

	/**
	 * @param shownMovie the shownMovie to set
	 */
	public void setShownMovie(Movie shownMovie) {
		this.shownMovie = shownMovie;
	}

	/**
	 * @return the seats
	 */
	public int[][] getSeats() {
		return seats;
	}

	/**
	 * @param seats the seats to set
	 */
	public void setSeats(int[][] seats) {
		this.seats = seats;
	}

	public abstract TicketOrder Ticket_Buy(Customer Client);
	
	public abstract void Update_Movie (Movie newMovie) ;
	
	//this method return how much seats is availables.
	public int Show_seats () {
		
		int counter=0;
		for(int i = 0; i < this.seats.length; i++){
			
			 for(int j = 0; j < this.seats[i].length; j++){
			
				 if (seats[i][j]==0) {
					 counter++;
				 }
				//System.out.print(this.seats[i][j] + " ");
			 	}
			 	//System.out.println();
				}
		return counter;
	}
	
	
	
}
