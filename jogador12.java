public class jogador12 {

    private final int maxVidas=3;
    private int numero=0;
    private int vidas=0;

    public jogador12(int num) {
        this.numero=num;
        this.vidas=1;
        System.out.printf("Jogador número %d criado!%n", num);
    }

    public int getVidas(){
        return this.vidas;
    }

    public void addVidas(){
        if(this.vidas < maxVidas){
            this.vidas++;
        }
    }
}


