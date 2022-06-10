package com.bubble.pattern.behavioral.chain;

/**
 * 业务流程接口
 *
 * @author wu gang
 * date: 2022-06-10 17:41
 **/
public interface IFlow {

    /**
     * 根据流程ID获取配置
     *
     * @param id 流程ID
     * @return FlowEnum
     */
    FlowEnum getFlow(Integer id);

    /**
     * 获取第一个处理者信息
     *
     * @return FlowEnum
     */
    FlowEnum getFirst();

}
