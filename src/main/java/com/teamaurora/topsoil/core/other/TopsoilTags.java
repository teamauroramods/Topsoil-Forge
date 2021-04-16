package com.teamaurora.topsoil.core.other;

import com.teamaurora.topsoil.core.Topsoil;
import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.util.ResourceLocation;

public class TopsoilTags {
    public static class Blocks {
        public static final ITag.INamedTag<Block> DIRT = BlockTags.createOptional(new ResourceLocation(Topsoil.MODID, "dirt"));
    }
}
