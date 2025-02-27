class Online:Evento{
    var Plataforma = ""


    constructor() : super() {

    }

    constructor(Nombre:String,Ubicacion:String,Fecha:String, categoria: String, Plataforma:String):super(){

        this.Nombre = Nombre
        this.Ubicacion = Ubicacion
        this.Fecha = Fecha
        this.categoria = categoria
        this.Plataforma = Plataforma

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

