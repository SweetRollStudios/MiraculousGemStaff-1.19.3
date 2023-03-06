package net.sweetrollstudios.miraculousgemstaff.item.staff;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ProjectileWeaponItem;

import java.util.function.Predicate;

public class Staff extends ProjectileWeaponItem {


    public Staff(Properties p_43009_) {
        super(p_43009_);
    }

    @Override
    public Predicate<ItemStack> getAllSupportedProjectiles() {
        return null;
    }

    @Override
    public int getDefaultProjectileRange() {
        return 0;
    }
}
