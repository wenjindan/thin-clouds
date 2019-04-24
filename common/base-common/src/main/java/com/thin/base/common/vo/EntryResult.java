package com.thin.base.common.vo;

public class EntryResult<T> extends BaseResult{
    private T t;

    public EntryResult(T t) {
        this.t = t;
        super.setCode("200");
        super.setMassage("ok");
    }
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
