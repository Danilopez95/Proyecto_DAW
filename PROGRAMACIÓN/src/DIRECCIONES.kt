enum class DIRECCIONES(direcciones:String) {


    DIRECCION1 ("Calle Gran Vía, 42, 28013 Madrid, España"),
    DIRECCION2 ("Avenida Diagonal, 640, 08017 Barcelona, España"),
    DIRECCION3 ("Calle Larios, 8, 29005 Málaga, España"),
    DIRECCION4 ("Paseo de la Castellana, 95, 28046 Madrid, España"),
    DIRECCION5 ("Calle San Fernando, 10, 41004 Sevilla, España"),
    DIRECCION6 ("Plaza del Ayuntamiento, 1, 46002 Valencia, España"),
    DIRECCION7 ("Calle Uría, 25, 33003 Oviedo, España"),
    DIRECCION8 ("Avenida de la Constitución, 18, 41001 Sevilla, España"),
    DIRECCION9 ("Rúa do Franco, 50, 15702 Santiago de Compostela, España"),
    DIRECCION10 ("Calle Reyes Católicos, 20, 18009 Granada, España");

    companion object {
        fun obtenerDireccion():String{
            return values().random().name
        }
    }
}