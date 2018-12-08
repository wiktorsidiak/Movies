package com.wseijavaee.movies.controller.movie;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wseijavaee.movies.model.MovieCategory;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;


public class MovieDTO {
    @Getter
    private int id;

    @Getter
    private String title;

    @Getter
    private List<MovieCategory> category;

    @Getter
    private String year;

    @Getter
    private String cast;

    @Getter
    private String director;

    @Getter
    private String story;

    @Getter
    private BigDecimal price;

@JsonCreator
    public MovieDTO(@JsonProperty("id") final int id, @JsonProperty("title") final String title,
                    @JsonProperty("category") final List category,@JsonProperty("year") final String year,
                    @JsonProperty("cast") final String cast, @JsonProperty("director") final String director,
                    @JsonProperty("story") final String story,@JsonProperty("price") final BigDecimal price) {

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
