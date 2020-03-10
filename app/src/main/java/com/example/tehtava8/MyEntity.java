package com.example.tehtava8;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity

public class MyEntity {

    @PrimaryKey(autoGenerate = true)
    public int avain;


    public String teksti;




}
