/*
 * DirList3.java 1.0.0 2017/11/19  23:24 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/11/19  23:24 created by xulihua
 */
package IO;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/11/19 23:24
 */
public class DirList3 {
    public static void main(String[] args){
        final File path = new File(".");
        String[] listStr;
        if(args.length== 0){
            listStr = path.list();
        }else{
            String[]    aaa = args;
            listStr = path.list(new FilenameFilter() {
                private Pattern pattern = Pattern.compile(".");
                @Override
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches();
                }
            });
            Arrays.sort(listStr,String.CASE_INSENSITIVE_ORDER);
            for(String dirItem : listStr){
                System.out.println(dirItem);
            }
        }
    }
}
