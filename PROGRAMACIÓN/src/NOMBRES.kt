enum class NOMBRES {
    ALEJANDRO, LUCIA, JAVIER, MARTA, DANIEL, SOFIA, CARLOS, LAURA, SERGIO, ELENA;

    companion object{
        fun obtenerNombres():String{
            return values().random().name
        }
    }
}