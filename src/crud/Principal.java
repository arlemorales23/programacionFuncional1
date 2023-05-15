package crud;

public class Principal {
    public static void main(String[] args) {
        EmpleadoRepository empleadoRepository = new EmpleadoRepositoryImpl();

        // crear
        empleadoRepository.crear(new Empleado(1L, "Jose", 23, 2000.0));
        empleadoRepository.crear(new Empleado(2L, "Lina", 18, 3000.0));
        empleadoRepository.crear(new Empleado(3L, "pilar", 30, 3200.0));

        //buscar por id
        System.out.println("Buscar por id : --------------");
        empleadoRepository.buscarPorId(2L).stream().toList().forEach(p-> System.out.println(p.getNombre()+ " "+p.getSalario()));
        System.out.println("Buscar todo: --------------");
        empleadoRepository.buscarTodos().forEach(p -> System.out.println(p.getNombre() + " " + p.getSalario()));

        System.out.println("Buscar todos as stream: --------------");
        empleadoRepository.buscarTodosAsStream().filter(p-> p.getNombre().startsWith("J")).toList().forEach(p -> System.out.println(p.getNombre() + " " + p.getSalario()));;

        System.out.println("Actualizar: --------------");
        empleadoRepository.actualizar(new Empleado(2L, "Juan", 18, 3000.0));
        empleadoRepository.buscarPorId(2L).stream().toList().forEach(p-> System.out.println(p.getNombre()+ " "+p.getSalario()));

        System.out.println("Eliminar: --------------");
        empleadoRepository.eliminarPorId(1L);
        empleadoRepository.buscarTodos().forEach(p -> System.out.println(p.getNombre() + " " + p.getSalario()));
    }
}
