package com.tracholar.recommend.demo;

import com.tracholar.recommend.engine.Merge;
import com.tracholar.recommend.data.RecallResult;
import com.tracholar.recommend.engine.Recall;
import com.tracholar.recommend.engine.config.Autoload;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Autoload
@Getter
@Setter
public class DemoMerge implements Merge<RecallResult> {

    // 简单合并
    @Override
    public List<RecallResult> merge(Map<Recall, List<RecallResult>> results){
        List<RecallResult> mergedList = new ArrayList<>();
        for(List<RecallResult> r : results.values()) {
            mergedList.addAll(r);
        }

        return mergedList;
    }
}
