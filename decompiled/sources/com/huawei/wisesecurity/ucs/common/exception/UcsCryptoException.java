package com.huawei.wisesecurity.ucs.common.exception;

import com.huawei.wisesecurity.kfs.exception.CryptoException;
import com.mapbox.navigation.core.utils.Delayer;

/* JADX INFO: loaded from: classes2.dex */
public class UcsCryptoException extends CryptoException {
    public final transient Delayer serializer;

    public UcsCryptoException(long j, String str) {
        super(str);
        this.serializer = new Delayer(j);
    }
}
