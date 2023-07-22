package org.theplaceholder.tdcr.fabric;

import com.tuesday.tdcr.TDCR;
import net.fabricmc.api.ModInitializer;

public class TDCRFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        TDCR.init();
    }
}