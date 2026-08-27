package com.incognia.internal;

import android.content.Context;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

/* JADX INFO: loaded from: classes2.dex */
public final class u4 {
    public final FusedLocationProviderClient BGx;

    public u4(Context context) {
        this.BGx = LocationServices.getFusedLocationProviderClient(context);
    }
}
