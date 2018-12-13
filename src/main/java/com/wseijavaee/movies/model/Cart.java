package com.wseijavaee.movies.model;

import javax.persistence.*;


@Entity
@Table(name = "cart")
public class Cart {
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "cart")
   

    @MapsId("id")
    @JoinColumn(name = "id",nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    public Movie getId(Movie id){
        return id;
    };






}
