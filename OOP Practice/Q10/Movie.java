/*
 * Create a class Movie with properties like name, rating, and releaseYear. 
 * Sort a list of movies using Comparator
 */
package Q10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Movie 
{
    private String name;
    private double rating;
    private int releaseYear;

    public Movie(String name, double rating, int releaseYear) 
    {
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    public String getName() 
    {
        return name;
    }

    public double getRating() 
    {
        return rating;
    }

    public int getReleaseYear() 
    {
        return releaseYear;
    }

    @Override
    public String toString()
    {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", releaseYear=" + releaseYear +
                '}';
    }

    public static void main(String[] args) 
    {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("The Godfather", 9.2, 1972));
        movies.add(new Movie("Pulp Fiction", 8.9, 1994));

        
        Collections.sort(movies, new Comparator<Movie>() 
        {
            @Override
            public int compare(Movie m1, Movie m2) 
            {
                return Double.compare(m2.getRating(), m1.getRating());
            }
        });

        for (Movie movie : movies) 
        {
            System.out.println(movie);
        }
    }
}
