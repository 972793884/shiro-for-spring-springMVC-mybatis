package com.star.vo;



import java.io.Serializable;
import java.util.Date;

/**
 *
 *
 * @author zzq
 * @email 972793884@qq.com
 * @date 2018-10-22 11:49:58
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
    private Integer age;
    /**
     *
     */
    private String name;
    /**
     *
     */
    private String aihao;
    /**
     *
     */
    private Integer status;
    /**
     *
     */
    private String aName;

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
    public void setAihao(String aihao) {
        this.aihao = aihao;
    }
    /**
     * 获取：
     */
    public String getAihao() {
        return aihao;
    }
    /**
     * 设置：
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
    /**
     * 获取：
     */
    public Integer getStatus() {
        return status;
    }
    /**
     * 设置：
     */
    public void setAName(String aName) {
        this.aName = aName;
    }
    /**
     * 获取：
     */
    public String getAName() {
        return aName;
    }
}
