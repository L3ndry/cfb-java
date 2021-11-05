public class cursojava03{
    public static void main(String[] args){
        //IF
        //IF...ELSE
        //?
        //SWITCH
        
        // ==  >  <  >=  <=  !=  ! (true/false)
        int nota=8;
        int faltas=10;
        int maximoFaltas=5;
        int media=7;

        if(nota >= media && faltas <= maximoFaltas){
            System.out.println("Aprovado!");
        }else if(nota >= 4){
            System.out.println("Recuperação!");
        }
        else{
            System.out.println("Reprovado!");
        }
        System.out.println("Fim do programa.");

        int resultado;

        //resultado=(nota>=media ? "Aprovado-" : "Reprovado-");
        //System.out.println("Resultado: " + resultado);
        resultado=(nota>=media ? 1 : 0);
        System.out.println("Resultado: " + (resultado==1?"Aprovado--":"Reprovado--"));

        int posicao=7;

        switch(posicao){
            case 1:
                System.out.println("Primeriro lugar.");
                break;
            case 2:
                System.out.println("Segundo lugar.");
                break;
            case 3:
                System.out.println("Terceiro lugar.");
                break;
            case 4: case 5: case 6: 
                System.out.println("Prêmio de participação.");
                break;
            default:
                System.out.println("Sem prêmios.");
                break;
        }
    }
}