package dev.frydae.gridmod.neoforge;

import net.neoforged.fml.common.Mod;

import dev.frydae.gridmod.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
