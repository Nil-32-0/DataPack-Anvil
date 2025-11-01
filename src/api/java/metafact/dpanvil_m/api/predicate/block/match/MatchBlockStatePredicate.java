package metafact.dpanvil_m.api.predicate.block.match;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.level.block.state.BlockState;
import metafact.dpanvil_m.api.DPAnvilNames;
import metafact.dpanvil_m.api.predicate.block.BlockPosPredicateType;
import metafact.dpanvil_m.api.predicate.block.IBlockStatePredicate;

public record MatchBlockStatePredicate(
		BlockState state
) implements IBlockStatePredicate {

	public static final String NAME = "blockstate";
	public static final Codec<MatchBlockStatePredicate> CODEC = RecordCodecBuilder.create(builder -> builder.group(
			BlockState.CODEC.fieldOf(DPAnvilNames.STATE).forGetter(p -> p.state)
	).apply(builder, MatchBlockStatePredicate::new));

	@Override
	public boolean test(BlockState state) {
		return this.state.equals(state);
	}

	@Override
	public BlockPosPredicateType<MatchBlockStatePredicate> getType() {
		return BlockPosPredicateType.MATCH_STATE.get();
	}

}
