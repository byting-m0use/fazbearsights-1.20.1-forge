package net.bytem0use.vermins.fazbear_sights.datagen;

import net.bytem0use.vermins.fazbear_sights.FazbearSights;
import net.bytem0use.vermins.fazbear_sights.block.FazbearBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {

    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, FazbearSights.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(FazbearBlocks.TILED_FLOOR_BLOCK.get(),
                        FazbearBlocks.TILED_WALL_BLOCK.get(),
                        FazbearBlocks.FNAF1_WALL_TOP_CEILING.get(),
                        FazbearBlocks.FNAF1_WALL_BLOCK.get(),
                        FazbearBlocks.FNAF1_WALL_PATTERN_BLOCK.get(),
                        FazbearBlocks.FNAF2_WALL_NOCONFETTI.get(),
                        FazbearBlocks.FNAF2_WALL_PATTERN_BLOCK.get(),
                        FazbearBlocks.TILED_FLOOR_BLOCK_WHITE_RED.get(),
                        FazbearBlocks.TILED_FLOOR_BLOCK_BLACK_RED.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL);

    }
}
