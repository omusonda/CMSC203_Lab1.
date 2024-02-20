package lab1;
import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);


		String try_again;

		do{


			System.out.println("Enter movie");
			String movie_name= keyboard.nextLine();
			System.out.println("Enter the rating of the movie");
			String rating= keyboard.nextLine();
			System.out.println("Enter number of tickets sold at theatre");
			int tickets_sold= keyboard.nextInt();
			System.out.print(movie_name+"("+rating+"): ");
			System.out.println("Tickets sold:"+tickets_sold);
			System.out.println("Would you like to enter another movie?");
			try_again= keyboard.next();
			keyboard.nextLine();
		}
		while (try_again.equalsIgnoreCase("y"));
		if(try_again.equalsIgnoreCase("n"));
		{
			System.out.println("Goodbye");
		}
		


	}

}	
