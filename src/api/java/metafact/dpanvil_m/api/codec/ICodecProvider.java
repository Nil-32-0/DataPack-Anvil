package metafact.dpanvil_m.api.codec;

import com.mojang.serialization.Codec;

public interface ICodecProvider<T> {

	Codec<T> codec();
}
