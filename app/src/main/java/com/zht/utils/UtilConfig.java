package com.zht.utils;

import android.os.Environment;

import java.io.File;

/**
 * 作者：zhanghaitao on 2018/2/11 10:32
 * 邮箱：820159571@qq.com
 *
 * @describe:
 */

public class UtilConfig {

    /**
     * 配置是否是debug版本
     */
    public static final boolean IsDebug = true;


    /**
     * 根路径
     */
    public static final String ROOT_PATH = getSDPath() + "/zhtUltron";
    /**
     * crash文件保存路径
     */
    public static final String CRASH_PATH = ROOT_PATH + "/crashLog";


    /**
     * 获取SD卡的根目录
     */
    public static String getSDPath() {
        File sdDir = null;
        // 判断sd卡是否存在
        boolean sdCardExist = Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
        if (sdCardExist) {
            // 获取跟目录
            sdDir = Environment.getExternalStorageDirectory();
        }
        if (sdDir == null) {
            return "";
        } else {
            return sdDir.toString();
        }
    }




}
