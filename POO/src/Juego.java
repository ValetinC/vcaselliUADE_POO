public class Juego {

    public int numVidas;

    public void vidasConstructor(int vidas){
        this.numVidas=vidas;
    }

    public int MuestraVidasRestantes(){
        return this.numVidas;
    }

    public int danio(){
        this.numVidas--;
        return this.numVidas;
    }
}
