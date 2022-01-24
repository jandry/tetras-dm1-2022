package com.tetras;

public class Pacman {

    private static Pacman pacman = new Pacman();

    private Pacman() {
    }

    public static Pacman getInstance() {
        return pacman;
    }

}