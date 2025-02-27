class Presencial:Evento {
    var Direccion = ""


    constructor() : super() {

    }

    constructor(Nombre:String,Ubicacion:String,Fecha:String, categoria: String, Direccion:String):super() {

        this.Nombre = Nombre
        this.Ubicacion = Ubicacion
        this.Fecha = Fecha
        this.categoria = categoria
        this.Direccion = Direccion

    }

    override fun inscribirUsuario(usuario: Usuario) {
        super.inscribirUsuario(usuario)
    }

    override fun cancelarInscripcion(usuario: Usuario) {
        super.cancelarInscripcion(usuario)
    }

    override fun confirmarAsistencia(usuario: Usuario) {
        super.confirmarAsistencia(usuario)
    }

    override fun listaInscritos() {
        super.listaInscritos()
    }

}
