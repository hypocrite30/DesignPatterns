package com.hypocrite30.patterns.PrototypePattern.demo4;

import java.util.ArrayList;

/**
 * @Description: 「原型模式」「浅拷贝」案例
 * @Author: Hypocrite30
 * @Date: 2021/4/25 12:23
 */
public class Thing implements Cloneable {
    //定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<String>();

    // @Override
    public Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

    //设置HashMap的值
    public void setValue(String value) {
        this.arrayList.add(value);
    }

    //取得arrayList的值
    public ArrayList<String> getValue() {
        return this.arrayList;
    }
}
