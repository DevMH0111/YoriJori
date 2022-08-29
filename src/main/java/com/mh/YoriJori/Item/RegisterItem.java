package com.mh.YoriJori.Item;

import com.mh.YoriJori.Util.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class RegisterItem
{
    static Item testitem;

    public static void init()
    {
        testitem = new ItemBasic("testitem").setMaxStackSize(1).setNoRepair().setCreativeTab(yorijoritab);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(testitem);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event)
    {
        registerRender(testitem);
    }
    private static void registerRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    static final CreativeTabs yorijoritab = (new CreativeTabs("yorijoritab")
    {
        @Override
        public ItemStack getTabIconItem()
        {
            return new ItemStack(Items.CLOCK);
        }

        @Override
        public boolean hasSearchBar()
        {
            return true;
        }
    }.setBackgroundImageName("item_search.png"));
}
