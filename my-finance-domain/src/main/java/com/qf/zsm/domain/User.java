package com.qf.zsm.domain;

import java.util.List;
import java.util.Set;

public class User {
    private Integer userId;
    private String loginName;
    private String loginPassword;
    //界面显示的名称
    private String userName;
    //用户绑定的手机号
    private String userBindTelNo;
    //关联实体类-->1个用户对多个投资标
    private List<Invest> invests;
    //关联实体类--->1个用户对1张用户信息
    private PersonData personData;
    //关联实体类--->1个用户对多张银行卡
    private Set<BankCard> bankCards;

    public User() {
    }

    public User(Integer userId, String loginName, String loginPassword, String userName, String userBindTelNo, List<Invest> invests, PersonData personData, Set<BankCard> bankCards) {
        this.userId = userId;
        this.loginName = loginName;
        this.loginPassword = loginPassword;
        this.userName = userName;
        this.userBindTelNo = userBindTelNo;
        this.invests = invests;
        this.personData = personData;
        this.bankCards = bankCards;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserBindTelNo() {
        return userBindTelNo;
    }

    public void setUserBindTelNo(String userBindTelNo) {
        this.userBindTelNo = userBindTelNo;
    }

    public List<Invest> getInvests() {
        return invests;
    }

    public void setInvests(List<Invest> invests) {
        this.invests = invests;
    }

    public PersonData getPersonData() {
        return personData;
    }

    public void setPersonData(PersonData personData) {
        this.personData = personData;
    }

    public Set<BankCard> getBankCards() {
        return bankCards;
    }

    public void setBankCards(Set<BankCard> bankCards) {
        this.bankCards = bankCards;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", loginName='" + loginName + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                ", userName='" + userName + '\'' +
                ", userBindTelNo='" + userBindTelNo + '\'' +
                ", invests=" + invests +
                ", personData=" + personData +
                ", bankCards=" + bankCards +
                '}';
    }
}
