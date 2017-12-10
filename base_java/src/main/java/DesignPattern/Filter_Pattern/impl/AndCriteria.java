package DesignPattern.Filter_Pattern.impl;

import DesignPattern.Filter_Pattern.Criteria;
import DesignPattern.Filter_Pattern.model.Person;

import java.util.List;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/2 23:43
 */
public class AndCriteria implements Criteria {

    //引用过滤器接口
    private Criteria criteria;

    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    //过滤出 person为
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
