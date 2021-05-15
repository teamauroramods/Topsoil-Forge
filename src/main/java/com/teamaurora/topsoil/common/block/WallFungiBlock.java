package com.teamaurora.topsoil.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;

import javax.annotation.Nullable;

public class WallFungiBlock extends Block {
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    protected static final VoxelShape SHAPE_NORTH = Block.makeCuboidShape(4.0F, 2.0F, 0.0F, 12.0F, 14.0F, 8.0F);
    protected static final VoxelShape SHAPE_SOUTH = Block.makeCuboidShape(4.0F, 2.0F, 8.0F, 12.0F, 14.0F, 16.0F);
    protected static final VoxelShape SHAPE_WEST = Block.makeCuboidShape(0.0F, 2.0F, 4.0F, 8.0F, 14.0F, 12.0F);
    protected static final VoxelShape SHAPE_EAST = Block.makeCuboidShape(8.0F, 2.0F, 4.0F, 16.0F, 14.0F, 12.0F);
    protected static final VoxelShape[] SHAPES = {SHAPE_SOUTH, SHAPE_WEST, SHAPE_NORTH, SHAPE_EAST};

    public WallFungiBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPES[state.get(FACING).getOpposite().getHorizontalIndex()];
    }

    @Override
    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        BlockState rootState = worldIn.getBlockState(pos.offset(state.get(FACING).getOpposite()));
        return rootState.isSolid();
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        Direction face = context.getFace();
        if (face == Direction.UP || face == Direction.DOWN) return null;
        return getDefaultState().with(FACING, face);
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        super.fillStateContainer(builder.add(FACING));
    }
}
