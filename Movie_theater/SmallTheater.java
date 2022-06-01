package Movie_theater;

public final class SmallTheater extends Theater {
	
	int ticketPrice;
	
		public SmallTheater( int theaterNum) {
			super(theaterNum);
			this.seats=new int[8][10];
			ticketPrice=30;
}
	

public int getTicketPrice() {
		return ticketPrice;
	}





	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}


public TicketOrder Ticket_Buy(Customer Client) {
		
		TicketOrder N;
		int a=0,b=0,i,j,Pay ;
		boolean flag1=false;
		
		//check if seat is taken
		
		for(i = seats.length-1; i >= 0; i--){		
				
			for(j = seats[i].length-1; j >= 0; j--){
					 
				if (seats[i][j]==0 && flag1==false) {
						seats[i][j]=1;
						a=i+1;
						b=j+1;
						flag1=true;		
					}
				}
			}
			
		if (flag1== false) {
			System.out.println("This theather is full .");
			return null;
		}
		else 
			Pay=Client.GetDiscount(ticketPrice);		
			N = new TicketOrder(shownMovie.getMovieName(), theaterNum, a, b, Pay);
			return N;
	}

			
	
	public void Update_Movie (Movie newMovie) {
			
			setShownMovie(newMovie);
			this.seats=new int[10][8];
		}
	
}
	
		//TicketOrder Res = new TicketOrder(shownMovie, roomNum, , ticketPrice, ticketPrice)

	
	


