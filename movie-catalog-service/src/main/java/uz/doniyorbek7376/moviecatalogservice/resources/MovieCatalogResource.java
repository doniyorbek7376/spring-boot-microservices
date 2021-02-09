package uz.doniyorbek7376.moviecatalogservice.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import uz.doniyorbek7376.moviecatalogservice.models.*;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
    private RestTemplate restTemplate;

    public MovieCatalogResource(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
        // get ratings by userId
        List<Rating> ratings = restTemplate.getForObject("http://localhost:8083/users/" + userId, UserRating.class)
                .getUserRatings();

        // get movie info for every rated movie from movie-info-servie
        // microservice
        return ratings.stream().map(rating -> {
            Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), Movie.class);
            return new CatalogItem(movie.getName(), "", rating.getRating());
        }).collect(Collectors.toList());
    }

}
