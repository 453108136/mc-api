package com.alldream.demo;

import java.util.HashSet;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class DreamTools extends ItemTool{
	//在这个字符串数组中添加你想要的工具类型
	 public static final HashSet<String> HARVESTABLE = Sets.newHashSet("pickaxe","shovel","axe");
	 
	 //构造函数
	 public DreamTools()
	 {
	 //调用基类的构造函数,参数分别是攻击实体(Entity)造成的伤害,工具材质(ToolMaterial),能被这种工具加速挖掘的砖块.
	 //其中,第三个参数是原版MC用的,使用Forge的可以无视.
	 super(100f, ToolMaterial.EMERALD, new HashSet());
	 }
	 
	 //获取对砖块的挖掘速度
	 @Override
	 public float getDigSpeed(ItemStack stack, Block block, int meta) {
	 //判断此砖块能否能被加速挖掘.
	 if (HARVESTABLE.contains(block.getHarvestTool(meta)))
	 return efficiencyOnProperMaterial;
	 else
	 return super.getDigSpeed(stack, block, meta);
	 }
	 
	 //判断能否挖掘砖块
	 @Override
	 public boolean canHarvestBlock(Block block, ItemStack itemStack) {
	 if (HARVESTABLE.contains(block.getHarvestTool(0)))
	 return true;
	 else
	 return super.canHarvestBlock(block, itemStack);
	 }

}
