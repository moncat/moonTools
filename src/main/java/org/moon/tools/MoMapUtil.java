package org.moon.tools;

import com.google.common.collect.Maps;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.HashMap;

/**
 * @Projectname: moonTools
 * @Filename: MoMapUtil
 * @Author: zhang yongling
 * @Data:2023/8/22 10:55
 * @Description: TODO
 */
public class MoMapUtil {

    public  static String  map(String str){
        return System.nanoTime()+"-------------"+str;
    }

    public  static HashMap  map2(String str){
        final HashMap<@Nullable Object, @Nullable Object> hashMap = Maps.newHashMap();
        hashMap.put("name","carl");
        return hashMap;
    }
}
