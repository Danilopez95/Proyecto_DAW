class Organizador {
    var eventoOrganizado = ArrayList<Evento>()
    var eventoOrganizadoOnline = ArrayList<Online>()
    var eventoOrganizadoPresencial= ArrayList<Presencial>()
    var Nombre = ""
    var Id_Organizador = 0
    var Email = ""
    var Telefono = 0

    companion object {
        private var contador = 1
    }

    constructor() {
        Id_Organizador = contador
        contador++
    }

    constructor(
        Telefono: Int,
        Email: String,
        Nombre: String,

    ) {
        this.Telefono = Telefono
        this.Email = Email
        this.Nombre = Nombre


        Id_Organizador = contador
        contador++
    }

   /* fun guardarEvento(evento: Evento) {
        eventoOrganizado.add(evento)
    }*/

    fun crearEventoTotal(Nombre:String, Ubicacion:String, Fecha:String, categoria:String):Evento{
        var evento = Evento (Nombre, Ubicacion, Fecha, categoria)
        eventoOrganizado.add(evento)

        return evento
    }

    fun crearEventoOnline(Nombre:String,Ubicacion:String,Fecha:String, categoria: String, Plataforma:String):Online{
        var eventoOnline = Online(Nombre, Ubicacion, Fecha, categoria, Plataforma)
        eventoOrganizadoOnline.add(eventoOnline)

        return eventoOnline
    }

    fun crearEventoPresencial(Nombre:String,Ubicacion:String,Fecha:String, categoria: String, Direccion:String):Presencial{
        var eventoPresencial = Presencial(Nombre, Ubicacion, Fecha, categoria, Direccion)
        eventoOrganizadoPresencial.add(eventoPresencial)

        return eventoPresencial
    }

    fun modificarEvento(evento: Evento):Evento{
        evento.Nombre = NOMBRES.obtenerNombres()
        evento.Ubicacion = UBICACIONES.obtenerUbicaciones()
        evento.Fecha = FECHAS.obtenerFechas()
        evento.categoria = Categoria.devolverCategoria()

        return evento
    }

    fun modificarEventoOnline(evento: Online):Online{
        evento.Nombre = NOMBRES.obtenerNombres()
        evento.Ubicacion = UBICACIONES.obtenerUbicaciones()
        evento.Fecha = FECHAS.obtenerFechas()
        evento.categoria = Categoria.devolverCategoria()
        evento.Plataforma = PLATAFORMAS.obtenerPlataformas()

        return evento
    }

    fun modificarEventoOnline(evento: Presencial):Presencial{
        evento.Nombre = NOMBRES.obtenerNombres()
        evento.Ubicacion = UBICACIONES.obtenerUbicaciones()
        evento.Fecha = FECHAS.obtenerFechas()
        evento.categoria = Categoria.devolverCategoria()
        evento.Ubicacion = UBICACIONES.obtenerUbicaciones()

        return evento
    }

    fun listaEventos(){
        for (i in eventoOrganizado.indices){
            println("Organizador: ${eventoOrganizado[i].Id_Evento}")
        }
    }


}