package com.vinspier.sentinel.fallback;


import com.vinspier.sentinel.block.TestBlock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 大鱼网络科技有限公司 版权所有 © Copyright 2018<br>
 *
 * 1、参数类型需要和原方法相匹配并且最后加一个额外的参数，类型为 Throwable
 * 2、注意对应的函数必需为 static 函数，否则无法解析
 *
 * @Decription: <br>
 * @Project: </br>
 * @CreateDate: 2020/11/3 15:57 <br>
 * @Author: <a href="fanxb@haibaobaoxian.cn">fxb</a>
 * @Modify:
 */
public class TestFallback {

    private static Logger logger = LoggerFactory.getLogger(TestFallback.class);

    public static String getName(String name,Throwable t){
        logger.info("fallBack 顶不住了呀[name={}]",name);
        return "fallBack 顶不住了";
    }

    public static String defaultFallback(Throwable t){
        logger.info("defaultFallback 顶不住了呀");
        return "defaultFallback 顶不住了";
    }

}
