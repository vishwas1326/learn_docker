package learning.docker.service;

import learning.docker.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    List<Movie> movieDetails;



    public List<Movie> getBooks(){
        movieDetails = new ArrayList<>();
        movieDetails.add(new Movie(
                1L,
                "Inception",
                "Christopher Nolan",
                "2010-07-16",
                "Leonardo DiCaprio",
                "Elliot Page",
                "A mind-bending thriller exploring dream manipulation.",
                "A groundbreaking narrative in science fiction."
        ));

        movieDetails.add(new Movie(
                2L,
                "The Matrix",
                "Lana Wachowski, Lilly Wachowski",
                "1999-03-31",
                "Keanu Reeves",
                "Carrie-Anne Moss",
                "A hacker discovers the truth about reality and fights for humanity.",
                "A defining moment in action and science fiction genres."
        ));

        movieDetails.add(new Movie(
                3L,
                "Titanic",
                "James Cameron",
                "1997-12-19",
                "Leonardo DiCaprio",
                "Kate Winslet",
                "A love story set against the backdrop of a tragic maritime disaster.",
                "An epic romance with historical significance."
        ));

        return movieDetails;
    }
}
