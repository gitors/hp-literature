package com.hpwenxue.domain;import javax.persistence.Entity;import javax.persistence.GeneratedValue;import javax.persistence.Id;/** * 用户权限,用户 -> 权限 为1对多的关系 * @author : liuwenlong * @date : 2018/1/13 16:25 */@Entitypublic class UserRoles {    @Id    @GeneratedValue    private Integer id;    private Integer userId;    private Integer roleId;    public Integer getId() {        return id;    }    public void setId(Integer id) {        this.id = id;    }    public Integer getUserId() {        return userId;    }    public void setUserId(Integer userId) {        this.userId = userId;    }    public Integer getRoleId() {        return roleId;    }    public void setRoleId(Integer roleId) {        this.roleId = roleId;    }    @Override    public String toString() {        return "UserRoles{" +                "id=" + id +                ", userId=" + userId +                ", roleId=" + roleId +                '}';    }}