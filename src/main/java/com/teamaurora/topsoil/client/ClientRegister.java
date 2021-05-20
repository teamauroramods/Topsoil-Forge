package com.teamaurora.topsoil.client;

import com.teamaurora.topsoil.core.Topsoil;
import com.teamaurora.topsoil.core.registry.TopsoilBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Topsoil.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientRegister {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            setupRenderLayer();
        });
    }

    public static void setupRenderLayer() {
        RenderTypeLookup.setRenderLayer(TopsoilBlocks.PARSNIP_ROOTS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TopsoilBlocks.PARSNIP_STRAW_VINES.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TopsoilBlocks.CANTALOUPE_VINES.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TopsoilBlocks.CANTALOUPE_STEM.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(TopsoilBlocks.RED_MALLOW.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TopsoilBlocks.WHITE_MALLOW.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TopsoilBlocks.MALLOW_BUSH.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(TopsoilBlocks.BLUE_FOXFIRE_FUNGI.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TopsoilBlocks.GREEN_FOXFIRE_FUNGI.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TopsoilBlocks.TALL_BLUE_FOXFIRE_FUNGI.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TopsoilBlocks.TALL_GREEN_FOXFIRE_FUNGI.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TopsoilBlocks.BLUE_FOXFIRE_WALL_FUNGI.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TopsoilBlocks.GREEN_FOXFIRE_WALL_FUNGI.get(), RenderType.getCutout());
    }
}