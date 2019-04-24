package com.thin.base.common.vo;

import java.util.List;

public class ListResult<T> extends BaseResult {
    private List<T> list;

    public ListResult(List<T> list) {
        this.list = list;
        super.setCode("200");
        super.setMassage("ok");
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
