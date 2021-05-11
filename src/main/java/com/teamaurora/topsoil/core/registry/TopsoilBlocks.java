package com.teamaurora.topsoil.core.registry;

import com.minecraftabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.VerticalSlabBlock;
import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;
import com.teamaurora.topsoil.common.block.ParsnipRootBlock;
import com.teamaurora.topsoil.common.block.RootBlock;
import com.teamaurora.topsoil.core.Topsoil;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Topsoil.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TopsoilBlocks {
    public static final BlockSubRegistryHelper HELPER = Topsoil.REGISTRY_HELPER.getBlockSubHelper();

    /*------------------*
     |    DIRT CAVES    |
     *------------------*/

    // Coarse Dirt Blocks
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

    public static final RegistryObject<Block> CHISELED_COARSE_DIRT_BRICKS = HELPER.createBlock("chiseled_coarse_dirt_bricks", ()->new Block(AbstractBlock.Properties.from(Blocks.COARSE_DIRT)), ItemGroup.BUILDING_BLOCKS);

    public static final RegistryObject<Block> COARSE_DIRT_TILES = HELPER.createBlock("coarse_dirt_tiles", ()->new Block(AbstractBlock.Properties.from(Blocks.COARSE_DIRT)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> COARSE_DIRT_TILE_SLAB = HELPER.createBlock("coarse_dirt_tile_slab", ()->new SlabBlock(AbstractBlock.Properties.from(Blocks.COARSE_DIRT)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> COARSE_DIRT_TILE_STAIRS = HELPER.createBlock("coarse_dirt_tile_stairs", ()->new AbnormalsStairsBlock(COARSE_DIRT_BRICKS.get().getDefaultState(), AbstractBlock.Properties.from(Blocks.COARSE_DIRT)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> COARSE_DIRT_TILE_WALL = HELPER.createBlock("coarse_dirt_tile_wall", ()->new WallBlock(AbstractBlock.Properties.from(Blocks.COARSE_DIRT)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> COARSE_DIRT_TILE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "coarse_dirt_tile_vertical_slab", ()->new VerticalSlabBlock(AbstractBlock.Properties.from(Blocks.COARSE_DIRT)), ItemGroup.BUILDING_BLOCKS);

    // Rough Dirt
    public static final RegistryObject<Block> ROUGH_DIRT = HELPER.createBlock("rough_dirt", ()->new Block(Properties.ROUGH_DIRT), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_ROUGH_DIRT = HELPER.createBlock("polished_rough_dirt", ()->new Block(Properties.ROUGH_DIRT), ItemGroup.BUILDING_BLOCKS);

    public static final RegistryObject<Block> ROUGH_DIRT_BRICKS = HELPER.createBlock("rough_dirt_bricks", ()->new Block(Properties.ROUGH_DIRT), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> ROUGH_DIRT_BRICK_SLAB = HELPER.createBlock("rough_dirt_brick_slab", ()->new SlabBlock(Properties.ROUGH_DIRT), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> ROUGH_DIRT_BRICK_STAIRS = HELPER.createBlock("rough_dirt_brick_stairs", ()->new AbnormalsStairsBlock(COARSE_DIRT_BRICKS.get().getDefaultState(), Properties.ROUGH_DIRT), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> ROUGH_DIRT_BRICK_WALL = HELPER.createBlock("rough_dirt_brick_wall", ()->new WallBlock(Properties.ROUGH_DIRT), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> ROUGH_DIRT_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "rough_dirt_brick_vertical_slab", ()->new VerticalSlabBlock(Properties.ROUGH_DIRT), ItemGroup.BUILDING_BLOCKS);

    public static final RegistryObject<Block> MOSSY_ROUGH_DIRT_BRICKS = HELPER.createBlock("mossy_rough_dirt_bricks", ()->new Block(Properties.ROUGH_DIRT), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MOSSY_ROUGH_DIRT_BRICK_SLAB = HELPER.createBlock("mossy_rough_dirt_brick_slab", ()->new SlabBlock(Properties.ROUGH_DIRT), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MOSSY_ROUGH_DIRT_BRICK_STAIRS = HELPER.createBlock("mossy_rough_dirt_brick_stairs", ()->new AbnormalsStairsBlock(COARSE_DIRT_BRICKS.get().getDefaultState(), Properties.ROUGH_DIRT), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MOSSY_ROUGH_DIRT_BRICK_WALL = HELPER.createBlock("mossy_rough_dirt_brick_wall", ()->new WallBlock(Properties.ROUGH_DIRT), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MOSSY_ROUGH_DIRT_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "mossy_rough_dirt_brick_vertical_slab", ()->new VerticalSlabBlock(Properties.ROUGH_DIRT), ItemGroup.BUILDING_BLOCKS);

    public static final RegistryObject<Block> CHISELED_ROUGH_DIRT_BRICKS = HELPER.createBlock("chiseled_rough_dirt_bricks", ()->new Block(Properties.ROUGH_DIRT), ItemGroup.BUILDING_BLOCKS);

    // Regolith
    public static final RegistryObject<Block> REGOLITH = HELPER.createBlock("regolith", ()->new Block(Properties.REGOLITH), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_REGOLITH = HELPER.createBlock("polished_regolith", ()->new Block(Properties.REGOLITH), ItemGroup.BUILDING_BLOCKS);

    public static final RegistryObject<Block> REGOLITH_BRICKS = HELPER.createBlock("regolith_bricks", ()->new Block(Properties.REGOLITH), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> REGOLITH_BRICK_SLAB = HELPER.createBlock("regolith_brick_slab", ()->new SlabBlock(Properties.REGOLITH), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> REGOLITH_BRICK_STAIRS = HELPER.createBlock("regolith_brick_stairs", ()->new AbnormalsStairsBlock(COARSE_DIRT_BRICKS.get().getDefaultState(), Properties.REGOLITH), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> REGOLITH_BRICK_WALL = HELPER.createBlock("regolith_brick_wall", ()->new WallBlock(Properties.REGOLITH), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> REGOLITH_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "regolith_brick_vertical_slab", ()->new VerticalSlabBlock(Properties.REGOLITH), ItemGroup.BUILDING_BLOCKS);

    public static final RegistryObject<Block> MOSSY_REGOLITH_BRICKS = HELPER.createBlock("mossy_regolith_bricks", ()->new Block(Properties.REGOLITH), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MOSSY_REGOLITH_BRICK_SLAB = HELPER.createBlock("mossy_regolith_brick_slab", ()->new SlabBlock(Properties.REGOLITH), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MOSSY_REGOLITH_BRICK_STAIRS = HELPER.createBlock("mossy_regolith_brick_stairs", ()->new AbnormalsStairsBlock(COARSE_DIRT_BRICKS.get().getDefaultState(), Properties.REGOLITH), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MOSSY_REGOLITH_BRICK_WALL = HELPER.createBlock("mossy_regolith_brick_wall", ()->new WallBlock(Properties.REGOLITH), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MOSSY_REGOLITH_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "mossy_regolith_brick_vertical_slab", ()->new VerticalSlabBlock(Properties.REGOLITH), ItemGroup.BUILDING_BLOCKS);

    public static final RegistryObject<Block> CHISELED_REGOLITH_BRICKS = HELPER.createBlock("chiseled_regolith_bricks", ()->new Block(Properties.REGOLITH), ItemGroup.BUILDING_BLOCKS);

    public static final RegistryObject<Block> COB = HELPER.createBlock("cob", ()->new Block(Properties.COB), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_COB = HELPER.createBlock("polished_cob", ()->new Block(Properties.COB), ItemGroup.BUILDING_BLOCKS);


    public static final RegistryObject<Block> IRON_CLUSTER = HELPER.createBlock("iron_cluster", ()->new Block(Properties.ROUGH_DIRT), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PEAT_CLUSTER = HELPER.createBlock("peat_cluster", ()->new Block(Properties.ROUGH_DIRT), ItemGroup.BUILDING_BLOCKS);

    // Parsnips
    public static final RegistryObject<Block> PARSNIP_ROOTS = HELPER.createBlockNoItem("parsnip_roots", ()->new ParsnipRootBlock(Properties.PARSNIP_ROOTS));

    // Cantaloupes
    public static final RegistryObject<Block> CANTALOUPE_VINES = HELPER.createBlock("cantaloupe_vines", ()->new RootBlock(Properties.ROOTS), ItemGroup.DECORATIONS);

    public static final class Properties {
        // todo: make these custom
        public static final AbstractBlock.Properties ROUGH_DIRT = AbstractBlock.Properties.from(Blocks.DIRT);
        public static final AbstractBlock.Properties REGOLITH = AbstractBlock.Properties.from(Blocks.COBBLESTONE);
        public static final AbstractBlock.Properties COB = AbstractBlock.Properties.from(Blocks.STONE);

        public static final AbstractBlock.Properties PARSNIP_ROOTS = AbstractBlock.Properties.create(Material.PLANTS).zeroHardnessAndResistance().sound(SoundType.PLANT).notSolid().doesNotBlockMovement().tickRandomly();
        public static final AbstractBlock.Properties ROOTS = AbstractBlock.Properties.create(Material.PLANTS).zeroHardnessAndResistance().sound(SoundType.PLANT).notSolid().doesNotBlockMovement();
    }
}
