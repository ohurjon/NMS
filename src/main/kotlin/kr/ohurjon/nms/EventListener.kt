package kr.ohurjon.nms

import org.bukkit.event.Event
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener

class EventListener : Listener {
    private val plugin = Plugin.instance

    private val config = plugin.config

    @EventHandler
    fun onEvent(event: Event) {
        //TODO
    }

}