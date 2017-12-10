package DesignPattern.Visitor_Pattern;

/**
 * @Description:定义一个表示 电脑 元素的接口。
 * @author: xulihua
 * @date: 2017/12/3 17:53
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);
}