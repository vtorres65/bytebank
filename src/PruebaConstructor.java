public class PruebaConstructor {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(54);
        Cuenta cuenta2 = new Cuenta(53);

        System.out.println(cuenta.getAgencia());
    }
}
