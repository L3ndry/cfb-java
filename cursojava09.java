public class cursojava09{
    public static void main(String[] args){

        // String pra ser mostrada, e a quantidade de repetiçôes
        mostre("CFB Cursos", 3);
        mostre("Curso de Java", 2);
        mostre("Wagner Leandro", 1);
        System.out.println(somar2(-4, 5));
        // Pode haver métodos com o mesmo nome, todavia é necessário mudar o tipo de parâmetro
        System.out.println(somar(1, 2, 4, -2));
        System.out.println(somar(1.2, 2.2, 4.2, -2.2));

    }

    public static int somar(int... numeros){
        int resultado=0;
        for(int numero:numeros){
            resultado+=numero;
        }
        return resultado;
    }

    public static Double somar(Double... numeros){
        Double resultado=0.0;
        for(Double numero:numeros){
            resultado+=numero;
        }
        return resultado;
    }

    public static int somar2(int numero1, int numero2){
        int soma = numero1 + numero2;
        return soma;
    }

    public static void mostre(String mensagem, int repeticoes){
        for(int contador=0; contador<repeticoes; contador++){
            System.out.println(mensagem);
        }
    }
}
