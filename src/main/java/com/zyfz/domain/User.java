package com.zyfz.domain;

import java.util.Date;
import java.util.List;

public class User {
    private Integer id;

    private String username;

    private String phone;

    private String password;

    private String salt;

    private Boolean isLocked;

    private String roleIds;

    private String organization;

    private String nickname;

    private String realName;

    private String userIdentify;

    private String area;

    private String currentArea;

    private Boolean isAdmin;

    private Boolean isNew;

    private Date createTime;

    private Double account;

    private Double contributeScore;

    private Double honerScore;

    private String gradeTotal;

    private Integer gradeTimes;

    private String withdrawAccount;

    private String wirhdrawAccontType;

    private String regid;

    private String alias;

    private String topic;

    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUserIdentify() {
        return userIdentify;
    }

    public void setUserIdentify(String userIdentify) {
        this.userIdentify = userIdentify;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCurrentArea() {
        return currentArea;
    }

    public void setCurrentArea(String currentArea) {
        this.currentArea = currentArea;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getAccount() {
        return account;
    }

    public void setAccount(Double account) {
        this.account = account;
    }

    public Double getContributeScore() {
        return contributeScore;
    }

    public void setContributeScore(Double contributeScore) {
        this.contributeScore = contributeScore;
    }

    public Double getHonerScore() {
        return honerScore;
    }

    public void setHonerScore(Double honerScore) {
        this.honerScore = honerScore;
    }

    public String getGradeTotal() {
        return gradeTotal;
    }

    public void setGradeTotal(String gradeTotal) {
        this.gradeTotal = gradeTotal;
    }

    public Integer getGradeTimes() {
        return gradeTimes;
    }

    public void setGradeTimes(Integer gradeTimes) {
        this.gradeTimes = gradeTimes;
    }

    public String getWithdrawAccount() {
        return withdrawAccount;
    }

    public void setWithdrawAccount(String withdrawAccount) {
        this.withdrawAccount = withdrawAccount;
    }

    public String getWirhdrawAccontType() {
        return wirhdrawAccontType;
    }

    public void setWirhdrawAccontType(String wirhdrawAccontType) {
        this.wirhdrawAccontType = wirhdrawAccontType;
    }

    public String getRegid() {
        return regid;
    }

    public void setRegid(String regid) {
        this.regid = regid;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getCredentialsSalt() {
        return username + salt;
    }
}