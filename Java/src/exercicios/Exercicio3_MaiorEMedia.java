package exercicios;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.xml.transform.Source;

/*
Faça um programa que leia 5 numeros
e informe o maior numero 
e a media desses numeros.
*/

public class Exercicio3_MaiorEMedia {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;
        do{
            System.out.println("Número: ");
            numero = scan.nextInt();

            if(numero > maior) maior = numero;

            soma = numero + soma ;
               
            count = count + 1;
            
        }while(count < 5);

        System.out.println("Maior: "+ maior);
        System.out.println("A media é  : "+ (soma/5)); 
    }
    
    }
