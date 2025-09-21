package net.bytem0use.vermins.fazbear_sights.datagen;

import net.bytem0use.vermins.fazbear_sights.FazbearSights;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FazbearSights.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }

    private ItemModelBuilder simplyItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                 ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0",
                 ResourceLocation.fromNamespaceAndPath(FazbearSights.MOD_ID, "item/" + item.getId().getPath()));
    }
}
