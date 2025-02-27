class Factoria   {
    companion object {

        fun crearUsuario():Usuario {
            var usuario = Usuario(NOMBRES.obtenerNombres())
                return usuario
        }

        fun crearOrganizador():Organizador{
            var organizador = Organizador(EMPRESAS.obtenerEmpresa())
            return organizador
        }
    }

}