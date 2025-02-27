//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var webEventos = webEventos()
    var EventoGratuito = Evento("IndraFree", "13/05/2025", "Ciudad Real", "Taller")
    var EventoPago = Evento("IndraProject", "25/06/2025", "Ciudad Real", "Conferencia")
    webEventos.aniadirEvento(EventoGratuito)
    webEventos.aniadirEvento(EventoPago)



    do {
            println("Bienvenido a la web sostenible")
            var opcion = 0
            var salirWeb = false
                do {
                println("Es usted organizador[1] o usuario[2]")
                opcion = readln().toIntOrNull() ?: -1
            } while (opcion != 1 && opcion != 2)

            when (opcion) {
                1 -> {
                        var organizador = Factoria.crearOrganizador()
                    println("Bienvenido/a ${organizador.Id_Organizador}")
                    var eleccionOrganizador = 0

                    do {
                        println(
                            "Que desea hacer:" +
                                    "[1]Crear evento" +
                                    " [2]Eliminar evento" +
                                    " [3]Modificar evento" +
                                    " [4]Consultar eventos" +
                                    " [5]Salir de la web"
                        )
                        eleccionOrganizador = readln().toIntOrNull() ?: -1
                        when (eleccionOrganizador) {
                            1 -> {
                                var nuevoEvento = organizador.eligeEventoAcrear()
                            }
                            2 -> {
                                println("¿Que evento quieres eliminar?")
                                for (i in organizador.eventoOrganizado.indices){
                                    println("Evento: ${organizador.eventoOrganizado[i].Id_Evento}")
                                }
                                var eleccion = readln().toIntOrNull()?: -1
                                organizador.eliminarEvento(organizador.eventoOrganizado[eleccion-1])
                            }
                            3 -> {
                                println("¿Que evento quieres modificar?")
                                var contador = 1
                                for (i in organizador.eventoOrganizado.indices){
                                    println("Evento: ${organizador.eventoOrganizado[i].Id_Evento}")

                                }
                                var eleccion = readln().toIntOrNull() ?: -1
                                organizador.modificarEvento(organizador.eventoOrganizado[eleccion-1])
                            }
                            4 -> organizador.mostrarEventos()
                            5 -> {
                                salirWeb = true
                                println("Gracias por su visita.")
                            }
                        }
                    } while (eleccionOrganizador in 1..5 && !salirWeb)
                }
                2 -> {
                    var usuario = Factoria.crearUsuario()
                    var eleccionUsuario = 0

                    do {
                        println("Menu de usuario:")
                        println("Bienvenid@ ${usuario.Nombre}")
                        println(
                            "Que desea hacer:" +
                                    "[1] Inscribirse a un evento" +
                                    "[2] Confirmar Asistencia a un evento" +
                                    "[3] Cancelar inscripcion a un evento" +
                                    "[4] Consultar lista de eventos" +
                                    "[5] Consultar lista de eventos a los que estás inscrito" +
                                    "[6] Mostrar información de los eventos" +
                                    "[7] Salir del portal web"
                        )
                        eleccionUsuario = readln().toIntOrNull() ?: -1

                        when (eleccionUsuario) {
                            1 -> {
                                println("¿A cual evento quieres inscribirte?")
                                var contador = 1
                                for (i in webEventos.WebEventos.indices){
                                    println("Evento $contador: ${webEventos.WebEventos[i]}")
                                    contador++
                                }
                                var eleccion = readln().toIntOrNull()?: -1
                                usuario.inscribirseEvento(webEventos.WebEventos[eleccion-1])
                            }
                            2 -> {
                                println("¿En cual evento quieres confirmar asistencia?")
                                var contador = 1
                                for (i in webEventos.WebEventos.indices){
                                    println("Evento $contador: ${webEventos.WebEventos[i]}")
                                    contador++
                                }
                                var eleccion = readln().toIntOrNull()?: -1
                                usuario.confirmarAsistencia(webEventos.WebEventos[eleccion-1])
                            }
                            3 -> {
                                println("¿En cual evento quieres cancelar la inscripción?")
                                var contador = 1
                                for (i in webEventos.WebEventos.indices){
                                    println("Evento $contador: ${webEventos.WebEventos[i]}")
                                    contador++
                                }
                                var eleccion = readln().toIntOrNull()?: -1
                                usuario.cancelarInscripcion(webEventos.WebEventos[eleccion-1])
                            }
                            4 -> webEventos.mostrarEvento()
                            5 -> usuario.historialEventos()
                            6 -> {
                                println("¿De cual evento quieres saber la información?")
                                var contador = 1
                                for (i in webEventos.WebEventos.indices){
                                    println("Evento $contador: ${webEventos.WebEventos[i]}")
                                    contador++
                                }
                                var eleccion = readln().toIntOrNull()?: -1
                                webEventos.WebEventos.toString()
                            }
                            7 -> {
                                salirWeb = true
                                println("Gracias por su visita.")
                            }
                        }
                    } while (eleccionUsuario in 1..7 && !salirWeb)
                }
            }
        } while (!salirWeb)
}


