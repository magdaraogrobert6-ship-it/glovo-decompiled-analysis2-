package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.compose.ui.graphics.Fields;
import com.incognia.internal.ZM$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.utils.SystemLocaleWatcher;
import com.mapbox.navigation.navigator.internal.MapboxNativeNavigatorImpl;
import kotlinx.coroutines.channels.ProducerCoroutine;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.getMethodQuietly;
import o.getStartEllipsisgIe3tQ8annotations;

/* JADX INFO: loaded from: classes2.dex */
public final class SyncTask$ConnectivityChangeReceiver extends BroadcastReceiver {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;

    public /* synthetic */ SyncTask$ConnectivityChangeReceiver(Object obj, int i, Object obj2) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = obj;
        this.read = obj2;
    }

    public /* synthetic */ SyncTask$ConnectivityChangeReceiver() {
        this.RemoteActionCompatParcelizer = 0;
    }

    public void read() {
        int i = 2 % 2;
        Log.isLoggable("FirebaseMessaging", 3);
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        getMethodQuietly getmethodquietly = (getMethodQuietly) this.serializer;
        if (getmethodquietly != null) {
            int i2 = IconCompatParcelizer + 5;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Context applicationContext = ((FirebaseMessaging) getmethodquietly.serializer).getApplicationContext();
            this.read = applicationContext;
            applicationContext.registerReceiver(this, intentFilter);
            int i4 = write + 83;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        int i2 = 2 % 2;
        int i3 = this.RemoteActionCompatParcelizer;
        if (i3 != 0) {
            if (i3 == 1) {
                context.getClass();
                intent.getClass();
                ((SystemLocaleWatcher) this.serializer).handler.postDelayed(new ZM$$ExternalSyntheticLambda0((MapboxNativeNavigatorImpl) this.read, 8, context), 100L);
                return;
            } else {
                context.getClass();
                intent.getClass();
                InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 = (InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) this.serializer;
                getStartEllipsisgIe3tQ8annotations getstartellipsisgie3tq8annotations = (getStartEllipsisgIe3tQ8annotations) this.read;
                ((ProducerCoroutine) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1).b_(Boolean.valueOf(!(getstartellipsisgie3tq8annotations.serializer.read() ^ true) && getstartellipsisgie3tq8annotations.read.RemoteActionCompatParcelizer()));
                return;
            }
        }
        getMethodQuietly getmethodquietly = (getMethodQuietly) this.serializer;
        if (getmethodquietly == null) {
            i = write + 119;
            IconCompatParcelizer = i % Fields.SpotShadowColor;
        } else {
            if (!getmethodquietly.serializer()) {
                return;
            }
            Log.isLoggable("FirebaseMessaging", 3);
            getMethodQuietly getmethodquietly2 = (getMethodQuietly) this.serializer;
            ((FirebaseMessaging) getmethodquietly2.serializer).enqueueTaskWithDelaySeconds(getmethodquietly2, 0L);
            Context context2 = (Context) this.read;
            if (context2 != null) {
                int i4 = write + 77;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                context2.unregisterReceiver(this);
            }
            this.serializer = null;
            i = IconCompatParcelizer + 39;
            write = i % Fields.SpotShadowColor;
        }
        int i6 = i % 2;
    }
}
