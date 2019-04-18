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

public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	private Integer id;
	/**
	 * 登录名
	 */
	private String name;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 昵称
	 */
	private String nickName;
	/**
	 * 
	 */
	private Integer isDelete;
	/**
	 * 
	 */
	private Integer isLocked;
	/**
	 * 职务/角色  默认初级角色 0超级管理员1学生2老师3工人
	 */
	private Integer duty;
	/**
	 * 根据duty对应的表所对应的的id
	 */
	private Integer bindId;
	/**
	 * 
	 */
	private Date signInTime;
	/**
	 * 
	 */
	private Date lastLoginTime;
	/**
	 * 
	 */
	private Date thisLoginTime;

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
	 * 设置：登录名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：登录名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：密码
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：昵称
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	/**
	 * 获取：昵称
	 */
	public String getNickName() {
		return nickName;
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
	/**
	 * 设置：职务/角色  默认初级角色 0超级管理员1学生2老师3工人
	 */
	public void setDuty(Integer duty) {
		this.duty = duty;
	}
	/**
	 * 获取：职务/角色  默认初级角色 0超级管理员1学生2老师3工人
	 */
	public Integer getDuty() {
		return duty;
	}
	/**
	 * 设置：根据duty对应的表所对应的的id
	 */
	public void setBindId(Integer bindId) {
		this.bindId = bindId;
	}
	/**
	 * 获取：根据duty对应的表所对应的的id
	 */
	public Integer getBindId() {
		return bindId;
	}
	/**
	 * 设置：
	 */
	public void setSignInTime(Date signInTime) {
		this.signInTime = signInTime;
	}
	/**
	 * 获取：
	 */
	public Date getSignInTime() {
		return signInTime;
	}
	/**
	 * 设置：
	 */
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	/**
	 * 获取：
	 */
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	/**
	 * 设置：
	 */
	public void setThisLoginTime(Date thisLoginTime) {
		this.thisLoginTime = thisLoginTime;
	}
	/**
	 * 获取：
	 */
	public Date getThisLoginTime() {
		return thisLoginTime;
	}
}
