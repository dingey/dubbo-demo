package com.d.controller;

import java.util.List;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author di
 */
@Controller
public class TestController {
	@ResponseBody
	@RequestMapping(path = "/test")
	public Object save(@Valid Test t) {
		return t;
	}

	public static class Test {
		@NotNull(message = "不允许为空")
		Integer id;
		@Size(min = 2, max = 6)
		String name;
		Date create;
		@NotNull
		Item item;
		@NotNull
		List<Item> items;

		public Item getItem() {
			return item;
		}

		public void setItem(Item item) {
			this.item = item;
		}

		public List<Item> getItems() {
			return items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Date getCreate() {
			return create;
		}

		public void setCreate(Date create) {
			this.create = create;
		}
	}

	public static class Item {
		@NotEmpty
		String n;

		public String getN() {
			return n;
		}

		public void setN(String n) {
			this.n = n;
		}

	}
}
