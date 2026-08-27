package com.roadrunner.logger.logger.firebase;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.installations.FirebaseInstallations;
import com.roadrunner.logger.api.data.AppInfoChangedListener;
import com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0;
import dagger.Lazy;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import o.ExecutableQueryexecuteAsOneOrNull1;
import o.executeAsOneOrNull;
import o.getCardAtIndexlambda0;
import o.getScrollLockEK5gGoQ;
import o.getSoftRightEK5gGoQ;
import o.hideCurrentlyDisplayingInAppMessage;
import o.oc;
import o.s0;
import o.s2;
import o.safeSetClipToOutline;

/* JADX INFO: loaded from: classes3.dex */
@getCardAtIndexlambda0
public final class FirebaseAnalyticsUserAttributesChangedListener implements AppInfoChangedListener {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final oc IconCompatParcelizer;
    public final s2 MediaBrowserCompatMediaItem;
    public final Lazy RemoteActionCompatParcelizer;
    public final Lazy write;
    public final ConcurrentHashMap serializer = new ConcurrentHashMap();
    public final ReentrantLock read = new ReentrantLock();

    public FirebaseAnalyticsUserAttributesChangedListener(oc ocVar, s2 s2Var, Lazy lazy, Lazy lazy2) {
        this.IconCompatParcelizer = ocVar;
        this.MediaBrowserCompatMediaItem = s2Var;
        this.RemoteActionCompatParcelizer = lazy;
        this.write = lazy2;
    }

    public final FirebaseAnalytics read() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 55;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objWrite = this.RemoteActionCompatParcelizer.write();
        objWrite.getClass();
        FirebaseAnalytics firebaseAnalytics = (FirebaseAnalytics) objWrite;
        int i4 = MediaSessionCompatQueueItem + 3;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return firebaseAnalytics;
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void updateUserProperty(String str, String str2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 115;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        str2.getClass();
        read().setUserProperty(str, str2);
        int i4 = MediaDescriptionCompat + 59;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void updateProperties(Map map) {
        int i = 2 % 2;
        map.getClass();
        Iterator it = map.entrySet().iterator();
        int i2 = MediaSessionCompatQueueItem + 83;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        while (true) {
            int i3 = i2 % 2;
            if (!it.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            read().setUserProperty((String) entry.getKey(), entry.getValue().toString());
            i2 = MediaDescriptionCompat + 119;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        }
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void updateUserProperties(ExecutableQueryexecuteAsOneOrNull1 executableQueryexecuteAsOneOrNull1) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 47;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        executableQueryexecuteAsOneOrNull1.getClass();
        FirebaseAnalytics firebaseAnalytics = read();
        getSoftRightEK5gGoQ getsoftrightek5ggoq = firebaseAnalytics.zzb;
        String str = executableQueryexecuteAsOneOrNull1.read;
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            getsoftrightek5ggoq.getClass();
            getsoftrightek5ggoq.write(new getScrollLockEK5gGoQ(getsoftrightek5ggoq, (String) null));
        } else {
            String str2 = executableQueryexecuteAsOneOrNull1.read();
            getsoftrightek5ggoq.getClass();
            getsoftrightek5ggoq.write(new getScrollLockEK5gGoQ(getsoftrightek5ggoq, str2));
            int i4 = MediaDescriptionCompat + 115;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        firebaseAnalytics.setUserProperty("employee_id", str);
        firebaseAnalytics.setUserProperty(PushNotificationParserObj.COUNTRY_KEY, executableQueryexecuteAsOneOrNull1.serializer);
        firebaseAnalytics.setUserProperty("device_id", executableQueryexecuteAsOneOrNull1.RemoteActionCompatParcelizer);
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void onInfoUpdated(executeAsOneOrNull executeasoneornull) {
        int i = 2 % 2;
        ConcurrentHashMap concurrentHashMap = this.serializer;
        executeasoneornull.getClass();
        ExecutableQueryexecuteAsOneOrNull1 executableQueryexecuteAsOneOrNull1 = executeasoneornull.MediaMetadataCompat;
        updateUserProperties(executableQueryexecuteAsOneOrNull1);
        FirebaseAnalytics firebaseAnalytics = read();
        firebaseAnalytics.setUserProperty("brand", executeasoneornull.IconCompatParcelizer);
        firebaseAnalytics.setUserProperty("city", executeasoneornull.RemoteActionCompatParcelizer);
        firebaseAnalytics.setUserProperty("zone", executeasoneornull.MediaBrowserCompatMediaItem);
        firebaseAnalytics.setUserProperty("contract_type", executeasoneornull.serializer);
        firebaseAnalytics.setUserProperty("shift_id", executeasoneornull.read);
        firebaseAnalytics.setUserProperty("push_enable", String.valueOf(((s0) this.MediaBrowserCompatMediaItem).MediaMetadataCompat.areNotificationsEnabled()));
        firebaseAnalytics.setUserProperty("default_map_provider", this.IconCompatParcelizer.read());
        safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
        String str = executeasoneornull.RatingCompat;
        if (str != null) {
            int i2 = MediaSessionCompatQueueItem + 25;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = MediaDescriptionCompat + 51;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        safesetcliptooutline.put("rider_id", executableQueryexecuteAsOneOrNull1.read);
        safeSetClipToOutline safesetcliptooutlineIconCompatParcelizer = safesetcliptooutline.IconCompatParcelizer();
        ReentrantLock reentrantLock = this.read;
        reentrantLock.lock();
        try {
            concurrentHashMap.clear();
            concurrentHashMap.putAll(safesetcliptooutlineIconCompatParcelizer);
            reentrantLock.unlock();
            Object objWrite = this.write.write();
            objWrite.getClass();
            ((FirebaseInstallations) objWrite).write().addOnCompleteListener(new PerseusInitializerImpl$$ExternalSyntheticLambda0(23, this));
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
