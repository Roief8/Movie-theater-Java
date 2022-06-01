package Movie_theater;

public final class Student extends Customer implements iCustomer {
	
	
	//Attributes 
	protected String college;
	protected int gradYear;
	
	//Constructor
	public Student(String name , String email , int id , String phone,int age,String college , int gradYear) {
		super(name,email,id,phone,age);
		this.college=college;
		this.gradYear=gradYear;
		
	}
	
	
	//Setters And Getters
	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getGradYear() {
		return gradYear;
	}

	public void setGradYear(int gradYear) {
		this.gradYear = gradYear;
	}

	
	//Methods
	public int GetDiscount(int price) {
		
		if (this.gradYear>YEAR) {
			price = price/2;
			System.out.println("You pay 1/2 price because you are Student .");
			return price;	
		}
		else return price;
		
	}
	
	
}
