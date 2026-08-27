package com.huawei.location.router.dispatch;

/* JADX INFO: loaded from: classes4.dex */
public class DispatchException extends RuntimeException {
    private static final long serialVersionUID = -6632599877015588781L;
    private int exceptionCode;

    private void setExceptionCode(int i) {
        this.exceptionCode = i;
    }

    public int getExceptionCode() {
        return this.exceptionCode;
    }

    public DispatchException(int i, String str) {
        super(str);
        setExceptionCode(i);
    }

    public DispatchException(int i, String str, Throwable th) {
        super(str, th);
        setExceptionCode(i);
    }
}
