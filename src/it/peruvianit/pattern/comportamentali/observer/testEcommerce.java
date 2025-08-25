package it.peruvianit.pattern.comportamentali.observer;

public class testEcommerce {
    public static void main(String[] args) {
        ConcreteEcommerceSubject concreteEcommerceSubject = new ConcreteEcommerceSubject();
        ConcreteEcommerceObserver concreteEcommerceObserverSergio = new ConcreteEcommerceObserver("Sergio");
        ConcreteEcommerceObserver concreteEcommerceObserverAlessandro = new ConcreteEcommerceObserver("Alessandro");

        concreteEcommerceSubject.register(concreteEcommerceObserverSergio);
        concreteEcommerceSubject.register(concreteEcommerceObserverAlessandro);

        concreteEcommerceSubject.notifyObservers();
    }
}
