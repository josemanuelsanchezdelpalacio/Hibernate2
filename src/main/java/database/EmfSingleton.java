package database;


import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EmfSingleton {

    //instancia del singleton de la factoria
    private static EmfSingleton emfInstancia = new EmfSingleton();

    //unidad de persistencia donde estan las entidades
    static private final String PERSISTENCE_UNIT_NAME = "default";
    private EntityManagerFactory emf = null;

    //metodo que devuelve una instancia del singleton que permite acceder a la factoria
    public static EmfSingleton getInstance(){
        return emfInstancia;
    }

    private EmfSingleton(){}

    //los entity manager se crearan a partir de la factoria que devuelve este metodo
    public EntityManagerFactory getEmf(){
        if(this.emf == null)
            this.emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        return this.emf;
    }
}
