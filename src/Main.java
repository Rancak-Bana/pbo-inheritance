public class Main {

    public static void main(String[] args) {
        SepedaGunung Poligon = new SepedaGunung();
        Poligon.gear = 1;
        Poligon.pedal = 2;
        Poligon.kecepatan = 40;
        Poligon.setLampu(1);
        Poligon.setShockbreaker(2);
        Poligon.setTempatMinum(1);
        System.out.println("Jumlah gear:" + Poligon.gear
                + ", Jumlah Pedal:" + Poligon.pedal
                + ", kecepatan:" + Poligon.kecepatan
                + ",Lampu:" + Poligon.getLampu()
                + ", Shockbreaker:" + Poligon.getShockbreaker());
    }
}