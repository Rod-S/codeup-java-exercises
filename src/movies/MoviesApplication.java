package movies;

import java.util.Scanner;
import util.Input;



public class MoviesApplication {

    public static void main(String[] args) {
        Movie[] allMovies = MoviesArray.findAll();
        Input userInput = new Input();
        boolean userLoop = true;
        do {
            System.out.println("What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n\n" +
                    "Enter your choice: ");
            int userChoice = userInput.getInt();
            System.out.println("\n");
            if (userChoice == 0) {
                System.out.println("Exiting Movies Application. See you next time.");
                userLoop = false;
            } else if (userChoice == 1) {
                for (var i =0; i< allMovies.length; i++) {
                    System.out.println(allMovies[i].getMovieName() + " -- "+allMovies[i].getMovieCategory());
                }
            } else if (userChoice == 2) {
                for (var i =0; i< allMovies.length; i++) {
                    if (allMovies[i].getMovieCategory().equalsIgnoreCase("animated")) {
                        System.out.println(allMovies[i].getMovieName() + " -- " + allMovies[i].getMovieCategory());
                    }
                }
            } else if (userChoice == 3) {
                for (var i =0; i< allMovies.length; i++) {
                    if (allMovies[i].getMovieCategory().equalsIgnoreCase("drama")) {
                        System.out.println(allMovies[i].getMovieName() + " -- " + allMovies[i].getMovieCategory());
                    }
                }
            } else if (userChoice == 4) {
                for (var i =0; i< allMovies.length; i++) {
                    if (allMovies[i].getMovieCategory().equalsIgnoreCase("horror")) {
                        System.out.println(allMovies[i].getMovieName() + " -- " + allMovies[i].getMovieCategory());
                    }
                }
            } else if (userChoice == 5) {
                for (var i =0; i< allMovies.length; i++) {
                    if (allMovies[i].getMovieCategory().equalsIgnoreCase("scifi")) {
                        System.out.println(allMovies[i].getMovieName() + " -- " + allMovies[i].getMovieCategory());
                    }
                }
            } else {
                System.out.println("Invalid input. Please try again.");
            }
                System.out.println("\n\n");
            }
            while(userLoop);
    }
}
