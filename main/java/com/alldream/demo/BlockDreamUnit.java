package com.alldream.demo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockDreamUnit extends Block{
	public BlockDreamUnit(Material material){
		super(material);
		init();
	}
	
	private void init(){

		this.setBlockName("dreamUnit4");
		this.setBlockTextureName("dream:dreamUnit1");
		this.setHardness(1000f);
		this.setResistance(1000.0f);
		this.setLightLevel(1.0f);
		this.setHarvestLevel("dream", 1);
		this.setStepSound(Block.soundTypeStone);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
}
