package cn.karo.ATP.core.shiro.entities;

import java.util.HashSet;
import java.util.Set;

public class Role {

	private Integer id;
	private String roleName;
	private Set<Permission> permissions=new HashSet<>();
	private Set<User> users=new HashSet<>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return roleName;
	}
	public void setName(String name) {
		this.roleName = name;
	}
	public Set<Permission> getPermissions() {
		return permissions;
	}
	public void setPermissions(Set<Permission> permissions) {
		this.permissions = permissions;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
}
