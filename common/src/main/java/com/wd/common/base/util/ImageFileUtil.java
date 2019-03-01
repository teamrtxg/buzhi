package com.wd.common.base.util;

import android.graphics.Bitmap;

import java.io.File;
import java.io.FileOutputStream;

/**
 *  @author Tang
 *  @time 2019/2/27  18:49
 *  @describe 质量压缩,装换成file文件
 */
public class ImageFileUtil {
    public static void setBitmap(Bitmap bitmap, String path, int quality){
        String sub = path.substring(0, path.lastIndexOf("/"));
        File subFile = new File(sub);
        if(!subFile.exists() || !subFile.isDirectory()){
            try {
                if(!subFile.mkdirs()){
                    return;
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        FileOutputStream outputStream;
        try {
            outputStream = new FileOutputStream(path);
            if(bitmap.compress(Bitmap.CompressFormat.PNG,quality,outputStream)){
                outputStream.flush();
                outputStream.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
