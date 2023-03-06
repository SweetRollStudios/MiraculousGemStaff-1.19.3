package net.sweetrollstudios.miraculousgemstaff.entity;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

public class ExplosiveSpellEntity extends AbstractArrow {
    protected ExplosiveSpellEntity(EntityType<ExplosiveSpellEntity> entityType, Level world) {
        super(entityType, world);
    }
    public ExplosiveSpellEntity(EntityType<ExplosiveSpellEntity> entityType, double x, double y, double z, Level world) {
        super(entityType, x, y, z, world);
    }
    public ExplosiveSpellEntity(EntityType<ExplosiveSpellEntity> entityType, LivingEntity shooter, Level world) {
        super(entityType, shooter, world);
    }

    @Override
    protected void onHitEntity(EntityHitResult ray) {
        super.onHitEntity(ray);
       // this.level.explode(this,this.getX(),this.getY(),this.getZ(),4.0f,false, Explosion.BlockInteraction.DESTROY);  method doesn't exist for some reason
    }

    @Override
    protected ItemStack getPickupItem() {
        return ItemStack.EMPTY;
    }
}
