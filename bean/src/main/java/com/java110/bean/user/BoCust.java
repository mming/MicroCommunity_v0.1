package com.java110.bean.user;

/**
 * 客户信息（过程）
 * 主要用于新建客户，更新客户，删除客户时，保存到以bo开头的过程表 实体
 * Created by wuxw on 2016/12/27.
 */
public class BoCust {


    private final static String CUST_TYPE_GENERAL= "1";// 普通客户

    private final static String CUST_TYPE_MANAGER="2";// 管理员

    private final static String CUST_TYPE_ADMINISTRATOR="3"; //超级管理

    private final static String CUST_TYPE_WECHAT="4"; //微信用户

    private final static String CUST_TYPE_ALIPAY="5";//支付宝用户

    private final static String CUST_TYPE_GITHUB="6";//github用户

    private final static String CUST_TYPE_SINA="7";//sina 用户
    private final static String CUST_TYPE_QQ="8";//QQ 用户

    private String boId;

    private String custId;

    private String name;

    private String email;

    private String cellphone;

    private String realName;

    private String sex;

    private String password;

    private String lanId;

    private String custAdress;

    private String custType;

    private String openId;

    private String state;

    public String getBoId() {
        return boId;
    }

    public void setBoId(String boId) {
        this.boId = boId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLanId() {
        return lanId;
    }

    public void setLanId(String lanId) {
        this.lanId = lanId;
    }

    public String getCustAdress() {
        return custAdress;
    }

    public void setCustAdress(String custAdress) {
        this.custAdress = custAdress;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}