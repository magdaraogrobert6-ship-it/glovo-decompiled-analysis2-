package com.mapbox.navigator;

import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public final class R {
    public static int IconCompatParcelizer;
    public static int RemoteActionCompatParcelizer;

    private R() {
    }

    public static int serializer() {
        int i = RemoteActionCompatParcelizer;
        int i2 = i % 9960280;
        RemoteActionCompatParcelizer = i + 1;
        if (i2 != 0) {
            return IconCompatParcelizer;
        }
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        IconCompatParcelizer = startElapsedRealtime;
        return startElapsedRealtime;
    }
}
