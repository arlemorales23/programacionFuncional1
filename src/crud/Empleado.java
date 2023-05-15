package crud;

public class Empleado {
    private Long id;
    private String nombre;
    private Integer edad;
    private Double salario;

    public Empleado(Long id, String nombre, Integer edad, Double salario) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado ->" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario ;
    }
}
