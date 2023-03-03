package net.sweetrollstudios.miraculousgemstaff.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sweetrollstudios.miraculousgemstaff.MiraculousGemStaff;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MiraculousGemStaff.MODID);

    public static final RegistryObject<Item> CUT_ONYX = ITEMS.register("cut_onyx",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> UNCUT_ONYX = ITEMS.register("uncut_onyx",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUNBURST_DIAMOND = ITEMS.register("sunburst_diamond",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIGER_EYE_GEM = ITEMS.register("tiger_eye_gem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIGER_EYE_ROCK = ITEMS.register("tiger_eye_rock",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STAFF_SUNBURST_DIAMOND = ITEMS.register("staff_sunburst_diamond",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STAFF_ONYX = ITEMS.register("staff_onyx",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
