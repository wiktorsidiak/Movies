package com.wseijavaee.movies.repository;


import com.wseijavaee.movies.model.Movie;
import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = Movie.class, idClass = String.class)
public interface MovieRepo {
   Movie save(Movie movie);

   Movie findByid(String id);
}
