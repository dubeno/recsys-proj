package com.tracholar.recommend.demo;

import com.tracholar.recommend.engine.RecallResult;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DemoRecallResult implements RecallResult {
    private String id;
}
