package net.sweetrollstudios.miraculousgemstaff.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sweetrollstudios.miraculousgemstaff.MiraculousGemStaff;

public class ModEntityInit{

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MiraculousGemStaff.MODID);

    public static final RegistryObject<EntityType<ExplosiveSpellEntity>> EXPLOSIVE_ARROW = ENTITY_TYPES.register("explosive_arrow",
            () -> EntityType.Builder.of((EntityType.EntityFactory<ExplosiveSpellEntity>) ExplosiveSpellEntity::new, MobCategory.MISC).sized(0.5F, 0.5F).build("explosive_arrow"));
}
