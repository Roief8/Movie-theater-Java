package Movie_theater;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Employee extends Customer{

	//Attributes 

	protected int[] workHours;
	protected double rate;

	//Constructor
	public Employee(String name , String email , int id , String phone, double rate,int age) {

		super(name,email,id,phone,age);
		this.workHours=new int[30];
		setWorkHrs();
		this.rate=rate;
	}

	//Setters And Getters
	public int[] getWorkHrs() {
		return workHours;
	}

	//our setter gives random daily shift hours between 0-8 hours max.
	public void setWorkHrs() {
		Random rand = new Random();

		for (int i=0;i<30;i++) {
			int Wh = rand.nextInt(8);
			this.workHours[i]=Wh;	

		}
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}


	@Override
	public String toString() {
		return "Worker Name"+ getName()+ Arrays.toString(workHours) + "rate=" + rate + "Age :" + getAge() + "\n";
	}

	//Methods
	public void Sell_popcorn(Customer Client , int size) {

		// small = 8 + 0 ; medium = 8 + 4 ; large = 8 + 8 ;
		int price = 8 + size*4;
		price =Client.GetDiscount(price);
		System.out.println("please pay "+price+ "$");


	}

	public void Sell_ticket (Customer Client , Movie M, Theater[] Th) {
		int temp = 0;
		int FreeSeats=0;

		for (int i =0;i<Th.length-1;i++) {
			if (M.equals(Th[i].shownMovie)) {
				if (Th[i].Show_seats()>FreeSeats) {
					FreeSeats=Th[i].Show_seats();
					temp=i;

				}				

			}			

		}
		System.out.println(Th[temp].Ticket_Buy(Client));
	}


	public double Payment_Calc() {
		int totalHrs=0;
		for (int i = 0; i < workHours.length; i++) {
			totalHrs=totalHrs+workHours[i];

		}
		System.out.println("Total hours : "+totalHrs + "\nRate : "+rate);
		return totalHrs*rate;

	}


}
