package com.cst.factorypattern;


import com.cst.factorypattern.page.AboutPage;
import com.cst.factorypattern.page.CommentPage;
import com.cst.factorypattern.page.ContactPage;
import com.cst.factorypattern.page.PostPage;

public class Blog extends Website {


    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
