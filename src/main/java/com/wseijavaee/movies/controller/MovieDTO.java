package com.wseijavaee.movies.controller;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;



public class MovieDTO {
    @Getter
    private int id;

    @Getter
    private String title;

    @Getter
    private String  category;

    @Getter
    private String year;

    @Getter
    private String cast;

    @Getter
    private String director;

    @Getter
    private String story;

    @Getter
    private int price;

@JsonCreator
    public MovieDTO(int i, String title, String category, String year, String cast, String director, String story, @JsonProperty("id") final int id) {

        this.id = id;
        this.title = this.title;
        this.category = this.category;
        this.year = this.year;
        this.cast = this.cast;
        this.director = this.director;
        this.story = this.story;
        this.price = price;

    }

}
