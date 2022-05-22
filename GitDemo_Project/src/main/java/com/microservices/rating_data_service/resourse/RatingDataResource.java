package com.microservices.rating_data_service.resourse;

import com.microservices.rating_data_service.model.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingData")
public class RatingDataResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable ("movieId") String movies){
        return new Rating(movies,4);
    }

}
