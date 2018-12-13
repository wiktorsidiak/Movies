package com.wseijavaee.movies.servise;

import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;

@Data
public class MoviePriceDATA {
    @Getter
    private final BigDecimal price;

    public MoviePriceDATA(final BigDecimal price) {this.price = price; }
}
