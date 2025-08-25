package it.peruvianit.pattern.creazionale.prototype;

public class Circle implements Shape{
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public void setColor(String color){
        this.color = color;
    }
    @Override
    public void draw() {
        System.out.println("Disegnando un cerchio di colore " + color);
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null; // Impossibile
        }
    }
}
