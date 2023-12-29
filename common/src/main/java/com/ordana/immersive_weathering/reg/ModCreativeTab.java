package com.ordana.immersive_weathering.reg;

import com.ordana.immersive_weathering.ImmersiveWeathering;
import com.ordana.immersive_weathering.configs.CommonConfigs;
import net.mehvahdjukaar.moonlight.api.misc.RegSupplier;
import net.mehvahdjukaar.moonlight.api.platform.RegHelper;
import net.mehvahdjukaar.moonlight.api.util.Utils;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;

public class ModCreativeTab {
    public static void addItems(RegHelper.ItemToTabEvent event) {
        for(var i : BuiltInRegistries.ITEM.entrySet()){
            //TODO: change
            if(i.getKey().location().getNamespace().equals(ImmersiveWeathering.MOD_ID)){
                event.add(MOD_TAB.getKey(), i.getValue().getDefaultInstance());
            }
        }
    }

    //my dude you are doing conditional registration here
    public static final RegSupplier<CreativeModeTab> MOD_TAB = !CommonConfigs.CREATIVE_TAB.get() ? null :
            RegHelper.registerCreativeModeTab(ImmersiveWeathering.res("supplementaries"),
                    (c) -> c.title(Component.translatable("itemGroup.immersive_weathering.immersive_weathering"))
                            .icon(() -> ModBlocks.IVY.get().asItem().getDefaultInstance()));

    /*
    public static final CreativeModeTab TAB = !CommonConfigs.CREATIVE_TAB.get() ? null :
            PlatHelper.createModTab(ImmersiveWeathering.res(ImmersiveWeathering.MOD_ID),
                    () -> ModBlocks.IVY.get().asItem().getDefaultInstance(), false);

    public static CreativeModeTab getTab(CreativeModeTab tab) {
        return TAB == null ? tab : TAB;
    }

     */
}
