public class cursojava09{
    public static void main(String[] args){

        for(int contador=0; contador < 3; contador++){
            canal("CFB Cursos");
            canal("Curso de Java");
        }
    }

    public static void canal(String mensagem){
        System.out.println(mensagem);
    }
}