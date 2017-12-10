/*
 * MealBuilder.java 1.0.0 2017/12/2  21:30 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  21:30 created by xulihua
 */
package DesignPattern.Builder_Pattern;

import DesignPattern.Builder_Pattern.extend.Coke;
import DesignPattern.Builder_Pattern.extend.Pepsi;
import DesignPattern.Builder_Pattern.impl.ChickenBurger;
import DesignPattern.Builder_Pattern.impl.VegBurger;

/**
 * @Description: 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象。
 * @Author: xulihua
 * @date: 2017/12/2 21:30
 */
public class MealBuilder {

    /**
     * 获取有蔬菜的套餐
     * @return
     */
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 获取无蔬菜的套餐
     * @return
     */
    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
