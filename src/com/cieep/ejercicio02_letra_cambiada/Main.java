package com.cieep.ejercicio02_letra_cambiada;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = scanner.nextLine();

        frase = frase.replace('e', 'a');
        frase = frase.replace('E', 'A');

        StringTokenizer st = new StringTokenizer(frase);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        System.out.println("FIN");
    }
}