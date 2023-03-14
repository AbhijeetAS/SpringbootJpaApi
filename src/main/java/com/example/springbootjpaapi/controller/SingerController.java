package com.example.springbootjpaapi.controller;

import com.example.springbootjpaapi.entity.Singer;
import com.example.springbootjpaapi.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class SingerController {
    @Autowired
    SingerService singerService;

    @GetMapping("/getAll")
    public List<Singer> getAll()
    {
        return this.singerService.getAllSinger();
    }

    @GetMapping("/getAll/{rating}")
    public  List<Singer> getAllByRating( @PathVariable int rating)
    {
        System.out.println(rating);
        return this.singerService.getAllSingerWithSameRating(rating);
    }

    @GetMapping("/getAll/{type}/{rating}")
    public  List<Singer> getAllByRatingAndType(@PathVariable("type") String type,@PathVariable("rating") int rating)
    {
        return this.singerService.getAllSingerWithSameRatingAndType(type, rating);
    }

    @PostMapping("/add")
    public Singer saveSinger(@RequestBody Singer singer)
    {
        return this.singerService.saveSinger(singer);

    }

    @DeleteMapping("/{id}")

    public String deleteSinger(@PathVariable("id") int id)
    {
        this.singerService.deleteSinger(id);
        return "delete Sussefully";
    }

}
