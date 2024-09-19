public class CuentaBancaria {

    private String nombreTitular;
    private String apellidoTitular;
    private int numeroDeCuenta;
    private String tipoDeCuenta;
    private double saldoCuenta;

    private double interes = 1.025;

    private int CONSTANTE=0;
    public void CrearCuenta(String nombreTitular, String apellidoTitular, String tipoDeCuenta){
        CONSTANTE++;
        this.nombreTitular = nombreTitular;
        this.apellidoTitular = apellidoTitular;
        this.tipoDeCuenta = tipoDeCuenta;
        this.saldoCuenta = 0;
        this.numeroDeCuenta=CONSTANTE;
    }

    public double getsaldoCuenta(){
        return this.saldoCuenta;
    }

    public void ModificarSaldo( double valor){
        if (this.saldoCuenta < (valor *-1)){
            System.out.println("Saldo insuficiente");
        } else {
            this.saldoCuenta = this.saldoCuenta + valor;
        }
    }
    public void ModificarSaldo(){
        this.saldoCuenta= this.saldoCuenta*interes;
    }
    public void ModificarSaldo(CuentaBancaria destino, double valor){
        if (this.saldoCuenta < (valor *-1)){
            System.out.println("Saldo insuficiente para la transferencia");
        } else {
            destino.ModificarSaldo(valor);
            System.out.println("La transferencia ha sido enviada satisfactoriamente");
        }
    }

    public void getAtributosCuenta(){
        System.out.println(nombreTitular + " " + apellidoTitular);
        System.out.println(tipoDeCuenta + "  N° cuenta: " + numeroDeCuenta);
        System.out.println("$" + saldoCuenta);
    }

    public boolean CompararSaldos(CuentaBancaria saldo2){
        if(this.saldoCuenta >= saldo2.saldoCuenta){
            return true;
        }
        return false;

    }

    public boolean CuentaActiva(){
        if(this.saldoCuenta > 0)
            return true;
        else
            return false;
    }

}

