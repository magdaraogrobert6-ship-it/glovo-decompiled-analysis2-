package io.sentry.android.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.braze.Braze$Companion$$ExternalSyntheticLambda4;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;
import io.sentry.protocol.ensureViewModelStore;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.DelayKt;
import o.AddToCustomAttributeArrayStep;
import o.BannerViewcreateBannerWebViewClientListener1;
import o.SimpleItemTouchHelperCallback;
import o._get_messageWebView_lambda0;
import o.accessgetDismissSubscriberp;
import o.accessgetInstancedelegatecp;
import o.defaultCardHandling;
import o.defaultCardHandlinglambda0;
import o.executelambda4;
import o.getChildStepIteratorandroid_sdk_ui_release;
import o.getCieXyz;
import o.getIntentArrayWithConfiguredBackStacklambda1;
import o.handleCardClicklambda4;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onMove;
import o.opN5in7k0;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg;
import o.relativeMoveTo;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryNavigationListener {
    public static final /* synthetic */ int serializer = 0;
    public final boolean IconCompatParcelizer;
    public WeakReference MediaDescriptionCompat;
    public final AddToCustomAttributeArrayStep RatingCompat = accessgetDismissSubscriberp.IconCompatParcelizer;
    public getChildStepIteratorandroid_sdk_ui_release RemoteActionCompatParcelizer;
    public Bundle read;
    public final boolean write;

    public static Map write(Bundle bundle) {
        if (bundle == null) {
            return SimpleItemTouchHelperCallback.serializer;
        }
        Set<String> setKeySet = bundle.keySet();
        setKeySet.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) obj, "android-support-nav:controller:deepLinkIntent"}, getCieXyz.write())).booleanValue()) {
                arrayList.add(obj);
            }
        }
        int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(arrayList, 10));
        if (iRemoteActionCompatParcelizer < 16) {
            iRemoteActionCompatParcelizer = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
        for (Object obj2 : arrayList) {
            linkedHashMap.put(obj2, bundle.get((String) obj2));
        }
        return linkedHashMap;
    }

    public SentryNavigationListener(boolean z, boolean z2) {
        this.write = z;
        this.IconCompatParcelizer = z2;
        DelayKt.MediaSessionCompatToken("NavigationListener");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c0 A[PHI: r9
  0x00c0: PHI (r9v32 java.lang.String) = (r9v19 java.lang.String), (r9v22 java.lang.String) binds: [B:24:0x009c, B:28:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    public final void write(relativeMoveTo relativemoveto, opN5in7k0 opn5in7k0, Bundle bundle) {
        opN5in7k0 opn5in7k1;
        String strConcat;
        opn5in7k0.getClass();
        r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg = opn5in7k0.serializer;
        Map mapWrite = write(bundle);
        boolean z = this.write;
        AddToCustomAttributeArrayStep addToCustomAttributeArrayStep = this.RatingCompat;
        if (z) {
            getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1 = new getIntentArrayWithConfiguredBackStacklambda1();
            getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem = "navigation";
            getintentarraywithconfiguredbackstacklambda1.write = "navigation";
            WeakReference weakReference = this.MediaDescriptionCompat;
            String str = (weakReference == null || (opn5in7k1 = (opN5in7k0) weakReference.get()) == null) ? null : (String) opn5in7k1.serializer.read;
            if (str != null) {
                ConcurrentHashMap concurrentHashMap = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                concurrentHashMap.getClass();
                concurrentHashMap.put(RemoteMessageConst.FROM, "/".concat(str));
            }
            Map mapWrite2 = write(this.read);
            if (!mapWrite2.isEmpty()) {
                ConcurrentHashMap concurrentHashMap2 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                concurrentHashMap2.getClass();
                concurrentHashMap2.put("from_arguments", mapWrite2);
            }
            String str2 = (String) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.read;
            if (str2 != null) {
                ConcurrentHashMap concurrentHashMap3 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                concurrentHashMap3.getClass();
                concurrentHashMap3.put(RemoteMessageConst.TO, "/".concat(str2));
            }
            if (!mapWrite.isEmpty()) {
                ConcurrentHashMap concurrentHashMap4 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                concurrentHashMap4.getClass();
                concurrentHashMap4.put("to_arguments", mapWrite);
            }
            getintentarraywithconfiguredbackstacklambda1.read = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO;
            executelambda4 executelambda4Var = new executelambda4();
            executelambda4Var.RemoteActionCompatParcelizer("android:navigationDestination", opn5in7k0);
            addToCustomAttributeArrayStep.IconCompatParcelizer(getintentarraywithconfiguredbackstacklambda1, executelambda4Var);
        }
        Context context = relativemoveto.write;
        String resourceEntryName = (String) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.read;
        if (resourceEntryName == null) {
            try {
                resourceEntryName = context.getResources().getResourceEntryName(r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.RemoteActionCompatParcelizer);
            } catch (Resources.NotFoundException unused) {
                addToCustomAttributeArrayStep.RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Destination id cannot be retrieved from Resources, no transaction captured.", new Object[0]);
                resourceEntryName = null;
            }
            if (resourceEntryName == null) {
                strConcat = null;
            } else {
                strConcat = "/".concat(hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(resourceEntryName, '/'));
            }
        } else {
            strConcat = "/".concat(hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(resourceEntryName, '/'));
        }
        if (strConcat != null) {
            if (addToCustomAttributeArrayStep.RemoteActionCompatParcelizer().isEnableScreenTracking()) {
                addToCustomAttributeArrayStep.RemoteActionCompatParcelizer(new Braze$Companion$$ExternalSyntheticLambda4(strConcat, 4));
            }
            if (addToCustomAttributeArrayStep.RemoteActionCompatParcelizer().isTracingEnabled() && this.IconCompatParcelizer) {
                getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release = this.RemoteActionCompatParcelizer;
                if (getchildstepiteratorandroid_sdk_ui_release != null) {
                    defaultCardHandlinglambda0 defaultcardhandlinglambda0MediaSessionCompatQueueItem = getchildstepiteratorandroid_sdk_ui_release.MediaSessionCompatQueueItem();
                    if (defaultcardhandlinglambda0MediaSessionCompatQueueItem == null) {
                        defaultcardhandlinglambda0MediaSessionCompatQueueItem = defaultCardHandlinglambda0.OK;
                    }
                    defaultcardhandlinglambda0MediaSessionCompatQueueItem.getClass();
                    getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release2 = this.RemoteActionCompatParcelizer;
                    if (getchildstepiteratorandroid_sdk_ui_release2 != null) {
                        getchildstepiteratorandroid_sdk_ui_release2.write(defaultcardhandlinglambda0MediaSessionCompatQueueItem);
                    }
                    addToCustomAttributeArrayStep.RemoteActionCompatParcelizer(new d0$$ExternalSyntheticLambda0(18, this));
                    this.RemoteActionCompatParcelizer = null;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{opn5in7k0.MediaMetadataCompat, "activity"}, getCieXyz.write())).booleanValue()) {
                    addToCustomAttributeArrayStep.RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Navigating to activity destination, no transaction captured.", new Object[0]);
                } else {
                    handleCardClicklambda4 handlecardclicklambda4 = new handleCardClicklambda4();
                    handlecardclicklambda4.MediaSessionCompatQueueItem = true;
                    handlecardclicklambda4.MediaDescriptionCompat = addToCustomAttributeArrayStep.RemoteActionCompatParcelizer().getIdleTimeout();
                    long deadlineTimeout = addToCustomAttributeArrayStep.RemoteActionCompatParcelizer().getDeadlineTimeout();
                    handlecardclicklambda4.RatingCompat = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
                    handlecardclicklambda4.RemoteActionCompatParcelizer = true;
                    getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_releaseSerializer = addToCustomAttributeArrayStep.serializer(new defaultCardHandling(strConcat, ensureViewModelStore.ROUTE, "navigation", (_get_messageWebView_lambda0) null), handlecardclicklambda4);
                    getchildstepiteratorandroid_sdk_ui_releaseSerializer.getClass();
                    getchildstepiteratorandroid_sdk_ui_releaseSerializer.RemoteActionCompatParcelizer().RatingCompat = "auto.navigation.".concat("jetpack_compose");
                    if (!mapWrite.isEmpty()) {
                        getchildstepiteratorandroid_sdk_ui_releaseSerializer.read(mapWrite, "arguments");
                    }
                    addToCustomAttributeArrayStep.RemoteActionCompatParcelizer(new d0$$ExternalSyntheticLambda0(17, getchildstepiteratorandroid_sdk_ui_releaseSerializer));
                    this.RemoteActionCompatParcelizer = getchildstepiteratorandroid_sdk_ui_releaseSerializer;
                }
            } else {
                addToCustomAttributeArrayStep.RemoteActionCompatParcelizer(new MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0(24));
            }
        }
        this.MediaDescriptionCompat = new WeakReference(opn5in7k0);
        this.read = bundle;
    }

    static {
        BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().IconCompatParcelizer("maven:io.sentry:sentry-android-navigation", "8.32.0");
    }
}
