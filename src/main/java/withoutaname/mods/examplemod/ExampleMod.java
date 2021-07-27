package withoutaname.mods.examplemod;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ExampleMod.MODID)
@Mod.EventBusSubscriber
public class ExampleMod {
	public static final String MODID = "examplemod";
	public static final Logger LOGGER = LogManager.getLogger();
	
	public ExampleMod() {}
}
