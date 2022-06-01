package Movie_theater;
import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {

		//create objects

		Soldier Sol = new Soldier ("solRoi","roi@gmail.com",931093,"054903102",15,2023);
		Customer Cus = new Customer ("Razcl","raz222",111111,"04234234",30);
		Student Stud = new Student ("Stud","asras234",2342,"05234320",32,"TLV",2022);
		Eldar Elde = new Eldar ("Menachem", "Shlaglah@walla.com",8280,"07781298",120);
		Employee Emp1 = new Employee ("emp","empmail",111111,"111111",70,20);
		Employee Emp2 = new Employee ("emp222","zssdc323",222222,"222222",42,32);
		Movie HorrorM = new HorrorMovie ("Wrong Turn 6",91);
		Movie ComedyM = new ComedyMovie("Jump Street 22", 112);
		Movie ActionM = new ActionMovie("Inception", 148);
		
		Theater SmallTh1 =new SmallTheater(1);
		Theater SmaillTh2 =new SmallTheater(2);
		Theater BigTh1 =new BigTheater(3);
		Theater VIPTh1 =new VIPTheater(4);	
		
		SmallTh1.setShownMovie(HorrorM);
		SmaillTh2.setShownMovie(HorrorM);
		BigTh1.setShownMovie(ActionM);
		VIPTh1.setShownMovie(ComedyM);
		
		Movie[] movies =new Movie[4];
		movies[0]=HorrorM;
		movies[1]=ComedyM;
		movies[2]=ActionM;

		Theater[] theater=new Theater[4];
		theater[0]=SmallTh1;
		theater[1]=SmaillTh2;
		theater[2]=BigTh1;
		theater[3]=VIPTh1;
		
		Cinema Cin = new Cinema("O&R Cinema");
		Cin.setTheaters(theater);
		Cin.setMovies(movies);
		//Objects in the cinema
		ArrayList<Customer> Customers = new ArrayList<Customer>(List.of(Sol,Cus,Stud));
		ArrayList<Employee> Employees = new ArrayList<Employee>(List.of(Emp1,Emp2));

		Cin.setEmployees(Employees);
		Cin.setCustomers(Customers);

		Employee S1 = new Employee("emp332","123132",333333,"333333",32,22);
		Cin.addEmployee(S1);
		Cin.RemoveEmployee(111111);
		System.out.println(Cin.getEmployees());

		/*
		// Check Func sell ticket
		Emp1.Sell_ticket(Stud, ComedyM, theater);
		Emp2.Sell_ticket(Cus, ComedyM, theater);
		Emp1.Sell_ticket(Stud, HorrorM, theater);
		Emp2.Sell_ticket(Cus, ActionM, theater);
		Emp1.Sell_ticket(Stud, ActionM, theater);


		//check update movie
		System.out.println(VIPTh1.getShownMovie());
		System.out.println(VIPTh1.Show_seats());
		VIPTh1.Update_Movie(HorrorM);
		System.out.println(VIPTh1.Show_seats());
		System.out.println(VIPTh1.getShownMovie());
		System.out.println(SmaillTh2.getShownMovie());
		*/
		System.out.println(Cin.getTheaters().length);
		Cin.Sell_Ticket();
		}

}
