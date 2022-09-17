package com.ninni.ascend;

import com.ninni.ascend.block.AscendBlocks;
import com.ninni.ascend.client.particles.AscendParticles;
import com.ninni.ascend.client.particles.ChorusPollenParticle;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class AscendClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {

		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
		AscendBlocks.CHORUS_SPROUTS,
		AscendBlocks.CHORUS_BULB
		);

		ParticleFactoryRegistry.getInstance().register(AscendParticles.CHORUS_POLLEN, ChorusPollenParticle.ChorusPollenSmokeFactory::new);
	}
}
