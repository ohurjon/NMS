package kr.ohurjon.nms

import kr.entree.spigradle.annotations.SpigotPlugin
import org.bukkit.event.Event
import org.bukkit.plugin.java.JavaPlugin

@SpigotPlugin
class Plugin : JavaPlugin() {

    companion object {
        lateinit var instance: Plugin
            private set
    }

    override fun onEnable() {
        instance = this
        this.saveDefaultConfig()
        server.pluginManager.registerEvents(EventListener(),this)
    }

    fun callEvent(event : Event) {
        server.pluginManager.callEvent(event)
    }

}