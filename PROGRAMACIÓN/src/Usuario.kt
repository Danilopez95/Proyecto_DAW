class Usuario {
    var eventosAsistidos = ArrayList<Evento>()
    var eventoInscritos = ArrayList<Evento>()
    var Nombre = ""
    var Id_Usuario = 0
    var Correo = ""
    var Contrasenia = ""

    companion object{
        private var contador = 1
    }

    constructor(){
        Id_Usuario = contador
        contador++
    }

    constructor(
        Nombre: String
    ){
        this.Nombre=Nombre
        Id_Usuario= contador
        contador++

    }

    constructor(
        Nombre: String,
        Correo: String,
        Contrasenia: String
    ) {
        this.Nombre = Nombre
        this.Correo = Correo
        this.Contrasenia = Contrasenia

        Id_Usuario = contador
        contador ++
    }

    fun historialEventos(){
       if (eventosAsistidos.isNotEmpty()){
           for (i in eventosAsistidos.indices){
               println("Evento: ${eventosAsistidos[i]}")
           }
       }
    }

    fun inscribirseEvento(evento: Evento) {
        if (!(evento in eventoInscritos)) {
            eventoInscritos.add(evento)
            evento.usuarioInscrito.add(this)
            println("${Id_Usuario} se ha inscrito en el evento ${evento.Id_Evento}")
        } else {
            println("${Id_Usuario} ya está inscrito en este evento")
        }
    }

    fun cancelarInscripcion(evento: Evento){
        if(evento in eventoInscritos){
            eventoInscritos.remove(evento)
            evento.usuarioInscrito.remove(this)
            println("$Id_Usuario ha cancelado su inscripcion al evento ${evento.Id_Evento}")
        } else {
            println("$Id_Usuario no estaba inscrito en este vento")
        }
    }

    fun confirmarAsistencia(evento: Evento){
        if(evento in eventoInscritos){
            eventosAsistidos.add(evento)
            evento.usuarioAsistentes.add(this)
            println("$Id_Usuario ha confirmado su asistencia al evento ${evento.Id_Evento}")
        }
    }
}

