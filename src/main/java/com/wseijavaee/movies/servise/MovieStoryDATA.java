package com.wseijavaee.movies.servise;

import lombok.Data;
import lombok.Getter;

@Data
public class MovieStoryDATA {
@Getter
private final String story;

    public MovieStoryDATA(final String story) {
        this.story = story;
    }
}

