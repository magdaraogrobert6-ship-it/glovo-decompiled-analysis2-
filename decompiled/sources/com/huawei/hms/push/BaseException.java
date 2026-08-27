package com.huawei.hms.push;

import com.huawei.hms.aaid.constant.ErrorEnum;

/* JADX INFO: loaded from: classes4.dex */
public class BaseException extends Exception {
    private final int a;
    private final ErrorEnum b;

    public int getErrorCode() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.b.getMessage();
    }

    public BaseException(int i) {
        ErrorEnum errorEnumFromCode = ErrorEnum.fromCode(i);
        this.b = errorEnumFromCode;
        this.a = errorEnumFromCode.getExternalCode();
    }
}
