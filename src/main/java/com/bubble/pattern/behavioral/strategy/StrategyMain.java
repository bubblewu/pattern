package com.bubble.pattern.behavioral.strategy;

import com.bubble.pattern.behavioral.strategy.impl.DataTypeEnum;

import java.lang.reflect.InvocationTargetException;

/**
 * 策略模式测试
 *
 * @author wu gang
 * date: 2022-09-27 22:47
 **/
public class StrategyMain {

    public static void main(String[] args) throws Exception {
        String fileName = "./data/test_data.txt";

        for (DataTypeEnum dataTypeEnum : DataTypeEnum.values()) {
            DataLoadContext dataLoadContext = new DataLoadContext(
                    (IDataLoadStrategy) dataTypeEnum.getClazz().getDeclaredConstructor().newInstance());
            Object result = dataLoadContext.execute(fileName);
            System.out.println(result);
        }
    }

}
