package com.ninni.ascend.item;

import com.ninni.ascend.Ascend;
import com.ninni.ascend.block.AscendBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class AscendItems {
    //logo
    public static final Item ASCEND = register("ascend", new Item(new FabricItemSettings().fireproof().rarity(Rarity.EPIC).maxCount(1)));

    public static final Item CHORUS_SPROUTS = register("chorus_sprouts", new BlockItem(AscendBlocks.CHORUS_SPROUTS, new FabricItemSettings().group(Ascend.ITEM_GROUP)));
    public static final Item CHORUS_BULB = register("chorus_bulb", new BlockItem(AscendBlocks.CHORUS_BULB, new FabricItemSettings().group(Ascend.ITEM_GROUP)));
    public static final Item MIRESTONE = register("mirestone", new BlockItem(AscendBlocks.MIRESTONE, new FabricItemSettings().group(Ascend.ITEM_GROUP)));
    public static final Item MAGNIA = register("magnia", new BlockItem(AscendBlocks.MAGNIA, new FabricItemSettings().group(Ascend.ITEM_GROUP)));
    public static final Item MARZUROCK = register("marzurock", new BlockItem(AscendBlocks.MARZUROCK, new FabricItemSettings().group(Ascend.ITEM_GROUP)));

    private static Item register(String id, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Ascend.MOD_ID, id), item);
    }
}
