package net.sweetrollstudios.miraculousgemstaff.item.staff;

import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ProjectileWeaponItem;

import java.util.function.Predicate;

public class Staff extends BowItem {


    public Staff(Properties properties) {
        super(properties);
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
