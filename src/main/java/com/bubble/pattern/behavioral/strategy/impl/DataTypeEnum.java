package com.bubble.pattern.behavioral.strategy.impl;

import lombok.Getter;

/**
 * 数据类型
 *
 * @author wu gang
 * date: 2022-09-27 22:42
 **/
@Getter
public enum DataTypeEnum {
    /**
     * 数据类型
     */
    KV(KeyValueDataLoad.class),
    STRING(StringDataLoad.class);

    /**
     * 实现类
     */
    private Class clazz;

    DataTypeEnum(Class clazz) {
        this.clazz = clazz;
    }

}
