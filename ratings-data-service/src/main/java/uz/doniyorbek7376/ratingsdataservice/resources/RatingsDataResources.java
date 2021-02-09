package uz.doniyorbek7376.ratingsdataservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uz.doniyorbek7376.ratingsdataservice.models.Rating;
import uz.doniyorbek7376.ratingsdataservice.models.UserRating;

@RestController
@RequestMapping("/ratings")
public class RatingsDataResources {

    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

    @GetMapping("/users/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
        UserRating ratings = new UserRating();
        ratings.setUserRatings(Arrays.asList(new Rating("1", 5), new Rating("2", 4), new Rating("3", 3)));
        return ratings;
    }
}
