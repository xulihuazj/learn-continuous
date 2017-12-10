/*
 * Meal.java 1.0.0 2017/12/2  21:29 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  21:29 created by xulihua
 */
package DesignPattern.Builder_Pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 套餐
 * @Author: xulihua
 * @date: 2017/12/2 21:29
 */
public class Meal {

    //创建商品集合
    private List<Item> items = new ArrayList<>();

    //添加商品
    public void addItem(Item item){
        items.add(item);
    }

    //获取当前套餐的总价（套餐中各个商品价的总额）
    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    //打印出 套餐中各个 商品的信息
    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}