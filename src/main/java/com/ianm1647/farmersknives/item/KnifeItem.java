package com.ianm1647.farmersknives.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ToolMaterial;

public class KnifeItem extends vectorwing.farmersdelight.common.item.KnifeItem {
    public KnifeItem(ToolMaterial tier, FabricItemSettings settings) {
        super(tier, .5f, -1.8f, settings);
    }
}
