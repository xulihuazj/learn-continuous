/*
 * FileLocking.java 1.0.0 2017/11/25  15:19 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/11/25  15:19 created by xulihua
 */
package IO;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/11/25 15:19
 */
public class FileLocking {

    @Test
    public void test() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("data.text");
            FileChannel channel = fileOutputStream.getChannel();
            FileLock fileLock = channel.tryLock();//尝试获取文件锁
            if (null != fileLock) {
                System.out.println("锁定文件");
                TimeUnit.MILLISECONDS.sleep(100);
                fileLock.release();//释放文件锁定
                System.out.println("释放文件锁");
            }
            fileOutputStream.close();
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
