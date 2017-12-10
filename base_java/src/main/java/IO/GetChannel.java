/*
 * GetChannel.java 1.0.0 2017/11/25  13:40 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/11/25  13:40 created by xulihua
 */
package IO;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/11/25 13:40
 */
public class GetChannel {

    private static final int BSIZE = 1024;

    @Test
    public void test1() {
        try {
            FileChannel fileChannel = new FileOutputStream("data.text").getChannel();
            fileChannel.write(ByteBuffer.wrap("some text".getBytes()));
            fileChannel.close();
            fileChannel = new RandomAccessFile("data.text", "rw").getChannel();
            fileChannel.position(fileChannel.size());
            fileChannel.write(ByteBuffer.wrap("some more".getBytes()));
            fileChannel.close();

            fileChannel = new FileOutputStream("date.text").getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
            fileChannel.read(buffer);
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
