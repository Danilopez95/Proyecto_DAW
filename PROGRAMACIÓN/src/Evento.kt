import kotlin.math.E

open class Evento {
    var usuarioInscrito = ArrayList<Usuario>()
    var usuarioAsistentes = ArrayList<Usuario>()
    var organizadores = ArrayList<Organizador>()
    var Id_Evento = 0
    var Nombre = ""
    var Duracion = 0
    var Ubicacion = ""
    var Fecha = ""
    var categoria = ""

    companion object{
        private var contador = 1
    }

    constructor(){
        Id_Evento = contador
        contador ++
    }

    constructor(
        Nombre: String,
        Ubicacion: String,
        Fecha: String,
        categoria: String

    ) {
        this.Nombre = Nombre
        this.Ubicacion = Ubicacion
        this.Fecha = Fecha
        this.categoria = categoria

        Id_Evento = contador
        contador++
    }


    open fun confirmarAsistencia(usuario: Usuario){
        if(usuario in usuarioInscrito){
            usuarioAsistentes.add(usuario)
        }else{
            println("El usuario no está inscrito, no puede asistir")
        }
    }

    open fun inscribirUsuario(usuario: Usuario){
        if(!usuarioInscrito.contains(usuario)){
            usuarioInscrito.add(usuario)
            println("$usuario se ha instrito en el evento ${Evento}.")
        }else{
            println("$usuario ya está inscrito en este evento.")
        }
    }

    open fun cancelarInscripcion(usuario: Usuario){
        if(usuarioInscrito.remove(usuario)){
            println("$usuario ha cancelado su inscripcion en el evento ${Evento}")
        } else {
            println("$usuario no estaba inscrito en este evento")
        }
    }

    open fun listaInscritos(){
        for (i in usuarioInscrito.indices){
            println("Usuario: ${usuarioInscrito[i]}")
        }

    }
}
