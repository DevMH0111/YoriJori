package com.mh.YoriJori.Proxy;

import com.mh.YoriJori.Item.RegisterItem;

public class CommonProxy
{
    public void preinit() {
        RegisterItem.init();
    }
    public void init() {}
    public void postinit() {}
}
