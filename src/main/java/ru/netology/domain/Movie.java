package ru.netology.domain;

public class Movie {
    public int id;
    public String name;
    public String genre;


    public Movie(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }
};