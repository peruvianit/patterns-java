package it.peruvianit.pattern.strutture.decorator;

public class FiguraRossaDecorator extends FiguraDecorator{
    public FiguraRossaDecorator(Figura figura){
        super(figura);
    }

    public void operazione(){
        figura.operazione();
        setBordoRosso();
    }

    public void  setBordoRosso(){
        System.out.println("Bordo rosso");
    }
}
