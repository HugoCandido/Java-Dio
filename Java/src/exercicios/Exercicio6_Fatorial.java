package exercicios;
/*
Faça um programa que calcule o fatorial de um numero inteiro fornecido pelo usuario.
*/

import java.net.SocketPermission;
import java.util.Scanner;

import javax.sound.midi.Soundbank;



public class Exercicio6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para descobrir seu fatorial: ");
        int fatorial = scan.nextInt();
        int multiplicacao = 1;

        System.out.print(fatorial + "! = ");
        for( int i = fatorial ; i >= 1 ; i -- ){

            multiplicacao = multiplicacao * i ;
        }
        System.out.println(multiplicacao);

    }
    
}
