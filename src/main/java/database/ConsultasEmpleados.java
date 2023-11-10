package database;

import entities.DepartamentosEntity;
import entities.EmpleadosEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class ConsultasEmpleados {
    public static void leerEmps(EntityManager em) {
        EmpleadosEntity e = em.find(EmpleadosEntity.class, 7499);
        System.out.println(e.getApellido() + " el " + e.getOficio());
        //mostrar el nombre del departamento tambien
        List<EmpleadosEntity> es = em.createQuery("from EmpleadosEntity where deptNo = 20", EmpleadosEntity.class).getResultList();

        for (EmpleadosEntity empleados : es) {
            System.out.println(empleados.getApellido());
        }
    }

    public static void modificarEmpleado(EntityManager em) {
        EntityTransaction transaction = em.getTransaction();
        //comenzamos a crear el contexto de persistencia
        transaction.begin();
        EmpleadosEntity e = em.createQuery("from EmpleadosEntity where apellido like 'ARROYO'", EmpleadosEntity.class).getSingleResult();
        //a partir de aqui trabajo con el objeto instanciado que representa un registro de la base de datos
        System.out.println("Salario anterior: " + e.getSalario());
        e.setSalario(e.getSalario() + 1000);
        System.out.println("Salario actual: " + e.getSalario());

        //recuperamos un objeto departamento con el nuevo departamento
        /*System.out.println("Departamento anterior: ");
        DepartamentosEntity nuevoDep = em.createQuery("from DepartamentosEntity where deptNo = 30", DepartamentosEntity.class).getSingleResult();
        nuevoDep.setDnombre(nuevoDep.getDnombre());*/

        //al hacer el commit los cambios se pasan a la base de datos
        transaction.commit();
    }

    public static void crearNuevoEmpleado(EntityManager em) {

        EntityTransaction transaction = em.getTransaction();
        //comenzamos a crear el contexto de persistencia
        transaction.begin();

        EmpleadosEntity museo = new EmpleadosEntity();
        museo.getEmpNo("");
        museo.setApellido("MUSEO VIEJALES");
        museo.setOficio("Calle falsa");
        museo.setDir("Jaca");
        museo.setFechaAlt("España");
        museo.setSalario("España");
        museo.setComision("España");
        museo.setDeptNo("España");

        em.persist(museo);

        transaction.commit();

    }
}