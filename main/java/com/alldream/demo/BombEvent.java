package com.alldream.demo;

import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.entity.player.EntityPlayer;

public class BombEvent extends Event{
	public final EntityPlayer entityPlayer;
	
	public BombEvent(EntityPlayer entity)
	{
		super();
		entityPlayer = entity;
	}
}
