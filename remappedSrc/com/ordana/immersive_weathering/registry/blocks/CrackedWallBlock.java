package com.ordana.immersive_weathering.registry.blocks;

import net.minecraft.block.BlockState;

public class CrackedWallBlock extends CrackableWallBlock {
    public CrackedWallBlock(CrackLevel crackLevel, Settings settings) {
        super(crackLevel, settings);
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return false;
    }
}