package metafact.dpanvil_m.api.data.remap;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import metafact.dpanvil_m.api.DataPackAnvilApi;
import metafact.dpanvil_m.api.data.AbstractManagedDataBuilderProvider;
import metafact.dpanvil_m.api.data.IDataManager;

import java.util.concurrent.CompletableFuture;

public abstract class AbstractRemapKeysProvider extends AbstractManagedDataBuilderProvider<RemapKeys, RemapKeys.Builder> {

    protected AbstractRemapKeysProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
        super(packOutput, registries, DataPackAnvilApi.REMAP_KEYS_MANAGER, RemapKeys.Builder.ENCODER);
    }

    protected RemapKeys.Builder remap(ResourceKey<? extends IDataManager<?>> key) {
        var builder = RemapKeys.builder();

        add(key.location(), builder);
        return builder;
    }
}
