package com.tetras;

public class AbstractPacGomme implements IPacGomme {
    private Couleur couleur;

    private int taille;

    public AbstractPacGomme(Couleur couleur, int taille) {
        this.couleur = couleur;
        this.taille = taille;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public int getTaille() {
        return taille;
    }
}