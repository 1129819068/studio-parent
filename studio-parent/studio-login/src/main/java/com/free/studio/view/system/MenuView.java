package com.free.studio.view.system;

import java.util.List;

/**
 * <p>Title: MenuView.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: com.free.studio</p>
 * @author yewp
 * @date 2017年6月19日上午10:40:19
 * @version 1.0
 */
public class MenuView {

	private String id;
	private String title;
	private String url;
	private String html;
	private String open;
	private String css;
	private String image;
	private String isLeaf;
	private List<MenuView> children;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getHtml() {
		return html;
	}
	public void setHtml(String html) {
		this.html = html;
	}
	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	public String getCss() {
		return css;
	}
	public void setCss(String css) {
		this.css = css;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getIsLeaf() {
		return isLeaf;
	}
	public void setIsLeaf(String isLeaf) {
		this.isLeaf = isLeaf;
	}
	public List<MenuView> getChildren() {
		return children;
	}
	public void setChildren(List<MenuView> children) {
		this.children = children;
	}
	
	
}
