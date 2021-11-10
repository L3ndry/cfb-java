public class cursojava12 {
    public static void main(String[] args) {

        int num=0;

        jogador12 jogador1 = new jogador12(num++);
        jogador12 jogador2 = new jogador12(num++);
        jogador12 jogador3 = new jogador12(num++);

        jogador3.addVidas();
        jogador3.addVidas();
        jogador3.addVidas();
        jogador3.addVidas();
        jogador1.addVidas();

        System.out.printf("O jogador 1 possui %d vida(s)!%n", jogador1.getVidas());
        System.out.printf("O jogador 2 possui %d vida(s)!%n", jogador2.getVidas());
        System.out.printf("O jogador 3 possui %d vida(s)!", jogador3.getVidas());
    }
}