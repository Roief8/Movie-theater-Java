package Movie_theater;

public final class Soldier extends Customer implements iCustomer {
		
	//Attributes 
	protected int releseYear;
	
	//Constructor
	public Soldier(String name , String email , int id , String phone,int age , int releseYear) {
		super(name,email,id,phone,age);
		this.releseYear=releseYear;
	}
	
	//Setters And Getters
	public int getReleseYear() {
		return releseYear;
	}

	public void setReleseYear(int releseYear) {
		this.releseYear = releseYear;
	}
	
	
	//Methods
	public int GetDiscount (int price) {
		
		if (this.releseYear>YEAR) {
			price = 0;
			System.out.println("You get free popcorn because you are Soldier .");
			return price;
		}
		else return price;
	}

		

}
