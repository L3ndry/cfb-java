public class cursojava14 {
    public static void main(String[] args){

        carro14 c1 = new carro14("Golf");
        carro14 c2 = new carro14("HRV");
        carrocombate14 c3 = new carrocombate14("Leopardo", 100);
        carrocombate14 c4 = new carrocombate14("Pantera", 50);

        c3.atirar();
        c3.atirar();
        c3.atirar();
        c4.sofrerDano(30);
        c1.sofrerDano(5);

        c1.info();
        c2.info();
        c3.info();
        c4.info();
    }
}
