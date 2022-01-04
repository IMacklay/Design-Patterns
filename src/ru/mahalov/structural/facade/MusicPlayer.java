package ru.mahalov.structural.facade;

public class MusicPlayer {

    PlayList playList;

    public MusicPlayer(PlayList playList) {
        this.playList = playList;
    }

    public void playMusic(){
        System.out.println("Music is playing now: \n" +
                playList.getListOfSongs().stream()
                        .map((x)-> x.artist+" "+x.title )
                        .reduce((x,y)->x+"\n"+y).orElse("")
                +"\n"
        );
    }
}
