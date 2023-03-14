package com.example.springbootjpaapi.service;

import com.example.springbootjpaapi.entity.Singer;
import com.example.springbootjpaapi.repository.SingerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SingerServiceImp implements SingerService {

    @Autowired
    SingerRepository singerRepository;

    @Override
    public Singer saveSinger(Singer singer) {
          return this.singerRepository.save(singer);
    }

    @Override
    public List<Singer> getAllSinger() {
        return this.singerRepository.findAll();
    }

    @Override
    public List<Singer> getAllSingerWithSameRating(int rating) {
        return this.singerRepository.findBySingerRating(rating);
    }

    @Override
    public List<Singer> getAllSingerWithSameRatingAndType(String type, int rating) {
        return this.singerRepository.findBySingerTypeAndSingerRating(type,rating);
    }

    @Override
    public void deleteSinger(int id) {
         this.singerRepository.deleteById(id);
    }
}
