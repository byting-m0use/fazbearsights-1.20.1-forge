package net.bytem0use.vermins.fazbear_sights.datagen.loot;

import net.bytem0use.vermins.fazbear_sights.block.FazbearBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlagSet.of());
    }

    @Override
    protected void generate() {
        this.dropSelf(FazbearBlocks.TILED_WALL_BLOCK.get());
        this.dropSelf(FazbearBlocks.TILED_FLOOR_BLOCK.get());
        this.dropSelf(FazbearBlocks.FNAF1_WALL_BLOCK.get());
        this.dropSelf(FazbearBlocks.FNAF1_WALL_PATTERN_BLOCK.get());
        this.dropSelf(FazbearBlocks.TILED_FLOOR_BLOCK_WHITE_RED.get());
        this.dropSelf(FazbearBlocks.TILED_FLOOR_BLOCK_BLACK_RED.get());
        this.dropSelf(FazbearBlocks.FNAF2_WALL_PATTERN_BLOCK.get());
        this.dropSelf(FazbearBlocks.FNAF2_WALL_NOCONFETTI.get());
        this.dropSelf(FazbearBlocks.RED_CURTAIN.get());
        this.dropSelf(FazbearBlocks.FNAF1_WALL_TOP_CEILING.get());


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return FazbearBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
