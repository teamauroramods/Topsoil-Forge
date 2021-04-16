package com.teamaurora.topsoil.core.other;

import com.minecraftabnormals.abnormals_core.core.util.DataUtil;
import com.teamaurora.topsoil.core.registry.TopsoilBlocks;
import com.teamaurora.topsoil.core.registry.TopsoilItems;

public class TopsoilCompat {
    public static void registerCompostables() {
        DataUtil.registerCompostable(TopsoilItems.PARSNIP.get(), 0.65F);
    }

    public static void registerFlammables() {
        DataUtil.registerFlammable(TopsoilBlocks.PARSNIP_ROOTS.get(), 15, 100);
    }
}
