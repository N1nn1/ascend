package com.ninni.ascend.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.ninni.ascend.Ascend.*;

public class AscendBlocks {

    public static final Block CHORUS_SPROUTS = register("chorus_sprouts", new ChorusSproutsBlock(AbstractBlock.Settings.copy(Blocks.CHORUS_PLANT).noCollision().breakInstantly().offsetType(AbstractBlock.OffsetType.XZ)));
    public static final Block CHORUS_BULB = register("chorus_bulb", new ChorusBulbBlock(AbstractBlock.Settings.copy(Blocks.CHORUS_PLANT).noCollision().breakInstantly().offsetType(AbstractBlock.OffsetType.XYZ)));
    public static final Block MIRESTONE = register("mirestone", new Block(AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block MAGNIA = register("magnia", new MagniaBlock(AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block MARZUROCK = register("marzurock", new Block(AbstractBlock.Settings.copy(Blocks.END_STONE)));


    private static Block register(String id, Block block) { return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, id), block); }
}
