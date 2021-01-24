package com.xiaoyu.springboot.entity;

/**
 * @Description 学生实体类
 * @Author yujiazhen
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/1/24
 */
public class Student {

    private String id;

    private String name;

    private String deptName;

    private Integer totCred;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getTotCred() {
        return totCred;
    }

    public void setTotCred(Integer totCred) {
        this.totCred = totCred;
    }
}
