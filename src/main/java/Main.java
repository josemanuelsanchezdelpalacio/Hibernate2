import database.EmfSingleton;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import static database.ConsultasEmpleados.leerEmps;
import static database.ConsultasEmpleados.modificarEmpleado;

public class Main {

    static EntityManagerFactory emf = EmfSingleton.getInstance().getEmf();
    public static EntityManager em = emf.createEntityManager();

    public static void main(String[] args){
        leerEmps(em);
        modificarEmpleado(em);
        desconectar();
    }

    private static void desconectar(){
        em.close();
        emf.close();
    }
}
