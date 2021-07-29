package withoutaname.mods.examplemod.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import withoutaname.mods.examplemod.ExampleMod;

import javax.annotation.Nonnull;

public class ModSetup {
	
	public static final CreativeModeTab DEFAULT_CREATIVE_TAB = new CreativeModeTab(ExampleMod.MODID) {
		
		@Nonnull
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(Items.AIR);
		}
		
	};
	public static final Item.Properties DEFAULT_ITEM_PROPERTIES = new Item.Properties().tab(DEFAULT_CREATIVE_TAB);
	
}
