package Movie_theater;

import java.util.ArrayList;
import java.util.Random;

public class Customer{

	public static int YEAR = 2021;
	protected String name , email ,phone;
	protected int id  , age;

	public Customer(String name , String email , int id , String phone, int age) {
		this.name=name;
		this.email=email;
		this.id=id;
		this.phone=phone;
		this.age=age;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name : " + name +'\n'+"Age : "+age+"\n"+"Phone : "+phone;

	}


	//Methods 

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Customer))
			return false;
		Customer other = (Customer) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public Movie Movie_choose(Movie Movies[]) {

		System.out.println("Hello ! Please Choose a movie from our list.");

		Random rand = new Random();
		int choice=rand.nextInt(Movies.length);
		Movie M = Movies[choice];
		boolean check=M.AgeCheck(this);
		while (check==false) {

			System.out.println("Sorry , you cant watch '" +M.getMovieName() + "' Please choose another one.");
			choice=rand.nextInt(Movies.length);
			M = Movies[choice];
			check=M.AgeCheck(this);

		}
		System.out.println("You chose to see '"+ M.getMovieName() + "'.\nGreat choice ! Enjoy !\n" );
		return M;


	}

	public int popcorn_choose() {
		Random rand = new Random();
		String size = "None" ;
		int choice = rand.nextInt(3);
		System.out.println("Hello .\n"
				+ "we have 3 sizes of popcorn .\n"
				+ "Small : 8$\n"
				+ "Medium : 12$\n"
				+ "Large : 16$\n"
				+ "What size would you like to buy ?\n");
		switch (choice) {
		case 0: {
			size = "Small";
			break;
		}
		case 1 :{ 
			size = "Medium";
			break;

		}
		case 2:{
			size="Large";
			break;
		}

		}
		System.out.println("You Choose "+size+" size Popcorn.\n");
		return choice;
	}

	public int GetDiscount(int price) {

		return price;
	}


}
