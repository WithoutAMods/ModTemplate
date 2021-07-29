package withoutaname.mods.examplemod.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import withoutaname.mods.examplemod.ExampleMod;

public class BlockStates extends BlockStateProvider {
	
	public BlockStates(DataGenerator gen, ExistingFileHelper exFileHelper) {
		super(gen, ExampleMod.MODID, exFileHelper);
	}
	
	@Override
	protected void registerStatesAndModels() {
	
	}
	
}
