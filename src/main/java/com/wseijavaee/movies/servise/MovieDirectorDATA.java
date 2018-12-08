package com.wseijavaee.movies.servise;

import lombok.Data;
import lombok.Getter;

@Data
public class MovieDirectorDATA {
    @Getter
    private final String director;

    public MovieDirectorDATA(final String director){this.director = director;}
}
