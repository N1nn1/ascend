package com.ninni.ascend.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.ninni.ascend.Ascend.*;

public interface AscendSoundEvents {

    SoundEvent BLOCK_CHORUS_HUM = chorus("hum");
    private static SoundEvent chorus(String type) { return createBlockSound("chorus", type); }

    private static SoundEvent register(String id) {
        Identifier identifier = new Identifier(MOD_ID, id);
        return Registry.register(Registry.SOUND_EVENT, identifier, new SoundEvent(identifier));
    }

    private static SoundEvent createBlockSound(String block, String type) { return register("block." + block + "." + type); }
}
