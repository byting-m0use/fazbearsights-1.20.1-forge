package net.bytem0use.vermins.fazbear_sights.block;

import net.bytem0use.vermins.fazbear_sights.FazbearSights;
import net.bytem0use.vermins.fazbear_sights.item.FazbearItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class FazbearBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, FazbearSights.MOD_ID);

    public static final RegistryObject<Block> TILED_FLOOR_BLOCK = registerBlock("tiled_floor_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> FNAF1_WALL_PATTERN_BLOCK = registerBlock("fnaf1_wall_pattern_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> FNAF1_WALL_BLOCK = registerBlock("fnaf1_wall_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD).sound(SoundType.SCAFFOLDING)));

    public static final RegistryObject<Block> FNAF2_WALL_NOCONFETTI = registerBlock("fnaf2_wall_noconfetti",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD).sound(SoundType.SCAFFOLDING)));

    public static final RegistryObject<Block> FNAF2_WALL_PATTERN_BLOCK = registerBlock("fnaf2_wall_pattern_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> TILED_FLOOR_BLOCK_BLACK_RED= registerBlock("tiled_floor_block_black_red",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> TILED_FLOOR_BLOCK_WHITE_RED= registerBlock("tiled_floor_block_white_red",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> TILED_WALL_BLOCK= registerBlock("tiled_wall_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> RED_CURTAIN= registerBlock("red_curtain",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));

    public static final RegistryObject<Block> FNAF1_WALL_TOP_CEILING= registerBlock("fnaf1_wall_top_ceiling",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD).sound(SoundType.SCAFFOLDING)));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
       return FazbearItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventbus) {
        BLOCKS.register(eventbus);
    }
}
