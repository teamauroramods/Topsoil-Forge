package com.teamaurora.topsoil.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class CarvedCantaloupeBlock extends FallingBlock {
    public static final IntegerProperty BITES = IntegerProperty.create("bites", 0, 7);
    protected static final VoxelShape[] SHAPES = new VoxelShape[]{
            Block.makeCuboidShape(8, 0, 8, 16, 8, 16),
            Block.makeCuboidShape(0, 0, 8, 8, 8, 16),
            Block.makeCuboidShape(8, 8, 8, 16, 16, 16),
            Block.makeCuboidShape(0, 8, 8, 8, 16, 16),
            Block.makeCuboidShape(8, 0, 0, 16, 8, 8),
            Block.makeCuboidShape(0, 0, 0, 8, 8, 8),
            Block.makeCuboidShape(8, 8, 0, 16, 16, 8),
            Block.makeCuboidShape(0, 8, 0, 8, 16, 8)
    };

    public CarvedCantaloupeBlock(Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(BITES, 0));
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        int bitesLeft = 8 - state.get(BITES);
        VoxelShape shape = VoxelShapes.empty();
        for (int i = 0; i < bitesLeft; i++) {
            shape = VoxelShapes.or(shape, SHAPES[i]);
        }
        return shape;
    }

    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (worldIn.isRemote) {
            ItemStack itemstack = player.getHeldItem(handIn);
            if (this.eatSlice(worldIn, pos, state, player).isSuccessOrConsume()) {
                return ActionResultType.SUCCESS;
            }

            if (itemstack.isEmpty()) {
                return ActionResultType.CONSUME;
            }
        }

        return this.eatSlice(worldIn, pos, state, player);
    }

    private ActionResultType eatSlice(IWorld world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!player.canEat(false)) {
            return ActionResultType.PASS;
        } else {
            // TODO: remove cake clone shit
            player.addStat(Stats.EAT_CAKE_SLICE);
            player.getFoodStats().addStats(2, 0.1F);
            int i = state.get(BITES);
            if (i < 7) {
                world.setBlockState(pos, state.with(BITES, Integer.valueOf(i + 1)), 3);
            } else {
                world.removeBlock(pos, false);
            }

            return ActionResultType.SUCCESS;
        }
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(BITES);
    }
}
