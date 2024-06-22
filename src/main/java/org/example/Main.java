package org.example;

import net.minestom.server.MinecraftServer;
import net.minestom.server.ServerSettings;
import net.minestom.server.instance.*;
import net.minestom.server.instance.block.Block;
import net.minestom.server.coordinate.Pos;

public class Main {
    public static void main(String[] args) {
        // Initialization
        MinecraftServer.init();

        // Create the instance
        InstanceContainer instance = new InstanceContainer();
        ServerSettings.setDefaultInstance(instance);

        // Set the ChunkGenerator
        instance.setGenerator(unit -> unit.modifier().fillHeight(0, 40, Block.GRASS_BLOCK));
        instance.setWorldSpawnPosition(new Pos(0, 42, 0));

        // Start the server on port 25565
        MinecraftServer.start();
    }
}