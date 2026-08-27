package com.incognia.internal;

import android.net.ConnectivityManager;
import android.net.Network;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.incognia.Incognia$$ExternalSyntheticLambda0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class as extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ ZE BGx;

    public static final void BGx(ZE ze, Network network) {
        ze.q = true;
        Iterator it = ze.x.iterator();
        if (it.hasNext()) {
            throw ff$$ExternalSyntheticOutline0.m(it);
        }
    }

    public static final void mbG(ZE ze, Network network) {
        ze.q = false;
        Iterator it = ze.x.iterator();
        if (it.hasNext()) {
            throw ff$$ExternalSyntheticOutline0.m(it);
        }
    }

    public as(ZE ze) {
        this.BGx = ze;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        ZE ze = this.BGx;
        O6.BGx(ze, new Incognia$$ExternalSyntheticLambda0(6, ze));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        ZE ze = this.BGx;
        O6.BGx(ze, new Dd$$ExternalSyntheticLambda0(ze, 13, network));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        ZE ze = this.BGx;
        O6.BGx(ze, new N6$$ExternalSyntheticLambda0(ze, 17, network));
    }

    public static final void BGx(ZE ze) {
        ze.q = false;
        Iterator it = ze.x.iterator();
        if (it.hasNext()) {
            throw ff$$ExternalSyntheticOutline0.m(it);
        }
    }
}
