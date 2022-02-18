package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PacGommeTest {

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