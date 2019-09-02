package com.zking.p2p.model;

import lombok.ToString;

/**
 * 数据字典表
 */
@ToString
public class BasDict {
    private Long dictId;//字典ID: 主键 标识列

    private String dictType;//字典类型

    private String dictItem;//字典条目

    private String dictValue;//字典值: 一般用来生成下拉框的值

    private Integer dictIsEditable;//能否编辑: 1 可(默认) 0 不可

    public BasDict(Long dictId, String dictType, String dictItem, String dictValue, Integer dictIsEditable) {
        this.dictId = dictId;
        this.dictType = dictType;
        this.dictItem = dictItem;
        this.dictValue = dictValue;
        this.dictIsEditable = dictIsEditable;
    }

    public BasDict() {
        super();
    }

    public Long getDictId() {
        return dictId;
    }

    public void setDictId(Long dictId) {
        this.dictId = dictId;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    public String getDictItem() {
        return dictItem;
    }

    public void setDictItem(String dictItem) {
        this.dictItem = dictItem;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public Integer getDictIsEditable() {
        return dictIsEditable;
    }

    public void setDictIsEditable(Integer dictIsEditable) {
        this.dictIsEditable = dictIsEditable;
    }
}