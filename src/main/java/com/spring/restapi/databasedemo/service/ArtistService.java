package com.spring.restapi.databasedemo.service;

import com.spring.restapi.databasedemo.model.Artist;

import java.util.List;

public interface ArtistService {
    Artist get(Integer id);

    List<Artist> listArtist();
}

