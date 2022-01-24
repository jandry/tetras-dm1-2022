package com.tetras;

public class PacGommeFactory {

    private static int compteur = 0;

    public static IPacGomme getPacGomme() {
        IPacGomme result = null;
        compteur++;
        System.out.println(compteur);
        System.out.println(compteur%16);
        if (compteur % 16 == 0) {
            result = new PacGommeBoost();
        } else {
            result = new PacGommeNormale();
        }

        return result;
    }
}