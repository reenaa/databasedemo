package com.spring.restapi.databasedemo.service;

import com.spring.restapi.databasedemo.db.ArtistRepository;
import com.spring.restapi.databasedemo.model.Artist;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ArtistServiceImpl implements ArtistService{
    @Autowired ArtistRepository artistRepository;

    @Override
    public Artist get(Integer id){
        return artistRepository.findById(id).get();
    }
    @Override
    public List<Artist> listArtist(){
        return artistRepository.findAll();
    }
}
