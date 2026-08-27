package com.braze;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import bo.app.a1;
import bo.app.a4;
import bo.app.a5;
import bo.app.a5$$ExternalSyntheticLambda4;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.bb$$ExternalSyntheticLambda0;
import bo.app.c1;
import bo.app.c8;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.cd;
import bo.app.d0;
import bo.app.d1;
import bo.app.d4;
import bo.app.d4$$ExternalSyntheticLambda2;
import bo.app.d8;
import bo.app.e8;
import bo.app.f;
import bo.app.f5;
import bo.app.fc;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.g;
import bo.app.g0;
import bo.app.g4;
import bo.app.g9;
import bo.app.h;
import bo.app.h$$ExternalSyntheticLambda0;
import bo.app.h2;
import bo.app.h2$$ExternalSyntheticLambda18;
import bo.app.ha;
import bo.app.hc;
import bo.app.hg$$ExternalSyntheticLambda1;
import bo.app.i0;
import bo.app.i5;
import bo.app.i9;
import bo.app.ig;
import bo.app.ig$$ExternalSyntheticLambda1;
import bo.app.ih;
import bo.app.k7$$ExternalSyntheticLambda9;
import bo.app.kc;
import bo.app.kh;
import bo.app.l$$ExternalSyntheticLambda2;
import bo.app.l5;
import bo.app.lh;
import bo.app.m1;
import bo.app.m1$$ExternalSyntheticLambda16;
import bo.app.m1$$ExternalSyntheticLambda20;
import bo.app.m1$$ExternalSyntheticLambda28;
import bo.app.m2;
import bo.app.n$$ExternalSyntheticLambda2;
import bo.app.n$$ExternalSyntheticLambda3;
import bo.app.n1;
import bo.app.nb;
import bo.app.o0;
import bo.app.o6$$ExternalSyntheticLambda15;
import bo.app.o8;
import bo.app.o9;
import bo.app.p0;
import bo.app.p9;
import bo.app.pg;
import bo.app.q$$ExternalSyntheticLambda1;
import bo.app.q0;
import bo.app.q4;
import bo.app.q8;
import bo.app.qc;
import bo.app.qe;
import bo.app.r0;
import bo.app.s0;
import bo.app.sb;
import bo.app.t0;
import bo.app.t1$$ExternalSyntheticLambda1;
import bo.app.u0;
import bo.app.u9;
import bo.app.v0;
import bo.app.v8;
import bo.app.w0;
import bo.app.w6;
import bo.app.w8$$ExternalSyntheticLambda1;
import bo.app.wa$$ExternalSyntheticLambda3;
import bo.app.we;
import bo.app.x0;
import bo.app.x1;
import bo.app.x9;
import bo.app.y0;
import bo.app.z0;
import bo.app.z4;
import bo.app.z7;
import bo.app.zc;
import com.braze.configuration.BrazeConfig;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.configuration.RuntimeAppConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DelayedInitializationAnalyticsBehavior;
import com.braze.enums.GeofenceTransitionType;
import com.braze.events.BannerDismissedEvent;
import com.braze.events.BannersUpdatedEvent;
import com.braze.events.BrazeNetworkFailureEvent;
import com.braze.events.BrazePushEvent;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.IFireOnceEventSubscriber;
import com.braze.events.IValueCallback;
import com.braze.events.InAppMessageEvent;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.events.SdkDataWipeEvent;
import com.braze.events.SessionStateChangedEvent;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.images.IBrazeImageLoader;
import com.braze.location.IBrazeGeofenceApi;
import com.braze.models.Banner;
import com.braze.models.FeatureFlag;
import com.braze.models.IBrazeLocation;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.models.recommended.ecommerce.CartUpdatedEvent;
import com.braze.models.recommended.ecommerce.CheckoutStartedEvent;
import com.braze.models.recommended.ecommerce.EcommerceEvent;
import com.braze.models.recommended.ecommerce.EcommerceProduct;
import com.braze.models.recommended.ecommerce.OrderPlacedEvent;
import com.braze.models.recommended.ecommerce.ProductViewedEvent;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.GeofenceDataStoreProvider;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.PermissionUtils;
import com.braze.support.StringUtils;
import com.braze.support.ValidationUtils;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.onContentCardClicked;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setCarryoverInAppMessage;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Braze implements IBraze {
    private static boolean areOutboundNetworkRequestsOffline;
    private static IBrazeNotificationFactory customBrazeNotificationFactory;
    private static a5 delayedInitializationProvider;
    private static o9 deviceDataProvider;
    private static IBrazeEndpointProvider endpointProvider;
    private static volatile Braze instance;
    private static qe sdkEnablementProvider;
    private static boolean shouldMockNetworkRequestsAndDropEvents;
    private static u9 staticExternalIEventMessenger;
    private Context applicationContext;
    private BrazeUser brazeUser;
    public BrazeConfigurationProvider configurationProvider;
    public p9 deviceIdProvider;
    private u9 externalIEventMessenger;
    private IBrazeImageLoader imageLoader;
    private Boolean isApiKeyPresent;
    private boolean isInstanceStopped;
    private nb offlineUserStorageProvider;
    public qc pushDeliveryManager;
    public x9 registrationDataProvider;
    public ha udm;
    public static final Companion Companion = new Companion(null);
    private static final ReentrantLock brazeClassLock = new ReentrantLock();
    private static final Set<String> KNOWN_APP_CRAWLER_DEVICE_MODELS = RangesKt.write((Object) "calypso appcrawler");
    private static final Set<String> NECESSARY_BRAZE_SDK_PERMISSIONS = onContentCardClicked.MediaSessionCompatQueueItem(new String[]{"android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET"});
    private static final ReentrantLock endpointProviderLock = new ReentrantLock();
    private static boolean shouldRequestFrameworkListenToNetworkUpdates = true;
    private static final List<BrazeConfig> pendingConfigurations = new ArrayList();
    private static final BrazeConfig clearConfigSentinel = new BrazeConfig.Builder().build();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getCustomBrazeNotificationFactory$annotations() {
        }

        public static /* synthetic */ void getDelayedInitializationProvider$android_sdk_base_release$annotations() {
        }

        public static /* synthetic */ void getDeviceDataProvider$android_sdk_base_release$annotations() {
        }

        public static /* synthetic */ void getOutboundNetworkRequestsOffline$annotations() {
        }

        public static /* synthetic */ void getSdkEnablementProvider$android_sdk_base_release$annotations() {
        }

        public static /* synthetic */ void getShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release$annotations() {
        }

        public static /* synthetic */ void getStaticExternalIEventMessenger$android_sdk_base_release$annotations() {
        }

        public static /* synthetic */ void isDelayedInitializationEnabled$annotations() {
        }

        public static /* synthetic */ void isDisabled$annotations() {
        }

        public static /* synthetic */ void isSdkDisabledOrDelayed$annotations() {
        }

        public final IBrazeNotificationFactory getCustomBrazeNotificationFactory() {
            return Braze.customBrazeNotificationFactory;
        }

        public final o9 getDeviceDataProvider$android_sdk_base_release() {
            return Braze.deviceDataProvider;
        }

        public final boolean getOutboundNetworkRequestsOffline() {
            return Braze.areOutboundNetworkRequestsOffline;
        }

        public final qe getSdkEnablementProvider$android_sdk_base_release() {
            return Braze.sdkEnablementProvider;
        }

        public final boolean getShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release() {
            return Braze.shouldRequestFrameworkListenToNetworkUpdates;
        }

        public final u9 getStaticExternalIEventMessenger$android_sdk_base_release() {
            return Braze.staticExternalIEventMessenger;
        }

        public final void setCustomBrazeNotificationFactory(IBrazeNotificationFactory iBrazeNotificationFactory) {
            Braze.customBrazeNotificationFactory = iBrazeNotificationFactory;
        }

        public final void setDelayedInitializationProvider$android_sdk_base_release(a5 a5Var) {
            Braze.delayedInitializationProvider = a5Var;
        }

        public final void setDeviceDataProvider$android_sdk_base_release(o9 o9Var) {
            Braze.deviceDataProvider = o9Var;
        }

        public final void setSdkEnablementProvider$android_sdk_base_release(qe qeVar) {
            Braze.sdkEnablementProvider = qeVar;
        }

        public final void setShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release(boolean z) {
            Braze.shouldRequestFrameworkListenToNetworkUpdates = z;
        }

        public final void setStaticExternalIEventMessenger$android_sdk_base_release(u9 u9Var) {
            Braze.staticExternalIEventMessenger = u9Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDelayedInitializationEnabled_$lambda$0() {
            return "DelayedInitializationProvider was null. Returning delayed initialization as disabled.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDelayedInitializationEnabled_$lambda$1() {
            return "Delayed initialization mode is enabled. Actions will not be performed on the SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDisabled_$lambda$0() {
            return "SDK enablement provider was null. Returning SDK as enabled.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDisabled_$lambda$1() {
            return "API key not present. Actions will not be performed on the SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDisabled_$lambda$2() {
            return "SDK is disabled. Actions will not be performed on the SDK.";
        }

        private final void clearDataStoreData(Context context) {
            try {
                DataStoreProvider.Companion.shutdownAllDataStores(context);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(9), 4, (Object) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String clearDataStoreData$lambda$0() {
            return "Failed to delete DataStore data for the Braze SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String clearInstance$lambda$0$0() {
            return "Clearing Braze instance";
        }

        private final void clearSharedPreferencesData(Context context) {
            try {
                File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
                if (file.exists() && file.isDirectory()) {
                    int i = 0;
                    File[] fileArrListFiles = file.listFiles(new Braze$Companion$$ExternalSyntheticLambda8(i));
                    if (fileArrListFiles != null) {
                        int length = fileArrListFiles.length;
                        while (i < length) {
                            File file2 = fileArrListFiles[i];
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.Companion, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new hg$$ExternalSyntheticLambda1(file2, 3), 6, (Object) null);
                            file2.getClass();
                            BrazeFileUtils.deleteSharedPreferencesFile(context, file2);
                            i++;
                        }
                    }
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda5(27), 4, (Object) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String clearSharedPreferencesData$lambda$2() {
            return "Failed to delete shared preference data for the Braze SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String configure$lambda$1$0() {
            return "Braze.configure() cannot be called while the singleton is still live.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String configure$lambda$1$1() {
            return "Braze.configure() called with a null config; Clearing all configuration values.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableDelayedInitialization$lambda$0() {
            return "Disabling delayed initialization.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableDelayedInitialization$lambda$1() {
            return "Enabling all network requests";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableSdk$lambda$0() {
            return "Stopping the SDK instance.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableSdk$lambda$1() {
            return "Disabling all network requests";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableSdk$lambda$2() {
            return "disableSdk has finished";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableDelayedInitialization$lambda$0() {
            return "Enabling delayed initialization.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableDelayedInitialization$lambda$1() {
            return "Stopping the SDK instance.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableDelayedInitialization$lambda$2() {
            return "Disabling all network requests";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableMockNetworkRequestsAndDropEventsMode$lambda$0$0() {
            return "Braze network requests already being mocked. Note that events dispatched in this mode are dropped.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableMockNetworkRequestsAndDropEventsMode$lambda$0$1() {
            return "Braze network requests will be mocked. Events dispatchedin this mode will be dropped.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableMockNetworkRequestsAndDropEventsMode$lambda$1() {
            return "Attempt to enable mocking Braze network requests had no effect since getInstance() has already been called.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableSdk$lambda$0() {
            return "Setting SDK to enabled.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableSdk$lambda$1() {
            return "Enabling all network requests";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getApiEndpoint$lambda$0$0$0() {
            return "Caught exception trying to get a Braze API endpoint from the BrazeEndpointProvider. Using the original URI";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getConfiguredApiKey$lambda$0() {
            return "Caught exception while retrieving API key.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInstance$lambda$0$0() {
            return "Created external messenger " + Braze.Companion.getStaticExternalIEventMessenger$android_sdk_base_release();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String requestTriggersIfInAppMessageTestPush$lambda$0() {
            return "Push contained key for fetching test triggers, fetching triggers.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String shouldAllowSingletonInitialization$lambda$0() {
            return "The instance is null. Allowing instance initialization";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String shouldAllowSingletonInitialization$lambda$1() {
            return "The instance was stopped. Allowing instance initialization";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String shouldAllowSingletonInitialization$lambda$2() {
            return "No API key was found previously. Allowing instance initialization";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$0() {
            return "Shutting down all queued work on the Braze SDK";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$1$0() {
            return "Sending sdk data wipe event to external subscribers";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$1$1() {
            return "Shutting down the singleton work queue";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$2() {
            return "Failed to shutdown queued work on the Braze SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String wipeData$lambda$0() {
            return "Failed to delete data from the internal storage cache.";
        }

        public final void setOutboundNetworkRequestsOffline(boolean z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a5$$ExternalSyntheticLambda4(z, 5), 6, (Object) null);
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                Braze.areOutboundNetworkRequestsOffline = z;
                Braze braze = Braze.instance;
                if (braze != null) {
                    braze.setSyncPolicyOfflineStatus(z);
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void stopInstance$android_sdk_base_release(boolean z) {
            try {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda5(28), 6, (Object) null);
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    BrazeCoroutineScope.cancelChildren();
                    Braze braze = Braze.instance;
                    if (braze != null) {
                        Companion companion = Braze.Companion;
                        BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda5(29), 6, (Object) null);
                        ((z7) braze.getExternalIEventMessenger$android_sdk_base_release()).b(new SdkDataWipeEvent(), SdkDataWipeEvent.class);
                        BrazeLogger.brazelog$default(brazeLogger, (Object) companion, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(1), 7, (Object) null);
                        we.a.a();
                        if (braze.udm != null) {
                            if (z) {
                                d4 d4Var = ((lh) braze.getUdm$android_sdk_base_release()).y;
                                d4Var.i.clear();
                                d4Var.h.clear();
                                o8 o8Var = ((lh) braze.getUdm$android_sdk_base_release()).w;
                                o8Var.getClass();
                                instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
                                o8Var.f = instance_delegatelambda0Var;
                                g0 g0Var = ((lh) braze.getUdm$android_sdk_base_release()).x;
                                g0Var.getClass();
                                g0Var.f = instance_delegatelambda0Var;
                            }
                            q4 q4Var = ((lh) braze.getUdm$android_sdk_base_release()).m;
                            synchronized (q4Var) {
                                q4Var.l = true;
                                q4Var.b();
                                q4Var.f();
                            }
                            c8 c8Var = ((lh) braze.getUdm$android_sdk_base_release()).f20o;
                            c8Var.b = true;
                            c8Var.a.c = true;
                            ((lh) braze.getUdm$android_sdk_base_release()).u.unregisterGeofences();
                        }
                        braze.getImageLoader().shutdown();
                        braze.isInstanceStopped = true;
                    }
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(2), 4, (Object) null);
            }
        }

        public final void addSdkMetadata(Context context, EnumSet<BrazeSdkMetadata> enumSet) {
            context.getClass();
            enumSet.getClass();
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                try {
                    Braze.pendingConfigurations.add(new BrazeConfig.Builder().setSdkMetadata(enumSet).build());
                    Braze braze = Braze.instance;
                    if (braze != null) {
                        braze.applyPendingRuntimeConfiguration$android_sdk_base_release();
                    }
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.Companion, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda0(29, enumSet), 4, (Object) null);
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean configure(Context context, BrazeConfig brazeConfig) {
            context.getClass();
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.I;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$Companion$$ExternalSyntheticLambda21(brazeConfig, 0), 6, (Object) null);
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                Braze braze = Braze.instance;
                if (braze != null && !braze.isInstanceStopped && Boolean.TRUE.equals(braze.isApiKeyPresent$android_sdk_base_release())) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) Braze.Companion, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(5), 6, (Object) null);
                    return false;
                }
                if (brazeConfig != null) {
                    Braze.pendingConfigurations.add(brazeConfig);
                } else {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) Braze.Companion, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(6), 6, (Object) null);
                    Braze.pendingConfigurations.add(Braze.clearConfigSentinel);
                }
                return true;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void disableDelayedInitialization(Context context) {
            context.getClass();
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.W;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(13), 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(14), 6, (Object) null);
            setOutboundNetworkRequestsOffline(false);
            a5 delayedInitializationProvider$android_sdk_base_release = getDelayedInitializationProvider$android_sdk_base_release(context);
            delayedInitializationProvider$android_sdk_base_release.b(false);
            delayedInitializationProvider$android_sdk_base_release.a.writeData(DataStoreKey.DELAYED_INIT_SET_DURING_RUNTIME_FLAG, Boolean.TRUE);
            Braze braze = Braze.instance;
            if (braze != null) {
                braze.safeCallFlushDelayedInitPushAnalyticsQueue();
            }
        }

        public final void disableSdk(Context context) {
            context.getClass();
            getSdkEnablementProvider(context).b(true);
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.W;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(15), 6, (Object) null);
            stopInstance$android_sdk_base_release(false);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(16), 6, (Object) null);
            setOutboundNetworkRequestsOffline(true);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(17), 6, (Object) null);
        }

        public final void enableDelayedInitialization(Context context, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) {
            context.getClass();
            delayedInitializationAnalyticsBehavior.getClass();
            int i = 1;
            try {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.W;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda5(26), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(3), 6, (Object) null);
                stopInstance$android_sdk_base_release(false);
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(7), 6, (Object) null);
                setOutboundNetworkRequestsOffline(true);
                getDelayedInitializationProvider$android_sdk_base_release(context).b(delayedInitializationAnalyticsBehavior);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda28(i, delayedInitializationAnalyticsBehavior), 4, (Object) null);
            }
        }

        public final void enableSdk(Context context) {
            context.getClass();
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.W;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(10), 6, (Object) null);
            getSdkEnablementProvider(context).b(false);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(11), 6, (Object) null);
            setOutboundNetworkRequestsOffline(false);
        }

        public final Uri getApiEndpoint(Uri uri) {
            uri.getClass();
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                IBrazeEndpointProvider iBrazeEndpointProvider = Braze.endpointProvider;
                if (iBrazeEndpointProvider != null) {
                    try {
                        Uri apiEndpoint = iBrazeEndpointProvider.getApiEndpoint(uri);
                        if (apiEndpoint != null) {
                            reentrantLock.unlock();
                            return apiEndpoint;
                        }
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.Companion, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda45(21), 4, (Object) null);
                    }
                }
                reentrantLock.unlock();
                return uri;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        public final String getConfiguredApiKey(BrazeConfigurationProvider brazeConfigurationProvider) {
            brazeConfigurationProvider.getClass();
            try {
                return brazeConfigurationProvider.getBrazeApiKey().a;
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda45(22), 4, (Object) null);
                return null;
            }
        }

        public final a5 getDelayedInitializationProvider$android_sdk_base_release(Context context) {
            context.getClass();
            a5 delayedInitializationProvider$android_sdk_base_release = getDelayedInitializationProvider$android_sdk_base_release();
            if (delayedInitializationProvider$android_sdk_base_release != null) {
                return delayedInitializationProvider$android_sdk_base_release;
            }
            a5 a5Var = new a5(context);
            setDelayedInitializationProvider$android_sdk_base_release(a5Var);
            return a5Var;
        }

        public final Braze getInstance(Context context) {
            context.getClass();
            if (shouldAllowSingletonInitialization()) {
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    Companion companion = Braze.Companion;
                    if (companion.shouldAllowSingletonInitialization()) {
                        if (companion.getStaticExternalIEventMessenger$android_sdk_base_release() == null) {
                            companion.setStaticExternalIEventMessenger$android_sdk_base_release(new z7(new qe(context), new a5(context), false));
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) companion, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda45(12), 6, (Object) null);
                        }
                        Braze braze = new Braze(context);
                        braze.isInstanceStopped = false;
                        Braze.instance = braze;
                        reentrantLock.unlock();
                        return braze;
                    }
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            Braze braze2 = Braze.instance;
            braze2.getClass();
            return braze2;
        }

        public final void requestTriggersIfInAppMessageTestPush$android_sdk_base_release(Intent intent, i9 i9Var) {
            intent.getClass();
            i9Var.getClass();
            String stringExtra = intent.getStringExtra(Constants.BRAZE_PUSH_FETCH_TEST_TRIGGERS_KEY);
            if (stringExtra == null || !stringExtra.equals("true")) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(12), 6, (Object) null);
            sb sbVar = new sb();
            sbVar.b = Boolean.TRUE;
            ((h2) i9Var).a(sbVar);
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _set_outboundNetworkRequestsOffline_$lambda$0(boolean z) {
            String str;
            if (z) {
                str = "disabled";
            } else {
                str = FeatureFlag.ENABLED;
            }
            return "Braze SDK outbound network requests are now ".concat(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String addSdkMetadata$lambda$0$0(EnumSet enumSet) {
            return "Failed to add SDK Metadata of: " + enumSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String configure$lambda$0(BrazeConfig brazeConfig) {
            return "Braze.configure() called with configuration: " + brazeConfig;
        }

        public static /* synthetic */ void enableDelayedInitialization$default(Companion companion, Context context, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior, int i, Object obj) {
            if ((i & 2) != 0) {
                delayedInitializationAnalyticsBehavior = DelayedInitializationAnalyticsBehavior.QUEUE;
            }
            companion.enableDelayedInitialization(context, delayedInitializationAnalyticsBehavior);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableDelayedInitialization$lambda$3(DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) {
            return "Failed to enable delayed initialization for behavior " + delayedInitializationAnalyticsBehavior;
        }

        public final void clearEndpointProvider() {
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                Braze.endpointProvider = null;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void clearInstance$android_sdk_base_release() {
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                Braze braze = Braze.instance;
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                Companion companion = Braze.Companion;
                BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(4), 6, (Object) null);
                BrazeCoroutineScope.cancelChildren();
                if (braze != null && braze.udm != null) {
                    ((lh) braze.getUdm$android_sdk_base_release()).m.i();
                }
                Braze.instance = null;
                Braze.shouldMockNetworkRequestsAndDropEvents = false;
                Braze.areOutboundNetworkRequestsOffline = false;
                companion.setSdkEnablementProvider$android_sdk_base_release(null);
                Braze.endpointProvider = null;
                companion.setShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release(true);
                companion.setStaticExternalIEventMessenger$android_sdk_base_release(null);
                companion.setDelayedInitializationProvider$android_sdk_base_release(null);
                d0 d0Var = g0.i;
                d0.c();
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void setConfiguredCustomEndpoint$android_sdk_base_release(String str) {
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                Braze.Companion.setEndpointProvider(new Braze$Companion$$ExternalSyntheticLambda4(str, 0));
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void setEndpointProvider(IBrazeEndpointProvider iBrazeEndpointProvider) {
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                Braze.endpointProvider = iBrazeEndpointProvider;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void wipeData(Context context) {
            context.getClass();
            stopInstance$android_sdk_base_release(true);
            try {
                ig.e.a(context);
                DefaultBrazeImageLoader.Companion.a(context);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(8), 4, (Object) null);
            }
            clearSharedPreferencesData(context);
            clearDataStoreData(context);
            setSdkEnablementProvider$android_sdk_base_release(null);
            setDelayedInitializationProvider$android_sdk_base_release(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean clearSharedPreferencesData$lambda$0(File file, String str) {
            str.getClass();
            if (!setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, DataStoreProvider.PERSISTENT_DATASTORE_PREFIX, false)) {
                if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "com.appboy", false) && !str.equals("com.appboy.override.configuration.cache")) {
                    return true;
                }
                if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, DataStoreProvider.BRAZE_DATASTORE_PREFIX, false) && !str.equals("com.braze.override.configuration.cache")) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String clearSharedPreferencesData$lambda$1$0(File file) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Deleting shared prefs file at: ", file.getAbsolutePath());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Uri setConfiguredCustomEndpoint$lambda$0$0(String str, Uri uri) {
            String authority;
            uri.getClass();
            Uri uri2 = str != null ? Uri.parse(str) : null;
            String scheme = uri2 != null ? uri2.getScheme() : null;
            boolean z = scheme == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) scheme) || (authority = uri2.getAuthority()) == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) authority);
            Uri.Builder builder = new Uri.Builder();
            if (z || uri2.getScheme() == null) {
                builder.scheme(uri.getScheme());
            } else {
                builder.scheme(uri2.getScheme());
            }
            if (z) {
                builder.encodedAuthority(str);
            } else if (uri2.getEncodedAuthority() != null) {
                builder.encodedAuthority(uri2.getEncodedAuthority());
            } else {
                builder.encodedAuthority(uri.getEncodedAuthority());
            }
            if (z || uri2.getPath() == null) {
                builder.path(uri.getPath());
            } else {
                builder.path(uri2.getPath() + uri.getPath());
            }
            return builder.build();
        }

        public final boolean enableMockNetworkRequestsAndDropEventsMode() {
            if (Braze.instance == null) {
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    if (Braze.instance == null) {
                        if (Braze.shouldMockNetworkRequestsAndDropEvents) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.Companion, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(18), 6, (Object) null);
                        } else {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.Companion, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(19), 6, (Object) null);
                            Braze.shouldMockNetworkRequestsAndDropEvents = true;
                        }
                        reentrantLock.unlock();
                        return true;
                    }
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(20), 6, (Object) null);
            return false;
        }

        public final boolean isDelayedInitializationEnabled() {
            a5 delayedInitializationProvider$android_sdk_base_release = getDelayedInitializationProvider$android_sdk_base_release();
            if (delayedInitializationProvider$android_sdk_base_release == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda45(13), 7, (Object) null);
                return false;
            }
            boolean zC = delayedInitializationProvider$android_sdk_base_release.c();
            if (zC) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda45(14), 6, (Object) null);
            }
            return zC;
        }

        public final boolean isDisabled() {
            qe sdkEnablementProvider$android_sdk_base_release = getSdkEnablementProvider$android_sdk_base_release();
            if (sdkEnablementProvider$android_sdk_base_release == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda45(15), 7, (Object) null);
                return false;
            }
            Braze braze = Braze.instance;
            if (braze != null && Boolean.FALSE.equals(braze.isApiKeyPresent$android_sdk_base_release())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda45(16), 6, (Object) null);
                return true;
            }
            boolean zA = sdkEnablementProvider$android_sdk_base_release.a();
            if (zA) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda45(17), 6, (Object) null);
            }
            return zA;
        }

        public final boolean isSdkDisabledOrDelayed() {
            return isDisabled() || isDelayedInitializationEnabled();
        }

        private final boolean shouldAllowSingletonInitialization() {
            Braze braze = Braze.instance;
            if (braze == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda45(18), 6, (Object) null);
                return true;
            }
            if (braze.isInstanceStopped) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda45(19), 7, (Object) null);
                return true;
            }
            if (!Boolean.FALSE.equals(braze.isApiKeyPresent$android_sdk_base_release())) {
                return false;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda45(20), 7, (Object) null);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final qe getSdkEnablementProvider(Context context) {
            qe sdkEnablementProvider$android_sdk_base_release = getSdkEnablementProvider$android_sdk_base_release();
            if (sdkEnablementProvider$android_sdk_base_release != null) {
                return sdkEnablementProvider$android_sdk_base_release;
            }
            qe qeVar = new qe(context);
            setSdkEnablementProvider$android_sdk_base_release(qeVar);
            return qeVar;
        }

        public final a5 getDelayedInitializationProvider$android_sdk_base_release() {
            return Braze.delayedInitializationProvider;
        }
    }

    public static /* synthetic */ void getConfigurationProvider$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getDeviceIdProvider$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getExternalIEventMessenger$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getPushDeliveryManager$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getRegistrationDataProvider$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getUdm$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void isApiKeyPresent$android_sdk_base_release$annotations() {
    }

    public final u9 getExternalIEventMessenger$android_sdk_base_release() {
        return this.externalIEventMessenger;
    }

    @Override // com.braze.IBraze
    public IBrazeImageLoader getImageLoader() {
        return this.imageLoader;
    }

    public final Boolean isApiKeyPresent$android_sdk_base_release() {
        return this.isApiKeyPresent;
    }

    public final void setApiKeyPresent$android_sdk_base_release(Boolean bool) {
        this.isApiKeyPresent = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_cachedContentCardsUpdatedEvent_$lambda$0() {
        return "Failed to retrieve the cached ContentCardsUpdatedEvent.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_currentUser_$lambda$0() {
        return "Failed to retrieve the current user.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_deviceId_$lambda$0() {
        return "Failed to retrieve the device id.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_registeredPushToken_$lambda$0() {
        return "Failed to get the registered push registration token.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0() {
        return "Braze SDK Initializing";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$2() {
        return "Failed to perform initial Braze singleton setup.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to set the push token ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel _set_registeredPushToken_$lambda$1(Braze braze, String str) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.I;
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda14(str, 0), 6, (Object) null);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (str == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(3), 6, (Object) null);
            return createfromparcel;
        }
        Object[] objArr = {((cd) braze.getRegistrationDataProvider$android_sdk_base_release()).b(), str};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda14(str, 1), 6, (Object) null);
            return createfromparcel;
        }
        ((cd) braze.getRegistrationDataProvider$android_sdk_base_release()).a(str);
        f5 f5Var = ((lh) braze.getUdm$android_sdk_base_release()).h;
        if (f5Var == null) {
            removeNodeAtDepth.serializer("deviceCache");
            throw null;
        }
        f5Var.e();
        braze.requestImmediateDataFlush();
        return createfromparcel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$1$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Push token registered: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$1$1() {
        return "Push token must not be null or blank. Not registering for push with Braze.";
    }

    public static final void addSdkMetadata(Context context, EnumSet<BrazeSdkMetadata> enumSet) {
        Companion.addSdkMetadata(context, enumSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addSingleSynchronousSubscription$lambda$0(Class cls) {
        return c8$$ExternalSyntheticOutline0.m(cls, "Failed to add synchronous subscriber for class: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel addSingleSynchronousSubscription$lambda$1(Braze braze, Class cls, IEventSubscriber iEventSubscriber) {
        ((z7) braze.externalIEventMessenger).c(cls, iEventSubscriber);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyPendingRuntimeConfiguration$lambda$0$0() {
        return "Applying any pending runtime configuration values";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyPendingRuntimeConfiguration$lambda$0$1() {
        return "Clearing config values";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String areCachedContentCardsStale$lambda$0() {
        return "The ContentCardsUpdatedEvent was null. Returning false for stale check.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to set external id to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$1$1(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Rejected user id with byte length longer than 997. Not changing user. Input user id: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$1$3(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Set sdk auth signature on changeUser call: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$1$5(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Set sdk auth signature on changeUser call: ", str);
    }

    public static final void clearEndpointProvider() {
        Companion.clearEndpointProvider();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeSession$lambda$0() {
        return "Cannot close session with null activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeSession$lambda$1() {
        return "Failed to close session.";
    }

    public static final boolean configure(Context context, BrazeConfig brazeConfig) {
        return Companion.configure(context, brazeConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteRegisteredGeofenceCache$lambda$0() {
        return "Failed to delete registered geofence cache.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel deleteRegisteredGeofenceCache$lambda$1(Braze braze) {
        GeofenceDataStoreProvider geofenceDataStoreProvider = ((lh) braze.getUdm$android_sdk_base_release()).u.getGeofenceDataStoreProvider();
        IBrazeGeofenceApi iBrazeGeofenceApi = new x1(geofenceDataStoreProvider).b;
        if (iBrazeGeofenceApi != null) {
            iBrazeGeofenceApi.deleteRegisteredGeofenceCache(geofenceDataStoreProvider);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deserializeContentCard$lambda$0() {
        return "Cannot deserialize null content card json string. Returning null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deserializeContentCard$lambda$1(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to deserialize content card json string. Payload: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deserializeContentCard$lambda$2(JSONObject jSONObject) {
        return af$$ExternalSyntheticOutline1.m("Failed to deserialize content card json. Payload: ", jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deserializeInAppMessageString$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to deserialize in-app message json. Payload: ", str);
    }

    public static final void disableDelayedInitialization(Context context) {
        Companion.disableDelayedInitialization(context);
    }

    public static final void disableSdk(Context context) {
        Companion.disableSdk(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel dismissBanner$lambda$1(Braze braze, String str) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w8$$ExternalSyntheticLambda1(str, 18), 6, (Object) null);
        Banner bannerA = ((lh) braze.getUdm$android_sdk_base_release()).x.a(str);
        if (bannerA != null) {
            ((lh) braze.getUdm$android_sdk_base_release()).x.a(bannerA);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String dismissBanner$lambda$1$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Banner dismiss requested. placementId=", str);
    }

    public static final void enableDelayedInitialization(Context context, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) {
        Companion.enableDelayedInitialization(context, delayedInitializationAnalyticsBehavior);
    }

    public static final boolean enableMockNetworkRequestsAndDropEventsMode() {
        return Companion.enableMockNetworkRequestsAndDropEventsMode();
    }

    public static final void enableSdk(Context context) {
        Companion.enableSdk(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getAllFeatureFlags$lambda$0() {
        return "Failed to get all feature flags";
    }

    public static final Uri getApiEndpoint(Uri uri) {
        return Companion.getApiEndpoint(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBanner$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to get Banner ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCachedContentCards$lambda$0() {
        return "The ContentCardsUpdatedEvent was null. Returning null for the list of cached cards.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getConfigurationProviderSafe$lambda$0() {
        return "ConfigurationProvider has not been initialized. Constructing a new one.";
    }

    public static final String getConfiguredApiKey(BrazeConfigurationProvider brazeConfigurationProvider) {
        return Companion.getConfiguredApiKey(brazeConfigurationProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getContentCardCount$lambda$0() {
        return "The ContentCardsUpdatedEvent was null. Returning the default value for the card count.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getContentCardUnviewedCount$lambda$0() {
        return "The ContentCardsUpdatedEvent was null. Returning the default value for the unviewed card count.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getContentCardsLastUpdatedInSecondsFromEpoch$lambda$0() {
        return "The ContentCardsUpdatedEvent was null. Returning the default value for the last update timestamp.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCurrentUser$lambda$0() {
        return "Failed to retrieve the current user.";
    }

    public static final IBrazeNotificationFactory getCustomBrazeNotificationFactory() {
        return Companion.getCustomBrazeNotificationFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDeviceIdAsync$lambda$0() {
        return "Failed to retrieve the current device id.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getFeatureFlag$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to get feature flag ", str);
    }

    public static final Braze getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public static final boolean getOutboundNetworkRequestsOffline() {
        return Companion.getOutboundNetworkRequestsOffline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleInAppMessageTestPush$lambda$0() {
        return "Error handling test in-app message push";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel handleInAppMessageTestPush$lambda$1(Intent intent, Braze braze) {
        Companion.requestTriggersIfInAppMessageTestPush$android_sdk_base_release(intent, ((lh) braze.getUdm$android_sdk_base_release()).t);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleInternalBannerRefresh$lambda$0() {
        return "Error handling banner push refresh";
    }

    public static final boolean isDelayedInitializationEnabled() {
        return Companion.isDelayedInitializationEnabled();
    }

    public static final boolean isDisabled() {
        return Companion.isDisabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isEphemeralEventKey$lambda$0() {
        return "Ephemeral events enabled";
    }

    public static final boolean isSdkDisabledOrDelayed() {
        return Companion.isSdkDisabledOrDelayed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$1$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Device build model matches a known crawler. Enabling mock network request mode. Device it: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$0() {
        return "***************************************************************************************";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$1() {
        return "**                                                                                   **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$10() {
        return "***************************************************************************************";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$11() {
        return "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$13() {
        return "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$14() {
        return "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$15() {
        return "Amazon Device Messaging found. Setting up Amazon Device Messaging";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$16() {
        return "ADM manifest requirements not met. Braze will not register for ADM.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$17() {
        return "Automatic ADM registration not enabled in configuration. Braze will not register for ADM.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$18() {
        return "Failed to setup pre SDK tasks";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$19() {
        return "Starting up a new user dependency manager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$2() {
        return "**                                   !! WARNING !!                                   **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$20() {
        return "Finished UserDependencyManager creation.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$21() {
        return "Failed to startup user dependency manager.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$22() {
        return "Finished singleton setup.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$3() {
        return "**                                                                                   **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$4() {
        return "**                       You are using a Braze REST API endpoint                     **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$5() {
        return "**                             instead of an SDK endpoint                            **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$6() {
        return "**                Replace \"rest\" with \"sdk\" in your configuration                    **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$7() {
        return "**                                        See                                        **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$8() {
        return "**  https://www.braze.com/docs/user_guide/administrative/access_braze/sdk_endpoints  **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$9() {
        return "**                                                                                   **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to log custom event: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel logCustomEvent$lambda$1(Braze braze, String str, BrazeProperties brazeProperties, BrazeProperties brazeProperties2) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        int i = 1;
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new m1$$ExternalSyntheticLambda20(str, brazeProperties2, i), 6, (Object) null);
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        createinappmessageeventsubscriber.IconCompatParcelizer = str;
        boolean zIsValidLogCustomEventInput = ValidationUtils.isValidLogCustomEventInput(str, ((lh) braze.getUdm$android_sdk_base_release()).j);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (!zIsValidLogCustomEventInput) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda75(createinappmessageeventsubscriber, 0), 6, (Object) null);
            return createfromparcel;
        }
        if (brazeProperties != null && brazeProperties.isInvalid()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda75(createinappmessageeventsubscriber, i), 6, (Object) null);
            return createfromparcel;
        }
        String strEnsureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength((String) createinappmessageeventsubscriber.IconCompatParcelizer);
        createinappmessageeventsubscriber.IconCompatParcelizer = strEnsureBrazeFieldLength;
        g9 g9VarA = n1.g.a(strEnsureBrazeFieldLength, brazeProperties);
        if (g9VarA == null) {
            return createfromparcel;
        }
        int i2 = 2;
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new m1$$ExternalSyntheticLambda20(str, brazeProperties2, i2), 6, (Object) null);
        if (braze.isEphemeralEventKey((String) createinappmessageeventsubscriber.IconCompatParcelizer) ? ((lh) braze.getUdm$android_sdk_base_release()).j.I() : ((lh) braze.getUdm$android_sdk_base_release()).t.a(g9VarA)) {
            ((lh) braze.getUdm$android_sdk_base_release()).B.a((pg) new g4((String) createinappmessageeventsubscriber.IconCompatParcelizer, brazeProperties, g9VarA));
            return createfromparcel;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda75(createinappmessageeventsubscriber, i2), 6, (Object) null);
        return createfromparcel;
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    public static final createFromParcel logEcommerceEvent$lambda$1(EcommerceEvent ecommerceEvent, Braze braze) throws JSONException {
        ecommerceEvent.getClass();
        BrazeProperties brazeProperties = new BrazeProperties();
        brazeProperties.addProperty("currency", ecommerceEvent.getCurrency());
        brazeProperties.addProperty("source", ecommerceEvent.getSource());
        boolean z = ecommerceEvent instanceof ProductViewedEvent;
        if (!z) {
            Double totalValue = ecommerceEvent.getTotalValue();
            if (totalValue != null) {
                brazeProperties.addProperty("total_value", Double.valueOf(totalValue.doubleValue()));
            }
            List<EcommerceProduct> products = ecommerceEvent.getProducts();
            JSONArray jSONArray = new JSONArray();
            Iterator<EcommerceProduct> it = products.iterator();
            while (it.hasNext()) {
                EcommerceProduct next = it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("product_id", next.getProductId());
                jSONObject.put("product_name", next.getProductName());
                jSONObject.put("variant_id", next.getVariantId());
                jSONObject.put("price", next.getPrice());
                Iterator<EcommerceProduct> it2 = it;
                jSONObject.put("quantity", next.getQuantity());
                String imageUrl = next.getImageUrl();
                if (imageUrl != null) {
                    jSONObject.put("image_url", imageUrl);
                }
                String productUrl = next.getProductUrl();
                if (productUrl != null) {
                    jSONObject.put("product_url", productUrl);
                }
                BrazeProperties metadata = next.getMetadata();
                if (metadata != null) {
                    jSONObject.put("metadata", metadata.forJsonPut());
                }
                jSONArray.put(jSONObject);
                it = it2;
            }
            brazeProperties.addProperty("products", jSONArray);
            BrazeProperties metadata2 = ecommerceEvent.getMetadata();
            if (metadata2 != null) {
                brazeProperties.addProperty("metadata", metadata2.forJsonPut());
            }
        }
        if (ecommerceEvent instanceof CheckoutStartedEvent) {
            CheckoutStartedEvent checkoutStartedEvent = (CheckoutStartedEvent) ecommerceEvent;
            brazeProperties.addProperty("checkout_id", checkoutStartedEvent.getCheckoutId());
            Object cartId = checkoutStartedEvent.getCartId();
            if (cartId != null) {
                brazeProperties.addProperty("cart_id", cartId);
            }
        } else if (ecommerceEvent instanceof CartUpdatedEvent) {
            CartUpdatedEvent cartUpdatedEvent = (CartUpdatedEvent) ecommerceEvent;
            brazeProperties.addProperty("cart_id", cartUpdatedEvent.getCartId());
            brazeProperties.addProperty("action", cartUpdatedEvent.getAction().getWireValue());
        } else if (ecommerceEvent instanceof OrderPlacedEvent) {
            OrderPlacedEvent orderPlacedEvent = (OrderPlacedEvent) ecommerceEvent;
            brazeProperties.addProperty("order_id", orderPlacedEvent.getOrderId());
            Object cartId2 = orderPlacedEvent.getCartId();
            if (cartId2 != null) {
                brazeProperties.addProperty("cart_id", cartId2);
            }
            Double totalDiscounts = orderPlacedEvent.getTotalDiscounts();
            if (totalDiscounts != null) {
                brazeProperties.addProperty("total_discounts", Double.valueOf(totalDiscounts.doubleValue()));
            }
            List<Object> discounts = orderPlacedEvent.getDiscounts();
            if (discounts != null) {
                brazeProperties.addProperty("discounts", new JSONArray((Collection) discounts));
            }
        } else if (z) {
            EcommerceProduct ecommerceProduct = ecommerceEvent.getProducts().get(0);
            brazeProperties.addProperty("product_id", ecommerceProduct.getProductId());
            brazeProperties.addProperty("product_name", ecommerceProduct.getProductName());
            brazeProperties.addProperty("variant_id", ecommerceProduct.getVariantId());
            brazeProperties.addProperty("price", Double.valueOf(ecommerceProduct.getPrice()));
            Object imageUrl2 = ecommerceProduct.getImageUrl();
            if (imageUrl2 != null) {
                brazeProperties.addProperty("image_url", imageUrl2);
            }
            Object productUrl2 = ecommerceProduct.getProductUrl();
            if (productUrl2 != null) {
                brazeProperties.addProperty("product_url", productUrl2);
            }
            BrazeProperties metadata3 = ecommerceProduct.getMetadata();
            if (metadata3 != null) {
                brazeProperties.addProperty("metadata", metadata3.forJsonPut());
            }
        }
        boolean zIsInvalid = brazeProperties.isInvalid();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (zIsInvalid) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda17(ecommerceEvent, 1), 6, (Object) null);
            return createfromparcel;
        }
        g9 g9VarA = n1.g.a(ecommerceEvent.getEventName(), brazeProperties);
        if (g9VarA == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda17(ecommerceEvent, 2), 6, (Object) null);
            return createfromparcel;
        }
        ((lh) braze.getUdm$android_sdk_base_release()).t.a(g9VarA);
        return createfromparcel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logFeatureFlagImpression$lambda$0() {
        return "Failed to log a Feature Flag impression.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logLocationRecordedEventFromLocationUpdate$lambda$0() {
        return "Failed to log location recorded event.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logLocationRecordedEventFromLocationUpdate$lambda$1$0() {
        return "Automatic location collection is disabled. Not logging location recorded event.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchase$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to log purchase event of: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchase$lambda$1$0() {
        return "Log purchase input was invalid. Not logging in-app purchase to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchase$lambda$1$1() {
        return "Purchase logged with invalid properties. Not logging custom event to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushDelivery$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Error logging Push Delivery ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushMaxCampaign$lambda$0() {
        return "Failed to log push max campaign";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$0() {
        return "Failed to log push notification action clicked.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$1$0() {
        return "No campaign Id associated with this notification (this is expected for test sends). Not logging push notification action clicked.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$1$1() {
        return "Action ID cannot be null or blank.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$1$2() {
        return "Action Type cannot be null or blank.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$1$0() {
        return "No campaign Id associated with this notification (this is expected for test sends). Not logging push notification opened.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel logPushNotificationOpened$lambda$3(Intent intent, Braze braze) throws JSONException {
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (intent == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new wa$$ExternalSyntheticLambda3(14), 6, (Object) null);
            return createfromparcel;
        }
        String stringExtra = intent.getStringExtra(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY);
        if (stringExtra == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) stringExtra)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new wa$$ExternalSyntheticLambda3(15), 6, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w8$$ExternalSyntheticLambda1(stringExtra, 13), 6, (Object) null);
            int i = kc.i;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, stringExtra);
            d8 d8Var = e8.b;
            kc kcVar = new kc(jSONObject);
            Companion companion = Companion;
            if (companion.isDelayedInitializationEnabled()) {
                companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(kcVar);
                return createfromparcel;
            }
            ((lh) braze.getUdm$android_sdk_base_release()).t.a(kcVar);
        }
        Companion.requestTriggersIfInAppMessageTestPush$android_sdk_base_release(intent, ((lh) braze.getUdm$android_sdk_base_release()).t);
        return createfromparcel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$3$0() {
        return "Cannot logPushNotificationOpened with null intent. Not logging push click.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$3$1(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Logging push click. Campaign Id: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$3$2() {
        return "No campaign Id associated with this notification (this is expected for test sends). Not logging push click.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushStoryPageClicked$lambda$1$0() {
        return "Push story page click input was invalid. Not logging in-app purchase to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushStoryPageClicked$lambda$1$1() {
        return "Enqueuing push story page click to delayed init provider";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openSession$lambda$0() {
        return "Cannot open session with null activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openSession$lambda$1() {
        return "Failed to open session.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String performPushDeliveryFlush$lambda$0() {
        return "Failed to flush push delivery events";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String publishError$lambda$0() {
        return "User dependency manager is uninitialized. Not publishing error.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String recordGeofenceTransition$lambda$0() {
        return "Failed to post geofence report.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlags$lambda$0() {
        return "Failed to refresh feature flags.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlags$lambda$1$0() {
        return "Feature flags not enabled. Not refreshing feature flags.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel removeSingleSubscription$lambda$1(IEventSubscriber iEventSubscriber, Braze braze, Class cls) {
        if (iEventSubscriber != null) {
            boolean zA = ((z7) braze.externalIEventMessenger).a(cls, iEventSubscriber);
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.V;
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o6$$ExternalSyntheticLambda15(cls, iEventSubscriber, zA, 1), 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o6$$ExternalSyntheticLambda15(cls, iEventSubscriber, ((z7) braze.externalIEventMessenger).b(cls, iEventSubscriber), 2), 6, (Object) null);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestBannersRefresh$lambda$0() {
        return "Failed to refresh banners.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel requestBannersRefresh$lambda$1(List list, final Braze braze, final IValueCallback iValueCallback) {
        g0.i.a(list);
        if (((lh) braze.getUdm$android_sdk_base_release()).j.d()) {
            final createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
            final createInAppMessageEventSubscriber createinappmessageeventsubscriber2 = new createInAppMessageEventSubscriber();
            if (iValueCallback != null) {
                final int i = 0;
                createinappmessageeventsubscriber.IconCompatParcelizer = new IFireOnceEventSubscriber() { // from class: com.braze.Braze$$ExternalSyntheticLambda206
                    @Override // com.braze.events.IEventSubscriber
                    public final void trigger(Object obj) {
                        int i2 = i;
                        Braze braze2 = braze;
                        createInAppMessageEventSubscriber createinappmessageeventsubscriber3 = createinappmessageeventsubscriber2;
                        createInAppMessageEventSubscriber createinappmessageeventsubscriber4 = createinappmessageeventsubscriber;
                        IValueCallback iValueCallback2 = iValueCallback;
                        if (i2 != 0) {
                            Braze.requestBannersRefresh$lambda$1$2$1(iValueCallback2, createinappmessageeventsubscriber4, createinappmessageeventsubscriber3, braze2, (i0) obj);
                        } else {
                            Braze.requestBannersRefresh$lambda$1$2$0(iValueCallback2, createinappmessageeventsubscriber4, createinappmessageeventsubscriber3, braze2, (BannersUpdatedEvent) obj);
                        }
                    }
                };
                final int i2 = 1;
                createinappmessageeventsubscriber2.IconCompatParcelizer = new IFireOnceEventSubscriber() { // from class: com.braze.Braze$$ExternalSyntheticLambda206
                    @Override // com.braze.events.IEventSubscriber
                    public final void trigger(Object obj) {
                        int i3 = i2;
                        Braze braze2 = braze;
                        createInAppMessageEventSubscriber createinappmessageeventsubscriber3 = createinappmessageeventsubscriber2;
                        createInAppMessageEventSubscriber createinappmessageeventsubscriber4 = createinappmessageeventsubscriber;
                        IValueCallback iValueCallback2 = iValueCallback;
                        if (i3 != 0) {
                            Braze.requestBannersRefresh$lambda$1$2$1(iValueCallback2, createinappmessageeventsubscriber4, createinappmessageeventsubscriber3, braze2, (i0) obj);
                        } else {
                            Braze.requestBannersRefresh$lambda$1$2$0(iValueCallback2, createinappmessageeventsubscriber4, createinappmessageeventsubscriber3, braze2, (BannersUpdatedEvent) obj);
                        }
                    }
                };
                IFireOnceEventSubscriber iFireOnceEventSubscriber = (IFireOnceEventSubscriber) createinappmessageeventsubscriber.IconCompatParcelizer;
                if (iFireOnceEventSubscriber != null) {
                    ((z7) braze.externalIEventMessenger).d(BannersUpdatedEvent.class, iFireOnceEventSubscriber);
                }
                IFireOnceEventSubscriber iFireOnceEventSubscriber2 = (IFireOnceEventSubscriber) createinappmessageeventsubscriber2.IconCompatParcelizer;
                if (iFireOnceEventSubscriber2 != null) {
                    ((z7) braze.externalIEventMessenger).d(i0.class, iFireOnceEventSubscriber2);
                }
            }
            ((lh) braze.getUdm$android_sdk_base_release()).x.d(list);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda19(22), 6, (Object) null);
            ((lh) braze.getUdm$android_sdk_base_release()).i.b(new i0(), i0.class);
            if (iValueCallback != null) {
                iValueCallback.onError();
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestBannersRefresh$lambda$1$3() {
        return "Banners not enabled. Not refreshing banners. Make sure you have at least one campaign and relaunch the app.";
    }

    private static final void requestBannersRefresh$lambda$1$unsubscribeLocalListeners(createInAppMessageEventSubscriber createinappmessageeventsubscriber, createInAppMessageEventSubscriber createinappmessageeventsubscriber2, Braze braze) {
        IFireOnceEventSubscriber iFireOnceEventSubscriber = (IFireOnceEventSubscriber) createinappmessageeventsubscriber.IconCompatParcelizer;
        if (iFireOnceEventSubscriber != null) {
            ((z7) braze.externalIEventMessenger).a(BannersUpdatedEvent.class, (IEventSubscriber) iFireOnceEventSubscriber);
        }
        IFireOnceEventSubscriber iFireOnceEventSubscriber2 = (IFireOnceEventSubscriber) createinappmessageeventsubscriber2.IconCompatParcelizer;
        if (iFireOnceEventSubscriber2 != null) {
            ((z7) braze.externalIEventMessenger).a(i0.class, (IEventSubscriber) iFireOnceEventSubscriber2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefresh$lambda$0() {
        return "Failed to request Content Cards refresh from Braze servers.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefresh$lambda$1$0() {
        return "DUST is enabled and blocking Content Cards refreshes during active connections. Returning cached Content Cards.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefresh$lambda$1$1() {
        return "Content Cards is not enabled, skipping API call to refresh";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefreshFromCache$lambda$0() {
        return "Failed to request Content Cards refresh from the cache.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel requestContentCardsRefreshFromCache$lambda$1(Braze braze) {
        ((z7) braze.externalIEventMessenger).b(((lh) braze.getUdm$android_sdk_base_release()).y.a(true, (Long) null), ContentCardsUpdatedEvent.class);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$0() {
        return "Failed to request geofence refresh.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$1$0() {
        return "Cannot request Geofence refresh with null location.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$2(boolean z) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to request geofence refresh with rate limit ignore: ", z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofences$lambda$0() {
        return "Failed to request geofence refresh.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofencesInitialization$lambda$0() {
        return "Failed to initialize geofences with the geofence manager.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestImmediateDataFlush$lambda$0() {
        return "Failed to request data flush.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel requestImmediateDataFlush$lambda$1(Braze braze) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda5(14), 6, (Object) null);
        ((lh) braze.getUdm$android_sdk_base_release()).t.a(new sb());
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestLocationInitialization$lambda$0() {
        return "Location permissions were granted. Requesting geofence and location initialization.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestSingleLocationUpdate$lambda$0() {
        return "Failed to request single location update";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String safeCallFlushDelayedInitPushAnalyticsQueue$lambda$0() {
        return "Error calling flushPushAnalyticsQueue on instance";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel safeCallFlushDelayedInitPushAnalyticsQueue$lambda$1(Braze braze) {
        Companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(((lh) braze.getUdm$android_sdk_base_release()).t);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String schedulePushDelivery$lambda$0() {
        return "Error scheduling push delivery";
    }

    public static final void setCustomBrazeNotificationFactory(IBrazeNotificationFactory iBrazeNotificationFactory) {
        Companion.setCustomBrazeNotificationFactory(iBrazeNotificationFactory);
    }

    public static final void setEndpointProvider(IBrazeEndpointProvider iBrazeEndpointProvider) {
        Companion.setEndpointProvider(iBrazeEndpointProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:6:0x0023  */
    public static final createFromParcel setGoogleAdvertisingId$lambda$1(Braze braze, String str, boolean z) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.D, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda48(str, 1, z), 6, (Object) null);
        i5 i5Var = (i5) braze.getDeviceDataProvider();
        if (str != null) {
            i5Var.getClass();
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                str = "";
            }
        } else {
            str = "";
        }
        i5Var.d.writeData(DataStoreKey.GOOGLE_ADVERTISING_ID, str);
        ((i5) braze.getDeviceDataProvider()).d.writeData(DataStoreKey.AD_TRACKING_ENABLED, Boolean.valueOf(!z));
        return createFromParcel.INSTANCE;
    }

    public static final void setOutboundNetworkRequestsOffline(boolean z) {
        Companion.setOutboundNetworkRequestsOffline(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSdkAuthenticationSignature$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to set SDK authentication signature on device.\n", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel setSdkAuthenticationSignature$lambda$1(Braze braze, String str) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w8$$ExternalSyntheticLambda1(str, 15), 6, (Object) null);
        boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (zSerializer) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new wa$$ExternalSyntheticLambda3(28), 6, (Object) null);
            return createfromparcel;
        }
        ((lh) braze.getUdm$android_sdk_base_release()).q.b(str);
        return createfromparcel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSdkAuthenticationSignature$lambda$1$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Got new sdk auth signature ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSdkAuthenticationSignature$lambda$1$1() {
        return "SDK authentication signature cannot be null or blank";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSyncPolicyOfflineStatus$lambda$0(boolean z) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to set sync policy offline to ", z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSyncPolicyOfflineStatus$lambda$1$0(boolean z) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Setting the image loader deny network downloads to ", z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToBannersErrors$lambda$0() {
        return "Failed to add subscriber for Banner errors.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel subscribeToBannersErrors$lambda$1(Braze braze, IEventSubscriber iEventSubscriber) {
        ((z7) braze.externalIEventMessenger).d(i0.class, iEventSubscriber);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToBannersUpdates$lambda$0() {
        return "Failed to subscribe to Banners updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel subscribeToBannersUpdates$lambda$1(Braze braze, IEventSubscriber iEventSubscriber) {
        ((z7) braze.externalIEventMessenger).d(BannersUpdatedEvent.class, iEventSubscriber);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToBannersUpdates$lambda$2() {
        return "Failed to send cached Banners updates upon subscription.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel subscribeToBannersUpdates$lambda$3(Braze braze) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda19(5), 7, (Object) null);
            if (((lh) braze.getUdm$android_sdk_base_release()).j.d()) {
                ((lh) braze.getUdm$android_sdk_base_release()).x.i();
            } else {
                ((lh) braze.getUdm$android_sdk_base_release()).i.b(new BannersUpdatedEvent(instance_delegatelambda0.write), BannersUpdatedEvent.class);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda19(6), 4, (Object) null);
            braze.publishError(e);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToBannersUpdates$lambda$3$0() {
        return "Sending cached update upon banners subscription";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToBannersUpdates$lambda$3$1() {
        return "Failed to send cached banners upon subscribeToBannersUpdates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToChangeUserEvents$lambda$0() {
        return "Failed to subscribe to BrazeUserChangeEvent.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel subscribeToChangeUserEvents$lambda$1(Braze braze, IEventSubscriber iEventSubscriber) {
        ((z7) braze.externalIEventMessenger).c(BrazeUserChangeEvent.class, iEventSubscriber);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToChangeUserEvents$lambda$2() {
        return "Failed to send initial BrazeUserChangeEvent upon subscribeToChangeUserEvents.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel subscribeToChangeUserEvents$lambda$3(Braze braze) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda45(0), 7, (Object) null);
            u9 u9Var = braze.externalIEventMessenger;
            BrazeUser brazeUser = braze.brazeUser;
            if (brazeUser == null) {
                removeNodeAtDepth.serializer("brazeUser");
                throw null;
            }
            ((z7) u9Var).b(new BrazeUserChangeEvent(brazeUser.getUserId()), BrazeUserChangeEvent.class);
            return createFromParcel.INSTANCE;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda45(1), 4, (Object) null);
            braze.publishError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToChangeUserEvents$lambda$3$0() {
        return "Sending initial BrazeUserChangeEvent upon subscribeToChangeUserEvents";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToChangeUserEvents$lambda$3$1() {
        return "Failed to send initial BrazeUserChangeEvent upon subscribeToChangeUserEvents.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToContentCardsUpdates$lambda$0() {
        return "Failed to subscribe to Content Cards updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel subscribeToContentCardsUpdates$lambda$1(Braze braze, IEventSubscriber iEventSubscriber) {
        ((z7) braze.externalIEventMessenger).d(ContentCardsUpdatedEvent.class, iEventSubscriber);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToContentCardsUpdates$lambda$2() {
        return "Failed to send cached Content Cards updates upon subscription.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel subscribeToContentCardsUpdates$lambda$3(Braze braze) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda5(17), 7, (Object) null);
            if (((lh) braze.getUdm$android_sdk_base_release()).j.G()) {
                ((z7) braze.externalIEventMessenger).b(((lh) braze.getUdm$android_sdk_base_release()).y.a(true, (Long) null), ContentCardsUpdatedEvent.class);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda5(18), 4, (Object) null);
            braze.publishError(e);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToContentCardsUpdates$lambda$3$0() {
        return "Sending cached update upon content card subscription";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToContentCardsUpdates$lambda$3$1() {
        return "Failed to send cached content cards upon subscribeToContentCardsUpdates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToFeatureFlagsUpdates$lambda$0() {
        return "Failed to subscribe to Feature Flags updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel subscribeToFeatureFlagsUpdates$lambda$1(Braze braze, IEventSubscriber iEventSubscriber) {
        ((z7) braze.externalIEventMessenger).d(FeatureFlagsUpdatedEvent.class, iEventSubscriber);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToFeatureFlagsUpdates$lambda$2() {
        return "Failed to send cached Feature Flags updates upon subscription.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel subscribeToFeatureFlagsUpdates$lambda$3(Braze braze) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new wa$$ExternalSyntheticLambda3(16), 7, (Object) null);
            if (((lh) braze.getUdm$android_sdk_base_release()).j.J()) {
                o8 o8Var = ((lh) braze.getUdm$android_sdk_base_release()).w;
                if (o8Var.g.get()) {
                    List list = o8Var.f;
                    ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
                    }
                    ((z7) o8Var.b).b(new FeatureFlagsUpdatedEvent(arrayList), FeatureFlagsUpdatedEvent.class);
                }
            } else {
                ((lh) braze.getUdm$android_sdk_base_release()).i.b(new q8(), q8.class);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new wa$$ExternalSyntheticLambda3(17), 4, (Object) null);
            braze.publishError(e);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToFeatureFlagsUpdates$lambda$3$0() {
        return "Sending cached update upon feature flag subscription";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToFeatureFlagsUpdates$lambda$3$1() {
        return "Failed to send cached feature flags upon subscribeToFeatureFlagsUpdates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToNetworkFailures$lambda$0() {
        return "Failed to add subscriber for network failures.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel subscribeToNetworkFailures$lambda$1(Braze braze, IEventSubscriber iEventSubscriber) {
        ((z7) braze.externalIEventMessenger).d(BrazeNetworkFailureEvent.class, iEventSubscriber);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToNewInAppMessages$lambda$0() {
        return "Failed to add subscriber to new in-app messages.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel subscribeToNewInAppMessages$lambda$1(Braze braze, IEventSubscriber iEventSubscriber) {
        ((z7) braze.externalIEventMessenger).d(InAppMessageEvent.class, iEventSubscriber);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToNoMatchingTriggerForEvent$lambda$0() {
        return "Failed to add subscriber to no matching trigger events.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel subscribeToNoMatchingTriggerForEvent$lambda$1(Braze braze, IEventSubscriber iEventSubscriber) {
        ((z7) braze.externalIEventMessenger).d(NoMatchingTriggerEvent.class, iEventSubscriber);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToPushNotificationEvents$lambda$0() {
        return "Failed to add subscriber for push notification updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel subscribeToPushNotificationEvents$lambda$1(Braze braze, IEventSubscriber iEventSubscriber) {
        ((z7) braze.externalIEventMessenger).d(BrazePushEvent.class, iEventSubscriber);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToSdkAuthenticationFailures$lambda$0() {
        return "Failed to add subscriber for SDK authentication failures.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel subscribeToSdkAuthenticationFailures$lambda$1(Braze braze, IEventSubscriber iEventSubscriber) {
        ((z7) braze.externalIEventMessenger).d(BrazeSdkAuthenticationErrorEvent.class, iEventSubscriber);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToSessionUpdates$lambda$0() {
        return "Failed to add subscriber for session updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel subscribeToSessionUpdates$lambda$1(Braze braze, IEventSubscriber iEventSubscriber) {
        ((z7) braze.externalIEventMessenger).d(SessionStateChangedEvent.class, iEventSubscriber);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String validateAndStorePushId$lambda$0() {
        return "Failed to validate and store push identifier";
    }

    private final void verifyProperSdkSetup() {
        int i;
        Iterator<String> it = NECESSARY_BRAZE_SDK_PERMISSIONS.iterator();
        boolean z = true;
        while (true) {
            i = 8;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (!PermissionUtils.hasPermission(this.applicationContext, next)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda14(next, i), 6, (Object) null);
                z = false;
            }
        }
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) getConfigurationProvider$android_sdk_base_release().getBrazeApiKey().a)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda45(i), 6, (Object) null);
        } else if (z) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda45(9), 6, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyProperSdkSetup$lambda$1() {
        return "The Braze SDK requires a non-empty API key. Check your braze.xml or BrazeConfig.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyProperSdkSetup$lambda$2() {
        return "The Braze SDK is not integrated correctly. Please visit https://www.braze.com/docs/developer_guide/platform_integration_guides/android/initial_sdk_setup/android_sdk_integration/";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String waitForUserDependencyThread$lambda$0() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String waitForUserDependencyThread$lambda$1() {
        return "Caught exception while waiting for previous tasks in serial work queue to finish.";
    }

    public static final void wipeData(Context context) {
        Companion.wipeData(context);
    }

    public final /* synthetic */ void applyPendingRuntimeConfiguration$android_sdk_base_release() {
        ReentrantLock reentrantLock = brazeClassLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda45(6), 7, (Object) null);
            RuntimeAppConfigurationProvider runtimeAppConfigurationProvider = new RuntimeAppConfigurationProvider(this.applicationContext);
            for (BrazeConfig brazeConfig : pendingConfigurations) {
                Object[] objArr = {brazeConfig, clearConfigSentinel};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda45(7), 6, (Object) null);
                    runtimeAppConfigurationProvider.clearAllConfigurationValues();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda0(2, brazeConfig), 6, (Object) null);
                    runtimeAppConfigurationProvider.setConfiguration(brazeConfig);
                }
            }
            pendingConfigurations.clear();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.braze.IBraze
    public void closeSession(Activity activity) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda45(4), 6, (Object) null);
        } else {
            runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda45(5), false, false, false, new Braze$$ExternalSyntheticLambda71(this, new f(activity.getClass()), 0), 14, null);
        }
    }

    @Override // com.braze.IBraze
    public void logCustomEvent(String str, BrazeProperties brazeProperties) {
        runGuardedAsync$android_sdk_base_release$default(this, new w8$$ExternalSyntheticLambda1(str, 26), false, false, false, new Braze$$ExternalSyntheticLambda9(this, str, brazeProperties != null ? brazeProperties.clone() : null, brazeProperties, 0), 14, null);
    }

    @Override // com.braze.IBraze
    public void logPurchase(final String str, final String str2, final BigDecimal bigDecimal, final int i, BrazeProperties brazeProperties) {
        final BrazeProperties brazePropertiesClone = brazeProperties != null ? brazeProperties.clone() : null;
        runGuardedAsync$android_sdk_base_release$default(this, new w8$$ExternalSyntheticLambda1(str, 20), false, false, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.braze.Braze$$ExternalSyntheticLambda205
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                return Braze.logPurchase$lambda$1(str, str2, bigDecimal, i, this, brazePropertiesClone);
            }
        }, 14, null);
    }

    @Override // com.braze.IBraze
    public void openSession(Activity activity) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda45(10), 6, (Object) null);
        } else {
            runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda45(11), false, false, false, new Braze$$ExternalSyntheticLambda71(this, new f(activity.getClass()), 1), 14, null);
        }
    }

    public Braze(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.imageLoader = new DefaultBrazeImageLoader(applicationContext);
        final long jNanoTime = System.nanoTime();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(0), 7, (Object) null);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        this.applicationContext = applicationContext2;
        String str = Build.MODEL;
        if (str != null) {
            Set<String> set = KNOWN_APP_CRAWLER_DEVICE_MODELS;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (set.contains(lowerCase)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(26), 6, (Object) null);
                Companion.enableMockNetworkRequestsAndDropEventsMode();
            }
        }
        u9 u9Var = staticExternalIEventMessenger;
        this.externalIEventMessenger = u9Var == null ? new z7(new qe(this.applicationContext), new a5(this.applicationContext), false) : u9Var;
        runGuardedAsync$android_sdk_base_release(new Braze$$ExternalSyntheticLambda0(29), false, false, false, new d4$$ExternalSyntheticLambda2(this, 17, context));
        final long jNanoTime2 = System.nanoTime();
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.braze.Braze$$ExternalSyntheticLambda4
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                return Braze._init_$lambda$4(jNanoTime2, jNanoTime);
            }
        }, 7, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$1$0() {
        return "userId passed to changeUser was null or empty. The current user will remain the active user.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestBannersRefresh$lambda$1$2$0(IValueCallback iValueCallback, createInAppMessageEventSubscriber createinappmessageeventsubscriber, createInAppMessageEventSubscriber createinappmessageeventsubscriber2, Braze braze, BannersUpdatedEvent bannersUpdatedEvent) {
        bannersUpdatedEvent.getClass();
        requestBannersRefresh$lambda$1$unsubscribeLocalListeners(createinappmessageeventsubscriber, createinappmessageeventsubscriber2, braze);
        iValueCallback.onSuccess(bannersUpdatedEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestBannersRefresh$lambda$1$2$1(IValueCallback iValueCallback, createInAppMessageEventSubscriber createinappmessageeventsubscriber, createInAppMessageEventSubscriber createinappmessageeventsubscriber2, Braze braze, i0 i0Var) {
        i0Var.getClass();
        requestBannersRefresh$lambda$1$unsubscribeLocalListeners(createinappmessageeventsubscriber, createinappmessageeventsubscriber2, braze);
        iValueCallback.onError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestImmediateDataFlush$lambda$1$0() {
        return "requestImmediateDataFlush() called";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSyncPolicyOfflineStatus(boolean z) {
        runGuardedAsync$android_sdk_base_release$default(this, new a5$$ExternalSyntheticLambda4(z, 4), false, false, false, new Braze$$ExternalSyntheticLambda64(this, z, 0), 14, null);
    }

    private final void setUserSpecificMemberVariablesAndStartDispatch(lh lhVar) {
        setUdm$android_sdk_base_release(lhVar);
        we weVar = we.a;
        we.b = ((lh) getUdm$android_sdk_base_release()).i;
        DataStoreProvider.Companion.setEventPublisher$android_sdk_base_release(((lh) getUdm$android_sdk_base_release()).i);
        ih ihVarA = ((lh) getUdm$android_sdk_base_release()).a();
        h2 h2Var = ((lh) getUdm$android_sdk_base_release()).t;
        nb nbVar = this.offlineUserStorageProvider;
        if (nbVar == null) {
            removeNodeAtDepth.serializer("offlineUserStorageProvider");
            throw null;
        }
        this.brazeUser = new BrazeUser(ihVarA, h2Var, nbVar.a(), ((lh) getUdm$android_sdk_base_release()).v, ((lh) getUdm$android_sdk_base_release()).j);
        ((lh) getUdm$android_sdk_base_release()).l.a(((lh) getUdm$android_sdk_base_release()).i);
        ((lh) getUdm$android_sdk_base_release()).i.a();
        ((lh) getUdm$android_sdk_base_release()).f20o.a(((lh) getUdm$android_sdk_base_release()).i);
        ((lh) getUdm$android_sdk_base_release()).A.g();
        u9 u9Var = this.externalIEventMessenger;
        BrazeUser brazeUser = this.brazeUser;
        if (brazeUser == null) {
            removeNodeAtDepth.serializer("brazeUser");
            throw null;
        }
        ((z7) u9Var).b(new BrazeUserChangeEvent(brazeUser.getUserId()), BrazeUserChangeEvent.class);
        z7 z7Var = ((lh) getUdm$android_sdk_base_release()).i;
        BrazeUser brazeUser2 = this.brazeUser;
        if (brazeUser2 != null) {
            z7Var.b(new BrazeUserChangeEvent(brazeUser2.getUserId()), BrazeUserChangeEvent.class);
        } else {
            removeNodeAtDepth.serializer("brazeUser");
            throw null;
        }
    }

    @Override // com.braze.IBraze
    public <T> void addSingleSynchronousSubscription(IEventSubscriber<T> iEventSubscriber, Class<T> cls) {
        iEventSubscriber.getClass();
        cls.getClass();
        runGuardedAsync$android_sdk_base_release(new Braze$$ExternalSyntheticLambda101(cls, 1), false, false, false, new Braze$$ExternalSyntheticLambda102(this, cls, iEventSubscriber));
    }

    @Override // com.braze.IBraze
    public void changeUser(String str, String str2) {
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda14(str, 7), false, false, false, new bb$$ExternalSyntheticLambda0(str, this, str2, 5), 14, null);
    }

    @Override // com.braze.IBraze
    public Card deserializeContentCard(String str) {
        if (str == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda5(6), 6, (Object) null);
            return null;
        }
        try {
            return deserializeContentCard(new JSONObject(str));
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w8$$ExternalSyntheticLambda1(str, 25), 4, (Object) null);
            publishError(e);
            return null;
        }
    }

    public final BrazeConfigurationProvider getConfigurationProviderSafe$android_sdk_base_release(Context context) {
        context.getClass();
        if (this.configurationProvider != null) {
            return getConfigurationProvider$android_sdk_base_release();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda19(0), 7, (Object) null);
        return new BrazeConfigurationProvider(context);
    }

    @Override // com.braze.IBraze
    public void getCurrentUser(IValueCallback<BrazeUser> iValueCallback) {
        iValueCallback.getClass();
        try {
            BuildersKt.RemoteActionCompatParcelizer(we.a, null, null, new v0(iValueCallback, this, null), 3);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(28), 4, (Object) null);
            iValueCallback.onError();
            publishError(e);
        }
    }

    @Override // com.braze.IBraze
    public String getDeviceId() {
        return (String) runGuardedForResult$android_sdk_base_release("", new Braze$$ExternalSyntheticLambda5(5), false, false, false, new s0(this, null));
    }

    @Override // com.braze.IBraze
    public void getDeviceIdAsync(IValueCallback<String> iValueCallback) {
        iValueCallback.getClass();
        try {
            BuildersKt.RemoteActionCompatParcelizer(we.a, null, null, new w0(iValueCallback, this, null), 3);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda19(27), 4, (Object) null);
            iValueCallback.onError();
            publishError(e);
        }
    }

    @Override // com.braze.IBraze
    public boolean logBannerImpression(String str) {
        str.getClass();
        return ((Boolean) runGuardedForResult$android_sdk_base_release$default(this, Boolean.FALSE, new w8$$ExternalSyntheticLambda1(str, 19), false, false, false, new y0(this, str, null), 28, null)).booleanValue();
    }

    public final /* synthetic */ void publishBrazePushAction$android_sdk_base_release(BrazePushEventType brazePushEventType, BrazeNotificationPayload brazeNotificationPayload) {
        brazePushEventType.getClass();
        brazeNotificationPayload.getClass();
        ((z7) this.externalIEventMessenger).b(new BrazePushEvent(brazePushEventType, brazeNotificationPayload), BrazePushEvent.class);
    }

    @Override // com.braze.IBraze
    public void requestContentCardsRefresh() {
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda19(7), false, false, false, new Braze$$ExternalSyntheticLambda54(this, 3), 14, null);
    }

    public final /* synthetic */ void runGuardedAsync$android_sdk_base_release(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, boolean z, boolean z2, boolean z3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        try {
            BuildersKt.RemoteActionCompatParcelizer(we.a, null, null, new a1(z, z2, z3, this, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null), 3);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 4, (Object) null);
            publishError(e);
        }
    }

    public final <T> T runGuardedForResult$android_sdk_base_release(T t, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, boolean z, boolean z2, boolean z3, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        try {
            return (T) BuildersKt.serializer(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, new c1(z, t, z2, z3, this, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null));
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 4, (Object) null);
            publishError(e);
            return t;
        }
    }

    public final void setConfigurationProvider$android_sdk_base_release(BrazeConfigurationProvider brazeConfigurationProvider) {
        brazeConfigurationProvider.getClass();
        this.configurationProvider = brazeConfigurationProvider;
    }

    public final void setDeviceIdProvider$android_sdk_base_release(p9 p9Var) {
        p9Var.getClass();
        this.deviceIdProvider = p9Var;
    }

    public final void setExternalIEventMessenger$android_sdk_base_release(u9 u9Var) {
        u9Var.getClass();
        this.externalIEventMessenger = u9Var;
    }

    @Override // com.braze.IBraze
    public void setGoogleAdvertisingId(String str, boolean z) {
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda48(str, 0, z), false, false, false, new m1$$ExternalSyntheticLambda28(this, str, z, 2), 14, null);
    }

    @Override // com.braze.IBraze
    public void setImageLoader(IBrazeImageLoader iBrazeImageLoader) {
        iBrazeImageLoader.getClass();
        this.imageLoader.shutdown();
        this.imageLoader = iBrazeImageLoader;
    }

    public final void setPushDeliveryManager$android_sdk_base_release(qc qcVar) {
        qcVar.getClass();
        this.pushDeliveryManager = qcVar;
    }

    @Override // com.braze.IBraze
    public void setRegisteredPushToken(String str) {
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda14(str, 2), false, false, false, new d4$$ExternalSyntheticLambda2(this, 16, str), 14, null);
    }

    public final void setRegistrationDataProvider$android_sdk_base_release(x9 x9Var) {
        x9Var.getClass();
        this.registrationDataProvider = x9Var;
    }

    public final void setUdm$android_sdk_base_release(ha haVar) {
        haVar.getClass();
        this.udm = haVar;
    }

    public final /* synthetic */ void subscribeToBannersDismissedEvent$android_sdk_base_release(IEventSubscriber iEventSubscriber) {
        iEventSubscriber.getClass();
        ((z7) this.externalIEventMessenger).c(BannerDismissedEvent.class, iEventSubscriber);
    }

    public final /* synthetic */ void unsubscribeFromBannersDismissedEvent$android_sdk_base_release(IEventSubscriber iEventSubscriber) {
        iEventSubscriber.getClass();
        ((z7) this.externalIEventMessenger).b(BannerDismissedEvent.class, iEventSubscriber);
    }

    public final /* synthetic */ boolean validateAndStorePushId$android_sdk_base_release(String str) {
        str.getClass();
        return ((Boolean) runGuardedForResult$android_sdk_base_release$default(this, Boolean.TRUE, new wa$$ExternalSyntheticLambda3(21), false, false, false, new d1(this, str, null), 28, null)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel _init_$lambda$3(Braze braze, Context context) {
        braze.applyPendingRuntimeConfiguration$android_sdk_base_release();
        braze.setConfigurationProvider$android_sdk_base_release(new BrazeConfigurationProvider(braze.applicationContext));
        Companion companion = Companion;
        String configuredApiKey = companion.getConfiguredApiKey(braze.getConfigurationProvider$android_sdk_base_release());
        braze.isApiKeyPresent = Boolean.valueOf(!(configuredApiKey == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) configuredApiKey)));
        a5 delayedInitializationProvider$android_sdk_base_release = companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext);
        BrazeConfigurationProvider configurationProvider$android_sdk_base_release = braze.getConfigurationProvider$android_sdk_base_release();
        delayedInitializationProvider$android_sdk_base_release.getClass();
        configurationProvider$android_sdk_base_release.getClass();
        z4 z4Var = delayedInitializationProvider$android_sdk_base_release.a;
        DataStoreKey dataStoreKey = DataStoreKey.DELAYED_INIT_SET_DURING_RUNTIME_FLAG;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = z4Var.readBoolean(dataStoreKey, bool);
        Boolean bool3 = Boolean.TRUE;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bool2, bool3}, getCieXyz.write())).booleanValue() && configurationProvider$android_sdk_base_release.isDelayedInitializationEnabled()) {
            delayedInitializationProvider$android_sdk_base_release.b(true);
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{delayedInitializationProvider$android_sdk_base_release.a.readBoolean(dataStoreKey, bool), bool3}, getCieXyz.write())).booleanValue()) {
            delayedInitializationProvider$android_sdk_base_release.c(configurationProvider$android_sdk_base_release.getDelayedInitializationAnalyticsBehavior());
        }
        BrazeLogger.setInitialLogLevelFromConfiguration(braze.getConfigurationProvider$android_sdk_base_release().getLoggerInitialLogLevel());
        BrazeLogger.checkForSystemLogLevelProperty$default(false, 1, null);
        if (companion.getSdkEnablementProvider(context).a() || companion.isDelayedInitializationEnabled()) {
            companion.setOutboundNetworkRequestsOffline(true);
        }
        String str = braze.getConfigurationProvider$android_sdk_base_release().getBrazeApiKey().a;
        braze.setPushDeliveryManager$android_sdk_base_release(new qc(braze.applicationContext, str));
        braze.setDeviceIdProvider$android_sdk_base_release(new l5(braze.applicationContext, str));
        braze.offlineUserStorageProvider = new nb(braze.applicationContext);
        braze.setRegistrationDataProvider$android_sdk_base_release(new cd(braze.applicationContext, braze.getConfigurationProvider$android_sdk_base_release()));
        String customEndpoint = braze.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint();
        if (customEndpoint != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) customEndpoint)) {
            if (ValidationUtils.isInvalidCustomEndpoint$android_sdk_base_release(braze.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint())) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.W;
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(4), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(15), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(18), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(19), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(20), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(21), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(22), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(23), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(24), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(25), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(5), 6, (Object) null);
            }
            companion.setConfiguredCustomEndpoint$android_sdk_base_release(braze.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint());
        }
        try {
            if (braze.getConfigurationProvider$android_sdk_base_release().isFirebaseCloudMessagingRegistrationEnabled()) {
                v8 v8Var = new v8(context, braze.getRegistrationDataProvider$android_sdk_base_release());
                if (v8Var.a()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(6), 6, (Object) null);
                    String firebaseCloudMessagingSenderIdKey = braze.getConfigurationProvider$android_sdk_base_release().getFirebaseCloudMessagingSenderIdKey();
                    if (firebaseCloudMessagingSenderIdKey != null) {
                        v8Var.a(firebaseCloudMessagingSenderIdKey);
                    }
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(7), 6, (Object) null);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(8), 6, (Object) null);
            }
            if (braze.getConfigurationProvider$android_sdk_base_release().isAdmMessagingRegistrationEnabled()) {
                g gVar = h.c;
                Context context2 = braze.applicationContext;
                context2.getClass();
                if (gVar.a() && gVar.a(context2)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(9), 6, (Object) null);
                    new h(braze.applicationContext, braze.getRegistrationDataProvider$android_sdk_base_release()).a();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(10), 6, (Object) null);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(11), 6, (Object) null);
            }
            braze.verifyProperSdkSetup();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(12), 4, (Object) null);
        }
        BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority2 = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, priority2, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(13), 6, (Object) null);
        try {
            Context context3 = braze.applicationContext;
            nb nbVar = braze.offlineUserStorageProvider;
            if (nbVar != null) {
                braze.setUserSpecificMemberVariablesAndStartDispatch(new lh(context3, nbVar, braze.getConfigurationProvider$android_sdk_base_release(), braze.externalIEventMessenger, braze.getDeviceIdProvider$android_sdk_base_release(), braze.getRegistrationDataProvider$android_sdk_base_release(), braze.getPushDeliveryManager$android_sdk_base_release(), shouldMockNetworkRequestsAndDropEvents, areOutboundNetworkRequestsOffline, braze.getDeviceDataProvider(), shouldRequestFrameworkListenToNetworkUpdates));
                BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, priority2, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(14), 6, (Object) null);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(17), 6, (Object) null);
                return createFromParcel.INSTANCE;
            }
            removeNodeAtDepth.serializer("offlineUserStorageProvider");
            throw null;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(16), 4, (Object) null);
            braze.publishError(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$4(long j, long j2) {
        long j3 = j - j2;
        return c8$$ExternalSyntheticOutline0.m(j3, " nanos", c8$$ExternalSyntheticOutline0.m(j3 / 1000000, "Braze SDK loaded in ", " ms / "));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$1$2(String str) {
        return ff$$ExternalSyntheticOutline0.m("Push token ", str, " is the same as the previous token. Not calling sendFullDeviceObjectOnNextExport or requesting data flush");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addSerializedCardJsonToStorage$lambda$0(String str, String str2) {
        return af$$ExternalSyntheticOutline0.m("Failed to update ContentCard storage provider with single card update. User id: ", str, " Serialized json: ", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel addSerializedCardJsonToStorage$lambda$1(String str, Braze braze, String str2) {
        boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (zSerializer) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda1(str2, str, 21), 6, (Object) null);
            return createfromparcel;
        }
        ((lh) braze.getUdm$android_sdk_base_release()).y.a(new a4(str), str2);
        ((z7) braze.externalIEventMessenger).b(((lh) braze.getUdm$android_sdk_base_release()).y.a(true, (Long) null), ContentCardsUpdatedEvent.class);
        return createfromparcel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addSerializedCardJsonToStorage$lambda$1$0(String str, String str2) {
        return af$$ExternalSyntheticOutline0.m("Cannot add null or blank card json to storage. Returning. User id: ", str, " Serialized json: ", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyPendingRuntimeConfiguration$lambda$0$2(BrazeConfig brazeConfig) {
        return "Setting pending config object: " + brazeConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel changeUser$lambda$1(String str, Braze braze, String str2) {
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (str == null || str.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(27), 6, (Object) null);
            return createfromparcel;
        }
        int i = 3;
        if (StringUtils.getByteSize(str) > 997) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda14(str, i), 6, (Object) null);
            return createfromparcel;
        }
        BrazeUser brazeUser = braze.brazeUser;
        if (brazeUser != null) {
            String userId = brazeUser.getUserId();
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{userId, str}, iWrite3)).booleanValue()) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda14(str, 4), 6, (Object) null);
                if (str2 != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda14(str2, 5), 7, (Object) null);
                    ((lh) braze.getUdm$android_sdk_base_release()).q.b(str2);
                }
                return createfromparcel;
            }
            BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new t1$$ExternalSyntheticLambda1(userId, str, i), 6, (Object) null);
            z7 z7Var = ((lh) braze.getUdm$android_sdk_base_release()).i;
            ReentrantLock reentrantLock = z7Var.h;
            reentrantLock.lock();
            try {
                reentrantLock.unlock();
                zc zcVar = ((lh) braze.getUdm$android_sdk_base_release()).p;
                zcVar.b.clearData(DataStoreKey.PUSH_MAX_CAMPAIGNS);
                zcVar.b.clearData(DataStoreKey.PUSH_MAX_LAST_UPDATE);
                ((lh) braze.getUdm$android_sdk_base_release()).t.d();
                ((lh) braze.getUdm$android_sdk_base_release()).k.a();
                nb nbVar = braze.offlineUserStorageProvider;
                if (nbVar != null) {
                    nbVar.b(str);
                    ha udm$android_sdk_base_release = braze.getUdm$android_sdk_base_release();
                    Context context = braze.applicationContext;
                    nb nbVar2 = braze.offlineUserStorageProvider;
                    if (nbVar2 != null) {
                        braze.setUserSpecificMemberVariablesAndStartDispatch(new lh(context, nbVar2, braze.getConfigurationProvider$android_sdk_base_release(), braze.externalIEventMessenger, braze.getDeviceIdProvider$android_sdk_base_release(), braze.getRegistrationDataProvider$android_sdk_base_release(), braze.getPushDeliveryManager$android_sdk_base_release(), shouldMockNetworkRequestsAndDropEvents, areOutboundNetworkRequestsOffline, braze.getDeviceDataProvider(), shouldRequestFrameworkListenToNetworkUpdates));
                        if (str2 != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                            BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda14(str2, 6), 7, (Object) null);
                            ((lh) braze.getUdm$android_sdk_base_release()).q.b(str2);
                        }
                        ((lh) braze.getUdm$android_sdk_base_release()).a().j();
                        ((lh) braze.getUdm$android_sdk_base_release()).t.m();
                        lh lhVar = (lh) udm$android_sdk_base_release;
                        lhVar.getClass();
                        BuildersKt.RemoteActionCompatParcelizer(BrazeCoroutineScope.INSTANCE, null, null, new kh(lhVar, null), 3);
                        return createfromparcel;
                    }
                    removeNodeAtDepth.serializer("offlineUserStorageProvider");
                    throw null;
                }
                removeNodeAtDepth.serializer("offlineUserStorageProvider");
                throw null;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        removeNodeAtDepth.serializer("brazeUser");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$1$2(String str) {
        return ff$$ExternalSyntheticOutline0.m("Received request to change current user ", str, " to the same user id. Not changing user.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel closeSession$lambda$2(Braze braze, f fVar) {
        ((lh) braze.getUdm$android_sdk_base_release()).t.a(fVar);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String dismissBanner$lambda$0(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to dismiss Banner for ", str, ".");
    }

    private final ContentCardsUpdatedEvent getCachedContentCardsUpdatedEvent() {
        return (ContentCardsUpdatedEvent) runGuardedForResult$android_sdk_base_release$default(this, null, new Braze$$ExternalSyntheticLambda5(8), false, false, false, new o0(this, null), 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel handleInternalBannerRefresh$lambda$1(Braze braze) {
        ((lh) braze.getUdm$android_sdk_base_release()).x.a();
        return createFromParcel.INSTANCE;
    }

    private final boolean isEphemeralEventKey(String str) {
        if (!getConfigurationProvider$android_sdk_base_release().isEphemeralEventsEnabled()) {
            return false;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new wa$$ExternalSyntheticLambda3(24), 6, (Object) null);
        Set<String> ephemeralEventKeys = getConfigurationProvider$android_sdk_base_release().getEphemeralEventKeys();
        boolean zContains = ephemeralEventKeys.contains(str);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new m1$$ExternalSyntheticLambda28(str, ephemeralEventKeys, zContains, 1), 6, (Object) null);
        return zContains;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isEphemeralEventKey$lambda$1(String str, Set set, boolean z) {
        return "Checking event key [" + str + "] against ephemeral event list " + set + " and got match?: " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logBannerClick$lambda$0(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to log a Banner impression for ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel logBannerClick$lambda$1(Braze braze, String str, String str2) {
        ((lh) braze.getUdm$android_sdk_base_release()).x.a(str, str2);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logBannerImpression$lambda$0(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to log a Banner impression for ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$1$0(String str, BrazeProperties brazeProperties) {
        return "Called logCustomEvent for custom event " + str + " and properties " + brazeProperties;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$1$3(String str, BrazeProperties brazeProperties) {
        return "Logging custom event " + str + " and properties " + brazeProperties;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel logFeatureFlagImpression$lambda$1(Braze braze, String str) {
        ((lh) braze.getUdm$android_sdk_base_release()).w.a(str);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel logLocationRecordedEventFromLocationUpdate$lambda$1(Braze braze, IBrazeLocation iBrazeLocation) {
        boolean zIsAutomaticLocationCollectionEnabled = braze.getConfigurationProvider$android_sdk_base_release().isAutomaticLocationCollectionEnabled();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (!zIsAutomaticLocationCollectionEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new wa$$ExternalSyntheticLambda3(27), 6, (Object) null);
            return createfromparcel;
        }
        g9 g9VarA = n1.g.a(iBrazeLocation);
        if (g9VarA != null) {
            ((lh) braze.getUdm$android_sdk_base_release()).t.a(g9VarA);
        }
        return createfromparcel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel logPurchase$lambda$1(String str, String str2, BigDecimal bigDecimal, int i, Braze braze, BrazeProperties brazeProperties) {
        boolean zIsValidLogPurchaseInput = ValidationUtils.isValidLogPurchaseInput(str, str2, bigDecimal, i, ((lh) braze.getUdm$android_sdk_base_release()).j);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (!zIsValidLogPurchaseInput) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda5(16), 6, (Object) null);
            return createfromparcel;
        }
        if (brazeProperties != null && brazeProperties.isInvalid()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda5(20), 6, (Object) null);
            return createfromparcel;
        }
        String strEnsureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(str);
        m1 m1Var = n1.g;
        str2.getClass();
        bigDecimal.getClass();
        g9 g9VarA = m1Var.a(strEnsureBrazeFieldLength, str2, bigDecimal, i, brazeProperties);
        if (g9VarA != null && ((lh) braze.getUdm$android_sdk_base_release()).t.a(g9VarA)) {
            ((lh) braze.getUdm$android_sdk_base_release()).B.a((pg) new fc(strEnsureBrazeFieldLength, brazeProperties, g9VarA));
        }
        return createfromparcel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel logPushDelivery$lambda$1(Braze braze, String str, long j) {
        ((lh) braze.getUdm$android_sdk_base_release()).t.a(str);
        braze.schedulePushDelivery$android_sdk_base_release(j);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel logPushMaxCampaign$lambda$1(Braze braze, String str) {
        ((lh) braze.getUdm$android_sdk_base_release()).t.c(str);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel logPushNotificationActionClicked$lambda$1(String str, Braze braze, String str2, String str3) throws JSONException {
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (str == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new wa$$ExternalSyntheticLambda3(13), 6, (Object) null);
            return createfromparcel;
        }
        if (str2 == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new wa$$ExternalSyntheticLambda3(12), 6, (Object) null);
            return createfromparcel;
        }
        if (str3 == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str3)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new wa$$ExternalSyntheticLambda3(11), 6, (Object) null);
            return createfromparcel;
        }
        int i = hc.j;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, str);
        jSONObject.put(Constants.BRAZE_PUSH_CONTENT_KEY, str2);
        d8 d8Var = e8.b;
        hc hcVar = new hc(jSONObject, str3);
        Companion companion = Companion;
        if (companion.isDelayedInitializationEnabled()) {
            companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(hcVar);
            return createfromparcel;
        }
        ((lh) braze.getUdm$android_sdk_base_release()).t.a(hcVar);
        return createfromparcel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$0(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to log push open for '", str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel logPushNotificationOpened$lambda$1(String str, Braze braze) throws JSONException {
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (str == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda5(25), 6, (Object) null);
            return createfromparcel;
        }
        int i = kc.i;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, str);
        d8 d8Var = e8.b;
        kc kcVar = new kc(jSONObject);
        Companion companion = Companion;
        if (companion.isDelayedInitializationEnabled()) {
            companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(kcVar);
            return createfromparcel;
        }
        ((lh) braze.getUdm$android_sdk_base_release()).t.a(kcVar);
        return createfromparcel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$2(Intent intent) {
        return "Error logging push notification with intent: " + intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushStoryPageClicked$lambda$0(String str, String str2) {
        return af$$ExternalSyntheticOutline0.m("Failed to log push story page clicked for pageId: ", str, " campaignId: ", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel logPushStoryPageClicked$lambda$1(String str, String str2, Braze braze) {
        boolean zIsValidPushStoryClickInput = ValidationUtils.isValidPushStoryClickInput(str, str2);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (!zIsValidPushStoryClickInput) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda5(21), 6, (Object) null);
            return createfromparcel;
        }
        m1 m1Var = n1.g;
        str.getClass();
        str2.getClass();
        g9 g9VarO = m1Var.o(str, str2);
        if (g9VarO != null) {
            Companion companion = Companion;
            if (companion.isDelayedInitializationEnabled()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda5(22), 7, (Object) null);
                companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(g9VarO);
                return createfromparcel;
            }
            ((lh) braze.getUdm$android_sdk_base_release()).t.a(g9VarO);
        }
        return createfromparcel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel openSession$lambda$2(Braze braze, f fVar) {
        ((lh) braze.getUdm$android_sdk_base_release()).t.b(fVar);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel performPushDeliveryFlush$lambda$1(Braze braze) {
        ((lh) braze.getUdm$android_sdk_base_release()).t.a(0L);
        return createFromParcel.INSTANCE;
    }

    private final void publishError(Throwable th) {
        if (this.udm == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, th, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new wa$$ExternalSyntheticLambda3(23), 4, (Object) null);
            return;
        }
        try {
            ((lh) getUdm$android_sdk_base_release()).i.b(th, Throwable.class);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h2$$ExternalSyntheticLambda18(1, th), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String publishError$lambda$1(Throwable th) {
        return "Failed to log throwable: " + th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel recordGeofenceTransition$lambda$1(String str, GeofenceTransitionType geofenceTransitionType, Braze braze) {
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (str != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str) && geofenceTransitionType != null) {
            ((lh) braze.getUdm$android_sdk_base_release()).u.postGeofenceReport(str, geofenceTransitionType);
        }
        return createfromparcel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String reenqueueInAppMessage$lambda$0(InAppMessageEvent inAppMessageEvent) {
        return "Error reenqueueing In-App Message from event " + inAppMessageEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel reenqueueInAppMessage$lambda$1(Braze braze, InAppMessageEvent inAppMessageEvent) {
        ((lh) braze.getUdm$android_sdk_base_release()).B.c(inAppMessageEvent.getTriggerAction());
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel refreshFeatureFlags$lambda$1(Braze braze) {
        if (((lh) braze.getUdm$android_sdk_base_release()).j.J()) {
            o8 o8Var = ((lh) braze.getUdm$android_sdk_base_release()).w;
            m2 m2Var = m2.SESSION_START;
            o8Var.e();
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new wa$$ExternalSyntheticLambda3(18), 6, (Object) null);
            ((lh) braze.getUdm$android_sdk_base_release()).i.b(new q8(), q8.class);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeSingleSubscription$lambda$1$0$0(Class cls, IEventSubscriber iEventSubscriber, boolean z) {
        return "Did remove the background " + cls + " " + iEventSubscriber + "? " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeSingleSubscription$lambda$1$0$1(Class cls, IEventSubscriber iEventSubscriber, boolean z) {
        return "Did remove the synchronous " + cls + " " + iEventSubscriber + "? " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel requestContentCardsRefresh$lambda$1(Braze braze) {
        w6 w6Var;
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0;
        boolean zG = ((lh) braze.getUdm$android_sdk_base_release()).j.G();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (!zG) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda19(26), 7, (Object) null);
            return createfromparcel;
        }
        if (!((lh) braze.getUdm$android_sdk_base_release()).j.F() || (setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (w6Var = ((lh) braze.getUdm$android_sdk_base_release()).k.c).a) == null || !setallviewgroupchildrenasnonaccessibilityimportantlambda0.I_() || !w6Var.b.get()) {
            ((lh) braze.getUdm$android_sdk_base_release()).t.a(((lh) braze.getUdm$android_sdk_base_release()).y.d, ((lh) braze.getUdm$android_sdk_base_release()).y.e, m2.CLIENT_INITIATED);
            return createfromparcel;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda19(25), 6, (Object) null);
        u9 u9Var = braze.externalIEventMessenger;
        d4 d4Var = ((lh) braze.getUdm$android_sdk_base_release()).y;
        d4Var.getClass();
        ((z7) u9Var).b(d4Var.a(true, Long.valueOf(DateTimeUtils.nowInSeconds())), ContentCardsUpdatedEvent.class);
        return createfromparcel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel requestGeofenceRefresh$lambda$1(IBrazeLocation iBrazeLocation, Braze braze) {
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (iBrazeLocation == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda5(15), 7, (Object) null);
            return createfromparcel;
        }
        ((lh) braze.getUdm$android_sdk_base_release()).u.requestGeofenceRefresh(iBrazeLocation);
        return createfromparcel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel requestGeofenceRefresh$lambda$3(Braze braze, boolean z) {
        ((lh) braze.getUdm$android_sdk_base_release()).u.requestGeofenceRefresh(z);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel requestGeofences$lambda$1(double d, double d2, Braze braze) {
        boolean zIsValidLocation = ValidationUtils.isValidLocation(d, d2);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (!zIsValidLocation) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda29(d, d2, 0), 6, (Object) null);
            return createfromparcel;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda29(d, d2, 1), 6, (Object) null);
        ((lh) braze.getUdm$android_sdk_base_release()).u.requestGeofenceRefresh(new BrazeLocation(d, d2, null, null, null, 28, null));
        return createfromparcel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofences$lambda$1$0(double d, double d2) {
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(d, "Location provided is invalid. Not requesting refresh of Braze Geofences. Provided latitude - longitude: ", " - ");
        sbM.append(d2);
        return sbM.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofences$lambda$1$1(double d, double d2) {
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(d, "Manually requesting Geofence refresh of with provided latitude - longitude: ", " - ");
        sbM.append(d2);
        return sbM.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel requestGeofencesInitialization$lambda$1(Braze braze) {
        ((lh) braze.getUdm$android_sdk_base_release()).u.initializeGeofences();
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel requestSingleLocationUpdate$lambda$1(Braze braze) {
        ((lh) braze.getUdm$android_sdk_base_release()).v.f();
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String retryInAppMessage$lambda$0(InAppMessageEvent inAppMessageEvent) {
        return "Error retrying In-App Message from event " + inAppMessageEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel retryInAppMessage$lambda$1(Braze braze, InAppMessageEvent inAppMessageEvent) {
        ((lh) braze.getUdm$android_sdk_base_release()).B.a(inAppMessageEvent.getTriggerEvent(), inAppMessageEvent.getTriggerAction());
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void safeCallFlushDelayedInitPushAnalyticsQueue() {
        runGuardedAsync$android_sdk_base_release$default(this, new wa$$ExternalSyntheticLambda3(29), false, false, false, new Braze$$ExternalSyntheticLambda54(this, 1), 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel schedulePushDelivery$lambda$1(Braze braze, long j) {
        ((lh) braze.getUdm$android_sdk_base_release()).t.a(j);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGoogleAdvertisingId$lambda$0(String str, boolean z) {
        return "Failed to set Google Advertising ID data on device. Google Advertising ID: " + str + " and limit-ad-tracking: " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGoogleAdvertisingId$lambda$1$0(String str, boolean z) {
        return "Setting Google Advertising ID: " + str + " and limit-ad-tracking: " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel setSyncPolicyOfflineStatus$lambda$1(Braze braze, boolean z) {
        ((lh) braze.getUdm$android_sdk_base_release()).t.getClass();
        q4 q4Var = ((lh) braze.getUdm$android_sdk_base_release()).m;
        synchronized (q4Var) {
            q4Var.l = z;
            q4Var.b();
            if (z) {
                q4Var.f();
            } else {
                q4Var.c();
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a5$$ExternalSyntheticLambda4(z, 2), 7, (Object) null);
        braze.getImageLoader().setOffline(z);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyProperSdkSetup$lambda$0(String str) {
        return ff$$ExternalSyntheticOutline0.m("The Braze SDK requires the permission ", str, ". Check your AndroidManifest.");
    }

    public final void deleteRegisteredGeofenceCache$android_sdk_base_release() {
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda19(14), false, false, false, new Braze$$ExternalSyntheticLambda54(this, 7), 14, null);
    }

    @Override // com.braze.IBraze
    public IInAppMessage deserializeInAppMessageString(String str) {
        return (IInAppMessage) runGuardedForResult$android_sdk_base_release$default(this, null, new w8$$ExternalSyntheticLambda1(str, 22), false, false, false, new r0(str, this, null), 28, null);
    }

    @Override // com.braze.IBraze
    public List<FeatureFlag> getAllFeatureFlags() {
        return (List) runGuardedForResult$android_sdk_base_release$default(this, instance_delegatelambda0.write, new Braze$$ExternalSyntheticLambda19(29), false, false, false, new t0(this, null), 28, null);
    }

    @Override // com.braze.IBraze
    public String getRegisteredPushToken() {
        return (String) runGuardedForResult$android_sdk_base_release$default(this, null, new Braze$$ExternalSyntheticLambda19(18), false, false, false, new z0(this, null), 28, null);
    }

    public final /* synthetic */ void handleInternalBannerRefresh$android_sdk_base_release() {
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda19(11), false, false, false, new Braze$$ExternalSyntheticLambda54(this, 5), 14, null);
    }

    @Override // com.braze.IBraze
    public void logPushNotificationActionClicked(String str, String str2, String str3) {
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda19(8), false, false, false, new Braze$$ExternalSyntheticLambda9(str, this, str2, str3), 10, null);
    }

    @Override // com.braze.IBraze
    public void logPushNotificationOpened(String str) {
        runGuardedAsync$android_sdk_base_release$default(this, new w8$$ExternalSyntheticLambda1(str, 23), false, false, false, new Braze$$ExternalSyntheticLambda36(this, str), 10, null);
    }

    @Override // com.braze.IBraze
    public void logPushStoryPageClicked(String str, String str2) {
        runGuardedAsync$android_sdk_base_release$default(this, new ig$$ExternalSyntheticLambda1(str2, str, 22), false, false, false, new Braze$$ExternalSyntheticLambda96(str, str2, this), 10, null);
    }

    public final /* synthetic */ void performPushDeliveryFlush$android_sdk_base_release() {
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda19(17), false, false, false, new Braze$$ExternalSyntheticLambda54(this, 9), 14, null);
    }

    public final /* synthetic */ void recordGeofenceTransition$android_sdk_base_release(String str, GeofenceTransitionType geofenceTransitionType) {
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda19(28), false, false, false, new n$$ExternalSyntheticLambda3(str, geofenceTransitionType, this, 10), 14, null);
    }

    @Override // com.braze.IBraze
    public void refreshFeatureFlags() {
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda19(20), false, false, false, new Braze$$ExternalSyntheticLambda54(this, 10), 14, null);
    }

    @Override // com.braze.IBraze
    public void requestContentCardsRefreshFromCache() {
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda19(10), false, false, false, new Braze$$ExternalSyntheticLambda54(this, 4), 14, null);
    }

    public final /* synthetic */ void requestGeofenceRefresh$android_sdk_base_release(IBrazeLocation iBrazeLocation) {
        runGuardedAsync$android_sdk_base_release$default(this, new wa$$ExternalSyntheticLambda3(26), false, false, false, new Braze$$ExternalSyntheticLambda28(iBrazeLocation, this), 14, null);
    }

    @Override // com.braze.IBraze
    public void requestGeofences(double d, double d2) {
        runGuardedAsync$android_sdk_base_release$default(this, new wa$$ExternalSyntheticLambda3(25), false, false, false, new m1$$ExternalSyntheticLambda16(d, d2, this), 14, null);
    }

    public final /* synthetic */ void requestGeofencesInitialization$android_sdk_base_release() {
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda5(24), false, false, false, new Braze$$ExternalSyntheticLambda54(this, 12), 14, null);
    }

    @Override // com.braze.IBraze
    public void requestImmediateDataFlush() {
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda19(13), false, false, false, new Braze$$ExternalSyntheticLambda54(this, 6), 14, null);
    }

    public final /* synthetic */ void requestSingleLocationUpdate$android_sdk_base_release() {
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda19(15), false, false, false, new Braze$$ExternalSyntheticLambda54(this, 8), 14, null);
    }

    public final /* synthetic */ void schedulePushDelivery$android_sdk_base_release(long j) {
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda19(21), false, false, false, new k7$$ExternalSyntheticLambda9(j, 1, this), 14, null);
    }

    public final /* synthetic */ void waitForUserDependencyThread$android_sdk_base_release() {
        try {
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new wa$$ExternalSyntheticLambda3(20), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$1$4(String str, String str2) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Changing current user '", str, "' to new user '", str2, ".'");
    }

    private final o9 getDeviceDataProvider() {
        o9 i5Var = deviceDataProvider;
        if (i5Var == null) {
            i5Var = new i5(this.applicationContext, getConfigurationProvider$android_sdk_base_release());
        }
        deviceDataProvider = i5Var;
        return i5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$1$1(createInAppMessageEventSubscriber createinappmessageeventsubscriber) {
        return af$$ExternalSyntheticOutline0.m(createinappmessageeventsubscriber.IconCompatParcelizer, "Logged custom event with name ", " was invalid. Not logging custom event to Braze.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$1$2(createInAppMessageEventSubscriber createinappmessageeventsubscriber) {
        return af$$ExternalSyntheticOutline0.m(createinappmessageeventsubscriber.IconCompatParcelizer, "Custom event with name ", " logged with invalid properties. Not logging custom event to Braze.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$1$4(createInAppMessageEventSubscriber createinappmessageeventsubscriber) {
        return af$$ExternalSyntheticOutline0.m(createinappmessageeventsubscriber.IconCompatParcelizer, "Not passing event with name ", " to trigger manager");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logEcommerceEvent$lambda$0(EcommerceEvent ecommerceEvent) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to dispatch eCommerce event: ", ecommerceEvent.getEventName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logEcommerceEvent$lambda$1$1(EcommerceEvent ecommerceEvent) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to create event for eCommerce event: ", ecommerceEvent.getEventName());
    }

    @Override // com.braze.IBraze
    public List<Card> getCachedContentCards() {
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getAllCards();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda19(16), 6, (Object) null);
        return null;
    }

    @Override // com.braze.IBraze
    public int getContentCardCount() {
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getCardCount();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda5(23), 6, (Object) null);
        return -1;
    }

    @Override // com.braze.IBraze
    public int getContentCardUnviewedCount() {
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getUnviewedCardCount();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda19(19), 6, (Object) null);
        return -1;
    }

    @Override // com.braze.IBraze
    public long getContentCardsLastUpdatedInSecondsFromEpoch() {
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getTimestampSeconds();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda19(2), 6, (Object) null);
        return -1L;
    }

    @Override // com.braze.IBraze
    public void logEcommerceEvent(EcommerceEvent ecommerceEvent) {
        ecommerceEvent.getClass();
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda17(ecommerceEvent, 0), false, false, false, new n$$ExternalSyntheticLambda2(ecommerceEvent, 17, this), 14, null);
    }

    public final /* synthetic */ void logLocationRecordedEventFromLocationUpdate$android_sdk_base_release(IBrazeLocation iBrazeLocation) {
        iBrazeLocation.getClass();
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda5(2), false, false, false, new Braze$$ExternalSyntheticLambda28(this, iBrazeLocation), 14, null);
    }

    public final void reenqueueInAppMessage$android_sdk_base_release(InAppMessageEvent inAppMessageEvent) {
        inAppMessageEvent.getClass();
        int i = 0;
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda148(inAppMessageEvent, i), false, false, false, new Braze$$ExternalSyntheticLambda149(this, inAppMessageEvent, i), 14, null);
    }

    @Override // com.braze.IBraze
    public <T> void removeSingleSubscription(IEventSubscriber<T> iEventSubscriber, Class<T> cls) {
        cls.getClass();
        runGuardedAsync$android_sdk_base_release(new Braze$$ExternalSyntheticLambda101(cls, 0), false, false, false, new Braze$$ExternalSyntheticLambda102(iEventSubscriber, this, cls));
    }

    @Override // com.braze.IBraze
    public void requestLocationInitialization() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda5(19), 7, (Object) null);
        requestGeofencesInitialization$android_sdk_base_release();
        requestSingleLocationUpdate$android_sdk_base_release();
    }

    public final /* synthetic */ void retryInAppMessage$android_sdk_base_release(InAppMessageEvent inAppMessageEvent) {
        inAppMessageEvent.getClass();
        int i = 1;
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda148(inAppMessageEvent, i), false, false, false, new Braze$$ExternalSyntheticLambda149(this, inAppMessageEvent, i), 14, null);
    }

    @Override // com.braze.IBraze
    public void subscribeToBannersErrors(IEventSubscriber<i0> iEventSubscriber) {
        iEventSubscriber.getClass();
        runGuardedAsync$android_sdk_base_release(new Braze$$ExternalSyntheticLambda5(3), false, false, false, new Braze$$ExternalSyntheticLambda26(this, iEventSubscriber, 5));
    }

    @Override // com.braze.IBraze
    public void subscribeToBannersUpdates(IEventSubscriber<BannersUpdatedEvent> iEventSubscriber) {
        iEventSubscriber.getClass();
        int i = 2;
        runGuardedAsync$android_sdk_base_release(new Braze$$ExternalSyntheticLambda19(3), false, false, false, new Braze$$ExternalSyntheticLambda26(this, iEventSubscriber, i));
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda19(4), false, false, false, new Braze$$ExternalSyntheticLambda54(this, i), 14, null);
    }

    @Override // com.braze.IBraze
    public void subscribeToChangeUserEvents(IEventSubscriber<BrazeUserChangeEvent> iEventSubscriber) {
        iEventSubscriber.getClass();
        int i = 1;
        runGuardedAsync$android_sdk_base_release(new Braze$$ExternalSyntheticLambda45(2), false, false, false, new Braze$$ExternalSyntheticLambda11(this, iEventSubscriber, i));
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda45(3), false, false, false, new c$$ExternalSyntheticLambda0(i, this), 14, null);
    }

    @Override // com.braze.IBraze
    public void subscribeToNetworkFailures(IEventSubscriber<BrazeNetworkFailureEvent> iEventSubscriber) {
        iEventSubscriber.getClass();
        runGuardedAsync$android_sdk_base_release(new Braze$$ExternalSyntheticLambda5(1), false, false, false, new Braze$$ExternalSyntheticLambda26(this, iEventSubscriber, 0));
    }

    @Override // com.braze.IBraze
    public void subscribeToNewInAppMessages(IEventSubscriber<InAppMessageEvent> iEventSubscriber) {
        iEventSubscriber.getClass();
        runGuardedAsync$android_sdk_base_release(new Braze$$ExternalSyntheticLambda0(2), false, false, false, new Braze$$ExternalSyntheticLambda11(this, iEventSubscriber, 0));
    }

    @Override // com.braze.IBraze
    public void subscribeToSdkAuthenticationFailures(IEventSubscriber<BrazeSdkAuthenticationErrorEvent> iEventSubscriber) {
        iEventSubscriber.getClass();
        runGuardedAsync$android_sdk_base_release(new Braze$$ExternalSyntheticLambda5(4), false, false, false, new Braze$$ExternalSyntheticLambda26(this, iEventSubscriber, 6));
    }

    @Override // com.braze.IBraze
    public void subscribeToSessionUpdates(IEventSubscriber<SessionStateChangedEvent> iEventSubscriber) {
        iEventSubscriber.getClass();
        int i = 1;
        runGuardedAsync$android_sdk_base_release(new Braze$$ExternalSyntheticLambda19(i), false, false, false, new Braze$$ExternalSyntheticLambda26(this, iEventSubscriber, i));
    }

    public final /* synthetic */ void addSerializedCardJsonToStorage$android_sdk_base_release(String str, String str2) {
        str.getClass();
        runGuardedAsync$android_sdk_base_release$default(this, new ig$$ExternalSyntheticLambda1(str2, str, 20), false, false, false, new Braze$$ExternalSyntheticLambda96(str, this, str2), 14, null);
    }

    @Override // com.braze.IBraze
    public void dismissBanner(String str) {
        str.getClass();
        runGuardedAsync$android_sdk_base_release$default(this, new w8$$ExternalSyntheticLambda1(str, 24), false, false, false, new Braze$$ExternalSyntheticLambda36(this, str, 3), 14, null);
    }

    @Override // com.braze.IBraze
    public Banner getBanner(String str) {
        str.getClass();
        return (Banner) runGuardedForResult$android_sdk_base_release$default(this, null, new w8$$ExternalSyntheticLambda1(str, 21), false, false, false, new u0(this, str, null), 28, null);
    }

    public final BrazeConfigurationProvider getConfigurationProvider$android_sdk_base_release() {
        BrazeConfigurationProvider brazeConfigurationProvider = this.configurationProvider;
        if (brazeConfigurationProvider != null) {
            return brazeConfigurationProvider;
        }
        removeNodeAtDepth.serializer("configurationProvider");
        throw null;
    }

    public final p9 getDeviceIdProvider$android_sdk_base_release() {
        p9 p9Var = this.deviceIdProvider;
        if (p9Var != null) {
            return p9Var;
        }
        removeNodeAtDepth.serializer("deviceIdProvider");
        throw null;
    }

    @Override // com.braze.IBraze
    public FeatureFlag getFeatureFlag(String str) {
        str.getClass();
        return (FeatureFlag) runGuardedForResult$android_sdk_base_release$default(this, null, new w8$$ExternalSyntheticLambda1(str, 16), false, false, false, new x0(this, str, null), 28, null);
    }

    public final qc getPushDeliveryManager$android_sdk_base_release() {
        qc qcVar = this.pushDeliveryManager;
        if (qcVar != null) {
            return qcVar;
        }
        removeNodeAtDepth.serializer("pushDeliveryManager");
        throw null;
    }

    public final /* synthetic */ void handleInAppMessageTestPush$android_sdk_base_release(Intent intent) {
        intent.getClass();
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda5(12), false, false, false, new Braze$$ExternalSyntheticLambda58(intent, this, 0), 14, null);
    }

    @Override // com.braze.IBraze
    public void logBannerClick(String str, String str2) {
        str.getClass();
        runGuardedAsync$android_sdk_base_release$default(this, new w8$$ExternalSyntheticLambda1(str, 17), false, false, false, new Braze$$ExternalSyntheticLambda96(this, str, str2), 14, null);
    }

    @Override // com.braze.IBraze
    public void logFeatureFlagImpression(String str) {
        str.getClass();
        runGuardedAsync$android_sdk_base_release$default(this, new wa$$ExternalSyntheticLambda3(22), false, false, false, new Braze$$ExternalSyntheticLambda36(this, str, 1), 14, null);
    }

    public final /* synthetic */ void logPushDelivery$android_sdk_base_release(String str, long j) {
        str.getClass();
        runGuardedAsync$android_sdk_base_release$default(this, new w8$$ExternalSyntheticLambda1(str, 14), false, false, false, new q$$ExternalSyntheticLambda1(this, str, j, 3), 14, null);
    }

    public final /* synthetic */ void logPushMaxCampaign$android_sdk_base_release(String str) {
        str.getClass();
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda19(12), false, false, false, new Braze$$ExternalSyntheticLambda36(this, str, 2), 14, null);
    }

    @Override // com.braze.IBraze
    public void requestBannersRefresh(List<String> list, IValueCallback<BannersUpdatedEvent> iValueCallback) {
        list.getClass();
        int i = 11;
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda5(i), false, false, false, new n$$ExternalSyntheticLambda3(list, this, iValueCallback, i), 14, null);
    }

    @Override // com.braze.IBraze
    public void setSdkAuthenticationSignature(String str) {
        str.getClass();
        runGuardedAsync$android_sdk_base_release$default(this, new w8$$ExternalSyntheticLambda1(str, 27), false, false, false, new Braze$$ExternalSyntheticLambda36(this, str, 4), 14, null);
    }

    @Override // com.braze.IBraze
    public void subscribeToContentCardsUpdates(IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber) {
        iEventSubscriber.getClass();
        runGuardedAsync$android_sdk_base_release(new Braze$$ExternalSyntheticLambda5(9), false, false, false, new Braze$$ExternalSyntheticLambda26(this, iEventSubscriber, 7));
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda5(10), false, false, false, new Braze$$ExternalSyntheticLambda54(this, 0), 14, null);
    }

    @Override // com.braze.IBraze
    public void subscribeToFeatureFlagsUpdates(IEventSubscriber<FeatureFlagsUpdatedEvent> iEventSubscriber) {
        iEventSubscriber.getClass();
        runGuardedAsync$android_sdk_base_release(new Braze$$ExternalSyntheticLambda19(23), false, false, false, new Braze$$ExternalSyntheticLambda26(this, iEventSubscriber, 4));
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda19(24), false, false, false, new Braze$$ExternalSyntheticLambda54(this, 11), 14, null);
    }

    @Override // com.braze.IBraze
    public void subscribeToNoMatchingTriggerForEvent(IEventSubscriber<NoMatchingTriggerEvent> iEventSubscriber) {
        iEventSubscriber.getClass();
        runGuardedAsync$android_sdk_base_release(new Braze$$ExternalSyntheticLambda5(13), false, false, false, new Braze$$ExternalSyntheticLambda26(this, iEventSubscriber, 8));
    }

    @Override // com.braze.IBraze
    public void subscribeToPushNotificationEvents(IEventSubscriber<BrazePushEvent> iEventSubscriber) {
        iEventSubscriber.getClass();
        runGuardedAsync$android_sdk_base_release(new Braze$$ExternalSyntheticLambda19(9), false, false, false, new Braze$$ExternalSyntheticLambda26(this, iEventSubscriber, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logEcommerceEvent$lambda$1$0(EcommerceEvent ecommerceEvent) {
        return ff$$ExternalSyntheticOutline0.m("eCommerce event ", ecommerceEvent.getEventName(), " exceeds maximum property size.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeSingleSubscription$lambda$0(Class cls) {
        return ff$$ExternalSyntheticOutline0.m("Failed to remove ", cls.getName(), " subscriber.");
    }

    public final boolean areCachedContentCardsStale() {
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.isTimestampOlderThan(60L);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda5(7), 6, (Object) null);
        return false;
    }

    public final x9 getRegistrationDataProvider$android_sdk_base_release() {
        x9 x9Var = this.registrationDataProvider;
        if (x9Var != null) {
            return x9Var;
        }
        removeNodeAtDepth.serializer("registrationDataProvider");
        throw null;
    }

    public final ha getUdm$android_sdk_base_release() {
        ha haVar = this.udm;
        if (haVar != null) {
            return haVar;
        }
        removeNodeAtDepth.serializer("udm");
        throw null;
    }

    public static /* synthetic */ void runGuardedAsync$android_sdk_base_release$default(Braze braze, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, boolean z, boolean z2, boolean z3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, int i, Object obj) {
        braze.runGuardedAsync$android_sdk_base_release(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? true : z3, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
    }

    public static /* synthetic */ Object runGuardedForResult$android_sdk_base_release$default(Braze braze, Object obj, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, boolean z, boolean z2, boolean z3, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i, Object obj2) {
        return braze.runGuardedForResult$android_sdk_base_release(obj, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? true : z3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    @Override // com.braze.IBraze
    public void changeUser(String str) {
        changeUser(str, null);
    }

    @Override // com.braze.IBraze
    public void logPushNotificationOpened(Intent intent) {
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda99(0, intent), false, false, false, new Braze$$ExternalSyntheticLambda58(intent, this, 1), 10, null);
    }

    public final /* synthetic */ void requestGeofenceRefresh$android_sdk_base_release(boolean z) {
        runGuardedAsync$android_sdk_base_release$default(this, new a5$$ExternalSyntheticLambda4(z, 3), false, false, false, new Braze$$ExternalSyntheticLambda64(this, z, 1), 14, null);
    }

    @Override // com.braze.IBraze
    public void requestBannersRefresh(List<String> list) {
        list.getClass();
        requestBannersRefresh(list, null);
    }

    @Override // com.braze.IBraze
    public void logCustomEvent(String str) {
        logCustomEvent(str, null);
    }

    @Override // com.braze.IBraze
    public BrazeUser getCurrentUser() {
        return (BrazeUser) runGuardedForResult$android_sdk_base_release(null, new Braze$$ExternalSyntheticLambda5(0), false, false, true, new p0(this, null));
    }

    @Override // com.braze.IBraze
    public void logPurchase(String str, String str2, BigDecimal bigDecimal, BrazeProperties brazeProperties) {
        logPurchase(str, str2, bigDecimal, 1, brazeProperties);
    }

    @Override // com.braze.IBraze
    public void logPurchase(String str, String str2, BigDecimal bigDecimal, int i) {
        logPurchase(str, str2, bigDecimal, i, null);
    }

    @Override // com.braze.IBraze
    public void logPurchase(String str, String str2, BigDecimal bigDecimal) {
        logPurchase(str, str2, bigDecimal, 1);
    }

    @Override // com.braze.IBraze
    public Card deserializeContentCard(JSONObject jSONObject) {
        return (Card) runGuardedForResult$android_sdk_base_release$default(this, null, new l$$ExternalSyntheticLambda2(jSONObject, 12), false, false, false, new q0(this, jSONObject, null), 28, null);
    }
}
