package com.tetras;

import java.util.ArrayList;
import java.util.List;

public class Labyrinthe {
    private List<IPacGomme> pacGommeList = new ArrayList<>();
    private Pacman pacman = Pacman.getInstance();

    public Pacman getPacman() {
        return pacman;
    }

    public List<IPacGomme> getPacGommeList() {
        return pacGommeList;
    }

    public IPacGomme ajouterPacGomme() {
        IPacGomme result = PacGommeFactory.getPacGomme();
        pacGommeList.add(result);
        return result;
    }
}