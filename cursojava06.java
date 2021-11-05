import java.util.Scanner;

public class cursojava06{
    public static void main(String[] args) {
        /*
        final int tamanho = 5;

        int[] num = new int[tamanho];

        num[0]=10;
        num[3]=5;

        int[] numeros = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        System.out.printf("%d \n", num[3]);
        System.out.printf("%d \n", numeros[1]);

        for(int i = 0; i <= numeros.length; i++){
            System.out.printf("%d - ", numeros[i]);
        }
        */

        Scanner scan = new Scanner(System.in);

        final int tam = 5;
        char[] gabarito = {'a', 'b', 'c', 'd', 'e'};
        char[] respostas = new char[tam];
        int nota = 0;

        for (int contador = 0; contador < tam; contador++){
            System.out.printf("Informe a resposta da questão %d: ", contador);
            respostas[contador] = scan.nextLine().charAt(0);
        }

        for (int contador = 0; contador < gabarito.length; contador++){
            if (gabarito[contador] == respostas[contador]){
                nota++;
            }
        }
    
        System.out.printf("Nota do aluno: %d", nota);
        scan.close();
    }
}