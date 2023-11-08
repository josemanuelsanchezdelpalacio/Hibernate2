package database;

import entities.EmpleadosEntity;
import jakarta.persistence.EntityManager;

import java.util.List;

public class ConsultasEmpleados {
    public static void leerEmps(EntityManager em){
        EmpleadosEntity e = em.find(EmpleadosEntity.class, 7499);
        System.out.println(e.getApellido());
        //mostrar el nombre del departamento tambien
        List<EmpleadosEntity> es = em.createQuery("from EmpleadosEntity where deptNo = 20", EmpleadosEntity.class).getResultList();
        EmpleadosEntity e2 = em.createQuery("from EmpleadosEntity where empNo=7369", EmpleadosEntity.class).getSingleResult();

        for(EmpleadosEntity empleados : es){
            System.out.println(empleados.getDepartamentosByDeptNo().getDnombre());
        }
    }
}