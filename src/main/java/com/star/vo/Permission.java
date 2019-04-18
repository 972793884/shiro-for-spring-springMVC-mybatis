package com.star.vo;



import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author zzq
 * @email 972793884@qq.com
 * @date 2019-04-10 13:55:23
 */

public class Permission implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	private Integer id;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String url;
	/**
	 * 
	 */
	private Integer needallroles;
	/**
	 * 
	 */
	private Integer needallperms;
	/**
	 * 
	 */
	private Integer isDelete;
	/**
	 * 
	 */
	private Integer isLocked;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * 设置：
	 */
	public void setNeedallroles(Integer needallroles) {
		this.needallroles = needallroles;
	}
	/**
	 * 获取：
	 */
	public Integer getNeedallroles() {
		return needallroles;
	}
	/**
	 * 设置：
	 */
	public void setNeedallperms(Integer needallperms) {
		this.needallperms = needallperms;
	}
	/**
	 * 获取：
	 */
	public Integer getNeedallperms() {
		return needallperms;
	}
	/**
	 * 设置：
	 */
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	/**
	 * 获取：
	 */
	public Integer getIsDelete() {
		return isDelete;
	}
	/**
	 * 设置：
	 */
	public void setIsLocked(Integer isLocked) {
		this.isLocked = isLocked;
	}
	/**
	 * 获取：
	 */
	public Integer getIsLocked() {
		return isLocked;
	}
}
