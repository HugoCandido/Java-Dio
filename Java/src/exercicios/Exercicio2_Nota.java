package exercicios;

import java.util.Scanner;

/*
 Faça um programa que peça uma nota, entre 0(zero) e 10(dez).
 Mostre uma mensagem caso o valor seja invalido e continue pedindo 
 até que o usuario insira uma valor valido,
*/

public class Exercicio2_Nota{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota:  ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10){
            System.out.println("Nota invalida! Digite novamente:");
            nota = scan.nextInt();

        }
        System.out.println("Nota " + nota + "   validada!");
    }
}