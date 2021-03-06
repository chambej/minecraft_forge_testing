package com.chee.tutorial.client.render.items;

import com.chee.tutorial.Main;
import com.chee.tutorial.items.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Copyright 2016 WANdisco.
 */
public final class ItemRenderRegister {

  public static String modid = Main.MODID;

  public static void registerItemRenderer() {
    reg(ModItems.tutorialItem);
    reg(ModItems.tutorialAxe);
    reg(ModItems.tutorialHoe);
    reg(ModItems.tutorialPickaxe);
    reg(ModItems.tutorialSpade);
    reg(ModItems.tutorialSword);
    reg(ModItems.tutorialMultitool);
    reg(ModItems.tutorialBoots);
    reg(ModItems.tutorialChestplate);
    reg(ModItems.tutorialHelmet);
    reg(ModItems.tutorialLeggings);
    reg(ModItems.tutorialChocolate);

  }

  public static void reg(Item item) {
    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
  }

}
