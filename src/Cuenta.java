public class Cuenta {
    //entidad Cuenta:
        double saldo;
        int agencia;
        int numero;
        String titular;

        void depositar(double valor){
            saldo += valor;
        }
}
