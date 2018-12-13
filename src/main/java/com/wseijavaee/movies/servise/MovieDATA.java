package com.wseijavaee.movies.servise;

import lombok.Getter;

import java.util.List;

public class MovieDATA {
    @Getter
    private MovieIdDATA id;
    @Getter
    private MovieTitleDATA title;
    @Getter
    private List<MovieCategoryDATA> category;
    @Getter
    private MovieYearDATA year;
    @Getter
    private MovieCastDATA cast;
    @Getter
    private MovieDirectorDATA director;
    @Getter
    private MovieStoryDATA story;
    @Getter
    private MoviePriceDATA price;

    public MovieDATA( final MovieIdDATA id, final MovieTitleDATA title, final List<MovieCategoryDATA> category,
                      final MovieYearDATA year, final MovieCastDATA cast, final MovieDirectorDATA director,
                      final MovieStoryDATA story, final MoviePriceDATA price) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.year = year;
        this.cast = cast;
        this.director = director;
        this.story = story;
        this.price = price;
    }
}
