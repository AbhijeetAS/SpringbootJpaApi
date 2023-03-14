package com.example.springbootjpaapi.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "singer")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Singer {

    @Id
    private int singerId;
    private String singerName;

    private int singerRating;
    private String singerType;


}
