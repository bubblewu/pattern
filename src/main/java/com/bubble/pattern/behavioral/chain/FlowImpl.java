package com.bubble.pattern.behavioral.chain;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 业务流程接口实现
 *
 * @author wu gang
 * date: 2022-06-10 17:43
 **/
public class FlowImpl implements IFlow {

    private static final Map<Integer, FlowEnum> flowEnumMap = new HashMap<>();

    static {
        Arrays.stream(FlowEnum.values()).forEach(f -> flowEnumMap.put(f.getId(), f));
    }

    @Override
    public FlowEnum getFlow(Integer id) {
        return flowEnumMap.get(id);
    }

    @Override
    public FlowEnum getFirst() {
        // 无前置流程时，为第一个初始流程
        return Arrays.stream(FlowEnum.values())
                .filter(f -> f.getPreHandlerId() == null)
                .findAny()
                .orElse(null);
    }

}
