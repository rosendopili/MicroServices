package com.example.songsapi.Model;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name = "songs")
public class Song {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String title;

    @Column
    private String artist;

    @Column
    private double length;

    public Song(){}

    public long getId(){return id;}
    public void setId(long id){this.id = id;}
    public String getTitle(){return title;}
    public void setTitle(String title){this.title = title;}
    public String getArtist(){return artist;}
    public void setArtist(String artist){this.artist = artist;}
    public double getLength(){return length;}
    public void setLength(double length){this.length = length;}
}
