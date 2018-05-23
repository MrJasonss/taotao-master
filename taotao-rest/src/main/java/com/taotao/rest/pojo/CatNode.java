package com.taotao.rest.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 *
 * @method
 * @param 
 * @return 
 * @author w.x.y
 * @date 2017/9/11 16:36
 */
public class CatNode {

	@JsonProperty("n")
	private String name;

	@JsonProperty("u")
	private String url;

	@JsonProperty("i")
	private List<?> item;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<?> getItem() {
		return item;
	}

	public void setItem(List<?> item) {
		this.item = item;
	}
	
	
	
}
