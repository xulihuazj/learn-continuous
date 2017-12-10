package DesignPattern.Iterator_Pattern;

/**
 * @Description: 迭代器接口
 * @author: 徐礼华
 * @date: 2017/12/3 14:57
 */
public interface Iterator {

    //是否存在下一个元素
    boolean hasNext();

    //获取下一个元素
    Object next();

}