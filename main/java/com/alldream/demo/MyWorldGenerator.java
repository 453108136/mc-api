package com.alldream.demo;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class MyWorldGenerator implements IWorldGenerator{
	BlockDreamUnit dreamUnit = new BlockDreamUnit(Material.rock);
	
//	private WorldGenMinable wgm = new WorldGenMinable((Block) Block.blockRegistry.getObject("dream:dreamUnit"), 64);

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub

		for(int i = 0; i < 32; i++) {
			int randPosX = chunkX + random.nextInt(16)+8;
			int randPosY = random.nextInt(256);
			int randPosZ = chunkZ + random.nextInt(16)+8;
			(new WorldGenMinable((Block) Block.blockRegistry.getObject("dream:dreamUnit"), 64)).generate(world, random, randPosX, randPosY, randPosZ);
		}
	}
}
