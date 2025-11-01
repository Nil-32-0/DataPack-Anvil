package metafact.dpanvil_m;

import metafact.dpanvil_m.api.IDataPackAnvilService;
import metafact.dpanvil_m.api.data.IDataManager;
import metafact.dpanvil_m.data.manager.SimpleDataManagerBuilder;

import javax.annotation.Nonnull;

public class DataPackAnvilService implements IDataPackAnvilService {
    @Nonnull
    @Override
    public <T> IDataManager.Builder<T> createDataManagerBuilder(@Nonnull Class<T> type, @Nonnull String folder) {
        return new SimpleDataManagerBuilder<>(type, folder);
    }
}
