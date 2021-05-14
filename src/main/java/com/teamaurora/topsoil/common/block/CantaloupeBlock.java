package com.teamaurora.topsoil.common.block;

import com.teamaurora.topsoil.core.registry.TopsoilBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IGrowable;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class CantaloupeBlock extends Block implements IGrowable {
    protected static final VoxelShape SMALL_SHAPE = Block.makeCuboidShape(3.0D, 6.0D, 3.0D, 13.0D, 16.0D, 13.0D);

    public CantaloupeBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {
        worldIn.setBlockState(pos, TopsoilBlocks.CANTALOUPE.get().getDefaultState(), 2);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SMALL_SHAPE;
    }

    @Override
    public boolean ticksRandomly(BlockState state) {
        return true;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
        if (worldIn.getBlockState(pos.up()).isIn(TopsoilBlocks.CANTALOUPE_STEM.get()) && net.minecraftforge.common.ForgeHooks.onCropsGrowPre(worldIn, pos, state, random.nextInt(10) == 0)) {
            worldIn.setBlockState(pos, TopsoilBlocks.CANTALOUPE.get().getDefaultState(), 2);
            net.minecraftforge.common.ForgeHooks.onCropsGrowPost(worldIn, pos, state);
        }
    }
}
