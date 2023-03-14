package com.example.springbootjpaapi.repository;

import com.example.springbootjpaapi.entity.Singer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SingerRepository extends MongoRepository<Singer,Integer> {


    public  List<Singer> findBySingerRating(int singerRating);

    public List<Singer> findByCapitalLetter(char ch);
    public List<Singer> findBySingerTypeAndSingerRating(String singerType,int singerRating);
}
