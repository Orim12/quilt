package com.Orim12.Test_mod.items;

import com.Orim12.Test_mod.test_mod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItems {

	public static final Item test_item = registerItem("test_item",
		new Item(new QuiltItemSettings().group(ItemGroup.MISC)));

	private static Item registerItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(test_mod.MOD_ID, name), item);
	}

	public static void registerModItems(){
		test_mod.LOGGER.info("registering mod for " + test_mod.MOD_ID);
	}
}
