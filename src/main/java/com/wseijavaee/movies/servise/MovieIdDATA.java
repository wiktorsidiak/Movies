package com.wseijavaee.movies.servise;

import lombok.Data;
import lombok.Getter;

@Data
public class MovieIdDATA {
    @Getter
    private final int Id;

    public MovieIdDATA(final int Id) { this.Id = Id;}
}

