package com.ninni.ascend.client.particles;

import com.ninni.ascend.Ascend;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AscendParticles {

    public static final DefaultParticleType CHORUS_POLLEN = Registry.register(Registry.PARTICLE_TYPE, new Identifier(Ascend.MOD_ID, "chorus_pollen"), FabricParticleTypes.simple());
}
