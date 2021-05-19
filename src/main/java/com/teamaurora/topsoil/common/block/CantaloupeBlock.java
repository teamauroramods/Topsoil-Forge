package com.teamaurora.topsoil.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.Tags;

import java.util.function.Supplier;

public class CantaloupeBlock extends Block {
    private final Supplier<Block> carved;

    public CantaloupeBlock(Supplier<Block> carved, Properties properties) {
        super(properties);
        this.carved = carved;
    }

    @Override
    @SuppressWarnings("deprecation")
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        ItemStack item = player.getHeldItem(handIn);

        if (Tags.Items.SHEARS.contains(item.getItem())) {
            worldIn.playSound(null, pos, SoundEvents.BLOCK_PUMPKIN_CARVE, SoundCategory.BLOCKS, 1.0F, 0.8F + worldIn.rand.nextFloat() * 0.4F);
            worldIn.setBlockState(pos, carved.get().getDefaultState(), 2);

            if (player instanceof ServerPlayerEntity && !player.isCreative()) {
                item.attemptDamageItem(1, worldIn.getRandom(), (ServerPlayerEntity) player);
            }
            return ActionResultType.func_233537_a_(worldIn.isRemote);
        }
        return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
    }
}
