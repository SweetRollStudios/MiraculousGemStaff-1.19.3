package net.sweetrollstudios.miraculousgemstaff.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

public class ExplosiveSpellEntity extends AbstractArrow {
    protected ExplosiveSpellEntity(EntityType<ExplosiveSpellEntity> entityType, Level world) {
        super(entityType, world);
    }

    @Override
    protected void onHitEntity(EntityHitResult ray) {
        super.onHitEntity(ray);
    }

    @Override
    protected ItemStack getPickupItem() {
        return ItemStack.EMPTY;
    }
}
