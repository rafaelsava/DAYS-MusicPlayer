package edu.unisabana.dyas.patterns.utils;

public class AdvancedAudioPlayerAdapter implements AudioPlayer{

    private final AdvancedAudioPlayer advancedAudioPlayer;
    public AdvancedAudioPlayerAdapter(AdvancedAudioPlayer advancedAudioPlayer){
        this.advancedAudioPlayer = advancedAudioPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedAudioPlayer.playVlc(fileName);
        } else if(audioType.equalsIgnoreCase("mp4")){
            advancedAudioPlayer.playMp4(fileName);
        }

    }

    @Override
    public void stop() {
        advancedAudioPlayer.stop();
    }
}
