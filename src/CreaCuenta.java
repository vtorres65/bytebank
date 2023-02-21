public class CreaCuenta {

    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(1000);

        System.out.println(primeraCuenta.getSaldo());

        Cuenta segundaCuenta = new Cuenta(2000);

        System.out.println(segundaCuenta.getSaldo());

        Cuenta miCuenta = new Cuenta(500);
        Cuenta otraCuenta = miCuenta;
        otraCuenta.setSaldo(1000);

        System.out.println(miCuenta.getSaldo());

        Cuenta primeraCuent = new Cuenta(200);
        System.out.println(primeraCuent.getSaldo());

        primeraCuent.setSaldo(100);
        System.out.println(primeraCuent.getSaldo());

        Cuenta segundaCuent = primeraCuenta;
        segundaCuenta.setSaldo(50);

        System.out.println("primera cuenta tiene " + primeraCuent.getSaldo());
        System.out.println("segunda cuenta tiene " + segundaCuent.getSaldo());
    }
}
