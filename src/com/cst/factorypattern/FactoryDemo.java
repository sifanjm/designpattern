package com.cst.factorypattern;

public class FactoryDemo {

	public static void main(String[] args) {
		Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		//site.createWebsite();

		System.out.println(site.getPages());


		site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		//site.createWebsite();

		System.out.println(site.getPages());
	}

}
