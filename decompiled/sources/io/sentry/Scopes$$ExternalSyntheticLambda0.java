package io.sentry;

import android.app.job.JobParameters;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import androidx.sqlite.SQLite;
import androidx.viewpager2.widget.ViewPager2;
import com.common_ui.databinding.LayoutTileBinding;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.MapboxNavigation$notification$1$1;
import com.sentiance.sdk.ResetCallback;
import com.sentiance.sdk.drivinginsights.api.DrivingInsights;
import com.sentiance.sdk.drivinginsights.api.DrivingInsightsReadyListener;
import com.sentiance.sdk.drivinginsights.api.HarshDrivingEvent;
import com.sentiance.sdk.drivinginsights.api.HarshDrivingEventListener;
import com.sentiance.sdk.events.EventUploadResult;
import com.sentiance.sdk.events.controlmessageextras.LogUploadResult;
import com.sentiance.sdk.eventtimeline.api.TripLocation;
import com.sentiance.sdk.eventtimeline.api.TripLocationUpdatesListener;
import com.sentiance.sdk.eventtimeline.transportsessionrecorder.api.TransportSession;
import com.sentiance.sdk.eventtimeline.transportsessionrecorder.api.TransportSessionListener;
import com.sentiance.sdk.pendingoperation.OnCompleteListener;
import com.sentiance.sdk.pendingoperation.OnFailureListener;
import com.sentiance.sdk.pendingoperation.OnSuccessListener;
import com.sentiance.sdk.pendingoperation.PendingOperation;
import com.sentiance.sdk.reset.ResetFailureReason;
import com.sentiance.sdk.task.SdkJobTaskService;
import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;
import com.ui.common.widget.calendar.CalendarView;
import io.sentry.android.core.AnrIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.ndk.read;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.capture.write;
import io.sentry.android.replay.viewhierarchy.IconCompatParcelizer;
import io.sentry.cache.MediaMetadataCompat;
import io.sentry.ndk.NativeScope;
import io.sentry.protocol.addObserverForBackInvoker;
import io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.TuplesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import o.BrazeActionUtilsWhenMappings;
import o.BundleUtils;
import o.UriActionExternalSyntheticLambda4;
import o.dismissSubscriberlambda0;
import o.forJsonPutlambda0;
import o.getEnabledannotations;
import o.getIntentArrayWithConfiguredBackStacklambda1;
import o.getPropertiesJsonannotations;
import o.getSdkDebuggerCallbackandroid_sdk_base_release;
import o.handlePush;
import o.handlePushperformWorklambda1;
import o.isExpired;
import o.onViewDetachedFromWindowlambda1;
import o.parseStringlambda0;
import o.populateNotificationBuilderlambda1;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0;
import o.r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg;
import o.setActionId;
import o.setInitialLogLevelFromConfiguration;
import o.setNativeShader;
import o.setSdkDebuggerCallbackandroid_sdk_base_release;
import o.stringAndKey;
import o.toStringMap;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Scopes$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object write;

    public /* synthetic */ Scopes$$ExternalSyntheticLambda0(r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg r8lambdauosl1ojcz1lncaiooglfrbn5pcg, IconCompatParcelizer iconCompatParcelizer, View view) {
        this.IconCompatParcelizer = 25;
        this.RemoteActionCompatParcelizer = r8lambdauosl1ojcz1lncaiooglfrbn5pcg;
        this.write = iconCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x01e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:77:0x01be A[LOOP:1: B:73:0x01b2->B:77:0x01be, LOOP_END] */
    @Override // java.lang.Runnable
    public final void run() {
        ResetCallback.ResetFailureReason resetFailureReason;
        toStringMap tostringmap;
        int i = this.IconCompatParcelizer;
        Object obj = this.write;
        Object obj2 = this.RemoteActionCompatParcelizer;
        String strSerializer = null;
        int i2 = -1;
        int i3 = 0;
        switch (i) {
            case 0:
                ((BrazeActionUtilsWhenMappings) obj).RemoteActionCompatParcelizer(((dismissSubscriberlambda0) obj2).RemoteActionCompatParcelizer().getShutdownTimeoutMillis());
                return;
            case 1:
                ((DrivingInsightsReadyListener) obj2).onDrivingInsightsReady((DrivingInsights) obj);
                return;
            case 2:
                ((HarshDrivingEventListener) obj2).onHarshDrivingEventDetected((HarshDrivingEvent) obj);
                return;
            case 3:
                ((isExpired) obj2).IconCompatParcelizer((LogUploadResult) obj);
                return;
            case 4:
                ((getPropertiesJsonannotations) obj2).serializer((EventUploadResult) obj);
                return;
            case 5:
                forJsonPutlambda0.IconCompatParcelizer((forJsonPutlambda0) obj2, (getEnabledannotations) obj);
                return;
            case 6:
                forJsonPutlambda0.RemoteActionCompatParcelizer((forJsonPutlambda0) obj2, (String) obj);
                return;
            case 7:
                ((TripLocationUpdatesListener) obj2).onLocationReceived((TripLocation) obj);
                return;
            case 8:
                ((TransportSessionListener) obj2).onTransportSessionCompleted((TransportSession) obj);
                return;
            case 9:
                setActionId.read((setActionId) obj2, (Long) obj);
                return;
            case 10:
                parseStringlambda0.write((parseStringlambda0) obj2, (String) obj);
                return;
            case 11:
                stringAndKey.RemoteActionCompatParcelizer((stringAndKey) obj2, (d0$$ExternalSyntheticLambda0) obj);
                return;
            case 12:
                populateNotificationBuilderlambda1.write((populateNotificationBuilderlambda1) obj2, (HashSet) obj);
                return;
            case 13:
                ((PendingOperation) obj2).lambda$callOnFailureListeners$2((OnFailureListener) obj);
                return;
            case 14:
                ((PendingOperation) obj2).lambda$callOnCompleteListeners$0((OnCompleteListener) obj);
                return;
            case 15:
                ((PendingOperation) obj2).lambda$callOnSuccessListeners$1((OnSuccessListener) obj);
                return;
            case 16:
                ResetCallback resetCallback = (ResetCallback) obj2;
                ResetFailureReason resetFailureReason2 = (ResetFailureReason) obj;
                resetFailureReason2.getClass();
                int i4 = handlePush.read[resetFailureReason2.ordinal()];
                if (i4 == 1) {
                    resetFailureReason = ResetCallback.ResetFailureReason.SDK_RESET_IN_PROGRESS;
                } else if (i4 == 2) {
                    resetFailureReason = ResetCallback.ResetFailureReason.SDK_INIT_IN_PROGRESS;
                } else {
                    if (i4 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return;
                    }
                    resetFailureReason = ResetCallback.ResetFailureReason.EXCEPTION_OR_ERROR;
                }
                resetCallback.onResetFailure(resetFailureReason);
                return;
            case 17:
                SdkJobTaskService.write((SdkJobTaskService) obj2, (JobParameters) obj);
                return;
            case 18:
                setSdkDebuggerCallbackandroid_sdk_base_release setsdkdebuggercallbackandroid_sdk_base_release = (setSdkDebuggerCallbackandroid_sdk_base_release) obj;
                LayoutTileBinding layoutTileBinding = ((CalendarView) obj2).ResultReceiver;
                Iterator it = setsdkdebuggercallbackandroid_sdk_base_release.serializer.iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    if (((BundleUtils) it.next()).write) {
                        i2 = i5;
                        ((ViewPager2) layoutTileBinding.write).setCurrentItem(i2);
                        tostringmap = (toStringMap) layoutTileBinding.serializer;
                        BundleUtils bundleUtils = (BundleUtils) setsdkdebuggercallbackandroid_sdk_base_release.serializer.get(i2);
                        bundleUtils.getClass();
                        for (Object obj3 : bundleUtils.IconCompatParcelizer) {
                            if (i3 >= 0) {
                                SQLite.serializer();
                                throw null;
                            }
                            getSdkDebuggerCallbackandroid_sdk_base_release getsdkdebuggercallbackandroid_sdk_base_release = (getSdkDebuggerCallbackandroid_sdk_base_release) obj3;
                            View childAt = tostringmap.getChildAt((i3 * 2) + 1);
                            childAt.getClass();
                            setInitialLogLevelFromConfiguration setinitialloglevelfromconfiguration = (setInitialLogLevelFromConfiguration) childAt;
                            getsdkdebuggercallbackandroid_sdk_base_release.getClass();
                            setinitialloglevelfromconfiguration.setText(getsdkdebuggercallbackandroid_sdk_base_release.IconCompatParcelizer);
                            setinitialloglevelfromconfiguration.setEnabled(getsdkdebuggercallbackandroid_sdk_base_release.RemoteActionCompatParcelizer);
                            setinitialloglevelfromconfiguration.setSelected(getsdkdebuggercallbackandroid_sdk_base_release.serializer);
                            i3++;
                        }
                        return;
                    }
                    i5++;
                }
                ((ViewPager2) layoutTileBinding.write).setCurrentItem(i2);
                tostringmap = (toStringMap) layoutTileBinding.serializer;
                BundleUtils bundleUtils2 = (BundleUtils) setsdkdebuggercallbackandroid_sdk_base_release.serializer.get(i2);
                bundleUtils2.getClass();
                while (r1.hasNext()) {
                    if (i3 >= 0) {
                        SQLite.serializer();
                        throw null;
                    }
                    getSdkDebuggerCallbackandroid_sdk_base_release getsdkdebuggercallbackandroid_sdk_base_release2 = (getSdkDebuggerCallbackandroid_sdk_base_release) obj3;
                    View childAt2 = tostringmap.getChildAt((i3 * 2) + 1);
                    childAt2.getClass();
                    setInitialLogLevelFromConfiguration setinitialloglevelfromconfiguration2 = (setInitialLogLevelFromConfiguration) childAt2;
                    getsdkdebuggercallbackandroid_sdk_base_release2.getClass();
                    setinitialloglevelfromconfiguration2.setText(getsdkdebuggercallbackandroid_sdk_base_release2.IconCompatParcelizer);
                    setinitialloglevelfromconfiguration2.setEnabled(getsdkdebuggercallbackandroid_sdk_base_release2.RemoteActionCompatParcelizer);
                    setinitialloglevelfromconfiguration2.setSelected(getsdkdebuggercallbackandroid_sdk_base_release2.serializer);
                    i3++;
                }
                return;
            case 19:
                AnrIntegration anrIntegration = (AnrIntegration) obj2;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) obj;
                UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = anrIntegration.MediaSessionCompatQueueItem.serializer();
                try {
                    if (!anrIntegration.RemoteActionCompatParcelizer) {
                        anrIntegration.IconCompatParcelizer(sentryAndroidOptions);
                        break;
                    }
                    uriActionExternalSyntheticLambda4Serializer.close();
                    return;
                } catch (Throwable th) {
                    try {
                        uriActionExternalSyntheticLambda4Serializer.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 20:
                read readVar = (read) obj2;
                getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1 = (getIntentArrayWithConfiguredBackStacklambda1) obj;
                SentryOptions sentryOptions = readVar.RemoteActionCompatParcelizer;
                r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = getintentarraywithconfiguredbackstacklambda1.read;
                String lowerCase = r8lambdal32xcezw71g2xzeh1nm3nimxco != null ? r8lambdal32xcezw71g2xzeh1nm3nimxco.name().toLowerCase(Locale.ROOT) : null;
                String strSerializer2 = setNativeShader.serializer(getintentarraywithconfiguredbackstacklambda1.write());
                try {
                    ConcurrentHashMap concurrentHashMap = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                    if (!concurrentHashMap.isEmpty()) {
                        strSerializer = sentryOptions.getSerializer().serializer(concurrentHashMap);
                    }
                    break;
                } catch (Throwable th3) {
                    sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th3, "Breadcrumb data is not serializable.", new Object[0]);
                }
                NativeScope nativeScope = readVar.write;
                String str = getintentarraywithconfiguredbackstacklambda1.serializer;
                String str2 = getintentarraywithconfiguredbackstacklambda1.write;
                String str3 = getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem;
                nativeScope.getClass();
                NativeScope.nativeAddBreadcrumb(lowerCase, str, str2, str3, strSerializer2, strSerializer);
                return;
            case 21:
                ((read) obj2).write.getClass();
                NativeScope.nativeRemoveTag((String) obj);
                return;
            case 22:
                addObserverForBackInvoker addobserverforbackinvoker = (addObserverForBackInvoker) obj;
                NativeScope nativeScope2 = ((read) obj2).write;
                String str4 = addobserverforbackinvoker.read;
                String str5 = addobserverforbackinvoker.RemoteActionCompatParcelizer;
                String str6 = addobserverforbackinvoker.IconCompatParcelizer;
                String str7 = addobserverforbackinvoker.MediaSessionCompatQueueItem;
                nativeScope2.getClass();
                NativeScope.nativeSetUser(str4, str5, str6, str7);
                return;
            case 23:
                r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0 = (r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0) obj;
                NativeScope nativeScope3 = ((read) obj2).write;
                String string = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.PlaybackStateCompat.toString();
                String string2 = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.ParcelableVolumeInfo.toString();
                nativeScope3.getClass();
                NativeScope.nativeSetTrace(string, string2);
                return;
            case 24:
                TuplesKt.serializer((File) obj2);
                ((write) obj).IconCompatParcelizer(-1);
                return;
            case 25:
                r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg r8lambdauosl1ojcz1lncaiooglfrbn5pcg = (r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg) obj2;
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
                AtomicBoolean atomicBoolean = (AtomicBoolean) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.ParcelableVolumeInfo;
                SentryOptions sentryOptions2 = (SentryOptions) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.serializer;
                Bitmap bitmap = (Bitmap) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaBrowserCompatMediaItem;
                if (atomicBoolean.get() || bitmap.isRecycled()) {
                    sentryOptions2.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "PixelCopyStrategy is closed, skipping masking", new Object[0]);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Canvas canvas = new Canvas(bitmap);
                canvas.setMatrix((Matrix) ((onViewDetachedFromWindowlambda1) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaMetadataCompat).MediaSessionCompatResultReceiverWrapper());
                iconCompatParcelizer.RemoteActionCompatParcelizer(new MapboxNavigation$notification$1$1(r8lambdauosl1ojcz1lncaiooglfrbn5pcg, arrayList, canvas));
                sentryOptions2.getReplayController().getClass();
                ((ReplayIntegration) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.read).serializer(bitmap);
                ((AtomicBoolean) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaSessionCompatToken).set(true);
                ((AtomicBoolean) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaSessionCompatResultReceiverWrapper).set(false);
                return;
            case 26:
                SentryOptions sentryOptions3 = (SentryOptions) obj;
                try {
                    ((e$$ExternalSyntheticLambda0) obj2).run();
                    return;
                } catch (Throwable th4) {
                    sentryOptions3.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to execute task ReplayIntegration.finalize_previous_replay", th4);
                    return;
                }
            case 27:
                Runnable runnable = (Runnable) obj2;
                io.sentry.android.replay.util.write writeVar = (io.sentry.android.replay.util.write) obj;
                try {
                    runnable.run();
                    return;
                } catch (Throwable th5) {
                    writeVar.RemoteActionCompatParcelizer.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to execute task ".concat(runnable instanceof io.sentry.android.replay.util.IconCompatParcelizer ? ((io.sentry.android.replay.util.IconCompatParcelizer) runnable).serializer : ""), th5);
                    return;
                }
            case 28:
                ((MediaMetadataCompat) obj2).write((r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) obj, "replay.json");
                return;
            default:
                ((CancellableContinuationImpl) obj2).read((CoroutineDispatcher) obj);
                return;
        }
    }

    public /* synthetic */ Scopes$$ExternalSyntheticLambda0(ResetCallback resetCallback, handlePushperformWorklambda1 handlepushperformworklambda1, ResetFailureReason resetFailureReason) {
        this.IconCompatParcelizer = 16;
        this.RemoteActionCompatParcelizer = resetCallback;
        this.write = resetFailureReason;
    }

    public /* synthetic */ Scopes$$ExternalSyntheticLambda0(Object obj, int i, Object obj2) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.write = obj2;
    }
}
