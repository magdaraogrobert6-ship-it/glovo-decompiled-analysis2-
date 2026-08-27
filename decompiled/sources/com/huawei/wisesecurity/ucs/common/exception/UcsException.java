package com.huawei.wisesecurity.ucs.common.exception;

import com.mapbox.navigation.core.utils.Delayer;

/* JADX INFO: loaded from: classes2.dex */
public class UcsException extends Exception {
    public final transient Delayer IconCompatParcelizer;

    public UcsException(long j, String str) {
        super(str);
        this.IconCompatParcelizer = new Delayer(j);
    }
}
