import java.util.Scanner;
abstract class Ciclista {

    private int idCiclista;
    String  nombreCiclista;
    private int tiempoAcumulado = 0;

    public void setIdCiclista(int idCiclista){
        this.idCiclista = idCiclista;
    }

    public void setNombreCiclista(String nombreCiclista) {
        this.nombreCiclista = nombreCiclista;
    }

    public void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    public int getIdCiclista() {
        return idCiclista;
    }
    public String getNombreCiclista(){
        return nombreCiclista;
    }
    public int getTiempoAcumulado(){
        return tiempoAcumulado;
    }
}
