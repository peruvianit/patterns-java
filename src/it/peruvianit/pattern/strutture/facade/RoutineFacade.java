package it.peruvianit.pattern.strutture.facade;

public class RoutineFacade {
    private final Sveglia sveglia;
    private final Studio studio;
    private final Mangio mangio;
    private final Dormi dormi;

    public RoutineFacade(){
        this.sveglia = new Sveglia();
        this.studio = new Studio();
        this.mangio = new Mangio();
        this.dormi = new Dormi();
    }

    public void rutineStudente(){
        sveglia.svegliaStudente();
        studio.studioStudente();
        mangio.MangiaStudente();
        dormi.dormeStudente();
    }
}
