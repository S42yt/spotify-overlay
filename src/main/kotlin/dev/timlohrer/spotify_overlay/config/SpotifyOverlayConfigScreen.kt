package dev.timlohrer.spotify_overlay.config

import com.terraformersmc.modmenu.api.ConfigScreenFactory
import com.terraformersmc.modmenu.api.ModMenuApi
import me.shedaniel.autoconfig.AutoConfig
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment


@Environment(EnvType.CLIENT)
internal class SpotifyOverlayConfigScreen : ModMenuApi {
    override fun getModConfigScreenFactory(): ConfigScreenFactory<*>? =
        ConfigScreenFactory { parent -> AutoConfig.getConfigScreen(SpotifyOverlayConfig::class.java, parent).get() }
}