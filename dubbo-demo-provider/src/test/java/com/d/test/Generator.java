package com.d.test;

import org.junit.Test;

import com.d.base.BaseEntity;
import com.d.base.BaseMapper;
import com.d.base.BaseService;
import com.di.kit.MvcGenerater;

/**
 * @author d
 */
public class Generator {
	String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC&useUnicode=true&useSSL=true&characterEncoding=UTF-8";
	String username = "root";
	String password = "root";
	String entityPcakage = "com.d.entity";
	String mapperPcakage = "com.d.mapper";
	String servicePcakage = "com.d.service";
	String controlPackage = "com.d.controller";
	String xmlPath = "mybatis/mapper/";
	String viewPath = "WEB-INF/template/";

	@Test
	public void test() {
		// generate();
	}

	public void generate() {
		MvcGenerater g = new MvcGenerater(url, username, password);
		g.setPersistence(MvcGenerater.PersistenceEnum.MYBATIS).setEntityBaseClass(BaseEntity.class);
		g.setServiceBaseClass(BaseService.class).setMapperBaseClass(BaseMapper.class).setTables("test");
		g.setLicenses("/* \r\n* Copyright (c) 2016,All Rights Reserved\r\n*/");
		g.setEntityLicenses(true).setMapperLicenses(true).setServiceLicenses(true).setControlLicenses(true);
		g.setLombok(true).setAuthor("d").setWar(false);
		g.setViewHeader("<#import \"../include/web_layout.ftl\" as layout />\r\n"
				+ "<#import \"../include/import.ftl\" as import />\r\n" + "<@layout.standard title=\"\""
				+ " cssMap={\"\":\"\"}" + " jsMap={\"\":\"\"}>").setViewFooter("</@layout.standard>");
		g.createEntity(entityPcakage).createMapper(mapperPcakage);
		g.createService(servicePcakage).createXml(xmlPath);
		g.createControl(controlPackage).createView(viewPath);
	}
}
