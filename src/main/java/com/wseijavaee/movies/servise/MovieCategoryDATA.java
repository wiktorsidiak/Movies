package com.wseijavaee.movies.servise;

import lombok.Data;
import lombok.Getter;

@Data
public class MovieCategoryDATA {
    @Getter
    private final String category;

    public MovieCategoryDATA(final String category){this.category = category;}
}
