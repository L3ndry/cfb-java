import java.util.Arrays;

public class cursojava07 {
    public static void main(String[] args) {
        final int tam=10;
        int[] num = {1, 2, 5, 6, 7, 3, 1, 10, 23, 32};
        int[] numeros = new int[tam];

        //Arrays.fill(numeros, 10);
        //System.arraycopy(num, 0, numeros, 0, tam);
        //System.out.printf("Os arrays são iguais?: %s", Arrays.equals(num, numeros) ? "Sim\n" : "Não\n");

        int elemento = 23;
        Arrays.sort(num);
        int posicao = Arrays.binarySearch(num, elemento); // Só funciona se o Array estiver em ordem.
        
        System.out.printf("Os arrays são iguais? %s", Arrays.equals(num, numeros) ? "Sim.\n" : "Não.\n");
        System.out.printf("O elemento %d se encontra no segundo Array? %s, na posição %d\n", elemento, posicao > 0 ? "Sim" : "Não", posicao+1);

        for(int n:numeros) 
            System.out.printf("- %d ", n);

        System.out.println("");
        for (int n:num) 
            System.out.printf("- %d ", n);
    }
}
