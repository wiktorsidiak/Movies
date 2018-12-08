package com.wseijavaee.movies.servise;

import lombok.Data;
import lombok.Getter;

@Data
public class MovieCastDATA {
@Getter
    private final String cast;

    public MovieCastDATA(final String cast) {this.cast = cast;}
}

