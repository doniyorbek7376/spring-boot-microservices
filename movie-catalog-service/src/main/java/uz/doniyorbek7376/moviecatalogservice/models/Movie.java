package uz.doniyorbek7376.moviecatalogservice.models;

public class Movie {
    private String movieId;
    private String name;

    public Movie() {
    }

    public Movie(String movieId, String name) {
        this.setMovieId(movieId);
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

}