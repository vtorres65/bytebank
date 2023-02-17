public class PruebaMetodos {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.saldo = 300;
        cuenta.depositar(200);

        System.out.println(cuenta.saldo);
    }
}
