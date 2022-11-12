package exercicios;

import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a;
        int b;
        
    
        System.out.println("valor 1: ");
        a = scan.nextInt();
        
        System.out.println("valor 2: ");
        b = scan.nextInt();
        
        if(a == b){
          System.out.println("São iguais");
        }else{
          System.out.println("Não são iguais");
        }
          
    
        }   
}
