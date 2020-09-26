package com.vinspier.nacos.boot.config.properties;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 大鱼网络科技有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description: <br>
 * @Project: <br>
 * @CreateDate: Created in 2020/9/26 12:18 <br>
 * @Author: <a href="fanxb@haibaobaoxian.cn">fxb</a>
 */
@Component
public class CustomizeProperty {

    @NacosValue(value = "${areaRoundPerception:10}",autoRefreshed = true)
    private Integer areaRoundPerception;

    @NacosValue(value = "${groupRoundPerception:5}",autoRefreshed = true)
    private Integer groupRoundPerception;

    @NacosValue(value = "${personalRoundPerception:1}",autoRefreshed = true)
    private Integer personalRoundPerception;

    public Integer getAreaRoundPerception() {
        return areaRoundPerception;
    }

    public void setAreaRoundPerception(Integer areaRoundPerception) {
        this.areaRoundPerception = areaRoundPerception;
    }

    public Integer getGroupRoundPerception() {
        return groupRoundPerception;
    }

    public void setGroupRoundPerception(Integer groupRoundPerception) {
        this.groupRoundPerception = groupRoundPerception;
    }

    public Integer getPersonalRoundPerception() {
        return personalRoundPerception;
    }

    public void setPersonalRoundPerception(Integer personalRoundPerception) {
        this.personalRoundPerception = personalRoundPerception;
    }
}
