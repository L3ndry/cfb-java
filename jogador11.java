public class jogador11 {
    
    private int numero=0;
    private int vidas=0;
    public jogador11(int num){
        this.numero=num;
        this.vidas=3;
        System.out.printf("Jogador número %d criado!%n", num);
        System.out.printf("O jogador número %d possui %d vidas!", num, vidas);
    }
}
