/*
 * TemplatePatternDemo.java 1.0.0 2017/12/3  17:34 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  17:34 created by xulihua
 */
package DesignPattern.Template_Pattern.demo;

import DesignPattern.Template_Pattern.Game;
import DesignPattern.Template_Pattern.impl.Cricket;
import DesignPattern.Template_Pattern.impl.Football;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 17:34
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
