/*
 * AbstractLinkBuilder.java 1.0.0 2017/10/29  22:19 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/10/29  22:19 created by xulihua
 */
package anonymous;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/10/29 22:19
 */
public class AbstractLinkBuilder implements LinkBuilder{

    @Override
    public StringBuffer getPagerUrl() {
        return null;
    }

    @Override
    public final StringBuffer getPageUrl(int page) {
      /*  StringBuffer url = new StringBuffer(XssFilterService.dhtmlSpecialchars(
                this.getPagerUrl(), true));
        if (url.toString().indexOf("?") > 0) {
            url.append("&");
        } else {
            url.append("?");
        }
        url.append("page=").append(page);
        return url;*/
      return null;
    }


   /* Pager pager = Pager.register("newPagerWidget", new AbstractLinkBuilder() {
        @Override
        public StringBuffer getPagerUrl() {
            StringBuffer url = null;
            if (queryAgentStore != null) {

                url = new StringBuffer("agentstorelist.html?");
                if (StringUtils.isNotBlank(queryAgentStore
                        .getStoreName()))// 店铺关键字
                {
                    url.append("&queryAgentStore.storeName=" + XssFilterService.dhtmlSpecialchars(queryAgentStore.getStoreName()));
                }
                if (queryAgentStore.getCity() != null)// 城市编码
                {
                    url.append("&queryAgentStore.city=" + queryAgentStore.getCity());
                }
                if (orderByClause != null && !"".equals(orderByClause)) {
                    url.append("&orderByClause=" + orderByClause);
                }
            } else {
                url = new StringBuffer("agentstorelist.html");
            }
            return url;
        }

    }, request);*/



}
