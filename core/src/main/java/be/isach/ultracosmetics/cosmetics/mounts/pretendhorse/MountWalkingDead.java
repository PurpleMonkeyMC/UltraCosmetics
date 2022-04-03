package be.isach.ultracosmetics.cosmetics.mounts.pretendhorse;

import be.isach.ultracosmetics.UltraCosmetics;
import be.isach.ultracosmetics.cosmetics.mounts.MountHorse;
import be.isach.ultracosmetics.cosmetics.type.MountType;
import be.isach.ultracosmetics.player.UltraPlayer;
import be.isach.ultracosmetics.util.Particles;
import be.isach.ultracosmetics.util.UtilParticles;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Horse.Color;

/**
 * Created by sacha on 1/03/17.
 */
public class MountWalkingDead extends MountHorse {

    public MountWalkingDead(UltraPlayer owner, UltraCosmetics ultraCosmetics) {
        super(owner, MountType.valueOf("walkingdead"), ultraCosmetics);
    }

    @Override
    public void onUpdate() {
        UtilParticles.display(Particles.CRIT_MAGIC, 0.4f, 0.2f, 0.4f, entity.getLocation().clone().add(0, 1, 0), 5);
        UtilParticles.display(Particles.SPELL_MOB_AMBIENT, 0.4f, 0.2f, 0.4f, entity.getLocation().clone().add(0, 1, 0), 5);
    }

    @SuppressWarnings("deprecation")
    @Override
    protected Horse.Variant getVariant() {
        return Horse.Variant.UNDEAD_HORSE;
    }

    @Override
    protected Color getColor() {
        return null;
    }
}