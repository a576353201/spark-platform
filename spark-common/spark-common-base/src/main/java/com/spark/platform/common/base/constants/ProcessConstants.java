package com.spark.platform.common.base.constants;

/**
 * @author: wangdingfeng
 * @Date: 2020/4/5 09:24
 * @Description: 流程常量
 */
public class ProcessConstants {
    /**
     * 流程部署文件 后缀名
     */
    public static final String BPMN_FILE_SUFFIX = ".bpmn";
    public static final String BPMN20_FILE_SUFFIX = ".bpmn20.xml";
    public static final String RESOURCES = "resources";

    public static final String IMAGE = "image";
    public static final String XML = "xml";

    /**
     * 拼接 like条件
     * @param str
     * @return
     */
    public static String contactLike(String str){
        return GlobalsConstants.LIKE_CHARACTER + str + GlobalsConstants.LIKE_CHARACTER;
    }


}
