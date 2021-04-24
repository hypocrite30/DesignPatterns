package com.hypocrite30.patterns.AbstractFactory.demo1.Impl;

import com.hypocrite30.patterns.AbstractFactory.demo1.AbstractYellowHuman;

/**
 * @Description: 「抽象工厂模式」引例
 * @Author: Hypocrite30
 * @Date: 2021/4/23 21:22
 */
public class FemaleYellowHuman extends AbstractYellowHuman {
    public void getSex() {
        System.out.println("黄人女性");
    }
}
