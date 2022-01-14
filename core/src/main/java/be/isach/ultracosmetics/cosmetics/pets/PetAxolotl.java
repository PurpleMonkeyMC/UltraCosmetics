package be.isach.ultracosmetics.cosmetics.pets;

import be.isach.ultracosmetics.UltraCosmetics;
import be.isach.ultracosmetics.UltraCosmeticsData;
import be.isach.ultracosmetics.cosmetics.type.PetType;
import be.isach.ultracosmetics.player.UltraPlayer;
import be.isach.ultracosmetics.util.ItemFactory;
import be.isach.ultracosmetics.util.UCMaterial;

/**
 * Represents an instance of a axolotl pet summoned by a player.
 *
 * @author Chris6ix
 * @since 14-01-2021
 */
public class PetAxolotl extends Pet {
    public PetAxolotl(UltraPlayer owner, UltraCosmetics ultraCosmetics) {
        super(owner, ultraCosmetics, PetType.getByName("axolotl"), ItemFactory.create(UCMaterial.BUCKET_OF_AXOLOTL, UltraCosmeticsData.get().getItemNoPickupString()));
    }
}
