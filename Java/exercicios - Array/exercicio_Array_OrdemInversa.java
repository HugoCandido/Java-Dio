public class exercicio_Array_OrdemInversa {
 
    public static void main(String[] args) {
        
        int [] vetor = {02,15,24,33,54,25};

        System.out.println("Vetor:  ");
        
        int count = 0;
        while(count <= vetor.length -1) {

            System.out.print(vetor[count] + " ");
            count ++;
        }
System.out.println("\nVetor inverso:  ");
        for(int i = (vetor.length -1); i >= 0 ; i-- ){
            System.out.print(vetor[i] + " ");
        }
    }

}
