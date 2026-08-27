package com.mapbox.core.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public class ServicesException extends RuntimeException {
    public static int read;
    public static int serializer;

    public static int RemoteActionCompatParcelizer() {
        int i = serializer;
        int i2 = i % 5081102;
        serializer = i + 1;
        if (i2 != 0) {
            return read;
        }
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        read = iMaxMemory;
        return iMaxMemory;
    }
}
