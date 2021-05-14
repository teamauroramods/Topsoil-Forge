package com.teamaurora.topsoil.core.registry;

import com.minecraftabnormals.abnormals_core.core.util.registry.ItemSubRegistryHelper;
import com.teamaurora.topsoil.core.Topsoil;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Topsoil.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TopsoilItems {
    public static final ItemSubRegistryHelper HELPER = Topsoil.REGISTRY_HELPER.getItemSubHelper();

    public static final RegistryObject<Item> PARSNIP = HELPER.createItem("parsnip", ()->new BlockNamedItem(TopsoilBlocks.PARSNIP_ROOTS.get(), new Item.Properties().group(ItemGroup.FOOD).food(Foods.PARSNIP)));
    public static final RegistryObject<Item> CANTALOUPE_SLICE = HELPER.createItem("cantaloupe_slice", ()->new Item(new Item.Properties().food(Foods.CANTALOUPE_STEM).group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> HEARTY_SOUP = HELPER.createItem("hearty_soup", ()->new SoupItem(new Item.Properties().maxStackSize(1).food(Foods.HEARTY_SOUP).group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> PARSNIP_STRAW = HELPER.createItem("parsnip_straw", ()->new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static class Foods {
        public static final Food PARSNIP = (new Food.Builder()).hunger(3).saturation(0.6F).build(); // temporarily a carrot clone
        public static final Food CANTALOUPE_STEM = (new Food.Builder()).hunger(2).saturation(0.3F).build(); // temporarily a melon clone
        public static final Food HEARTY_SOUP = (new Food.Builder()).hunger(6).saturation(0.5F).build(); // temporarily a lavender salad clone
    }
}
