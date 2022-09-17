package com.ninni.ascend.mixin;

import com.ninni.ascend.client.particles.AscendParticles;
import com.ninni.ascend.sound.AscendSoundEvents;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ChorusFlowerBlock;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ChorusFlowerBlock.class)
public abstract class ChorusFlowerBlockMixin extends Block {
    @Shadow @Final public static IntProperty AGE;

    public ChorusFlowerBlockMixin(Settings settings) {
        super(settings);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (state.get(AGE) == 5) {

            if (random.nextFloat() < 0.5F) {
                world.addParticle(AscendParticles.CHORUS_POLLEN, pos.getX() + random.nextDouble(), pos.getY() + random.nextDouble(), pos.getZ() + random.nextDouble(), 0.25, random.nextGaussian() * 0.025, 0.25);
            }
            if (random.nextInt(10) == 0) {
                world.playSound((double)pos.getX() + 0.5, (double)pos.getY() + 0.5, (double)pos.getZ() + 0.5, AscendSoundEvents.BLOCK_CHORUS_HUM, SoundCategory.BLOCKS, 0.15f + random.nextFloat(), random.nextFloat() + 0.3f, false);
            }
        }
    }

}
