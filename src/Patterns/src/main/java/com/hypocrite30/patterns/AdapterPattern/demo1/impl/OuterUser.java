package com.hypocrite30.patterns.AdapterPattern.demo1.impl;

import com.hypocrite30.patterns.AdapterPattern.demo1.IOuterUser;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 「适配器模式」引例
 * @Author: Hypocrite30
 * @Date: 2021/5/1 17:31
 */
public class OuterUser implements IOuterUser {
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "这个员工叫混世魔王...");
        baseInfoMap.put("mobileNumber", "这个员工电话是...");
        return baseInfoMap;
    }

    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition", "这个人的职位是BOSS...");
        officeInfo.put("officeTelNumber", "员工的办公电话是...");
        return officeInfo;
    }

    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumbner", "员工的家庭电话是...");
        homeInfo.put("homeAddress", "员工的家庭地址是...");
        return homeInfo;
    }
}
