package withoutaname.mods.examplemod.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import withoutaname.mods.examplemod.ExampleMod;

public class Language extends LanguageProvider {
	
	private final String locale;
	
	public Language(DataGenerator gen, String locale) {
		super(gen, ExampleMod.MODID, locale);
		this.locale = locale;
	}
	
	@Override
	protected void addTranslations() {
		add("itemGroup." + ExampleMod.MODID, "Example Mod", "Example Mod");
	}
	
	private void add(String key, String de_de, String en_us) {
		switch (locale) {
			case "de_de" -> add(key, de_de);
			case "en_us" -> add(key, en_us);
		}
	}
	
	private void add(Item key, String de_de, String en_us) {
		add(key.getDescriptionId(), de_de, en_us);
	}
	
	private void add(Block key, String de_de, String en_us) {
		add(key.getDescriptionId(), de_de, en_us);
	}
	
}
