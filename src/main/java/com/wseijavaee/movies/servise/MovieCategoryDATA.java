package com.wseijavaee.movies.servise;

import com.wseijavaee.movies.model.MovieCategory;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
public class MovieCategoryDATA {
    @Getter
    private final String category;

    public MovieCategoryDATA(final String category){this.category = category;}
}
