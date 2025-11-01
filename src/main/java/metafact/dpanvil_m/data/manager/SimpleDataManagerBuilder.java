package metafact.dpanvil_m.data.manager;

import metafact.dpanvil_m.api.data.IDataManager;

public class SimpleDataManagerBuilder<T> extends AbstractBuilder<T> {

	public SimpleDataManagerBuilder(Class<T> type, String folder) {
		super(type, folder);
	}
	
	@Override
	public IDataManager<T> build() {
		return new SimpleDataManager<>(type, folder, defaultValueFactory, idSetter);
	}
}
