package com.huawei.hms.common.api;

import com.huawei.hms.support.api.client.Result;

/* JADX INFO: loaded from: classes2.dex */
public class Response<T extends Result> {
    protected T result;

    public T getResult() {
        return this.result;
    }

    public void setResult(T t) {
        this.result = t;
    }

    public Response(T t) {
        this.result = t;
    }

    public Response() {
    }
}
