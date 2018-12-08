package com.wseijavaee.movies.servise;

import com.wseijavaee.movies.model.Movie;

public interface MovieServise {
    String saveMovie(MovieDATA movieDATA);

    MovieDATA getMovie(MovieIdDATA movieIdDATA);
}

