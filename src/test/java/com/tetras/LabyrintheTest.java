package com.tetras;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}