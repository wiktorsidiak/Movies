package com.wseijavaee.movies.servise;

import lombok.Data;
import lombok.Getter;

@Data
public class MovieTitleDATA {
    @Getter
    private final String title;

    public MovieTitleDATA(final String title) {this.title = title;}
}
