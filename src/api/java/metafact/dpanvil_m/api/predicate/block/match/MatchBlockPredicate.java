package metafact.dpanvil_m.api.predicate.block.match;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import metafact.dpanvil_m.api.DPAnvilNames;
import metafact.dpanvil_m.api.codec.Codecs;
import metafact.dpanvil_m.api.predicate.block.BlockPosPredicateType;
import metafact.dpanvil_m.api.predicate.block.IBlockStatePredicate;

public record MatchBlockPredicate(
		Block block
) implements IBlockStatePredicate {

	public static final String NAME = "block";
	public static final Codec<MatchBlockPredicate> CODEC = RecordCodecBuilder.create(builder -> builder.group(
			Codecs.BLOCK.fieldOf(DPAnvilNames.BLOCK).forGetter(MatchBlockPredicate::block)
	).apply(builder, MatchBlockPredicate::new));


	@Override
	public boolean test(BlockState state) {
		return block == state.getBlock();
	}

	@Override
	public BlockPosPredicateType<MatchBlockPredicate> getType() {
		return BlockPosPredicateType.MATCH_BLOCK.get();
	}

}
