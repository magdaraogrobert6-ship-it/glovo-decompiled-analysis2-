package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import o.LookaheadScopeKtLookaheadScope221;
import o.PinnableContainerKtLocalPinnableContainer1;
import o.enableZ;
import o.getLookaheadDelegate;

/* JADX INFO: loaded from: classes4.dex */
public final class AppMeasurementReceiver extends enableZ {
    public PinnableContainerKtLocalPinnableContainer1 read;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.read == null) {
            this.read = new PinnableContainerKtLocalPinnableContainer1(10, this);
        }
        PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1 = this.read;
        pinnableContainerKtLocalPinnableContainer1.getClass();
        getLookaheadDelegate getlookaheaddelegate = LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(context, null, null).ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        if (intent == null) {
            getlookaheaddelegate.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        getlookaheaddelegate.PlaybackStateCompat.serializer(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                getlookaheaddelegate.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        getlookaheaddelegate.PlaybackStateCompat.RemoteActionCompatParcelizer("Starting wakeful intent.");
        ((AppMeasurementReceiver) pinnableContainerKtLocalPinnableContainer1.serializer).getClass();
        SparseArray sparseArray = enableZ.RemoteActionCompatParcelizer;
        synchronized (sparseArray) {
            int i = enableZ.IconCompatParcelizer;
            int i2 = i + 1;
            enableZ.IconCompatParcelizer = i2;
            if (i2 <= 0) {
                enableZ.IconCompatParcelizer = 1;
            }
            className.putExtra("androidx.contentpager.content.wakelockid", i);
            ComponentName componentNameStartService = context.startService(className);
            if (componentNameStartService == null) {
                return;
            }
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
            wakeLockNewWakeLock.setReferenceCounted(false);
            wakeLockNewWakeLock.acquire(60000L);
            sparseArray.put(i, wakeLockNewWakeLock);
        }
    }
}
