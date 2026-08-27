package com.google.android.gms.internal.base;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zas {
    public static final Feature[] serializer;
    public static final Feature write;

    static {
        Feature feature = new Feature("moduleinstall", -1, 7L, true);
        write = feature;
        serializer = new Feature[]{feature};
    }
}
