package com.alldream.demo;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class MaterialDream extends Material{
	public MaterialDream(MapColor par1MapColor) {
		 super(par1MapColor);
		 setRequiresTool(); //让它只能被特定工具采集
	}
}
