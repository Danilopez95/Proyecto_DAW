class webEventos {
    var WebEventos = ArrayList<Evento>()

    fun mostrarEvento(){
        for (i in WebEventos.indices){
            println("Evento ${WebEventos[i].Id_Evento}")
        }
    }

    fun aniadirEvento(evento: Evento){
        WebEventos.add(evento)
    }
}