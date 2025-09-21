package net.bytem0use.vermins.fazbear_sights.datagen;

import net.bytem0use.vermins.fazbear_sights.FazbearSights;
import net.bytem0use.vermins.fazbear_sights.block.FazbearBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, FazbearSights.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        BAIM(FazbearBlocks.TILED_FLOOR_BLOCK);
        BAIM(FazbearBlocks.TILED_WALL_BLOCK);
        BAIM(FazbearBlocks.FNAF1_WALL_BLOCK);
        BAIM(FazbearBlocks.FNAF1_WALL_PATTERN_BLOCK);
        BAIM(FazbearBlocks.TILED_FLOOR_BLOCK_WHITE_RED);
        BAIM(FazbearBlocks.TILED_FLOOR_BLOCK_BLACK_RED);
        BAIM(FazbearBlocks.FNAF2_WALL_PATTERN_BLOCK);
        BAIM(FazbearBlocks.FNAF2_WALL_NOCONFETTI);
        BAIM(FazbearBlocks.RED_CURTAIN);
        BAIM(FazbearBlocks.FNAF1_WALL_TOP_CEILING);

    }

    private void BAIM(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
