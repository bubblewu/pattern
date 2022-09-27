package com.bubble.pattern.behavioral.strategy;

/**
 * 数据加载接口
 *
 * @author wu gang
 * date: 2022-09-27 22:36
 **/
public interface IDataLoadStrategy {

    /**
     * 数据加载
     *
     * @param fileName 文件名称
     * @return 数据
     * @throws Exception 文件读取异常
     */
    Object load(String fileName) throws Exception;

}
