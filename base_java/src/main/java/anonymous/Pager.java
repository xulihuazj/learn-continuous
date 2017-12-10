/*
 * Pager.java 1.0.0 2017/10/29  22:21 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/10/29  22:21 created by xulihua
 */
package anonymous;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/10/29 22:21
 */
public class Pager {

    private LinkBuilder linkBuilder;

    public Pager(LinkBuilder builder) {
        this.linkBuilder = builder;
    }

    public String getUrl(int page) {
        //return staticTool.process(this.linkBuilder.getPageUrl(page).toString());
        return null;
    }

}
