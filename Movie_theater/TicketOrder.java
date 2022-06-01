package Movie_theater;

public class TicketOrder {

	//Attributes 
	String filmName;
	int hallNum;	
	int rowNum;
	int chairNum;
	int ticketPrice;

	//Constructor
	public TicketOrder(String filmName, int hallNum, int rowNum, int chairNum, int ticketPrice) {

		this.filmName = filmName;
		this.hallNum = hallNum;
		this.rowNum = rowNum;
		this.chairNum = chairNum;
		this.ticketPrice = ticketPrice;
	}

	//Setters And Getters
	public String getFilmName() {
		return filmName;
	}
	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}
	public int getHallNum() {
		return hallNum;
	}
	public void setHallNum(int hallNum) {
		this.hallNum = hallNum;
	}
	public int getRowNum() {
		return rowNum;
	}
	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}
	public int getChairNum() {
		return chairNum;
	}
	public void setChairNum(int chairNum) {
		this.chairNum = chairNum;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	@Override
	public String toString() {
		return "OrderTickets [filmName=" + filmName + ", hallNum=" + hallNum + ", rowNum=" + rowNum + ", chairNum="
				+ chairNum + ", ticketPrice=" + ticketPrice + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TicketOrder other = (TicketOrder) obj;
		if (chairNum != other.chairNum)
			return false;
		if (filmName == null) {
			if (other.filmName != null)
				return false;
		} else if (!filmName.equals(other.filmName))
			return false;
		if (hallNum != other.hallNum)
			return false;
		if (rowNum != other.rowNum)
			return false;
		if (ticketPrice != other.ticketPrice)
			return false;
		return true;
	}



}
