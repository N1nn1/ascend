package com.ninni.ascend.client.particles;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.ParticleTextureSheet;
import net.minecraft.client.particle.SpriteBillboardParticle;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;

@Environment(EnvType.CLIENT)
public class ChorusPollenParticle extends SpriteBillboardParticle {

    protected ChorusPollenParticle(ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
        super(world, x, y ,z);
        this.collidesWithWorld = true;
        this.maxAge = world.getRandom().nextInt(80) + 20;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.velocityZ = velocityZ;
    }


    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }

    @Override
    protected int getBrightness(float tint) {
        return 240;
    }

    @Environment(value=EnvType.CLIENT)
    public static class ChorusPollenSmokeFactory
        implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;

        public ChorusPollenSmokeFactory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
            ChorusPollenParticle particle = new ChorusPollenParticle(clientWorld, d, e, f, g, h, i);
            particle.setAlpha(0.9f);
            particle.setSprite(this.spriteProvider);
            return particle;
        }
    }
}
