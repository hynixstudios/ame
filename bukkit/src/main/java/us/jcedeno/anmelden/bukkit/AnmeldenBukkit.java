package us.jcedeno.anmelden.bukkit;

import org.bukkit.plugin.java.JavaPlugin;

import kr.entree.spigradle.annotations.SpigotPlugin;

/**
 * The entry point of the Bukkit side of the Anmelden Project.
 * 
 * @author jcedeno
 */
@SpigotPlugin
public class AnmeldenBukkit extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("hello world.");
    }

    @Override
    public void onDisable() {
        System.out.println("bye bye");
    }

}
