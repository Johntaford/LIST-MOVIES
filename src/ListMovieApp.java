import java.util.*;

public class ListMovieApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList<ListMovie> Movie = new ArrayList<>();

		Movie.add(new ListMovie("Star War", "Action"));
		Movie.add(new ListMovie("Black Adam", "Action"));
		Movie.add(new ListMovie("Father Stu", "Drama"));
		Movie.add(new ListMovie("Breaking", "Thriller"));
		Movie.add(new ListMovie("Last Man Down", "Adventure"));
		Movie.add(new ListMovie("The Man from Toronto", "Comedy"));
		Movie.add(new ListMovie("Memory", "Thriller"));
		Movie.add(new ListMovie("Hustle", "Drama"));
		Movie.add(new ListMovie("Poker Face", "Mystery"));
		Movie.add(new ListMovie("Dual", "Sci-fi"));
		String answer;
		do {
		System.out.println("Welcome to the Movie List Application!\n");

		System.out.println("There are 10 movies in this list.\n");

		System.out.println("");
		System.out.print("What category are you interested in? ");
		String choice = scan.nextLine();

		System.out.print(choice);
		System.out.println("\n");
		
		
			for (ListMovie movie : Movie) {
				if (choice.equalsIgnoreCase(movie.category)) {
					System.out.println(movie.title);
				}

			}
			System.out.println("Would you like to continue y or n?");
			answer = scan.nextLine();

		} while (answer.equalsIgnoreCase("Y"));

		if (answer.equalsIgnoreCase("N")) {
			System.out.println("Thank you see you again soon!");
		}
	}

}
