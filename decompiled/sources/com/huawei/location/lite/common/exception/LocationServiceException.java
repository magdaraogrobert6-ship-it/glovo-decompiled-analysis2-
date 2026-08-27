package com.huawei.location.lite.common.exception;

/* JADX INFO: loaded from: classes4.dex */
public class LocationServiceException extends BaseException {
    public LocationServiceException(int i, String str) {
        super(str);
        this.read = i;
    }
}
