package it.peruvianit.pattern.strutture.decorator;

public class MainDecorator {
    public static void main(String[] args) {
        Figura cerchio =  new Cerchio();
        Figura cerchioRosso = new FiguraRossaDecorator(new Cerchio());
        Figura rettangoloRosso = new FiguraRossaDecorator(new Rettangolo());

        cerchio.operazione();
        cerchioRosso.operazione();
        rettangoloRosso.operazione();
    }
}
