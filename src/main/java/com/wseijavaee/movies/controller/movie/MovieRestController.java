package com.wseijavaee.movies.controller.movie;

import com.wseijavaee.movies.model.MovieCategory;
import com.wseijavaee.movies.servise.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MovieRestController {
    private final MovieServise movieServise;


    public MovieRestController(final MovieServise movieServise){this.movieServise = movieServise;}

    @PostMapping("movie")
    public String addNewMovie(@RequestBody final MovieDTO movieDTO) {
    return this.movieServise.saveMovie((this.mapToMovieDATA(movieDTO)));
    }
    @GetMapping("movie/{movieId}")
    public MovieDTO getMovie (@PathVariable("movieId") final int Id){
        return this.mapToMovieDTO(this.movieServise.getMovie(new MovieIdDATA(Id)));
    }
    private MovieDATA mapToMovieDATA(final MovieDTO movieDTO) {
        return new MovieDATA(
                new MovieIdDATA(movieDTO.getId()),
                new MovieTitleDATA(movieDTO.getTitle()),
                movieDTO.getCategory().stream().map(mv-> new MovieCategoryDATA(mv.getCategory())).collect(Collectors.toList()),
                new MovieYearDATA(movieDTO.getYear()),
                new MovieCastDATA(movieDTO.getCast()),
                new MovieDirectorDATA(movieDTO.getDirector()),
                new MovieStoryDATA(movieDTO.getStory()),
                new MoviePriceDATA(movieDTO.getPrice()));

    }
    private MovieDTO mapToMovieDTO(final MovieDATA movie) {
        return new MovieDTO(
                movie.getId().getId(),
        movie.getTitle().getTitle(),
        movie.getCategory().stream()
                .filter(mvd ->
                        Arrays.stream(MovieCategory.values()).anyMatch(mv -> mvd.getCategory().equals(mv.getCategory())))
                .collect(Collectors.toList()),
        movie.getYear().getYear(),
        movie.getCast().getCast(),
        movie.getDirector().getDirector(),
        movie.getStory().getStory(),
        movie.getPrice().getPrice());
    }
}



