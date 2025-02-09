fun main() {
    val persona1 = Persona("Marcos", 13, "123123123aa")
    persona1.mostrarRol()
    val estudiante1 = Estudiante("Marcos", 12, "12312321312a", "Primero A", 8.3)
    estudiante1.mostrarRol()
    estudiante1.mostrarCalificacion()
    val profesor = Profesor("Marcos", 26, "12131231a", "Matematicas", 2)
    profesor.mostrarRol()
    profesor.mostrarExp()
}