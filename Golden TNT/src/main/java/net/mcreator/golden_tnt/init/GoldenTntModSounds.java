/*
 *    MCreator note: This file will be REGENERATED on each build.
 */

package net.mcreator.golden_tnt.init;

public class GoldenTntModSounds {

	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, GoldenTntMod.MODID);

	public static final DeferredHolder<SoundEvent, SoundEvent> STEVES_LAVA_CHICKEN = REGISTRY.register("steves_lava_chicken", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("golden_tnt", "steves_lava_chicken")));

}