package com.teamaurora.topsoil.common.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.DoublePlantBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;

public class LargeFoxfireBlock extends DoublePlantBlock {
    public LargeFoxfireBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        BlockState state1 = worldIn.getBlockState(pos.down());
        return state1.isSolid() || state1.isIn(this);  // TODO: maby make this more complex
    }

    @Override
    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        BlockState state1 = worldIn.getBlockState(pos.down());
        return state1.isSolid() || state1.isIn(this);  // TODO: maby make this more complex
    }
}
