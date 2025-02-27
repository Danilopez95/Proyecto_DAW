enum class Categoria {
    TALLER,
    ACTIVIDAD,
    CONFERENCIA;

    companion object {

        fun devolverCategoria(): String {
            return values().random().toString()

        }
    }
}