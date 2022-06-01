package Movie_theater;

public final class Eldar extends Customer implements iCustomer {
	
	//Constructor
	public Eldar(String name , String email , int id , String phone,int age) {
		super(name,email,id,phone,age);
	}
	
	
	//Methods
	public int GetDiscount (int price) {
		
		if (this.age > 65) {
			price = price/3;
			System.out.println("You pay 1/3 price because you are Eldar .");
			return price;
		}
		else return price;
	}
	
	

}
