package cn.karo.ATP.core.shiro.entities;

public class Permission {

	private Integer id;
	private String permissionName;
	private String url;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return permissionName;
	}
	public void setUserName(String userName) {
		this.permissionName = userName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
