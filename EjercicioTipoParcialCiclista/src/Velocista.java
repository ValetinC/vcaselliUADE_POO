public class Velocista extends Ciclista {
    private double potenciaPromedio;
    private double velocidadPromedio;
    private String tipoCiclista = "Velocista";

    public void setPotenciaPromedio(double potenciaPromedio){
        this.potenciaPromedio = potenciaPromedio;
    }
    public void setVelocidadPromedio(double velocidadPromedio){
        this.velocidadPromedio = velocidadPromedio;
    }
    public double getPotenciaPromedio(){
        return potenciaPromedio;
    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }
    public String imprimirTipo(){
        return "Es un " + this.tipoCiclista;
    }
}
