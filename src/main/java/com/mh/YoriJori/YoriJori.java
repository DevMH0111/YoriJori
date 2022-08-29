package com.mh.YoriJori;

import com.mh.YoriJori.Proxy.CommonProxy;
import com.mh.YoriJori.Util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class YoriJori
{
    @Mod.Instance(Reference.MOD_ID)
    public static YoriJori instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
        proxy.preinit();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        proxy.init();
    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {
        proxy.postinit();
    }
}
