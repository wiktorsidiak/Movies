package com.wseijavaee.movies.servise;

import lombok.Data;
import lombok.Getter;

@Data
public class MoviePriceDATA {
    @Getter
    private final int price;

    public MoviePriceDATA(final int price) {this.price = price; }
}
