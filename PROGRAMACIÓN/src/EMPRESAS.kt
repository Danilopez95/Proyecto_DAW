enum class EMPRESAS {

    IKEA, PATAGONIA, TESLA, BEYONDMEAT, UNILEVER, INTERFACE, SEVENTHGENERATION, ORSTED, ECOVER, BMWGROUP;

    companion object {
        fun obtenerEmpresa():String{
            return values().random().name
        }
    }
}