package ch.goldensbg.sbgutils

import ch.goldensbg.kpaper.main.KPaper
import ch.goldensbg.sbgutils.DamageEvent
import dev.jorel.commandapi.CommandAPI
import dev.jorel.commandapi.CommandAPIBukkitConfig
import net.kyori.adventure.text.Component

class Main : KPaper() {


    override fun load() {
        CommandAPI.onLoad(CommandAPIBukkitConfig(this).silentLogs(true))
        server.consoleSender.sendMessage(Component.text("Hey, ich wurde geladen!"))

        TimerCommand()
    }

    override fun startup() {
        CommandAPI.onEnable()
        DamageEvent
        Timer
    }

    override fun shutdown() {
        CommandAPI.onDisable()
        server.consoleSender.sendMessage(Component.text("Ich wurde deaktiviert :("))
    }
}