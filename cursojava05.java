import java.util.Scanner;

public class cursojava05{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /* For

        for(int controle=1; controle<6; controle++){
            System.out.println(controle + " - CFB Cursos");
        }
        */
        /* While 

        System.out.print("Digite a quantidade de repetiçoes: ");
        int maximo = scan.nextInt();
        int contador=1;
        while(contador <= maximo){
            System.out.println(contador + " - CFB Cursos.");
            contador++;
        }
        */
        int cont=0;
        do{
            System.out.println(cont + " - CFB Cursos|");
            cont++;
        } while(cont<0);
        System.out.println("Fim do programa.");
        scan.close();
    }
}