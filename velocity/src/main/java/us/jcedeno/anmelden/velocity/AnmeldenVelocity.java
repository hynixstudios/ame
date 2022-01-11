package us.jcedeno.anmelden.velocity;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;

import org.slf4j.Logger;

import lombok.Getter;

/**
 * The entry point for the anmelden plugin.
 * 
 * @author jcedeno
 */
@Plugin(id = "anmelden", name = "Anmelden", version = "1.0", description = "A velocity login and skin-restorer plugin.")
public class AnmeldenVelocity {
    private @Getter final ProxyServer server;
    private @Getter final Logger logger;

    @Inject
    public AnmeldenVelocity(ProxyServer server, Logger logger) {
        this.server = server;
        this.logger = logger;
    }

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        this.logger.info("Anmelden plugin loaded.");
        // Do anything requiring the velocity api here.
    }

}
