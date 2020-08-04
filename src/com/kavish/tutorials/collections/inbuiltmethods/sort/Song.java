package com.kavish.tutorials.collections.inbuiltmethods.sort;


public class Song implements Comparable<Song> {

   private String title;
   private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public int compareTo(Song s) {
        return title.compareTo(s.getTitle());
    }

    @Override
    public String toString() {
        return title;
    }
}
