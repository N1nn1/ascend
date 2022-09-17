package com.ninni.ascend.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MagniaBlock extends Block {
    public static final BooleanProperty INVERTED = Properties.INVERTED;

    public MagniaBlock(Settings settings) {
        super(settings);
        this.setDefaultState((((this.stateManager.getDefaultState())).with(INVERTED, false)));
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) return ActionResult.SUCCESS;
        state = state.cycle(INVERTED);
        world.setBlockState(pos, state, Block.NOTIFY_ALL);
        return ActionResult.CONSUME;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(INVERTED);
    }
}
