package com.chee.tutorial.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Copyright 2016 WANdisco.
 */
public class ModItems {

  public static Item tutorialItem;
  public static Item.ToolMaterial TUTORIAL = EnumHelper.addToolMaterial("TUTORIAL", 3, 1000, 15.0F, 4.0F, 30);
  public static ItemArmor.ArmorMaterial TUTORIALA = EnumHelper.addArmorMaterial("TUTORIALA", "tutorial:tutorial", 16, new int[] {3, 8, 6, 3}, 30);
  public static ItemModSword tutorialSword;
  public static ItemModPickaxe tutorialPickaxe;
  public static ItemModAxe tutorialAxe;
  public static ItemModSpade tutorialSpade;
  public static ItemModHoe tutorialHoe;
  public static ItemModMultitool tutorialMultitool;
  public static ItemModArmor tutorialHelmet;
  public static ItemModArmor tutorialChestplate;
  public static ItemModArmor tutorialLeggings;
  public static ItemModArmor tutorialBoots;
  public static ItemFood tutorialChocolate;

  public static void createItems() {
    GameRegistry.registerItem(tutorialItem = new BasicItem("tutorial_item"), "tutorial_item");
    GameRegistry.registerItem(tutorialPickaxe = new ItemModPickaxe("tutorial_pickaxe", TUTORIAL), "tutorial_pickaxe");
    GameRegistry.registerItem(tutorialAxe = new ItemModAxe("tutorial_axe", TUTORIAL), "tutorial_axe");
    GameRegistry.registerItem(tutorialSpade = new ItemModSpade("tutorial_spade", TUTORIAL), "tutorial_spade");
    GameRegistry.registerItem(tutorialHoe = new ItemModHoe("tutorial_hoe", TUTORIAL), "tutorial_hoe");
    GameRegistry.registerItem(tutorialSword = new ItemModSword("tutorial_sword", TUTORIAL), "tutorial_sword");
    GameRegistry.registerItem(tutorialMultitool = new ItemModMultitool("tutorial_multitool", TUTORIAL), "tutorial_multitool");
    GameRegistry.registerItem(tutorialHelmet = new ItemModArmor("tutorial_helmet", TUTORIALA, 1, 0), "tutorial_helmet");
    GameRegistry.registerItem(tutorialChestplate = new ItemModArmor("tutorial_chestplate", TUTORIALA, 1, 1), "tutorial_chestplate");
    GameRegistry.registerItem(tutorialLeggings = new ItemModArmor("tutorial_leggings", TUTORIALA, 2, 2), "tutorial_leggings");
    GameRegistry.registerItem(tutorialBoots = new ItemModArmor("tutorial_boots", TUTORIALA, 1, 3), "tutorial_boots");
    GameRegistry.registerItem(tutorialChocolate = new ItemModFood("tutorial_chocolate", 2, 0.2f, false,
            new PotionEffect(Potion.moveSpeed.id, 1200, 1),
            new PotionEffect(Potion.jump.id, 600, 0),
            new PotionEffect(Potion.regeneration.id, 200, 1))
            .setAlwaysEdible(), "tutorial_chocolate");
  }

}
