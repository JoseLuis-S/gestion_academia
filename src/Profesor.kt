class Profesor(nombre: String, edad: Int, id: String, val departamento: String,
               val aniosExp: Int): Persona(nombre, edad, id) {

    override fun mostrarRol() {
        println("Rol: Profesor")
    }

    fun mostrarExp() {
        println(aniosExp)
    }
}