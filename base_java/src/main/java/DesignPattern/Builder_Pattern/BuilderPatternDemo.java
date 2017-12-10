/*
 * BuilderPatternDemo.java 1.0.0 2017/12/2  21:32 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  21:32 created by xulihua
 */
package DesignPattern.Builder_Pattern;

/**
 * @Description: demo
 * @Author: xulihua
 * @date: 2017/12/2 21:32
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        //获取 套餐构建Builder类
        MealBuilder mealBuilder = new MealBuilder();
        //从建造者中 获取 有蔬菜的 套餐
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        //从建造者中获取无蔬菜的 套餐
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
