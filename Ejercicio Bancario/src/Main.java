public class Main {
    public static void main(String[] args) {
        Cuenta c1=new Cuenta ("C005", "PEPE", 0);
        Cuenta c2=new Cuenta ("C005", "ANA", 500.76f);

        c1.retirar(-1);
        c2.retirar(600);

        System.out.println("Cuenta 1: "+c1.getSaldo());
        System.out.println("Cuenta 2: "+c2.getSaldo());
        c2.retirar(400.76f);
        System.out.println("Cuenta 1: "+c1.getSaldo());
        System.out.println("Cuenta 2: "+c2.getSaldo());

        c1.setTitular("pepe flores");
        System.out.println("Titular cuenta 1: "+c1.getTitular());
    }
}
