package com.wseijavaee.movies.servise;

import lombok.Data;
import lombok.Getter;

@Data
public class MoviePriceDATA {
    @Getter
    private final float price;

    public MoviePriceDATA(final float price) {this.price = price; }
}
