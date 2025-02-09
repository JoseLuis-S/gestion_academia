class Estudiante(nombre: String, edad: Int, id: String, val curso: String,
                 val promedioNotas: Double): Persona(nombre, edad, id) {

    override fun mostrarRol() {
        println("Rol: Estudiante de $curso")
    }

    fun mostrarCalificacion() {
        println(promedioNotas)
    }
}