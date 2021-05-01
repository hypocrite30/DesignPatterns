package com.hypocrite30.patterns.AdapterPattern.demo1.impl;

import com.hypocrite30.patterns.AdapterPattern.demo1.IUserInfo;

/**
 * @Description: 「适配器模式」引例
 * @Author: Hypocrite30
 * @Date: 2021/5/1 17:23
 */
public class UserInfo implements IUserInfo {
    public String getUserName() {
        System.out.println("姓名叫做...");
        return null;
    }

    public String getHomeAddress() {
        System.out.println("这里是员工的家庭地址...");
        return null;
    }

    public String getMobileNumber() {
        System.out.println("这个人的手机号码是0000...");
        return null;
    }

    public String getOfficeTelNumber() {
        System.out.println("办公室电话是...");
        return null;
    }

    public String getJobPosition() {
        System.out.println("这个人的职位是BOSS...");
        return null;
    }

    public String getHomeTelNumber() {
        System.out.println("员工的家庭电话是...");
        return null;
    }
}
