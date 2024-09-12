public class Escalador extends Ciclista{
    private float accPromSubida;
    private float gradRampaSoportada;
    private String tipoCiclista = "Escalador";

    public void setAccPromSubida(float accPromSubida) {
        this.accPromSubida = accPromSubida;
    }

    public void setGradRampaSoportada(float gradRampaSoportada) {
        this.gradRampaSoportada = gradRampaSoportada;
    }

    public float getAccPromSubida() {
        return accPromSubida;
    }

    public float getGradRampaSoportada() {
        return gradRampaSoportada;
    }
    public String imprimirTipo(){
        return "Es un " + this.tipoCiclista;
    }
}
