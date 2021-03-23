package com.teamaurora.topsoil.core.registry;

import com.minecraftabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.VerticalSlabBlock;
import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;
import com.teamaurora.topsoil.core.Topsoil;
import net.minecraft.block.*;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Topsoil.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TopsoilBlocks {
    public static final BlockSubRegistryHelper HELPER = Topsoil.REGISTRY_HELPER.getBlockSubHelper();

    /*------------------*
     |    DIRT CAVES    |
     *------------------*/

    public static final RegistryObject<Block> COARSE_DIRT_BRICKS = HELPER.createBlock("coarse_dirt_bricks", ()->new Block(AbstractBlock.Properties.from(Blocks.COARSE_DIRT)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> COARSE_DIRT_BRICK_SLAB = HELPER.createBlock("coarse_dirt_brick_slab", ()->new SlabBlock(AbstractBlock.Properties.from(Blocks.COARSE_DIRT)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> COARSE_DIRT_BRICK_STAIRS = HELPER.createBlock("coarse_dirt_brick_stairs", ()->new AbnormalsStairsBlock(COARSE_DIRT_BRICKS.get().getDefaultState(), AbstractBlock.Properties.from(Blocks.COARSE_DIRT)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> COARSE_DIRT_BRICK_WALL = HELPER.createBlock("coarse_dirt_brick_wall", ()->new WallBlock(AbstractBlock.Properties.from(Blocks.COARSE_DIRT)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> COARSE_DIRT_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "coarse_dirt_brick_vertical_slab", ()->new VerticalSlabBlock(AbstractBlock.Properties.from(Blocks.COARSE_DIRT)), ItemGroup.BUILDING_BLOCKS);

    public static final RegistryObject<Block> MOSSY_COARSE_DIRT_BRICKS = HELPER.createBlock("mossy_coarse_dirt_bricks", ()->new Block(AbstractBlock.Properties.from(Blocks.COARSE_DIRT)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MOSSY_COARSE_DIRT_BRICK_SLAB = HELPER.createBlock("mossy_coarse_dirt_brick_slab", ()->new SlabBlock(AbstractBlock.Properties.from(Blocks.COARSE_DIRT)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MOSSY_COARSE_DIRT_BRICK_STAIRS = HELPER.createBlock("mossy_coarse_dirt_brick_stairs", ()->new AbnormalsStairsBlock(COARSE_DIRT_BRICKS.get().getDefaultState(), AbstractBlock.Properties.from(Blocks.COARSE_DIRT)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MOSSY_COARSE_DIRT_BRICK_WALL = HELPER.createBlock("mossy_coarse_dirt_brick_wall", ()->new WallBlock(AbstractBlock.Properties.from(Blocks.COARSE_DIRT)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MOSSY_COARSE_DIRT_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "mossy_coarse_dirt_brick_vertical_slab", ()->new VerticalSlabBlock(AbstractBlock.Properties.from(Blocks.COARSE_DIRT)), ItemGroup.BUILDING_BLOCKS);




    public static final class Properties {
        // todo: make these custom
        public static final AbstractBlock.Properties ROUGH_DIRT = AbstractBlock.Properties.from(Blocks.DIRT);
        public static final AbstractBlock.Properties REGOLITH = AbstractBlock.Properties.from(Blocks.COBBLESTONE);
        public static final AbstractBlock.Properties COB = AbstractBlock.Properties.from(Blocks.STONE);
    }
}
