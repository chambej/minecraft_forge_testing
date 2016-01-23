package com.chee.tutorial.client.render.blocks;

import com.chee.tutorial.Main;
import com.chee.tutorial.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Copyright 2016 WANdisco.
 */
public class BlockRenderRegister {

  public static String modid = Main.MODID;

  public static void reg(Block block) {
    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
  }

  public static void registerBlockRenderer() {
    reg(ModBlocks.tutorialBlock);
  }

}
