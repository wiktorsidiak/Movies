package com.wseijavaee.movies.servise;

import lombok.Data;
import lombok.Getter;

@Data
public class MovieYearDATA {
    @Getter
    private final String year;

    public MovieYearDATA(final String year){this.year = year;}
}
