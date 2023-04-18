package com.spring.restapi.databasedemo.db;

import com.spring.restapi.databasedemo.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Integer> {
}
