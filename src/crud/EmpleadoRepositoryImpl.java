package crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class EmpleadoRepositoryImpl implements EmpleadoRepository {
    private List<Empleado> empleados = new ArrayList<>();

    @Override
    public void crear(Empleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public Optional<Empleado> buscarPorId(Long id) {
        return empleados.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst();
    }

    @Override
    public List<Empleado> buscarTodos() {
        return empleados;
    }

    @Override
    public Stream<Empleado> buscarTodosAsStream() {
        return empleados.stream();
    }

    @Override
    public void actualizar(Empleado empleado) {
        empleados.stream()
                .filter(e -> e.getId().equals(empleado.getId()))
                .findFirst()
                .ifPresent(e -> {
                    e.setNombre(empleado.getNombre());
                    e.setEdad(empleado.getEdad());
                    e.setSalario(empleado.getSalario());
                });
    }

    @Override
    public void eliminarPorId(Long id) {
        empleados.removeIf(e -> e.getId().equals(id));
    }
}
