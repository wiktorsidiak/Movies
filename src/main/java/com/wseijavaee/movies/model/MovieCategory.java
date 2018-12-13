package com.wseijavaee.movies.model;

public enum  MovieCategory {

    DRAMA("drama"),COMEDY("comedy"), FAMILY("family"),ACTION("action"),SCI_FI("sci_fi"),CLASSICS("classics");

    public String getCategory() {
        return category;
    }




    String category;

    MovieCategory(String category) {

        this.category = category;
    }
}
