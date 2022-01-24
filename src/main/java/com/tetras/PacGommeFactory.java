package com.tetras;

public class PacGommeFactory {

    private static int compteur = 0;

    public static IPacGomme getPacGomme() {
        IPacGomme result = null;
        compteur++;
        if (compteur % 16 == 0) {
            result = new PacGommeBoost();
        } else {
            result = new PacGommeNormale();
        }
        return result;
    }
}