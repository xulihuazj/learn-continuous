/*
 * LargeMappedFiles.java 1.0.0 2017/11/25  15:06 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/11/25  15:06 created by xulihua
 */
package IO;

import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;


/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/11/25 15:06
 */
public class LargeMappedFiles {

    static int length = 0x8FFFFFF;

    @Test
    public void test(){
        try {
            MappedByteBuffer out = new RandomAccessFile("data.text","rw").getChannel()
                    .map(FileChannel.MapMode.READ_WRITE,0,length);
            for(int i = 0;i<length;i++){
                out.put((byte)'x');

            }
        } catch (IOException e) {


        }
    }

}
