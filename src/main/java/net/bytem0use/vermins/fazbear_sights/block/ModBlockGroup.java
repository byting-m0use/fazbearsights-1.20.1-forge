package net.bytem0use.vermins.fazbear_sights.block;

import net.bytem0use.vermins.fazbear_sights.FazbearSights;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockGroup {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FazbearSights.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FAZBEAR_BLOCKS = CREATIVE_MODE_TABS.register("fazbear_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(FazbearBlocks.FNAF1_WALL_PATTERN_BLOCK.get()))
                    .title(Component.translatable("creative_tab.fazbear_blocks"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(FazbearBlocks.FNAF1_WALL_PATTERN_BLOCK.get());
                        pOutput.accept(FazbearBlocks.TILED_FLOOR_BLOCK.get());
                        pOutput.accept(FazbearBlocks.TILED_WALL_BLOCK.get());
                        pOutput.accept(FazbearBlocks.TILED_FLOOR_BLOCK_WHITE_RED.get());
                        pOutput.accept(FazbearBlocks.TILED_FLOOR_BLOCK_BLACK_RED.get());
                        pOutput.accept(FazbearBlocks.FNAF2_WALL_NOCONFETTI.get());
                        pOutput.accept(FazbearBlocks.FNAF2_WALL_PATTERN_BLOCK.get());
                        pOutput.accept(FazbearBlocks.RED_CURTAIN.get());
                        pOutput.accept(FazbearBlocks.FNAF1_WALL_BLOCK.get());
                        pOutput.accept(FazbearBlocks.FNAF1_WALL_TOP_CEILING.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
