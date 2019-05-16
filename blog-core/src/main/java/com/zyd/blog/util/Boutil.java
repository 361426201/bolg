package com.zyd.blog.util;

import lombok.Builder;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@Builder
public class Boutil {

    private static SimpleDateFormat df = new SimpleDateFormat("yy-MM-dd HH:mm:ss");

    /**
     *状态码
     */
    private String code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     *返回的信息
     */
    private Object data;

    /**
     * 创建时间
     */
    private String createTime;


    public static Boutil getBoUtilFaild(){
        return Boutil.builder().code("300").msg("FAILD").createTime(df.format(new Date())).build();
    }
}
