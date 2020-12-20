package com.cst.factorypattern;

import com.cst.factorypattern.page.CartPage;
import com.cst.factorypattern.page.ItemPage;
import com.cst.factorypattern.page.SearchPage;

public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
