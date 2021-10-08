package com.ir.dp.structure.adapter;

import com.ir.dp.structure.adapter.core.AudioPlayer;

/**
 * @author i-rain
 */
public class AdapterDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "1");
        audioPlayer.play("mp4", "2");
        audioPlayer.play("vlc", "3");
        audioPlayer.play("avi", "3");
    }
}
