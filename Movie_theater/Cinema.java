package Movie_theater;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cinema {

	private int movies_cap = 5 , theaters_cap=10;
	private String cinemaName;
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	private Movie[] movies;
	private Theater[] theaters;

	// Constructor that recive th Cinema name
	public Cinema(String cinemaName) {
		
		//Calls for a Method that returns this Cinema name
		setCinemaName(cinemaName);
		this.movies = new Movie[movies_cap];
		this.theaters = new Theater[3];	
		
		// Calls for a Method that returns Movies in this Cinema
		setMovies(movies);
		
		// Calls for a Method that returns Theaters in this Cinema
		setTheaters(theaters);
	}


	// Sets & Gets
	
	// Set the Cinema name
	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}

	public String getCinemaName() {
		return cinemaName;
	}


	

	public ArrayList<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}


	public ArrayList<Customer> getCustomers() {
		return customers;
	}


	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}


	public Movie[] getMovies() {
		return movies;
	}


	public void setMovies(Movie[] movies) {
		this.movies = movies;
	}


	public Theater[] getTheaters() {
		return theaters;
	}


	public void setTheaters(Theater[] theaters) {
		this.theaters = theaters;
	}


	// methods
	public void addMovie(Movie m) {
		int k = 0;
		boolean flag = false;
		if (this.countMovies() != this.getMovies().length) {
			for (Movie i : movies) {
				if (i != null && !flag)
					if (m.equals(i)) {
						flag = true;
					}
				k++;
			}
			k = 0;
			if (!flag) {
				for (Movie i : movies) {
					if (i == null && !flag) {
						this.movies[k] = m;
						flag = true;
				}
				k++;
				}
			}
			k = 0;
			flag = false;
			int size = (movies.length / theaters.length);
			int counter = 0;
			for (Theater t : theaters) {
				if (theaters[k].getShownMovie() == null) {
					this.theaters[k].setShownMovie(m);
					counter++;
					if (size == counter)
					return;
				}
				k++;
			}
		}
		else
			System.out.println("We apologize, The list of movies is full.");
	}
	
	
	private int countMovies(){
		int i=0;
		for(Movie m : movies) {
			if (m != null)
				i++;
		}
		return i;
	}
	
	private int countHalls(){
		int i=0;
		for (Theater t : theaters) {
			if (t != null)
				i++;
		}
		return i;
	}
	
	
	
	
	public void aaddMovie(Movie m , Theater[] theater ){
		int flag1=0, flag2=0, moviescount=0 , theaterscount=0 , i=0 , b=0;
			for (i=0 ; i<movies.length ; i++) {
				if ( movies[i]==null) {
					flag1=1;
					moviescount=i;
				}
			}
			for (i=0 ; i<theater.length;i++) {
				if (theater[i].getShownMovie()==null) {
					flag2=1;
					theaterscount=i;
				}
				
			}
			if (flag1==1 && flag2==1) {
				movies[moviescount]=m;
				int ratio = movies_cap/theaters_cap;
				for (int j = 0; j < theater.length; j++) {
					if ((theater[j].getShownMovie()==null)&&ratio>=b){
						b++;
						theater[j].setShownMovie(m);
						System.out.println("Movie added");
					}
					
				}
			}
			
	}
	

	//public void updateMovie(String oldMovie, Movie newMovie){
		//for(Movie i: Movies){
		//	if(i.getMovieName().equals(oldMovie)) {
		//		i = newMovie;
			//	return;
		//	}
		//}
	//}
	public void addEmployee(Employee newEmployee) {
		boolean flag = false;
		for (Employee i : employees) {
			if (i.equals(newEmployee)) {
				System.out.println("");
				flag = true;
			}
		}
		if (!flag)
			this.employees.add(newEmployee);
	}

	public void RemoveEmployee(int employeeId) {
		for (Employee i : employees) {
			if (i.getId() == employeeId)
			{
				employees.remove(i);
				return;
			}

		}
	}

	public void Sell_Ticket() {
		Random rand = new Random();
		int randemp = rand.nextInt(employees.size());
		int randcus = rand.nextInt(customers.size());
		Employee Emp = employees.get(randemp);
		Customer Cus = customers.get(randcus);
		Movie m = Cus.Movie_choose(movies);
		Emp.Sell_ticket(Cus, m, theaters);
	}

	//private boolean availabllirtyCheck() {
	//	if (getNotAvailableHalls() ==)
	//}


}
