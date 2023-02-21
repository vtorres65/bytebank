public class PruebaReferencia {

    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.setNombre("Diego");
        diego.setDocumento("456789");
        diego.setTelefono(123456);

        Cuenta cuentaDiego = new Cuenta(1);
        cuentaDiego.setAgencia(1);
        cuentaDiego.setTitular(diego);

        System.out.println(cuentaDiego.getTitular());
    }
}
