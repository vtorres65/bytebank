public class PruebaMetodos {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.saldo = 300;
        System.out.println(cuenta.saldo);
        cuenta.depositar(200);
        System.out.println(cuenta.saldo);

        cuenta.retirar(100);
        System.out.println(cuenta.saldo);

        Cuenta cuentaVladimir = new Cuenta();
        cuentaVladimir.depositar(1000);
        cuentaVladimir.transferir(400, cuenta);

        System.out.println(cuentaVladimir.saldo);
        System.out.println(cuenta.saldo);
    }
}
