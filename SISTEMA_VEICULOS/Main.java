enum FREIOS{
    TAMBOR, DISCO, ABS;
}

public class Main {
    public static void main(String[] args){
        // INSTÂNCIANDO
        Bicicleta b1 = new Bicicleta("modelo", "14/10/2024", "marca", "amarelo", "material", 5, true);
        Caminhao c1 = new Caminhao("modelo", "14/10/2024", "montadora", "verde", 5000.21, 4, 10);
        Domestico d1 = new Domestico("modelo", "14/10/2024", "montadora", "cor", 10000, 5, FREIOS.ABS, true);
        Motocicleta m1 = new Motocicleta("modelo", "14/10/2024", "montadora", "amarelo", 5000, 6000, 75.98);
        Skate s1 = new Skate("modelo", "14/10/2024", "marca", "vermelho", 74, 5);

        // SAÍDA
        System.out.println(b1.printaTudo());
        System.out.println(c1.printaTudo());
        System.out.println(d1.printaTudo());
        System.out.println(m1.printaTudo());
        System.out.println(s1.printaTudo());
    }
}
