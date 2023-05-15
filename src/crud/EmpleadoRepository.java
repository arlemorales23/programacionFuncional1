package crud;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface EmpleadoRepository {
    void crear(Empleado empleado);

    Optional<Empleado> buscarPorId(Long id);

    List<Empleado> buscarTodos();

    Stream<Empleado> buscarTodosAsStream();

    void actualizar(Empleado empleado);

    void eliminarPorId(Long id);
}
