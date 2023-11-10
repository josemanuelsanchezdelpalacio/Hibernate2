package entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "empleados", schema = "miBD")
public class EmpleadosEntity {
    private Short empNo;
    private String apellido;
    private String oficio;
    private Short dir;
    private Date fechaAlt;
    private Double salario;
    private Double comision;
    private Byte deptNo;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "emp_no", nullable = false)
    public Short getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Short empNo) {
        this.empNo = empNo;
    }

    @Basic
    @Column(name = "apellido", nullable = true, length = 10)
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Basic
    @Column(name = "oficio", nullable = true, length = 10)
    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    @Basic
    @Column(name = "dir", nullable = true)
    public Short getDir() {
        return dir;
    }

    public void setDir(Short dir) {
        this.dir = dir;
    }

    @Basic
    @Column(name = "fecha_alt", nullable = true)
    public Date getFechaAlt() {
        return fechaAlt;
    }

    public void setFechaAlt(Date fechaAlt) {
        this.fechaAlt = fechaAlt;
    }

    @Basic
    @Column(name = "salario", nullable = true, precision = 2)
    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Basic
    @Column(name = "comision", nullable = true, precision = 2)
    public Double getComision() {
        return comision;
    }

    public void setComision(Double comision) {
        this.comision = comision;
    }

    @Basic
    @Column(name = "dept_no", nullable = false)
    public Byte getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Byte deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpleadosEntity empleados = (EmpleadosEntity) o;

        if (empNo != null ? !empNo.equals(empleados.empNo) : empleados.empNo != null) return false;
        if (apellido != null ? !apellido.equals(empleados.apellido) : empleados.apellido != null) return false;
        if (oficio != null ? !oficio.equals(empleados.oficio) : empleados.oficio != null) return false;
        if (dir != null ? !dir.equals(empleados.dir) : empleados.dir != null) return false;
        if (fechaAlt != null ? !fechaAlt.equals(empleados.fechaAlt) : empleados.fechaAlt != null) return false;
        if (salario != null ? !salario.equals(empleados.salario) : empleados.salario != null) return false;
        if (comision != null ? !comision.equals(empleados.comision) : empleados.comision != null) return false;
        if (deptNo != null ? !deptNo.equals(empleados.deptNo) : empleados.deptNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empNo != null ? empNo.hashCode() : 0;
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + (oficio != null ? oficio.hashCode() : 0);
        result = 31 * result + (dir != null ? dir.hashCode() : 0);
        result = 31 * result + (fechaAlt != null ? fechaAlt.hashCode() : 0);
        result = 31 * result + (salario != null ? salario.hashCode() : 0);
        result = 31 * result + (comision != null ? comision.hashCode() : 0);
        result = 31 * result + (deptNo != null ? deptNo.hashCode() : 0);
        return result;
    }
}
