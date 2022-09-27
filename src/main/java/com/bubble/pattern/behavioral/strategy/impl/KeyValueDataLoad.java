package com.bubble.pattern.behavioral.strategy.impl;

import com.bubble.pattern.behavioral.strategy.IDataLoadStrategy;
import lombok.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * K-V结构数据
 *
 * @author wu gang
 * date: 2022-09-27 22:38
 **/
public class KeyValueDataLoad implements IDataLoadStrategy {

    @Override
    public Object load(String fileName) throws Exception {
        Stream<String> lines = Files.lines(Paths.get(fileName));
        List<String> dataList = lines.collect(Collectors.toList());

        Map<String, Object> dictMap = new HashMap<>();
        dictMap.put("data", dataList);
        dictMap.put("updateTime", Instant.now().toString());

        return CommonDict.builder()
                .key(UUID.randomUUID().toString())
                .value(Instant.now().toString())
                .dictMap(dictMap).build();
    }

    @Getter
    @Setter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    static class CommonDict {
        private String key;
        private String value;
        private Map<String, Object> dictMap;
    }

}
