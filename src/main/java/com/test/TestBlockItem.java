package com.test;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

@Mod(modid=TestBlockItem.MOD_ID, name="BlockSampleMod", version="1.0")
public class TestBlockItem
{
        public static final String MOD_ID = "BlockSampleMod";
	public static Block blockSample;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//ブロックのインスタンス生成
		blockSample = new AddBlock();
		//ブロックの登録。登録文字列はMOD内で被らなければ何でも良い。
		GameRegistry.registerBlock(blockSample, "blockSample");

	}
}