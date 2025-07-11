package dev.timlohrer.spotify_overlay.config

enum class HUD_TYPE(val type: String) {
    DEFAULT("Default"),
    MEDIUM_COVER("Medium Cover"),
    BIG_COVER("Big Cover");


    override fun toString(): String {
        return type
    }
}