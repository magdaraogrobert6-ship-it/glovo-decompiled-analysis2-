package com.incognia.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class E3 extends Exception {
    public final String BGx;
    public final Throwable mbG;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.mbG;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.BGx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E3(String str, Throwable th, int i) {
        super(str);
        th = (i & 8) != 0 ? null : th;
        this.BGx = str;
        this.mbG = th;
    }

    public E3(String str, Throwable th) {
        super(str);
        this.BGx = str;
        this.mbG = th;
    }
}
