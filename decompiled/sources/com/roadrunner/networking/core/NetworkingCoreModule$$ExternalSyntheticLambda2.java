package com.roadrunner.networking.core;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Intent;
import android.net.Uri;
import android.view.WindowManager;
import androidx.compose.ui.graphics.Fields;
import androidx.core.app.NotificationManagerCompat;
import androidx.sqlite.SQLite;
import androidx.work.impl.WorkerWrapper;
import com.mapbox.common.MapboxOptions;
import com.mapbox.common.MapboxSDKCommonInitializer;
import com.mapbox.maps.MapView;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.core.lifecycle.MapboxNavigationApp;
import com.mapbox.navigation.core.lifecycle.MapboxNavigationAppDelegate;
import com.mapbox.navigation.core.lifecycle.MapboxNavigationOwner;
import com.mapbox.navigation.ui.maps.camera.data.MapboxNavigationViewportDataSource;
import com.mapbox.navigator.R;
import com.roadrunner.localPushNotifications.smartPolling.domain.AutoAcceptLocalPushHandlerImpl;
import com.roadrunner.logger.performance.DefaultPerformanceLogger;
import com.roadrunner.map.container.enabled.usecases.recenter.RecenterMapTriggerImpl;
import com.roadrunner.nafath.presentation.ui.NafathModalFragment;
import com.roadrunner.opportunities.calendar.info.CalendarInformationFragment;
import com.roadrunner.order.history.data.database.HistoryDatabase_Impl;
import com.roadrunner.order.history.presentation.orderdetails.OrderDetailsFragment;
import com.roadrunner.overlay.bubble.permission.presentation.OverlayPermissionDialogFragment;
import com.roadrunner.overlay.bubble.permission.presentation.OverlayPermissionViewModel$onDialogOpened$1;
import com.roadrunner.push.presentation.MessageDialogFragment;
import com.roadrunner.recentdeliveries.presentation.RecentDeliveriesFragment;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.safety.lifecycle.RiderSafetyLifecycleManager;
import com.roadrunner.rider.safety.report.presentation.RiderSafetyReportFragment;
import com.roadrunner.rider.safety.sentiance.SentianceGuard;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.H$b;
import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.init.InitializationFailureReason;
import com.sentiance.sdk.init.InitializationResult;
import com.sentiance.sdk.init.SentianceOptions;
import io.grpc.internal.CallTracer;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import kotlinx.coroutines.BuildersKt;
import o.AndroidQuerybindBoolean1;
import o.BrazeExternalSyntheticLambda28;
import o.C0179j;
import o.C0180k;
import o.MemoryCacheService;
import o.NetworkFetcher;
import o.PrefetchNetworkException;
import o.accessdoFetch;
import o.accessexecute;
import o.accessgetOldDependencyp;
import o.asComposePaint;
import o.createFromParcel;
import o.getBoolean;
import o.getClassLogTag;
import o.getEnterdhqQ8s;
import o.getFirstErrorCode;
import o.getQueryContext;
import o.gotOptOutResponseI;
import o.h9;
import o.ia;
import o.isAdapterPositionOnScreen;
import o.isPreinstallTrackingEnabled;
import o.jsonStringToList;
import o.l3;
import o.lambdaisEnabled9;
import o.m7;
import o.mergeJsonObjects;
import o.newTransaction;
import o.pb;
import o.pg;
import o.q0;
import o.q4ExternalSyntheticLambda1;
import o.r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0;
import o.r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.ra;
import o.removeGlobalCallbackParametersI;
import o.removeNodeAtDepth;
import o.setPageTransformer;
import o.setToSaturationimpl;
import o.setTransactionSuccessful;
import o.toBitmapConfig1JJdX4A;
import o.transferSessionPackageI;
import o.u4;
import o.updateAdidI;
import o.updateHasCallbacks;
import o.updateLayerElements;
import o.verifyPlayStorePurchaseI;
import okhttp3.FormBody;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class NetworkingCoreModule$$ExternalSyntheticLambda2 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;

    public /* synthetic */ NetworkingCoreModule$$ExternalSyntheticLambda2(accessgetOldDependencyp accessgetolddependencyp, ra raVar) {
        this.RemoteActionCompatParcelizer = 0;
        this.read = raVar;
    }

    public /* synthetic */ NetworkingCoreModule$$ExternalSyntheticLambda2(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.read = obj;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0100  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        boolean z;
        MapboxNavigation mapboxNavigation;
        int i = 2 % 2;
        int i2 = serializer + 39;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj = this.read;
        boolean z2 = true;
        z = true;
        boolean z3 = true;
        z = true;
        boolean z4 = true;
        Object obj2 = null;
        Object[] objArr = 0;
        Map mapSingletonMap = null;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (i4) {
            case 0:
                getClassLogTag getclasslogtag = new getClassLogTag(0);
                getclasslogtag.write(r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig.NONE);
                r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq = new r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ();
                ArrayList arrayList = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                arrayList.add(getclasslogtag);
                arrayList.add((ra) obj);
                return new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq);
            case 1:
                return ((FirebaseRemoteConfigImpl) ((AutoAcceptLocalPushHandlerImpl) obj).write.IconCompatParcelizer).IconCompatParcelizer.read("accept_local_notification_background_sound");
            case 2:
                return ((FirebaseRemoteConfigImpl) ((setPageTransformer) obj).read.IconCompatParcelizer).IconCompatParcelizer.read("accept_local_notification_background_sound");
            case 3:
                return ((FirebaseRemoteConfigImpl) ((PrefetchNetworkException) obj).write.IconCompatParcelizer).IconCompatParcelizer.read("accept_local_notification_background_sound");
            case 4:
                return Boolean.valueOf(((FirebaseRemoteConfigImpl) ((DefaultPerformanceLogger) obj).write).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_SENTRY_CUSTOM_TRACES_ENABLED.getFirebaseFlagName()));
            case 5:
                return (verifyPlayStorePurchaseI) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(-383819351, R.serializer(), R.serializer(), 383819352, R.serializer(), R.serializer(), new Object[]{(FirebaseRemoteConfigImpl) ((C0180k) obj).MediaMetadataCompat});
            case 6:
                C0179j c0179j = (C0179j) obj;
                getBoolean getboolean = c0179j.read;
                if (!getboolean.RemoteActionCompatParcelizer() || getboolean.IconCompatParcelizer()) {
                    z = false;
                } else {
                    int i5 = serializer + 45;
                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    z = true;
                }
                if (c0179j.MediaSessionCompatQueueItem) {
                    z2 = z;
                } else {
                    int i7 = IconCompatParcelizer + 45;
                    serializer = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        obj2.hashCode();
                        throw null;
                    }
                    if (z && c0179j.write.serializer) {
                        int i8 = serializer + 29;
                        IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                        if (i8 % 2 != 0) {
                            (objArr3 == true ? 1 : 0).hashCode();
                            throw null;
                        }
                    } else {
                        z2 = false;
                    }
                }
                return Boolean.valueOf(z2);
            case 7:
                ((getQueryContext) obj).serializer(AndroidQuerybindBoolean1.IconCompatParcelizer);
                return createfromparcel;
            case 8:
                WorkerWrapper.Builder builder = (WorkerWrapper.Builder) obj;
                setToSaturationimpl settosaturationimplIconCompatParcelizer = setToSaturationimpl.IconCompatParcelizer((Application) builder.write);
                settosaturationimplIconCompatParcelizer.read(MapboxSDKCommonInitializer.class);
                WorkerWrapper.Builder.IconCompatParcelizer();
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Initializing mapbox SDK v11", new Object[0]);
                MapboxOptions.setAccessToken(((h9) builder.MediaSessionCompatQueueItem).RemoteActionCompatParcelizer());
                return createfromparcel;
            case 9:
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Initializing mapbox navigation SDK v11", new Object[0]);
                return createfromparcel;
            case 10:
                ia iaVar = (ia) obj;
                MapboxNavigationViewportDataSource mapboxNavigationViewportDataSource = iaVar.ParcelableVolumeInfo;
                if (mapboxNavigationViewportDataSource != null) {
                    int i9 = IconCompatParcelizer + 31;
                    serializer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    mapboxNavigationViewportDataSource.clearRouteData();
                }
                MapboxNavigationViewportDataSource mapboxNavigationViewportDataSource2 = iaVar.ParcelableVolumeInfo;
                if (mapboxNavigationViewportDataSource2 != null) {
                    mapboxNavigationViewportDataSource2.evaluate();
                }
                RecenterMapTriggerImpl recenterMapTriggerImpl = iaVar.MediaDescriptionCompat;
                updateHasCallbacks updatehascallbacks = updateHasCallbacks.MapVisibleAreaChange;
                updatehascallbacks.getClass();
                recenterMapTriggerImpl.RemoteActionCompatParcelizer.onNext(updatehascallbacks);
                MapView mapView = iaVar.MediaMetadataCompat;
                if (mapView != null) {
                    SQLite.getCompass(mapView).setEnabled(true);
                }
                MapView mapView2 = iaVar.MediaMetadataCompat;
                if (mapView2 != null) {
                    mapView2.setKeepScreenOn(false);
                }
                return createfromparcel;
            case 11:
                l3 l3Var = (l3) obj;
                isAdapterPositionOnScreen isadapterpositiononscreen = MapboxNavigationApp.mapboxNavigationAppDelegate$delegate;
                MapboxNavigationAppDelegate mapboxNavigationAppDelegate = MapboxNavigationApp.getMapboxNavigationAppDelegate();
                mapboxNavigationAppDelegate.getClass();
                MapboxNavigationOwner mapboxNavigationOwner = mapboxNavigationAppDelegate.getMapboxNavigationOwner();
                mapboxNavigationOwner.getClass();
                if (mapboxNavigationOwner.services.remove(l3Var) && (mapboxNavigation = mapboxNavigationOwner.mapboxNavigation) != null) {
                    l3Var.onDetached(mapboxNavigation);
                }
                return createfromparcel;
            case 12:
                ((m7) obj).IconCompatParcelizer().cancel();
                return createfromparcel;
            case 13:
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = ((NafathModalFragment) obj).invalidateMenu;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
                    removeNodeAtDepth.serializer("viewModelProviderFactory");
                    throw null;
                }
                int i11 = serializer + 79;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    return r8lambdaudhhxliolpu0hpccqh6voskpny;
                }
                throw null;
            case 14:
                q4ExternalSyntheticLambda1 q4externalsyntheticlambda1 = (q4ExternalSyntheticLambda1) obj;
                pg pgVar = q4externalsyntheticlambda1.read;
                asComposePaint ascomposepaintIconCompatParcelizer = toBitmapConfig1JJdX4A.IconCompatParcelizer(q4externalsyntheticlambda1);
                CallTracer callTracer = pgVar.write;
                return new pb(ascomposepaintIconCompatParcelizer, (transferSessionPackageI) ((mergeJsonObjects) callTracer.RemoteActionCompatParcelizer).write(), (FormBody.Builder) ((newTransaction) callTracer.write).write(), new getQueryContext(), (setTransactionSuccessful) ((mergeJsonObjects) callTracer.serializer).write(), (H$b) ((q0) callTracer.IconCompatParcelizer).write());
            case 15:
                C$b c$b = (C$b) obj;
                return new u4((BrazeExternalSyntheticLambda28) c$b.serializer, (jsonStringToList) c$b.write);
            case 16:
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny2 = ((CalendarInformationFragment) obj).getNavigationEventDispatcher;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny2 != null) {
                    return r8lambdaudhhxliolpu0hpccqh6voskpny2;
                }
                removeNodeAtDepth.serializer("viewModelFactory");
                throw null;
            case 17:
                return HistoryDatabase_Impl.RemoteActionCompatParcelizer((HistoryDatabase_Impl) obj);
            case 18:
                updateLayerElements.RemoteActionCompatParcelizer((updateLayerElements) obj);
                return createfromparcel;
            case 19:
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny3 = ((OrderDetailsFragment) obj).onActivityResult;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny3 == null) {
                    removeNodeAtDepth.serializer("viewModelFactory");
                    throw null;
                }
                int i12 = serializer + 63;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                return r8lambdaudhhxliolpu0hpccqh6voskpny3;
            case 20:
                OverlayPermissionDialogFragment overlayPermissionDialogFragment = (OverlayPermissionDialogFragment) obj;
                accessexecute accessexecuteVarSerializer = overlayPermissionDialogFragment.serializer();
                String packageName = overlayPermissionDialogFragment.requireContext().getPackageName();
                packageName.getClass();
                ((MemoryCacheService) accessexecuteVarSerializer.MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper()).read.RemoteActionCompatParcelizer("DRAW_OVER_OTHER_APPS_REQUESTED_KEY", Boolean.TRUE);
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(accessexecuteVarSerializer), null, null, new OverlayPermissionViewModel$onDialogOpened$1(accessexecuteVarSerializer, objArr == true ? 1 : 0, z2 ? 1 : 0), 3);
                accessexecuteVarSerializer.read.serializer(new NetworkFetcher(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.fromParts("package", packageName, null))));
                return createfromparcel;
            case 21:
                accessdoFetch accessdofetch = (accessdoFetch) obj;
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, accessdofetch.MediaDescriptionCompat, accessdofetch.MediaMetadataCompat, 2038, 8, -3);
                layoutParams.gravity = 8388627;
                return layoutParams;
            case 22:
                Application application = ((gotOptOutResponseI) obj).RemoteActionCompatParcelizer;
                NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(application);
                notificationManagerCompatFrom.getClass();
                if (notificationManagerCompatFrom.getNotificationChannel("com.foodora.acknowledgment.push.notification") == null) {
                    String string = application.getString(com.logistics.rider.glovo.R.string.acknowledgment_notification_channel_title);
                    string.getClass();
                    NotificationChannel notificationChannel = new NotificationChannel("com.foodora.acknowledgment.push.notification", string, 2);
                    NotificationManagerCompat notificationManagerCompatFrom2 = NotificationManagerCompat.from(application);
                    notificationManagerCompatFrom2.getClass();
                    notificationManagerCompatFrom2.createNotificationChannel(notificationChannel);
                }
                getEnterdhqQ8s getenterdhqq8s = new getEnterdhqQ8s(application, "com.foodora.acknowledgment.push.notification");
                String string2 = application.getString(com.logistics.rider.glovo.R.string.acknowledgment_push_notification_title);
                string2.getClass();
                getenterdhqq8s.PlaybackStateCompatCustomAction = getEnterdhqQ8s.serializer((CharSequence) string2);
                String string3 = application.getString(com.logistics.rider.glovo.R.string.acknowledgment_push_notification_content);
                string3.getClass();
                getenterdhqq8s.MediaDescriptionCompat = getEnterdhqQ8s.serializer((CharSequence) string3);
                getenterdhqq8s.write(2, true);
                getenterdhqq8s.write(16, true);
                getenterdhqq8s.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.icon = com.logistics.rider.glovo.R.drawable.ic_bold_large_notification_roadrunner;
                Notification notificationWrite = getenterdhqq8s.write();
                notificationWrite.getClass();
                return notificationWrite;
            case 23:
                return Long.valueOf(Instant.now(((lambdaisEnabled9) obj).write).toEpochMilli());
            case 24:
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny4 = ((MessageDialogFragment) obj).getNavigationEventDispatcher;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny4 != null) {
                    return r8lambdaudhhxliolpu0hpccqh6voskpny4;
                }
                removeNodeAtDepth.serializer("viewModelProviderFactory");
                throw null;
            case 25:
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny5 = ((RecentDeliveriesFragment) obj).onActivityResult;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny5 == null) {
                    removeNodeAtDepth.serializer("viewModelFactory");
                    throw null;
                }
                int i14 = IconCompatParcelizer + 99;
                serializer = i14 % Fields.SpotShadowColor;
                if (i14 % 2 == 0) {
                    int i15 = 30 / 0;
                }
                return r8lambdaudhhxliolpu0hpccqh6voskpny5;
            case 26:
                removeGlobalCallbackParametersI removeglobalcallbackparametersi = (removeGlobalCallbackParametersI) obj;
                getBoolean getboolean2 = removeglobalcallbackparametersi.MediaSessionCompatResultReceiverWrapper;
                getBoolean getboolean3 = removeglobalcallbackparametersi.MediaBrowserCompatMediaItem;
                if (getboolean2.RemoteActionCompatParcelizer()) {
                    int i16 = serializer + 77;
                    IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                    if (i16 % 2 != 0) {
                        boolean zIconCompatParcelizer = getboolean2.IconCompatParcelizer();
                        int i17 = 28 / 0;
                        if (!zIconCompatParcelizer) {
                            if (removeglobalcallbackparametersi.ParcelableVolumeInfo && (!getboolean3.RemoteActionCompatParcelizer() || getboolean3.IconCompatParcelizer())) {
                            }
                        }
                    } else if (!getboolean2.IconCompatParcelizer()) {
                        if (removeglobalcallbackparametersi.ParcelableVolumeInfo) {
                        }
                    }
                    z4 = false;
                } else {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            case 27:
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((getFirstErrorCode) obj).write;
                firebaseRemoteConfigImpl.getClass();
                Boolean boolValueOf = Boolean.valueOf(firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_SENTIANCE_ADDITIONAL_LOG_ENABLED));
                int i18 = IconCompatParcelizer + 51;
                serializer = i18 % Fields.SpotShadowColor;
                if (i18 % 2 != 0) {
                    return boolValueOf;
                }
                (objArr2 == true ? 1 : 0).hashCode();
                throw null;
            case 28:
                SentianceGuard sentianceGuard = (SentianceGuard) ((RiderSafetyLifecycleManager) obj).MediaSessionCompatToken.write();
                getFirstErrorCode getfirsterrorcode = sentianceGuard.RemoteActionCompatParcelizer;
                if (!sentianceGuard.read()) {
                    Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                    forest.IconCompatParcelizer("Sentiance will be initialized sync", new Object[0]);
                    getfirsterrorcode.read("initialize");
                    Sentiance sentianceIconCompatParcelizer = sentianceGuard.IconCompatParcelizer();
                    isPreinstallTrackingEnabled ispreinstalltrackingenabled = sentianceGuard.MediaMetadataCompat;
                    SentianceOptions sentianceOptionsBuild = new SentianceOptions.Builder(ispreinstalltrackingenabled.write).setNotification(ispreinstalltrackingenabled.read.read(null), 104).build();
                    sentianceOptionsBuild.getClass();
                    InitializationResult initializationResultInitialize = sentianceIconCompatParcelizer.initialize(sentianceOptionsBuild);
                    initializationResultInitialize.getClass();
                    boolean zIsSuccessful = initializationResultInitialize.isSuccessful();
                    InitializationFailureReason failureReason = initializationResultInitialize.getFailureReason();
                    Throwable throwable = initializationResultInitialize.getThrowable();
                    if (zIsSuccessful) {
                        forest.IconCompatParcelizer("Sentiance initialized successfully", new Object[0]);
                        getfirsterrorcode.RemoteActionCompatParcelizer("initialize");
                    } else {
                        String strName = failureReason != null ? failureReason.name() : null;
                        if (strName != null) {
                            mapSingletonMap = Collections.singletonMap("reason", strName);
                            mapSingletonMap.getClass();
                        }
                        getfirsterrorcode.write("rider_safety_init_sdk_error", mapSingletonMap);
                        sentianceGuard.IconCompatParcelizer("Sentiance initialization failed: Reason: " + strName, throwable);
                        z3 = false;
                    }
                }
                return Boolean.valueOf(z3);
            default:
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny6 = ((RiderSafetyReportFragment) obj).getSavedStateRegistry;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny6 != null) {
                    return r8lambdaudhhxliolpu0hpccqh6voskpny6;
                }
                removeNodeAtDepth.serializer("viewModelProviderFactory");
                throw null;
        }
    }
}
