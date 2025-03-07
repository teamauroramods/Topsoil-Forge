package com.teamaurora.topsoil.core.registry;

import com.minecraftabnormals.abnormals_core.common.blocks.AbnormalsFlowerBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.VerticalSlabBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.wood.AbnormalsLogBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.wood.StrippedLogBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.wood.StrippedWoodBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.wood.WoodBlock;
import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;
import com.teamaurora.topsoil.common.block.*;
import com.teamaurora.topsoil.core.Topsoil;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Effects;
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

    // Cob
    // TODO: add variants when AC datagen arrives
    public static final RegistryObject<Block> COB = HELPER.createBlock("cob", ()->new Block(Properties.COB), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_COB = HELPER.createBlock("polished_cob", ()->new Block(Properties.COB), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMOOTH_COB = HELPER.createBlock("smooth_cob", ()->new Block(Properties.COB), ItemGroup.BUILDING_BLOCKS);

    public static final RegistryObject<Block> COB_BRICKS = HELPER.createBlock("cob_bricks", ()->new Block(Properties.COB), ItemGroup.BUILDING_BLOCKS);

    public static final RegistryObject<Block> COB_TILES = HELPER.createBlock("cob_tiles", ()->new Block(Properties.COB), ItemGroup.BUILDING_BLOCKS);

    public static final RegistryObject<Block> CUT_COB = HELPER.createBlock("cut_cob", ()->new Block(Properties.COB), ItemGroup.BUILDING_BLOCKS);

    public static final RegistryObject<Block> CHISELED_COB_TILES = HELPER.createBlock("chiseled_cob_tiles", ()->new Block(Properties.COB), ItemGroup.BUILDING_BLOCKS);

    public static final RegistryObject<Block> IRON_CLUSTER = HELPER.createBlock("iron_cluster", ()->new Block(Properties.ROUGH_DIRT), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PEAT_CLUSTER = HELPER.createBlock("peat_cluster", ()->new Block(Properties.ROUGH_DIRT), ItemGroup.BUILDING_BLOCKS);

    // Peat
    public static final RegistryObject<Block> PEAT_BLOCK = HELPER.createBlock("peat_block", ()->new Block(Properties.PEAT), ItemGroup.BUILDING_BLOCKS);

    public static final RegistryObject<Block> PEAT_BRICKS = HELPER.createBlock("peat_bricks", ()->new Block(Properties.PEAT), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHISELED_PEAT_BRICKS = HELPER.createBlock("chiseled_peat_bricks", ()->new Block(Properties.PEAT), ItemGroup.BUILDING_BLOCKS);

    public static final RegistryObject<Block> LARGE_PEAT_BRICKS = HELPER.createBlock("large_peat_bricks", ()->new Block(Properties.PEAT), ItemGroup.BUILDING_BLOCKS);

    // Parsnips
    public static final RegistryObject<Block> PARSNIP_ROOTS = HELPER.createBlockNoItem("parsnip_roots", ()->new ParsnipRootBlock(Properties.PARSNIP_ROOTS));
    public static final RegistryObject<Block> PARSNIP_STRAW_BALE = HELPER.createBlock("parsnip_straw_bale", ()->new HayBlock(AbstractBlock.Properties.from(Blocks.HAY_BLOCK)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PARSNIP_STRAW_VINES = HELPER.createBlock("parsnip_straw_vines", ()->new VineBlock(AbstractBlock.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0.2F).sound(SoundType.VINE)), ItemGroup.DECORATIONS);

    // Cantaloupes
    public static final RegistryObject<Block> CANTALOUPE_VINES = HELPER.createBlock("cantaloupe_vines", ()->new RootBlock(false, Properties.ROOTS), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> CANTALOUPE_STEM = HELPER.createBlock("cantaloupe_stem", ()->new CantaloupeStemBlock(AbstractBlock.Properties.from(Blocks.PUMPKIN_STEM)), ItemGroup.MISC);
    public static final RegistryObject<Block> SMALL_CANTALOUPE = HELPER.createBlock("small_cantaloupe", ()->new SmallCantaloupeBlock(AbstractBlock.Properties.from(Blocks.PUMPKIN)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> CARVED_CANTALOUPE = HELPER.createBlock("carved_cantaloupe", ()->new CarvedCantaloupeBlock(AbstractBlock.Properties.from(Blocks.PUMPKIN)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> CANTALOUPE = HELPER.createBlock("cantaloupe", ()->new CantaloupeBlock(CARVED_CANTALOUPE, AbstractBlock.Properties.from(Blocks.PUMPKIN)), ItemGroup.DECORATIONS);

    // Foxfire Shrooms
    // TODO: make decaying wood block properties
    public static final RegistryObject<Block> STRIPPED_DECAYING_LOG = HELPER.createBlock("stripped_decaying_log", ()->new StrippedLogBlock(AbstractBlock.Properties.from(Blocks.STRIPPED_OAK_LOG)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_DECAYING_WOOD = HELPER.createBlock("stripped_decaying_wood", ()->new StrippedWoodBlock(AbstractBlock.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> DECAYING_LOG = HELPER.createBlock("decaying_log", ()->new AbnormalsLogBlock(STRIPPED_DECAYING_LOG, AbstractBlock.Properties.from(Blocks.OAK_LOG)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> DECAYING_WOOD = HELPER.createBlock("decaying_wood", ()->new WoodBlock(STRIPPED_DECAYING_WOOD, AbstractBlock.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> FOXFIRE_DECAYING_LOG = HELPER.createBlock("foxfire_decaying_log", ()->new ShroomLogBlock(DECAYING_LOG, STRIPPED_DECAYING_LOG, AbstractBlock.Properties.from(Blocks.OAK_LOG).setLightLevel((state)->(3))), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> FOXFIRE_DECAYING_WOOD = HELPER.createBlock("foxfire_decaying_wood", ()->new ShroomWoodBlock(DECAYING_WOOD, STRIPPED_DECAYING_WOOD, AbstractBlock.Properties.from(Blocks.OAK_WOOD).setLightLevel((state)->(3))), ItemGroup.BUILDING_BLOCKS);

    public static final RegistryObject<Block> GREEN_FOXFIRE_SOIL = HELPER.createBlock("green_foxfire_soil", ()->new Block(AbstractBlock.Properties.from(Blocks.DIRT).setLightLevel((state)->(3))), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_FOXFIRE_SOIL = HELPER.createBlock("blue_foxfire_soil", ()->new Block(AbstractBlock.Properties.from(Blocks.DIRT).setLightLevel((state)->(3))), ItemGroup.BUILDING_BLOCKS);

    public static final RegistryObject<Block> TALL_BLUE_FOXFIRE_FUNGI = HELPER.createBlock("tall_blue_foxfire_fungi", ()->new LargeFoxfireBlock(AbstractBlock.Properties.from(Blocks.BROWN_MUSHROOM).setLightLevel((state)->(6))), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> TALL_GREEN_FOXFIRE_FUNGI = HELPER.createBlock("tall_green_foxfire_fungi", ()->new LargeFoxfireBlock(AbstractBlock.Properties.from(Blocks.BROWN_MUSHROOM).setLightLevel((state)->(6))), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> BLUE_FOXFIRE_FUNGI = HELPER.createBlock("blue_foxfire_fungi", ()->new FoxfireBlock(TALL_BLUE_FOXFIRE_FUNGI, AbstractBlock.Properties.from(Blocks.BROWN_MUSHROOM).setLightLevel((state)->(6))), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> GREEN_FOXFIRE_FUNGI = HELPER.createBlock("green_foxfire_fungi", ()->new FoxfireBlock(TALL_GREEN_FOXFIRE_FUNGI, AbstractBlock.Properties.from(Blocks.BROWN_MUSHROOM).setLightLevel((state)->(6))), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> BLUE_FOXFIRE_WALL_FUNGI = HELPER.createBlock("blue_foxfire_wall_fungi", ()->new WallFungiBlock(AbstractBlock.Properties.from(Blocks.BROWN_MUSHROOM).setLightLevel((state)->(6))), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> GREEN_FOXFIRE_WALL_FUNGI = HELPER.createBlock("green_foxfire_wall_fungi", ()->new WallFungiBlock(AbstractBlock.Properties.from(Blocks.BROWN_MUSHROOM).setLightLevel((state)->(6))), ItemGroup.DECORATIONS);



    // Mallows
    // TODO: custom stew effect
    public static final RegistryObject<Block> RED_MALLOW = HELPER.createBlock("red_mallow", ()->new AbnormalsFlowerBlock(() -> Effects.HASTE, 0, AbstractBlock.Properties.from(Blocks.POPPY)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> WHITE_MALLOW = HELPER.createBlock("white_mallow", ()->new AbnormalsFlowerBlock(() -> Effects.HASTE, 0, AbstractBlock.Properties.from(Blocks.POPPY)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> MALLOW_BUSH = HELPER.createBlock("mallow_bush", ()->new AbnormalsFlowerBlock(() -> Effects.HASTE, 0, AbstractBlock.Properties.from(Blocks.POPPY)), ItemGroup.DECORATIONS);

    public static final class Properties {
        // todo: make these custom
        public static final AbstractBlock.Properties ROUGH_DIRT = AbstractBlock.Properties.from(Blocks.DIRT);
        public static final AbstractBlock.Properties REGOLITH = AbstractBlock.Properties.from(Blocks.COBBLESTONE);
        public static final AbstractBlock.Properties COB = AbstractBlock.Properties.from(Blocks.STONE);
        public static final AbstractBlock.Properties PEAT = AbstractBlock.Properties.from(Blocks.DIRT);

        public static final AbstractBlock.Properties PARSNIP_ROOTS = AbstractBlock.Properties.create(Material.PLANTS).zeroHardnessAndResistance().sound(SoundType.PLANT).notSolid().doesNotBlockMovement().tickRandomly();
        public static final AbstractBlock.Properties ROOTS = AbstractBlock.Properties.create(Material.PLANTS).zeroHardnessAndResistance().sound(SoundType.PLANT).notSolid().doesNotBlockMovement();
    }
}
