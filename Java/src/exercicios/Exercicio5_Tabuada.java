package exercicios;

import java.util.Scanner;

import javax.sound.midi.Soundbank;
import javax.sound.sampled.SourceDataLine;

/*
Desenvolva um gerador de tabuada, 
capaz de gerar a tabuada de qualquer numero entre 1 e 10. O usuario deve informar de qual numero ele deseja ver
a tabuada.
A saida deve ser conforme o exemplo logo abaixo: 

Tabuada de 5:
1 x 5 = 5 
2 x 5 = 10
3 x 5 = 15
...
10 x 5 = 50
*/

public class Exercicio5_Tabuada {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Tabuada: ");
    int tabuada = scan.nextInt();

    System.out.println("Tabuada de "+ tabuada);

    for( int i = 1; i <= 10 ; i = i + 1 ){
        System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
    }

  }
    
}
