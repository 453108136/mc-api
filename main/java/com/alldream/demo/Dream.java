package com.alldream.demo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
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
    
	@EventHandler
	public void preLoad(FMLPreInitializationEvent event)
	{
		dreamBlock = new BlockDreamUnit(Material.rock);
		dreamBlock.setBlockName("dreamUnit");
		dreamBlock.setBlockTextureName("dream:dreamUnit");
		dreamBlock.setHardness(0.5f);
		dreamBlock.setResistance(10.0f);
		dreamBlock.setLightLevel(1.0f);
		dreamBlock.setHarvestLevel("pickaxe", -1);
		dreamBlock.setStepSound(Block.soundTypeStone);
		dreamBlock.setCreativeTab(CreativeTabs.tabBlock);
		GameRegistry.registerBlock(dreamBlock,"dreamUnit");
	}
	 
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
	}
	 
	@EventHandler
	public void postLoad(FMLPostInitializationEvent event)
	{
	}
}
