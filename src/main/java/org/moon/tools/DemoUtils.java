package org.moon.tools;

/**
 * @Projectname: moonTools
 * @Filename: DemoUtils
 * @Author: zhang yongling
 * @Data:2023/8/22 9:13
 * @Description: TODO
 */
public class DemoUtils {

    /**
     * 毫秒测试
     * @param str
     * @return
     */
    public  static String  print(String str){
        return System.nanoTime()+"---"+str;
    }


}
