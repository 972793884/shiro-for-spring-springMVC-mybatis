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

public class Student implements Serializable {
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
	private Integer age;
	/**
	 * 
	 */
	private String studentNumber;
	/**
	 * 
	 */
	private String phone;
	/**
	 * 
	 */
	private String email;
	/**
	 * 
	 */
	private String address;
	/**
	 * 
	 */
	private Date birthday;
	/**
	 *  系
	 */
	private Integer dept;
	/**
	 * 专业
	 */
	private Integer major;
	/**
	 * 班级
	 */
	private Integer grade;

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
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * 获取：
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * 设置：
	 */
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	/**
	 * 获取：
	 */
	public String getStudentNumber() {
		return studentNumber;
	}
	/**
	 * 设置：
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/**
	 * 获取：
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * 设置： 系
	 */
	public void setDept(Integer dept) {
		this.dept = dept;
	}
	/**
	 * 获取： 系
	 */
	public Integer getDept() {
		return dept;
	}
	/**
	 * 设置：专业
	 */
	public void setMajor(Integer major) {
		this.major = major;
	}
	/**
	 * 获取：专业
	 */
	public Integer getMajor() {
		return major;
	}
	/**
	 * 设置：班级
	 */
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	/**
	 * 获取：班级
	 */
	public Integer getGrade() {
		return grade;
	}
}
