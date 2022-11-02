package com.zoolatech.lecture3.tasks;

public class MusicalInstrument {
    private String name;
    private String sound;

    public MusicalInstrument(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    void play() {
        System.out.println(sound);
    }

    @Override
    public String toString() {
        return name;
    }
}
