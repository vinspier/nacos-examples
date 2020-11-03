package com.vinspier.sentinel.block;


import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 大鱼网络科技有限公司 版权所有 © Copyright 2018<br>
 *
 * 1、参数类型需要和原方法相匹配并且最后加一个额外的参数，类型为 BlockException
 * 2、注意对应的函数必需为 static 函数，否则无法解析
 *
 * @Decription: <br>
 * @Project: </br>
 * @CreateDate: 2020/11/3 16:05 <br>
 * @Author: <a href="fanxb@haibaobaoxian.cn">fxb</a>
 * @Modify:
 */
public class TestBlock {

    private static Logger logger = LoggerFactory.getLogger(TestBlock.class);

    public static String getName(String name, BlockException e){
        logger.info("block 顶不住了呀[name={}]",name);
        return "block 顶不住了呀";
    }

}
