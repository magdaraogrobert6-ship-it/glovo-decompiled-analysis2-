package com.google.firebase.perf.transport;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.FirebaseApp;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.v1.AndroidApplicationInfo;
import com.google.firebase.perf.v1.ApplicationInfo;
import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import o.AbstractComposeViewExternalSyntheticLambda0;
import o.accesssetAddChangeCallbackMethodcp;
import o.accesssetSystemPropertiesClasscp;
import o.isInBounds;
import o.moveFocusInChildrenViewFocusFix3ESFkO8;
import o.outOfFrameRunnablelambda0;
import o.recalculateWindowViewTransforms;
import o.rotateRad0AR0LA0default;
import o.sendMotionEvent8iAsVTc;
import o.setFontFamilyResolver;
import o.updateWindowMetrics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class TransportManager$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int read;
    public final /* synthetic */ moveFocusInChildrenViewFocusFix3ESFkO8 write;

    public /* synthetic */ TransportManager$$ExternalSyntheticLambda0(moveFocusInChildrenViewFocusFix3ESFkO8 movefocusinchildrenviewfocusfix3esfko8, int i) {
        this.read = i;
        this.write = movefocusinchildrenviewfocusfix3esfko8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        accesssetSystemPropertiesClasscp accesssetsystempropertiesclasscp;
        String str;
        int i = this.read;
        moveFocusInChildrenViewFocusFix3ESFkO8 movefocusinchildrenviewfocusfix3esfko8 = this.write;
        if (i == 0) {
            recalculateWindowViewTransforms recalculatewindowviewtransforms = movefocusinchildrenviewfocusfix3esfko8.ComponentActivity;
            boolean z = movefocusinchildrenviewfocusfix3esfko8.MediaSessionCompatResultReceiverWrapper;
            recalculatewindowviewtransforms.IconCompatParcelizer.serializer(z);
            recalculatewindowviewtransforms.serializer.serializer(z);
            return;
        }
        FirebaseApp firebaseApp = movefocusinchildrenviewfocusfix3esfko8.MediaMetadataCompat;
        firebaseApp.IconCompatParcelizer();
        Context context = firebaseApp.read;
        movefocusinchildrenviewfocusfix3esfko8.read = context;
        movefocusinchildrenviewfocusfix3esfko8.ResultReceiver = context.getPackageName();
        movefocusinchildrenviewfocusfix3esfko8.RatingCompat = accesssetAddChangeCallbackMethodcp.RemoteActionCompatParcelizer();
        movefocusinchildrenviewfocusfix3esfko8.ComponentActivity = new recalculateWindowViewTransforms(movefocusinchildrenviewfocusfix3esfko8.read, new rotateRad0AR0LA0default(100L, 1L, TimeUnit.MINUTES));
        movefocusinchildrenviewfocusfix3esfko8.serializer = AppStateMonitor.read();
        AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0 = movefocusinchildrenviewfocusfix3esfko8.PlaybackStateCompat;
        accesssetAddChangeCallbackMethodcp accesssetaddchangecallbackmethodcp = movefocusinchildrenviewfocusfix3esfko8.RatingCompat;
        accesssetaddchangecallbackmethodcp.getClass();
        accesssetSystemPropertiesClasscp accesssetsystempropertiesclasscp2 = accesssetSystemPropertiesClasscp.write;
        synchronized (accesssetSystemPropertiesClasscp.class) {
            if (accesssetSystemPropertiesClasscp.write == null) {
                accesssetSystemPropertiesClasscp.write = new accesssetSystemPropertiesClasscp();
            }
            accesssetsystempropertiesclasscp = accesssetSystemPropertiesClasscp.write;
        }
        accesssetsystempropertiesclasscp.getClass();
        Long l = (Long) accesssetaddchangecallbackmethodcp.serializer.getRemoteConfigValueOrDefault("fpr_log_source", -1L);
        l.getClass();
        Map map = accesssetSystemPropertiesClasscp.IconCompatParcelizer;
        if (!map.containsKey(l) || (str = (String) map.get(l)) == null) {
            sendMotionEvent8iAsVTc sendmotionevent8iasvtcRemoteActionCompatParcelizer = accesssetaddchangecallbackmethodcp.RemoteActionCompatParcelizer(accesssetsystempropertiesclasscp);
            str = sendmotionevent8iasvtcRemoteActionCompatParcelizer.serializer() ? (String) sendmotionevent8iasvtcRemoteActionCompatParcelizer.RemoteActionCompatParcelizer() : "FIREPERF";
        } else {
            accesssetaddchangecallbackmethodcp.read.IconCompatParcelizer("com.google.firebase.perf.LogSourceName", str);
        }
        movefocusinchildrenviewfocusfix3esfko8.PlaybackStateCompatCustomAction = new isInBounds(abstractComposeViewExternalSyntheticLambda0, str);
        ConcurrentLinkedQueue concurrentLinkedQueue = movefocusinchildrenviewfocusfix3esfko8.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        AppStateMonitor appStateMonitor = movefocusinchildrenviewfocusfix3esfko8.serializer;
        WeakReference weakReference = new WeakReference(moveFocusInChildrenViewFocusFix3ESFkO8.write);
        synchronized (appStateMonitor.MediaBrowserCompatMediaItem) {
            appStateMonitor.MediaBrowserCompatMediaItem.add(weakReference);
        }
        updateWindowMetrics updatewindowmetricsNewBuilder = ApplicationInfo.newBuilder();
        movefocusinchildrenviewfocusfix3esfko8.RemoteActionCompatParcelizer = updatewindowmetricsNewBuilder;
        FirebaseApp firebaseApp2 = movefocusinchildrenviewfocusfix3esfko8.MediaMetadataCompat;
        firebaseApp2.IconCompatParcelizer();
        String str2 = firebaseApp2.PlaybackStateCompatCustomAction.IconCompatParcelizer;
        updatewindowmetricsNewBuilder.RemoteActionCompatParcelizer();
        ((ApplicationInfo) updatewindowmetricsNewBuilder.RemoteActionCompatParcelizer).setGoogleAppId(str2);
        setFontFamilyResolver setfontfamilyresolverNewBuilder = AndroidApplicationInfo.newBuilder();
        String str3 = movefocusinchildrenviewfocusfix3esfko8.ResultReceiver;
        setfontfamilyresolverNewBuilder.RemoteActionCompatParcelizer();
        ((AndroidApplicationInfo) setfontfamilyresolverNewBuilder.RemoteActionCompatParcelizer).setPackageName(str3);
        setfontfamilyresolverNewBuilder.RemoteActionCompatParcelizer();
        ((AndroidApplicationInfo) setfontfamilyresolverNewBuilder.RemoteActionCompatParcelizer).setSdkVersion("22.0.4");
        Context context2 = movefocusinchildrenviewfocusfix3esfko8.read;
        String str4 = "";
        try {
            String str5 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
            if (str5 != null) {
                str4 = str5;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        setfontfamilyresolverNewBuilder.RemoteActionCompatParcelizer();
        ((AndroidApplicationInfo) setfontfamilyresolverNewBuilder.RemoteActionCompatParcelizer).setVersionName(str4);
        updatewindowmetricsNewBuilder.RemoteActionCompatParcelizer();
        ((ApplicationInfo) updatewindowmetricsNewBuilder.RemoteActionCompatParcelizer).setAndroidAppInfo((AndroidApplicationInfo) setfontfamilyresolverNewBuilder.serializer());
        movefocusinchildrenviewfocusfix3esfko8.MediaSessionCompatToken.set(true);
        while (!concurrentLinkedQueue.isEmpty()) {
            outOfFrameRunnablelambda0 outofframerunnablelambda0 = (outOfFrameRunnablelambda0) concurrentLinkedQueue.poll();
            if (outofframerunnablelambda0 != null) {
                movefocusinchildrenviewfocusfix3esfko8.MediaBrowserCompatMediaItem.execute(new ND$$ExternalSyntheticLambda0(movefocusinchildrenviewfocusfix3esfko8, 21, outofframerunnablelambda0));
            }
        }
    }
}
