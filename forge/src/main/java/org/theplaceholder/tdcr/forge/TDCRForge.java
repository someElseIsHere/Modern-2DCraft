package org.theplaceholder.tdcr.forge;

import com.tuesday.tdcr.TDCR;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.tuesday.tdcr.TDCR.MODID;

@Mod(MODID)
public class TDCRForge {
    public TDCRForge() {
        EventBuses.registerModEventBus(MODID, FMLJavaModLoadingContext.get().getModEventBus());
        TDCR.init();
    }
}