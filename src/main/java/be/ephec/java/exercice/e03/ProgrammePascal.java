package be.ephec.java.exercice.e03;

import java.util.Scanner;

public class ProgrammePascal {
    public static void main(String[] args) {
        System.out.println("Ce programme calcule le triangle de Pascal jusqu'a la ligne spécifiée");
        System.out.print("jusqu'a quelle ligne voulez-vous la calculer?");
        Scanner in = new Scanner(System.in);
        int nbLines = in.nextInt();

        int[][] triangle = Pascal.triangle(nbLines);

        for (int [] line : triangle){
            for (int val : line)
                System.out.print(val + " ");
                System.out.println();
        }

    }
}
