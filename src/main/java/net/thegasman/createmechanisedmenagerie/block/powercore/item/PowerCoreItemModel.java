package net.thegasman.createmechanisedmenagerie.block.powercore.item;

import net.minecraft.resources.ResourceLocation;
import net.thegasman.createmechanisedmenagerie.CreateMechanisedMenagerie;
import software.bernie.geckolib.model.GeoModel;

public class PowerCoreItemModel extends GeoModel<PowerCoreItem> {
    @Override
    public ResourceLocation getModelResource(PowerCoreItem powerCoreItem) {
        return new ResourceLocation(CreateMechanisedMenagerie.MODID, "geo/power_core.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PowerCoreItem powerCoreItem) {
        return new ResourceLocation(CreateMechanisedMenagerie.MODID, "textures/block/power_core.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PowerCoreItem powerCoreItem) {
        return new ResourceLocation(CreateMechanisedMenagerie.MODID, "animations/power_core.animation.json");
    }
}
