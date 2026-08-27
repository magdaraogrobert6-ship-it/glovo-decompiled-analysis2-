package com.incognia.internal;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class FX implements LocationListener {
    public final /* synthetic */ io2 BGx;

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public FX(io2 io2Var) {
        this.BGx = io2Var;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        this.BGx.invoke(location);
    }
}
