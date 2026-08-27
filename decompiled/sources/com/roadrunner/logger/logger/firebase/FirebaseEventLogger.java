package com.roadrunner.logger.logger.firebase;

import android.app.Application;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl;
import com.roadrunner.home.CreateHomeScope;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import o.FontEj4NQ78;
import o.decode;
import o.getSoftLeftEK5gGoQ;
import o.getSoftRightEK5gGoQ;
import o.isAdapterPositionOnScreen;
import o.onMove;
import o.transferSessionPackageI;
import okio.internal.ResourceFileSystem$$ExternalSyntheticLambda0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseEventLogger implements decode {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final isAdapterPositionOnScreen IconCompatParcelizer = new isAdapterPositionOnScreen(new ResourceFileSystem$$ExternalSyntheticLambda0(3, this));
    public final FirebaseAnalyticsUserAttributesChangedListener RemoteActionCompatParcelizer;
    public final CreateHomeScope read;
    public final transferSessionPackageI serializer;
    public final Application write;

    public FirebaseEventLogger(Application application, CreateHomeScope createHomeScope, transferSessionPackageI transfersessionpackagei, FirebaseAnalyticsUserAttributesChangedListener firebaseAnalyticsUserAttributesChangedListener) {
        this.write = application;
        this.read = createHomeScope;
        this.serializer = transfersessionpackagei;
        this.RemoteActionCompatParcelizer = firebaseAnalyticsUserAttributesChangedListener;
    }

    @Override // o.decode
    public final void IconCompatParcelizer(String str, Map map) {
        int i = 2 % 2;
        str.getClass();
        if (((Set) this.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).contains(str)) {
            return;
        }
        if (map == null) {
            map = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        String str2 = (String) ((StateV3AnalyticsProviderImpl) ((FontEj4NQ78) this.read.read)).write().get("currentDeliveryStatus");
        if (str2 != null) {
            int i2 = RatingCompat + 115;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            linkedHashMap.put("currentDeliveryStatus", str2);
        }
        logEvent("screen_opened", linkedHashMap);
        int i4 = RatingCompat + 1;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.decode
    public final void logEvent(String str, Map map) {
        int i = 2 % 2;
        int i2 = RatingCompat + 121;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        if (((Set) this.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).contains(str)) {
            return;
        }
        FirebaseAnalyticsUserAttributesChangedListener firebaseAnalyticsUserAttributesChangedListener = this.RemoteActionCompatParcelizer;
        ReentrantLock reentrantLock = firebaseAnalyticsUserAttributesChangedListener.read;
        reentrantLock.lock();
        try {
            ConcurrentHashMap concurrentHashMap = firebaseAnalyticsUserAttributesChangedListener.serializer;
            reentrantLock.unlock();
            if (map == null) {
                map = new LinkedHashMap();
            }
            LinkedHashMap linkedHashMapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(concurrentHashMap, map);
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this.write);
            firebaseAnalytics.getClass();
            Bundle bundle = new Bundle();
            for (Map.Entry entry : linkedHashMapRemoteActionCompatParcelizer.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
                int i4 = MediaSessionCompatQueueItem + 73;
                RatingCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 4 / 3;
                }
            }
            getSoftRightEK5gGoQ getsoftrightek5ggoq = firebaseAnalytics.zzb;
            getsoftrightek5ggoq.getClass();
            getsoftrightek5ggoq.write(new getSoftLeftEK5gGoQ(getsoftrightek5ggoq, null, null, str, bundle, false, true));
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            linkedHashMapRemoteActionCompatParcelizer.toString();
            forest.getClass();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
