package com.foodora.courier.app.application;

import android.app.ActivityManager;
import android.app.Application;
import android.util.Base64;
import androidx.compose.ui.graphics.Fields;
import androidx.datastore.core.SimpleActor$offer$2;
import androidx.sqlite.SQLite;
import androidx.work.impl.WorkManagerImpl;
import coil3.ImageLoader$Builder;
import coil3.util.IntPair;
import com.deliveryhero.fwf_cache.UtilKt;
import com.deliveryhero.fwf_client.FwFClient;
import com.deliveryhero.fwf_client.FwFClientExtensionKt;
import com.deliveryhero.perseus.Consent;
import com.deliveryhero.perseus.Perseus;
import com.deliveryhero.perseus.PerseusApp;
import com.deliveryhero.perseus.logging.StandardLogger$$ExternalSyntheticLambda1;
import com.google.android.gms.dynamite.zzj;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import com.roadrunner.logger.crash.CriticalObservabilityExceptionTree;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.safety.lifecycle.RiderSafetyLifecycleManager;
import dagger.Lazy;
import fwfd.com.fwfsdk.util.FWFHelper;
import io.grpc.internal.SharedResourcePool;
import io.sentry.CombinedScopeView;
import io.sentry.SentryTracer$$ExternalSyntheticLambda1;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda6;
import io.sentry.android.core._init_lambda3;
import io.sentry.android.core.getOnBackPressedInput;
import io.sentry.okhttp.RemoteActionCompatParcelizer;
import io.sentry.util.MediaBrowserCompatMediaItem;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0;
import o.AddToCustomAttributeArrayStep;
import o.AndroidUiDispatcherCompanioncurrentThread1;
import o.AndroidUiFrameClock;
import o.BrazeCompanionExternalSyntheticLambda21;
import o.FlingCancellationException;
import o.ImageHeaderParserImageType;
import o.LottieAnimatableImplanimate21;
import o.Query;
import o.ShortNewsContentCardView;
import o.SuspendingTransacterImpl;
import o.SuspendingTransacterImpltransactionWithWrapper1;
import o.UriActionExternalSyntheticLambda4;
import o._get_messageWebView_lambda0;
import o.accessisMainThread;
import o.addListener;
import o.convertToHttps;
import o.createFromParcel;
import o.getActionViewIntentlambda0;
import o.getConnectivityType;
import o.getContentViewGroupParentLayout;
import o.getDefaultWidthD9Ej5fM;
import o.getEventParameters;
import o.getInstallBeginTimeInSeconds;
import o.getMessageImageView;
import o.getPathFillTypeRgk1Os;
import o.getQueryParameterslambda2;
import o.getRootInfoui;
import o.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION;
import o.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET;
import o.graphicsLayerpANQ8Wgdefault;
import o.hideCurrentlyDisplayingInAppMessage;
import o.internalHeightCallbacklambda0;
import o.isArgCountInBounds;
import o.isConsumed;
import o.isMainThread;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.prepareForActivityTransitionCarryover;
import o.queryResultsChanged;
import o.r8lambdaL2KhZ8WIdczgPrnf6hiwq8mR014;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.rd;
import o.removeListener;
import o.removeNodeAtDepth;
import o.sendAccessibilityEvent;
import o.setBrushui_text;
import o.setRoundRectOutlineTNW_H78default;
import o.speculativeHit;
import o.subscribeToBannersErrorslambda0;
import o.transactionWithResult;
import o.updateAdidI;
import okio.Path$Companion;
import org.koin.dsl.ModuleDSLKt;
import retrofit2.OkHttpCall$1;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CourierApplication$$ExternalSyntheticLambda2 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 0;
    private static byte serializer = -112;
    private static int write = 1;
    public final /* synthetic */ CourierApplication IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ CourierApplication$$ExternalSyntheticLambda2(CourierApplication courierApplication, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = courierApplication;
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ serializer);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        Object obj;
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        CourierApplication courierApplication = this.IconCompatParcelizer;
        int i3 = 23;
        int i4 = 3;
        int i5 = 1;
        int i6 = 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        switch (i2) {
            case 0:
                CourierApplication courierApplication2 = CourierApplication.write;
                return new getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION(new isMainThread(5), new ImageHeaderParserImageType(), new getActionViewIntentlambda0(), new FlingCancellationException(8), new ImageHeaderParserImageType(), new Path$Companion(), new getActionViewIntentlambda0(), new isMainThread(14), new AndroidUiDispatcherCompanioncurrentThread1(14), new AndroidUiFrameClock(), new getActionViewIntentlambda0(), new isMainThread(3), new AndroidUiDispatcherCompanioncurrentThread1(3), new setRoundRectOutlineTNW_H78default(0), new MediaBrowserCompatMediaItem(24), new AndroidUiDispatcherCompanioncurrentThread1(11), new getActionViewIntentlambda0(), new isMainThread(6), new getActionViewIntentlambda0(), new setBrushui_text(), new AndroidUiFrameClock(), new ImageHeaderParserImageType(), new MediaBrowserCompatMediaItem(20), new ImageHeaderParserImageType(), new Path$Companion(), new ImageHeaderParserImageType(), new MediaBrowserCompatMediaItem(16), new MediaBrowserCompatMediaItem(25), new Path$Companion(), new MediaBrowserCompatMediaItem(22), new sendAccessibilityEvent(), new getActionViewIntentlambda0(), new isMainThread(13), new Path$Companion(), new ImageHeaderParserImageType(), new MediaBrowserCompatMediaItem(15), new getActionViewIntentlambda0(), new AndroidUiDispatcherCompanioncurrentThread1(22), new AndroidUiDispatcherCompanioncurrentThread1(19), new AndroidUiFrameClock(), new isMainThread(7), new accessisMainThread(), new AndroidUiFrameClock(), new getActionViewIntentlambda0(), new speculativeHit(9), new AndroidUiDispatcherCompanioncurrentThread1(21), new BrazeCompanionExternalSyntheticLambda21(7), new AndroidUiFrameClock(), new r8lambdaL2KhZ8WIdczgPrnf6hiwq8mR014(), new AndroidUiFrameClock(), new ImageHeaderParserImageType(), new Path$Companion(), new AndroidUiDispatcherCompanioncurrentThread1(23), new AndroidUiFrameClock(), new ImageHeaderParserImageType(), new isMainThread(25), new MediaBrowserCompatMediaItem(26), new zzj(9), new AndroidUiFrameClock(), new AndroidUiDispatcherCompanioncurrentThread1(13), new convertToHttps(), new getEventParameters(), this.IconCompatParcelizer);
            case 1:
                r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = courierApplication.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
                if (r8lambdaktwlyipskq3tfa9ey3gatonixfq == null) {
                    removeNodeAtDepth.serializer("riderSafetyInitializer");
                    throw null;
                }
                int i7 = read + 61;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                ((RiderSafetyLifecycleManager) ((getInstallBeginTimeInSeconds) r8lambdaktwlyipskq3tfa9ey3gatonixfq.write())).RemoteActionCompatParcelizer();
                int i9 = read + 109;
                write = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    int i10 = 52 / 0;
                }
                return createfromparcel;
            case 2:
                Lazy lazy = courierApplication.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                if (lazy == null) {
                    removeNodeAtDepth.serializer("okHttpCallFactory");
                    throw null;
                }
                Object objWrite = lazy.write();
                objWrite.getClass();
                return (getMessageImageView) objWrite;
            case 3:
                CombinedScopeView combinedScopeView = courierApplication.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                if (combinedScopeView == null) {
                    removeNodeAtDepth.serializer("loggerInitializer");
                    throw null;
                }
                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                forest.write(new Query(i5));
                forest.write((CriticalObservabilityExceptionTree) combinedScopeView.write);
                if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) "v4.2634.5", (CharSequence) "PR#", true)) {
                    forest.write(new addListener(combinedScopeView));
                }
                forest.write(new Query(i6));
                CombinedScopeView combinedScopeView2 = (CombinedScopeView) combinedScopeView.read;
                queryResultsChanged queryresultschanged = new queryResultsChanged(combinedScopeView2);
                io.sentry.android.core.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = new io.sentry.android.core.MediaBrowserCompatMediaItem(0);
                try {
                    UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = getOnBackPressedInput.write.serializer();
                    try {
                        internalHeightCallbacklambda0.write(new isArgCountInBounds(), new ActivityLifecycleIntegration$$ExternalSyntheticLambda6(mediaBrowserCompatMediaItem, courierApplication, queryresultschanged));
                        AddToCustomAttributeArrayStep addToCustomAttributeArrayStepIconCompatParcelizer = internalHeightCallbacklambda0.IconCompatParcelizer();
                        if (_init_lambda3.IconCompatParcelizer()) {
                            if (addToCustomAttributeArrayStepIconCompatParcelizer.RemoteActionCompatParcelizer().isEnableAutoSessionTracking()) {
                                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                                addToCustomAttributeArrayStepIconCompatParcelizer.RemoteActionCompatParcelizer(new SentryTracer$$ExternalSyntheticLambda1(10, atomicBoolean));
                                if (!atomicBoolean.get()) {
                                    addToCustomAttributeArrayStepIconCompatParcelizer.MediaSessionCompatQueueItem();
                                }
                            }
                            addToCustomAttributeArrayStepIconCompatParcelizer.RemoteActionCompatParcelizer().getReplayController().RatingCompat();
                            break;
                        }
                        uriActionExternalSyntheticLambda4Serializer.close();
                        internalHeightCallbacklambda0.read(new queryResultsChanged(combinedScopeView2));
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (runningAppProcessInfo.importance != 100) {
                            return createfromparcel;
                        }
                        int i11 = write + 31;
                        read = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        ((getRootInfoui) ((removeListener) combinedScopeView2.read).write).serializer("app_start_to_interactive_sentry");
                        return createfromparcel;
                    } catch (Throwable th) {
                        try {
                            uriActionExternalSyntheticLambda4Serializer.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IllegalAccessException e) {
                    mediaBrowserCompatMediaItem.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.FATAL, "Fatal error during SentryAndroid.init(...)", e);
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Failed to initialize Sentry's SDK", e);
                    return null;
                } catch (InstantiationException e2) {
                    mediaBrowserCompatMediaItem.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.FATAL, "Fatal error during SentryAndroid.init(...)", e2);
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Failed to initialize Sentry's SDK", e2);
                    return null;
                } catch (NoSuchMethodException e3) {
                    mediaBrowserCompatMediaItem.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.FATAL, "Fatal error during SentryAndroid.init(...)", e3);
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Failed to initialize Sentry's SDK", e3);
                    return null;
                } catch (InvocationTargetException e4) {
                    mediaBrowserCompatMediaItem.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.FATAL, "Fatal error during SentryAndroid.init(...)", e4);
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Failed to initialize Sentry's SDK", e4);
                    return null;
                }
            case 4:
                OkHttpCall$1 okHttpCall$1 = courierApplication.addObserverForBackInvokerlambda0;
                if (okHttpCall$1 == null) {
                    removeNodeAtDepth.serializer("setupFunWithFlag");
                    throw null;
                }
                getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET getstyleable_vector_drawable_path_trim_path_offset = (getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET) okHttpCall$1.serializer;
                try {
                    FwFClientExtensionKt.getUser((FwFClient) okHttpCall$1.write).setAttributes(onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("platform", FWFHelper.fwfDeviceOS), new onViewAttachedToWindowlambda0("is_debug", Boolean.FALSE), new onViewAttachedToWindowlambda0("os_version", getstyleable_vector_drawable_path_trim_path_offset.serializer), new onViewAttachedToWindowlambda0("app_version", "v4.2634.5"), new onViewAttachedToWindowlambda0("app_build_number", 1312), new onViewAttachedToWindowlambda0("application_id", getstyleable_vector_drawable_path_trim_path_offset.write)));
                    break;
                } catch (Exception e5) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e5, "FwF Gen II: static attributes setup failed.", new Object[0]);
                }
                return createfromparcel;
            case 5:
                isConsumed isconsumed = courierApplication.fullyDrawnReporter_delegatelambda00;
                if (isconsumed == null) {
                    removeNodeAtDepth.serializer("workManagerInitializer");
                    throw null;
                }
                ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder();
                imageLoader$Builder.read = isconsumed.RemoteActionCompatParcelizer;
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                defaultScheduler.getClass();
                imageLoader$Builder.IconCompatParcelizer = defaultScheduler;
                imageLoader$Builder.RemoteActionCompatParcelizer = IntPair.write(DefaultIoScheduler.RemoteActionCompatParcelizer);
                imageLoader$Builder.serializer = IntPair.write(defaultScheduler);
                WorkManagerImpl.serializer(courierApplication, new graphicsLayerpANQ8Wgdefault(imageLoader$Builder));
                return createfromparcel;
            case 6:
                SuspendingTransacterImpl suspendingTransacterImpl = courierApplication.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                if (suspendingTransacterImpl == null) {
                    removeNodeAtDepth.serializer("perseusInitializer");
                    throw null;
                }
                transactionWithResult transactionwithresult = suspendingTransacterImpl.MediaSessionCompatQueueItem;
                RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = suspendingTransacterImpl.MediaBrowserCompatMediaItem.IconCompatParcelizer();
                transactionwithresult.getClass();
                int i13 = Perseus.serializer;
                PerseusApp.write.add(remoteActionCompatParcelizerIconCompatParcelizer);
                Application application = suspendingTransacterImpl.write;
                String basePath = Perseus.Environment.PRODUCTION.getBasePath();
                String str = suspendingTransacterImpl.serializer.write;
                Application application2 = suspendingTransacterImpl.RemoteActionCompatParcelizer.IconCompatParcelizer;
                String string = application2.getString(application2.getApplicationInfo().labelRes);
                if (string.startsWith("%('")) {
                    Object[] objArr = new Object[1];
                    a(string.substring(3), objArr);
                    string = ((String) objArr[0]).intern();
                }
                String str2 = string;
                str2.getClass();
                Perseus.Config config = new Perseus.Config("", str, str2, "v4.2634.5", null, null, "rider-app", false, basePath, 10, 30L, null, null, null, Consent.ESSENTIAL, null, false, String.valueOf(1312), null, null, null, null, 0L, 0L, 0L, null, 66959360, null);
                CompletableDeferredImpl completableDeferredImpl = transactionwithresult.RemoteActionCompatParcelizer;
                AtomicBoolean atomicBoolean2 = transactionwithresult.read;
                if (!atomicBoolean2.get()) {
                    try {
                        try {
                            Perseus.serializer(application, config);
                            completableDeferredImpl.MediaSessionCompatQueueItem(createfromparcel);
                        } catch (Exception e6) {
                            completableDeferredImpl.IconCompatParcelizer((Throwable) e6);
                        }
                        atomicBoolean2.set(true);
                    } catch (Throwable th3) {
                        atomicBoolean2.set(true);
                        throw th3;
                    }
                    break;
                }
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) suspendingTransacterImpl.MediaDescriptionCompat;
                String strSerializer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer.serializer();
                if (strSerializer != null && firebaseRemoteConfigImpl.IconCompatParcelizer.serializer(updateAdidI.IS_PERSEUS_EMPTY_VALUES_FIX_ENABLED.getFirebaseFlagName(), strSerializer)) {
                    getContentViewGroupParentLayout getcontentviewgroupparentlayout = suspendingTransacterImpl.IconCompatParcelizer;
                    DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new RiderStateRepositoryImpl.AnonymousClass1(suspendingTransacterImpl, shortNewsContentCardView, 28), 2);
                }
                StandardLogger$$ExternalSyntheticLambda1 standardLogger$$ExternalSyntheticLambda1 = new StandardLogger$$ExternalSyntheticLambda1(13);
                int i14 = Perseus.serializer;
                LinkedHashSet linkedHashSet = PerseusApp.write;
                r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = getPathFillTypeRgk1Os.RemoteActionCompatParcelizer().read;
                if (r8lambdalmkbrrgswwtv97obrsj7trj7ai != null) {
                    r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer = (ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -866125098, new Object[]{new getDefaultWidthD9Ej5fM[]{new getDefaultWidthD9Ej5fM(standardLogger$$ExternalSyntheticLambda1)}}, getQueryParameterslambda2.serializer(), 866125100, getQueryParameterslambda2.serializer());
                    int i15 = write + 99;
                    read = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                }
                PerseusApp.serializer.add(new SuspendingTransacterImpltransactionWithWrapper1(new PerseusInitializerImpl$$ExternalSyntheticLambda0(0, suspendingTransacterImpl)));
                MutableStateFlow mutableStateFlow = suspendingTransacterImpl.RatingCompat.serializer;
                do {
                    obj = mutableStateFlow.read();
                    ((Boolean) obj).getClass();
                } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, Boolean.TRUE));
                return createfromparcel;
            case 7:
                _get_messageWebView_lambda0 _get_messagewebview_lambda0 = courierApplication.MediaSessionCompatResultReceiverWrapper;
                if (_get_messagewebview_lambda0 == null) {
                    removeNodeAtDepth.serializer("initUserAttributes");
                    throw null;
                }
                AppEventInfoChangeHandler appEventInfoChangeHandler = (AppEventInfoChangeHandler) _get_messagewebview_lambda0.IconCompatParcelizer;
                Map mapSerializer = onMove.serializer(onMove.serializer(onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0(UtilKt.ENVIRONMENT_KEY, "production"), new onViewAttachedToWindowlambda0("app_build_number", 1312)), new onViewAttachedToWindowlambda0("installation_source", ((rd) ((SharedResourcePool) _get_messagewebview_lambda0.write).IconCompatParcelizer).IconCompatParcelizer())), ((LottieAnimatableImplanimate21) _get_messagewebview_lambda0.RemoteActionCompatParcelizer).read());
                Application application3 = ((subscribeToBannersErrorslambda0) _get_messagewebview_lambda0.serializer).IconCompatParcelizer;
                LinkedHashMap linkedHashMapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(mapSerializer, onMove.IconCompatParcelizer(new onViewAttachedToWindowlambda0("device_class", ModuleDSLKt.read(application3).toString()), new onViewAttachedToWindowlambda0("is_low_end_device", String.valueOf(ModuleDSLKt.RemoteActionCompatParcelizer(application3)))));
                getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET getstyleable_vector_drawable_path_trim_path_offset2 = (getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET) ((SharedResourcePool) _get_messagewebview_lambda0.read).IconCompatParcelizer;
                ((TraceTimeMeasurementWithPerformanceKit) appEventInfoChangeHandler.MediaMetadataCompat).read("asti_app_event_update_properties", new SealedClassSerializer$$ExternalSyntheticLambda0(appEventInfoChangeHandler, i4, onMove.RemoteActionCompatParcelizer(linkedHashMapRemoteActionCompatParcelizer, onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("analytics_key", getstyleable_vector_drawable_path_trim_path_offset2.RemoteActionCompatParcelizer), new onViewAttachedToWindowlambda0("analytics_value", getstyleable_vector_drawable_path_trim_path_offset2.read)))));
                return createfromparcel;
            case 8:
                InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = courierApplication.IconCompatParcelizer;
                if (initializeAppStartupItemsImpl == null) {
                    removeNodeAtDepth.serializer("adjustSdkInitializer");
                    throw null;
                }
                getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = (getContentViewGroupParentLayout) initializeAppStartupItemsImpl.serializer;
                DefaultScheduler defaultScheduler3 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new SimpleActor$offer$2(initializeAppStartupItemsImpl, courierApplication, shortNewsContentCardView, i3), 2);
                return createfromparcel;
            default:
                Lazy lazy2 = courierApplication.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                if (lazy2 == null) {
                    removeNodeAtDepth.serializer("riderStatusPollingScheduler");
                    throw null;
                }
                int i17 = write + 19;
                read = i17 % Fields.SpotShadowColor;
                if (i17 % 2 == 0) {
                    ((getConnectivityType) lazy2.write()).read();
                    return createfromparcel;
                }
                ((getConnectivityType) lazy2.write()).read();
                throw null;
        }
    }
}
