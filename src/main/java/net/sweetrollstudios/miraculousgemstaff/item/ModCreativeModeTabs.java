package net.sweetrollstudios.miraculousgemstaff.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sweetrollstudios.miraculousgemstaff.MiraculousGemStaff;

@Mod.EventBusSubscriber(modid = MiraculousGemStaff.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs{
    public static CreativeModeTab MIRACULOUS_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        MIRACULOUS_TAB = event.registerCreativeModeTab(new ResourceLocation(MiraculousGemStaff.MODID, "miraculous_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.TIGER_EYE_GEM.get())).title(Component.translatable("creativemodetab.miraculous_tab")));
    }
}
