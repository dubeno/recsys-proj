package com.tracholar.recommend.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.tracholar.recommend.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DemoItem implements Item {
    @JSONField
    private String id;

    @JSONField
    private String name;

    public String toString(){
        return JSON.toJSONString(this);
    }
}
