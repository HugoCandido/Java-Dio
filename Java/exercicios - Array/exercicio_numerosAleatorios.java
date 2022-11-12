import java.util.Random;

/*
Faça um programa que leia 20 números aleatorios (entre 0 e 100) armazeno-os num vetor.
Ao final mostre os números e seus sucessores.

*/


public class exercicio_numerosAleatorios {

    public static void main(String[] args) {
        Random random =  new Random();

        int [] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Números Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores dos Números Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero +1) + " ");
        }

        System.out.print("\nAntecessor dos Números Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero -1) + " ");
        }
    }
}
