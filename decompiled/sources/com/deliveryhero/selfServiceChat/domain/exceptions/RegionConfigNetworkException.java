package com.deliveryhero.selfServiceChat.domain.exceptions;

/* JADX INFO: loaded from: classes4.dex */
public final class RegionConfigNetworkException extends Exception {
    static {
        new RegionConfigNetworkException("Looks like there's some issue fetching the region config. Please try again later");
    }

    public RegionConfigNetworkException(String str) {
        super(str);
    }
}
