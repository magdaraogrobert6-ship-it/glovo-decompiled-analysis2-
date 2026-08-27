package com.incognia.internal;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.util.Iterator;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class LP0 implements LocationListener {
    public final /* synthetic */ BvF BGx;

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public LP0(BvF bvF) {
        this.BGx = bvF;
    }

    public static final void BGx(BvF bvF, Location location) {
        Gbn gbnBGx = bvF.A1.BGx(new onViewAttachedToWindowlambda0(location, bvF.x.BGx(location)));
        Iterator it = bvF.q.iterator();
        while (it.hasNext()) {
            ((THn) it.next()).BGx(gbnBGx);
        }
    }

    public static final void mbG(BvF bvF, String str) {
        Iterator it = bvF.q.iterator();
        while (it.hasNext()) {
            ((THn) it.next()).BGx(str, true);
        }
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        BvF bvF = this.BGx;
        O6.BGx(bvF, new N6$$ExternalSyntheticLambda0(bvF, 7, location));
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        BvF bvF = this.BGx;
        O6.BGx(bvF, new LP0$$ExternalSyntheticLambda1(bvF, str, 0));
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        BvF bvF = this.BGx;
        O6.BGx(bvF, new LP0$$ExternalSyntheticLambda1(bvF, str, 1));
    }

    public static final void BGx(BvF bvF, String str) {
        Iterator it = bvF.q.iterator();
        while (it.hasNext()) {
            ((THn) it.next()).BGx(str, false);
        }
    }
}
