
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Juego link = new Juego();

        link.vidasConstructor(5);

        System.out.println("Link tiene " + link.MuestraVidasRestantes() + " vidas");

        System.out.println("Link sufrio daño, ahora tiene " + link.danio() + " vidas");

        Juego zelda = new Juego();

        zelda.vidasConstructor(5);

        System.out.println("Zelda tiene " + zelda.MuestraVidasRestantes() + " vidas");

    }
}