package com.Orim12.Test_mod.items;

import com.Orim12.Test_mod.Test_mod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItems {

	public static final Item Test_item = registerItem("flame",
		new Item(new QuiltItemSettings().group(ItemGroup.MISC)));

	private static Item registerItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(Test_mod.MOD_ID, name), item);
	}

	public static void registerModItems(){
		Test_mod.LOGGER.info("registering mod for " + Test_mod.MOD_ID);
	}
}
