public class Contrarrelojista extends Ciclista{
    private double velocidadMax;
    private String tipoCiclista = "Contrarrelojista";

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }
    public String imprimirTipo(){
        return "Es un " + this.tipoCiclista;
    }
}
