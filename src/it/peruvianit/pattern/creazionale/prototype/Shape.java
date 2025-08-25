package it.peruvianit.pattern.creazionale.prototype;

public interface Shape extends Cloneable{
    void draw();
    Object clone();
}
