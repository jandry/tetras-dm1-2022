package com.tetras;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LabyrintheTest {

    @Test
    public void testSeiziemeEstPacGommeBoost() {
        Labyrinthe labyrinthe = new Labyrinthe();
        for (int i = 0; i < 15; i++) {
            // 15 jaunes
            assertEquals(Couleur.Jaune, labyrinthe.ajouterPacGomme().getCouleur());
        }
        // 16ème bleu
        assertEquals(Couleur.Bleu, labyrinthe.ajouterPacGomme().getCouleur());
        // 17ème jaune
        assertEquals(Couleur.Jaune, labyrinthe.ajouterPacGomme().getCouleur());
    }

    @Test
    public void testPacmanEstUnique() {
        Labyrinthe labyrinthe = new Labyrinthe();
        assertEquals(labyrinthe.getPacman(), Pacman.getInstance());
    }


    @Test
    public void testPacGommeNormal() {
        IPacGomme result = new PacGommeNormale();
        assertEquals(Couleur.Jaune, result.getCouleur());
        assertEquals(5, result.getTaille());
    }

    @Test
    public void testPacGommeBoost() {
        IPacGomme result = new PacGommeBoost();
        assertEquals(Couleur.Bleu, result.getCouleur());
        assertEquals(10, result.getTaille());
    }
}