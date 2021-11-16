public class cursojava13 {
    public static void main(String[] args){

        int num = 0;

        jogador13.pontos();
        jogador13.pontos();
        jogador13.pontos();

        jogador13 j1 = new jogador13(++num);
        jogador13 j2 = new jogador13(++num);
        jogador13 j3 = new jogador13(++num);

        jogador13.alerta = true;

        j1.info();
        j2.info();
        j3.info();

    }
}