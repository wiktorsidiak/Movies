package com.wseijavaee.movies.model;
import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id", length = 12,nullable = false)
    @Getter
            private int id;
    @Column (name = "title", length = 400, nullable = false)
    @Getter
            private String title;
    @Column (name = "category", length = 50, nullable = true)
    @Getter
            private String  category;
    @Column (name = "year", length = 4, nullable = true)
    @Getter
            private String year;
    @Column (name = "cast", length = 4000, nullable = true)
    @Getter
            private String cast;
    @Column (name = "director", length = 4000, nullable = true)
    @Getter
            private String director;
    @Column (name = "story", length = 4000, nullable = true)
    @Getter
            private String story;
    @Column (name = "price", length = 5, nullable = true)
    @Getter
            private int price;
    public Movie(){

    }
    public Movie (final int id, final String title,
                 final String category, final String year,
                 final String cast, final String director,
                 final String story, final int price) {

        this.id = id;
        this.title = title;
        this.category = category;
        this.year = year;
        this.cast = cast;
        this.director = director;
        this.story = story;
        this.price = price;

    }
}

