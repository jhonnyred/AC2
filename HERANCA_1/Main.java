public class Main{
    public static void main(String[] args){
        // Instânciando as classes
        Fisica f1 = new Fisica("Rodrigo", "Leblon, RJ", "rodmilgrau@gmail.com", "5468724695");
        Juridica j1 = new Juridica("Kadu", "Boituva, SP", "kadu123@yahoo.com", "54687956423875");
        Funcionario fun1 = new Funcionario("Augusto", "Boituva, SP", "augustinho@yopmail.com", 1700);

        // Printando
        System.out.println(f1.printaTudo());
        System.out.println(j1.printaTudo());
        System.out.println(fun1.printaTudo());
    }
}
