package com.oltruong.demo;

public class ImpotRevenu {

    public static double calculImpots(double revenuBrut, int nombreDeParts) {

        double revenuNet = revenuBrut * 0.9;
        double revenuSurQuotient = revenuNet / nombreDeParts;

        final int premiereFraction = 9710;
        final int deuxiemeFraction = 26818;
        final int troisiemeFraction = 71826;
        final int derniereFraction = 152108;


        double tranche1 = Math.max((Math.min(Math.max(revenuSurQuotient, premiereFraction), deuxiemeFraction) - premiereFraction) * 0.14, 0);
        double tranche2 = Math.max((Math.min(Math.max(revenuSurQuotient, deuxiemeFraction), troisiemeFraction) - deuxiemeFraction) * 0.3, 0);
        double tranche3 = Math.max((Math.min(Math.max(revenuSurQuotient, troisiemeFraction), derniereFraction) - troisiemeFraction) * 0.41, 0);
        double tranche4 = Math.max((Math.max(revenuSurQuotient, derniereFraction) - derniereFraction) * 0.45, 0);
        double impot = tranche1 + tranche2 + tranche3 + tranche4;


        return impot * nombreDeParts;
    }
}
