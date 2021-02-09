package uz.doniyorbek7376.moviecatalogservice.models;

public class Rating {
    private String movieId;
    private Integer rating;

    public Rating(String movieId, Integer rating) {
        this.setMovieId(movieId);
        this.setRating(rating);
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
}
