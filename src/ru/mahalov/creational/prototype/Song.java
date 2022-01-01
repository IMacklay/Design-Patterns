package ru.mahalov.creational.prototype;

import ru.mahalov.creational.singleton.MusicSourceSingleton;

public class Song implements Cloneable{

    private String author;
    private String title;
    private int lengthMs;
    private MusicSourceSingleton musicSource;

    public Song(String author, String title, int lengthMs, MusicSourceSingleton musicSource) {
        this.author = author;
        this.title = title;
        this.lengthMs = lengthMs;
        this.musicSource = musicSource;
    }

    @Override
    public Song clone() throws CloneNotSupportedException {
        return (Song) super.clone();
    }

    @Override
    public String toString() {
        return "Song{" +
                "Author='" + author + '\'' +
                ", Title='" + title + '\'' +
                ", length=" + lengthMs +
                ", musicSource='" + musicSource + '\'' +
                '}';
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLengthMs(int lengthMs) {
        this.lengthMs = lengthMs;
    }

    public void setMusicSource(MusicSourceSingleton musicSource) {
        this.musicSource = musicSource;
    }

    public MusicSourceSingleton getMusicSource() {
        return musicSource;
    }
}
