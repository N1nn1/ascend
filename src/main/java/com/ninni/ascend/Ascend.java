package com.ninni.ascend;

import com.google.common.reflect.Reflection;
import com.ninni.ascend.block.AscendBlocks;
import com.ninni.ascend.item.AscendItems;
import com.ninni.ascend.sound.AscendSoundEvents;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


public class Ascend implements ModInitializer {
	public static final String MOD_ID = "ascend";
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
		new Identifier(Ascend.MOD_ID, "item_group"),
		() -> new ItemStack(AscendItems.ASCEND)
	);

	@SuppressWarnings("UnstableApiUsage")
	@Override
	public void onInitialize() {
		Reflection.initialize(
			AscendBlocks.class,
			AscendSoundEvents.class,
			AscendItems.class
		);
	}
}
