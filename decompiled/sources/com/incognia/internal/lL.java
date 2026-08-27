package com.incognia.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lL extends Exception {
    public final String BGx;

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.BGx;
    }

    public lL(String str) {
        super(str);
        this.BGx = str;
    }
}
