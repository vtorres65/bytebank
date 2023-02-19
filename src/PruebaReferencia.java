public class PruebaReferencia {

    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.nombre = "Diego";
        diego.documento = "456789";
        diego.telefono = 123456;

        Cuenta cuentaDiego = new Cuenta();
        cuentaDiego.setAgencia(1);
        cuentaDiego.titular = diego;

        System.out.println(cuentaDiego.titular.documento);
    }
}
