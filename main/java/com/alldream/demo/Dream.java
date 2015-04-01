package com.alldream.demo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=Dream.MODID, name=Dream.NAME, version=Dream.VERSION)
public class Dream {
	public static final String MODID = "dream";
	public static final String NAME = "Dream";
    public static final String VERSION = "1.0";
    public static Block dreamBlock;
    static public Item noUse;
    static public Item dreamTool;
	@EventHandler
	public void preLoad(FMLPreInitializationEvent event)
	{
		dreamBlock = new BlockDreamUnit(Material.rock);
		dreamBlock.setBlockName("dreamUnit");
		dreamBlock.setBlockTextureName("dream:dreamUnit");
		dreamBlock.setHardness(10f);
		dreamBlock.setResistance(10.0f);
		dreamBlock.setLightLevel(1.0f);
		dreamBlock.setHarvestLevel("dream", 1);
		dreamBlock.setStepSound(Block.soundTypeStone);
		dreamBlock.setCreativeTab(CreativeTabs.tabBlock);
		GameRegistry.registerBlock(dreamBlock,"dreamUnit");
		
		noUse = new NoUse();	
		noUse.setUnlocalizedName("NoUse");
		noUse.setTextureName("dream:NoUse");
		noUse.setMaxStackSize(64);
		noUse.setCreativeTab(CreativeTabs.tabMaterials);
		GameRegistry.registerItem(noUse, "NoUse");

		dreamTool = new DreamTools();
		dreamTool.setUnlocalizedName("dreamTool");
		dreamTool.setTextureName("dream:dreamTool");
		dreamTool.setCreativeTab(CreativeTabs.tabTools);
		GameRegistry.registerItem(dreamTool, "dreamTool");
		dreamTool.setHarvestLevel("dream",1);
	}
	 
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		GameRegistry.addSmelting(dreamBlock, new ItemStack(noUse), 100f);
		GameRegistry.addRecipe(new ItemStack(dreamTool, 1), new Object[] {"###", "#X#", " X ", '#', noUse, 'X', Items.stick});
		MinecraftForge.EVENT_BUS.register(new EventContainer());
	}
	 
	@EventHandler
	public void postLoad(FMLPostInitializationEvent event)
	{
	}
}
