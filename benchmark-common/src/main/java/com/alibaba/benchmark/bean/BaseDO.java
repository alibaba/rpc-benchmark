package com.alibaba.benchmark.bean;

import java.util.Map;

public class BaseDO {
    private int id;
    private String name;
    private Map<String, BaseDO> baseDOMap;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, BaseDO> getBaseDOMap() {
        return baseDOMap;
    }

    public void setBaseDOMap(Map<String, BaseDO> baseDOMap) {
        this.baseDOMap = baseDOMap;
    }
}
