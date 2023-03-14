package com.example.springbootjpaapi.service;

import com.example.springbootjpaapi.entity.Singer;

import java.util.List;

public interface SingerService {

    //save the singer
    public Singer saveSinger(Singer singer);

    //get all singer
    public List<Singer> getAllSinger();

    //get All Singer With the Same Rating
    public List<Singer> getAllSingerWithSameRating(int rating);

    //get all the singer with the same type and same Rating
    public List<Singer> getAllSingerWithSameRatingAndType(String type,int rating);

    //delete the singer with the id
    public void deleteSinger(int id);

}
