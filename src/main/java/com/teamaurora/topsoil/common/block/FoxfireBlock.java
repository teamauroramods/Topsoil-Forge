package com.teamaurora.topsoil.common.block;

import net.minecraft.block.*;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;
import java.util.function.Supplier;

public class FoxfireBlock extends BushBlock implements IGrowable {
    protected static final VoxelShape SHAPE = Block.makeCuboidShape(5.0D, 0.0D, 5.0D, 11.0D, 6.0D, 11.0D);
    private final Supplier<Block> tallVariant;

    public FoxfireBlock(Supplier<Block> tallVariant, Properties properties) {
        super(properties);
        this.tallVariant = tallVariant;
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    @Override
    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return state.isOpaqueCube(worldIn, pos);
    }

    @Override
    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        return worldIn.getBlockState(pos.down()).isSolid(); // TODO: maby make this more complex
    }

    @Override
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return worldIn.getBlockState(pos.up()).isAir();
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {
        if (worldIn.getBlockState(pos.up()).isAir()) {
            ((DoublePlantBlock) tallVariant.get()).placeAt(worldIn, pos, 3);
        }
    }
}
