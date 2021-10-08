package com.ir.dp.structure.adapter.core;

/**
 * @author i-rain
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("play vlc file: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
