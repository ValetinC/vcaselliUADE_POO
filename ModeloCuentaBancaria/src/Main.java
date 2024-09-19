
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CuentaBancaria Juan = new CuentaBancaria();
        Juan.CrearCuenta("Juan", "Gildo","Cuenta de ahorros");
        //Juan.getAtributosCuenta();
        CuentaBancaria Jeffrey = new CuentaBancaria();
        Jeffrey.CrearCuenta("Jeffrey", "Bezos", "Cuenta Corriente");
        Juan.ModificarSaldo(1000.75);
        Jeffrey.ModificarSaldo(1000000000000.00);
        Juan.getsaldoCuenta();
        Juan.ModificarSaldo();
        Juan.getsaldoCuenta();
        System.out.println(Juan.CompararSaldos(Jeffrey));

    }
}