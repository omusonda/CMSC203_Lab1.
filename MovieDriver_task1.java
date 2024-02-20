package lab1;
import java.util.Scanner;

public class MovieDriver_task1 {
	
		public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);


				System.out.println("Enter movie");
				String movie_name= keyboard.nextLine();
				System.out.println("Enter the rating of the movie");
				String rating= keyboard.nextLine();
				System.out.println("Enter number of tickets sold at theatre");
				int tickets_sold= keyboard.nextInt();
				System.out.println("Goodbye");
				String try_again= keyboard.next();
				keyboard.nextLine();
			}
}
