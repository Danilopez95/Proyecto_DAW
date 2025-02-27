enum class UBICACIONES {

    TOKIO,
    NUEVAYORK,
    PARIS,
    SIDNEY,
    LONDRES,
    BERLIN,
    ROMA,
    DUBAI,
    TORONTO;

    companion object {
        fun obtenerUbicaciones():String{
            return values().random().name
        }
    }
}