enum class FECHAS(fechas:String) {

    FECHA1 ("12/03/1995"),
    FECHA2 ("27/08/2002"),
    FECHA3 ("05/11/1987"),
    FECHA4 ("19/06/2010"),
    FECHA5 ("30/09/1978"),
    FECHA6 ("14/02/1999"),
    FECHA7 ("22/07/2005"),
    FECHA8 ("09/12/2018"),
    FECHA9 ("03/05/1992"),
    FECHA10 ("25/04/1983");

    companion object{
        fun obtenerFechas():String{
            return values().random().name
        }
    }
}