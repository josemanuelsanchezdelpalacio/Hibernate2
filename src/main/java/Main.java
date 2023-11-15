import database.EmfSingleton;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import static database.ConsultarDepartamentosP.leerDepartamentosP;
import static database.ConsultarEmpleadosP.*;

public class Main {
    //Contexto de persistencia haciendo uso del singleton
    static EntityManagerFactory emf = EmfSingleton.getInstance().getEmf();
    public static EntityManager em = emf.createEntityManager();

    public static void main(String[] args) {
        //leerEmpleados(em);
        //leerDepartamentosP(em);
        //modificarEmpleado(em);
        crearEmpleadoP(em);
        desconectar();
    }

    private static void desconectar() {
        em.close();
        emf.close();
    }


}