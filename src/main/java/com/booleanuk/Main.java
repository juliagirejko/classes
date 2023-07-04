package com.booleanuk;

public class Main {
    public static void main(String[] args) {
        Album pinkFloydAlbum = new Album("Dark Side of Moon", "Pink Floyd", 1973, "Progressive Rock", true, "record1", 12.99, "Vinyl");
        Album beatlesAlbum = new Album("White Album", "The Beatels", 1967, "Rock", false, "record2", 10.99, "CD");
        Album remAlbum = new Album("Automatic for the People", "REM");
        Album edAlbum = new Album("Divide", "Ed Sheeran", 15.99);
        Album tainyAlbum = new Album("DATA", "Tainy", 18.89);

        System.out.println(pinkFloydAlbum.title + " by " + pinkFloydAlbum.artist);
        System.out.println(beatlesAlbum.title + " by " + beatlesAlbum.artist);
        System.out.println(remAlbum.title + " by " + remAlbum.artist);

        System.out.println(pinkFloydAlbum);
        System.out.println(beatlesAlbum);
        System.out.println(remAlbum);

        Book book1 = new Book("The Lord of the Rings", "JRR Tolkien", 11.99, 1954, "Fantasy", false);
        Book book2 = new Book("Hobbit", "JRR Tolkien", 13.99, 1956, "Fantasy", false);
        Book book3 = new Book("Why do we sleep?", "Matthew Walker", 7.99, 2019, "Undefined", false);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}