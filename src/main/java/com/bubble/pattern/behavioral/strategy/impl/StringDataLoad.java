package com.bubble.pattern.behavioral.strategy.impl;

import com.bubble.pattern.behavioral.strategy.IDataLoadStrategy;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * String结构数据
 *
 * @author wu gang
 * date: 2022-09-27 22:38
 **/
public class StringDataLoad implements IDataLoadStrategy {

    @Override
    public Object load(String fileName) throws Exception {
        Stream<String> lines = Files.lines(Paths.get(fileName));

        return lines.collect(Collectors.toList());
    }

}
