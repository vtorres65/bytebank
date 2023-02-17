public class CreaCuenta {

    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo = 1000;

        System.out.println(primeraCuenta.saldo);

        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.saldo = 2000;

        System.out.println(segundaCuenta.saldo);

        Cuenta miCuenta = new Cuenta();
        miCuenta.saldo = 500.0;
        Cuenta otraCuenta = miCuenta;
        otraCuenta.saldo += 1000.0;

        System.out.println(miCuenta.saldo);

        Cuenta primeraCuent = new Cuenta();
        primeraCuent.saldo = 200;
        System.out.println(primeraCuent.saldo);

        primeraCuent.saldo += 100;
        System.out.println(primeraCuent.saldo);

        Cuenta segundaCuent = primeraCuenta;
        segundaCuenta.saldo = 50;

        System.out.println("primera cuenta tiene " + primeraCuent.saldo);
        System.out.println("segunda cuenta tiene " + segundaCuent.saldo);
    }
}
