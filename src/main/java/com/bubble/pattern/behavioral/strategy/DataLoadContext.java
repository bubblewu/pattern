package com.bubble.pattern.behavioral.strategy;

/**
 * 数据加载Context
 *
 * @author wu gang
 * date: 2022-09-27 22:44
 **/
public class DataLoadContext {

    private IDataLoadStrategy dataLoadStrategy;

    public DataLoadContext(IDataLoadStrategy dataLoadStrategy) {
        this.dataLoadStrategy = dataLoadStrategy;
    }

    public Object execute(String fileName) throws Exception {
        return dataLoadStrategy.load(fileName);
    }

}
