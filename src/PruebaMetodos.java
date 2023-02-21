public class PruebaMetodos {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(100);
        cuenta.setSaldo(300);
        System.out.println(cuenta.getSaldo());
        cuenta.depositar(200);
        System.out.println(cuenta.getSaldo());

        cuenta.retirar(100);
        System.out.println(cuenta.getSaldo());

        Cuenta cuentaVladimir = new Cuenta(100);
        cuentaVladimir.depositar(1000);
        cuentaVladimir.transferir(400, cuenta);

        System.out.println(cuentaVladimir.getSaldo());
        System.out.println(cuenta.getSaldo());
    }
}
