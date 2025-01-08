package learning.docker.model;

public class Movie {

    private long id;
    private String movieName;
    private String movieDirector;
    private String releaseDate;
    private String actorName;
    private String actressName;
    private String movieSummary;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getActressName() {
        return actressName;
    }

    public void setActressName(String actressName) {
        this.actressName = actressName;
    }

    public String getMovieSummary() {
        return movieSummary;
    }

    public void setMovieSummary(String movieSummary) {
        this.movieSummary = movieSummary;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    private String journal;

    public Movie(long id, String movieName, String movieDirector, String releaseDate,
                 String actorName, String actressName, String movieSummary, String journal) {
        this.id = id;
        this.movieName = movieName;
        this.movieDirector = movieDirector;
        this.releaseDate = releaseDate;
        this.actorName = actorName;
        this.actressName = actressName;
        this.movieSummary = movieSummary;
        this.journal = journal;
    }




}
