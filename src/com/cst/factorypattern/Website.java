package com.cst.factorypattern;

import com.cst.factorypattern.page.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public List<Page> getPages() {
        return pages;
    }

    public Website() {
        this.createWebsite();
    }

    public abstract void createWebsite();
}
