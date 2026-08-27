package com.google.android.gms.internal.base;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zad {
    public static final Feature RemoteActionCompatParcelizer;
    public static final Feature serializer;
    public static final Feature[] write;

    static {
        Feature feature = new Feature("CLIENT_TELEMETRY", -1, 1L, true);
        serializer = feature;
        Feature feature2 = new Feature("CLIENT_NOTIFICATION_TELEMETRY", -1, 1L, true);
        RemoteActionCompatParcelizer = feature2;
        write = new Feature[]{feature, feature2};
    }
}
