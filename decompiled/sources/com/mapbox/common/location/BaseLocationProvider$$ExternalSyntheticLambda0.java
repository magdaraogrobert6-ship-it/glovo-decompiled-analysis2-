package com.mapbox.common.location;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class BaseLocationProvider$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BaseLocationProvider$$ExternalSyntheticLambda0(Object obj, int i, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        if (i != 0) {
            LocationUpdatesReceiver.onReceive$lambda$2((Intent) obj2, (BroadcastReceiver.PendingResult) obj);
        } else {
            BaseLocationProvider.notifyLocationUpdate$lambda$2$lambda$1$lambda$0((LocationObserver) obj2, (List) obj);
        }
    }
}
