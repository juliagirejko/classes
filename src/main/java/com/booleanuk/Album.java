package com.booleanuk;

public class Album {
    String title;
    String artist;
    int year;
    String genre;
    boolean bandStillPerforming;
    String recordCompany;
    Double price;
    String format;

    public Album(String title, String artist, int year, String genre, boolean bandStillPerforming, String recordCompany, double price, String format){
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.genre = genre;
        this.bandStillPerforming = bandStillPerforming;
        this.recordCompany = recordCompany;
        this.price = price;
        this.format = format;
    }

    public Album(String title, String artist){
        this.title = title;
        this.artist = artist;
        this.year = 0;
        this.genre = "Undefined";
        this.bandStillPerforming = false;
        this.recordCompany = "Undefined";
        this.price = 0.00;
        this.format = "Undefined";
    }

    public Album(String title, String artist, double price){
        this.title = title;
        this.artist = artist;
        this.year = 0;
        this.genre = "Undefined";
        this.bandStillPerforming = false;
        this.recordCompany = "Undefined";
        this.price = price;
        this.format = "Undefined";
    }

    public String toString(){
        String album = "";
        album += "Title: " + this.title + "\n";
        album += "Artist: " + this.artist + "\n";
        album += "Year: " + this.year + "\n";
        album += "Genre: " + this.genre + "\n";
        album += "Still performing: " + this.bandStillPerforming + "\n";
        return album;
    }

}
