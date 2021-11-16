public class jogador13 {

    private final int maxVidas = 3;
    private int num = 0;
    private int vidas = 3;
    static boolean alerta = false;
    static int qtdJogadores = 0;
    static int pontosJogadores = 0;

    public jogador13(int num){
        this.num = num;
        this.vidas = 1;
        System.out.printf("Jogador número %d criado\n", num);
        qtdJogadores++;
    }

    public int getVidas(){
        return this.vidas;
    }

    public void addVidas(){
        if(this.vidas < maxVidas){
            this.vidas++;
        }
    }

    public void info(){
        System.out.printf("\nJogador: %d", this.num);
        System.out.printf("\nVidas: %d", this.vidas);
        System.out.printf("\nAlerta: %s", alerta ? "Sim" : "Não");
        System.out.printf("\nJogadores: %d", qtdJogadores);
        System.out.printf("\nPontos Jogadores: %d", pontosJogadores);
        System.out.println("\n--------------------------------");
    }
}