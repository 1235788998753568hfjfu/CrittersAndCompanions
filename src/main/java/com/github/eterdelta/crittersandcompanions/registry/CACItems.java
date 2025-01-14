package com.github.eterdelta.crittersandcompanions.registry;

import com.github.eterdelta.crittersandcompanions.CrittersAndCompanions;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MobBucketItem;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CACItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CrittersAndCompanions.MODID);

    public static final RegistryObject<Item> CLAM = ITEMS.register("clam", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> KOI_FISH = ITEMS.register("koi_fish", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(Foods.TROPICAL_FISH)));
    public static final RegistryObject<Item> PEARL = ITEMS.register("pearl", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> KOI_FISH_BUCKET = ITEMS.register("koi_fish_bucket", () -> new MobBucketItem(CACEntities.KOI_FISH, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> SEA_BUNNY_BUCKET = ITEMS.register("sea_bunny_bucket", () -> new MobBucketItem(CACEntities.SEA_BUNNY, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> DRAGONFLY_SPAWN_EGG = ITEMS.register("dragonfly_spawn_egg", () -> new ForgeSpawnEggItem(CACEntities.DRAGONFLY, 0x08EECF, 0xD3FF96, (new Item.Properties()).tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> FERRET_SPAWN_EGG = ITEMS.register("ferret_spawn_egg", () -> new ForgeSpawnEggItem(CACEntities.FERRET, 0xC5AC88, 0x37212D, (new Item.Properties()).tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> DUMBO_OCTOPUS_SPAWN_EGG = ITEMS.register("dumbo_octopus_spawn_egg", () -> new ForgeSpawnEggItem(CACEntities.DUMBO_OCTOPUS, 0xFCDC4C, 0x162630, (new Item.Properties()).tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> KOI_FISH_SPAWN_EGG = ITEMS.register("koi_fish_spawn_egg", () -> new ForgeSpawnEggItem(CACEntities.KOI_FISH, 0xF3ECED, 0xFB5321, (new Item.Properties()).tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> LEAF_INSECT_SPAWN_EGG = ITEMS.register("leaf_insect_spawn_egg", () -> new ForgeSpawnEggItem(CACEntities.LEAF_INSECT, 0xDAD475, 0x3C6C34, (new Item.Properties()).tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> OTTER_SPAWN_EGG = ITEMS.register("otter_spawn_egg", () -> new ForgeSpawnEggItem(CACEntities.OTTER, 0x352C34, 0xB49494, (new Item.Properties()).tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RED_PANDA_SPAWN_EGG = ITEMS.register("red_panda_spawn_egg", () -> new ForgeSpawnEggItem(CACEntities.RED_PANDA, 0xF4943C, 0x13131B, (new Item.Properties()).tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> SEA_BUNNY_SPAWN_EGG = ITEMS.register("sea_bunny_spawn_egg", () -> new ForgeSpawnEggItem(CACEntities.SEA_BUNNY, 0xF4ECE4, 0x453337, (new Item.Properties()).tab(CreativeModeTab.TAB_MISC)));
}