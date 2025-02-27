enum class PLATAFORMAS {

    TRELLO,
    DUOLINGO,
    STEAM,
    COURSERA,
    NOTION,
    TWITCH,
    UPWORK,
    CANVA,
    REDDIT,
    SPOTIFY;

    companion object {
        fun obtenerPlataformas(): String {
            return values().random().name
        }
    }
}