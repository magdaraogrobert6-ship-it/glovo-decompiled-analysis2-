package com.sentiance.sdk;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.ApplicationExitInfo;
import android.app.Notification;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.util.Log;
import android.util.Pair;
import android.util.Patterns;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.incognia.internal.pNP$$ExternalSyntheticLambda0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.authentication.UserCreationType;
import com.sentiance.sdk.authentication.UserLinkingError;
import com.sentiance.sdk.authentication.UserLinkingFailureReason;
import com.sentiance.sdk.authentication.UserLinkingResult;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.detectionupdates.UserActivity;
import com.sentiance.sdk.detectionupdates.UserActivityListener;
import com.sentiance.sdk.detectionupdates.UserActivityType;
import com.sentiance.sdk.devicestate.Permission;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.init.AsyncInitializationError;
import com.sentiance.sdk.init.AsyncInitializationResult;
import com.sentiance.sdk.init.InitializationFailureReason;
import com.sentiance.sdk.init.InitializationResult;
import com.sentiance.sdk.init.SentianceOptions;
import com.sentiance.sdk.pendingoperation.PendingOperation;
import com.sentiance.sdk.quota.BandwidthQuotaMonitor;
import com.sentiance.sdk.reset.ResetError;
import com.sentiance.sdk.reset.ResetFailureReason;
import com.sentiance.sdk.reset.ResetResult;
import com.sentiance.sdk.services.ServiceManager;
import com.sentiance.sdk.threading.executors.Executors;
import com.sentiance.sdk.tile.j$$ExternalSyntheticLambda1;
import com.sentiance.sdk.trip.StartTripCallback;
import com.sentiance.sdk.trip.StartTripError;
import com.sentiance.sdk.trip.StartTripFailureReason;
import com.sentiance.sdk.trip.StartTripResult;
import com.sentiance.sdk.trip.StopTripCallback;
import com.sentiance.sdk.trip.StopTripError;
import com.sentiance.sdk.trip.StopTripFailureReason;
import com.sentiance.sdk.trip.StopTripResult;
import com.sentiance.sdk.trip.TransportMode;
import com.sentiance.sdk.trip.TripTimeoutListener;
import com.sentiance.sdk.trip.TripType;
import com.sentiance.sdk.usercreation.UserCreationError;
import com.sentiance.sdk.usercreation.UserCreationFailureReason;
import com.sentiance.sdk.usercreation.UserCreationOptions;
import com.sentiance.sdk.usercreation.UserCreationResult;
import com.sentiance.sdk.usercreation.UserInfo;
import com.sentiance.sdk.util.N;
import com.sentiance.sdk.util.Optional;
import com.sentiance.sdk.util.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import o.BannersDataStoreProviderCompanionExternalSyntheticLambda3;
import o.BannersDataStoreProviderCompanionExternalSyntheticLambda6;
import o.BrazeActionReceiver;
import o.BrazeActionReceiverActionReceiver;
import o.BrazeActionReceiverActionReceiverExternalSyntheticLambda0;
import o.BrazeCompanionExternalSyntheticLambda8;
import o.BrazeNotificationUtilsExternalSyntheticLambda14;
import o.IBrazeImageLoader;
import o.PushDeliveryDataStoreProviderCompanion;
import o.RecommendedEvent;
import o.SdkMetadataDataStoreProviderCompanion;
import o.accesshandlePush;
import o.configureFromServerConfiglambda1;
import o.configureFromServerConfiglambda2;
import o.containsandroid_sdk_base_release;
import o.createNotificationlambda0;
import o.downloadBitmapFromUrl;
import o.getAnalyticsEnabledEnterannotations;
import o.getBitmapFromCache;
import o.getBitmapFromDiskCache;
import o.getBitmapFromDiskCachelambda00;
import o.getBitmapFromMemCache;
import o.getBitmapFromUrl;
import o.getBitmapFromUrllambda3;
import o.getConversationPersonMap;
import o.getCooldownEnterSeconds;
import o.getCustomNotificationId;
import o.getDiskCacheDir;
import o.getInAppMessageBitmapFromUrl;
import o.getLatitudeannotations;
import o.getMemoryCache;
import o.getPushBitmapFromUrl;
import o.getVerticalAccuracy;
import o.handlePushNotificationPayloadlambda1;
import o.handlePushperformWorklambda1;
import o.initDiskCacheTask;
import o.invokeFallbackFirebaseServicelambda2;
import o.isTestSend;
import o.migrateBannerImpressionMapToJsonlambda0;
import o.migratePushMaxStorageToJsonlambda0;
import o.onLocationRequestCompletelambda1;
import o.onReceivelambda1;
import o.parseLonglambda0;
import o.performWork;
import o.performWorklambda0;
import o.performWorklambda4;
import o.performWorklambda6;
import o.populateNotificationBuilderlambda1;
import o.putBitmapIntoCache;
import o.putBitmapIntoCachelambda1;
import o.putBitmapIntoCachelambda20;
import o.r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk;
import o.r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg;
import o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI;
import o.r8lambdaA7HtEaFcO66TIYU2_NPKLeRVvQ;
import o.r8lambdaHBPYx5q7eaode3KBM3evVdD_7Kk;
import o.r8lambdaMiz9IrkK7Q7UB6htOHoIqxpE3WQ;
import o.r8lambdaMuUi1RM08ko_9tUvxYcERI7MB2c;
import o.r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM;
import o.r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI;
import o.r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0;
import o.r8lambdaSSzQFAg6bhoXOyJDO2xWrJylVQA;
import o.r8lambdaSl3af_1zCuD6DwNVG4BIatmaN14;
import o.r8lambdaTDxYAs0BD_svpym_2igOwG7FG0;
import o.r8lambdaVASNITF2JtWbJ3L6rKMthGjKews;
import o.r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk;
import o.r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I;
import o.r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY;
import o.r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0;
import o.r8lambdacjWcjm3stVKeZF_SundXc95EHE8;
import o.r8lambdadjZXVOGWIc3ngZy46ZXLciOGj2U;
import o.r8lambdal_awVTFE12STYFaoAFGTfNdTTsU;
import o.r8lambdaw447glWJfoun4bg91upXnaDQEZs;
import o.r8lambdaylNQm0hc21VPSChRAMa37hJE9XM;
import o.r8lambdaz9EGbeSzC7s1wOa1PXdUjIuP7p8;
import o.r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA;
import o.readBoolean;
import o.readInt;
import o.readandroid_sdk_base_release;
import o.registerGeofencesWithGeofencingClient;
import o.registerGeofencesWithGooglePlayIfNecessarylambda0;
import o.registerGeofencesWithGooglePlayIfNecessarylambda10;
import o.registerGeofencesWithGooglePlayIfNecessarylambda11;
import o.registerGeofencesWithGooglePlayIfNecessarylambda2;
import o.registerGeofencesWithGooglePlayIfNecessarylambda7;
import o.removeGeofencesRegisteredWithGeofencingClientlambda20;
import o.removeGeofencesRegisteredWithGeofencingClientlambda23;
import o.removeGeofencesRegisteredWithGeofencingClientlambda24;
import o.removeGeofencesRegisteredWithGeofencingClientlambda25;
import o.renderUrlIntoCardView;
import o.renderUrlIntoInAppMessageView;
import o.renderUrlIntoView;
import o.renderUrlIntoViewTaskandroid_sdk_base_release;
import o.renderUrlIntoViewlambda0;
import o.renderUrlIntoViewlambda1;
import o.requestGeofenceRefresh;
import o.requestSingleLocationUpdateFromGooglePlaylambda30;
import o.retrieveRegisteredGeofencesFromLocalStorageandroid_sdk_location_release;
import o.retrieveRegisteredGeofencesFromLocalStoragelambda0;
import o.setBitmapUrl;
import o.setNewlyReceivedPushStory;
import o.setNotificationBadgeNumber;
import o.setNotificationChannelId;
import o.setOfflinelambda0;
import o.setPushUniqueId;
import o.setShouldPersistWebView;
import o.shouldSkipCaching;
import o.shouldSkipCachinglambda0;
import o.unsubscribeFromBannersDismissedEvent;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class Sentiance extends N implements ISentiance {
    private static final String GUARD_TAG = "sentiance";
    private static final String LOG_TAG = "Sentiance";
    private static final performWorklambda4 MIN_SUPPORTED_ANDROID_VERSION = new performWorklambda4();
    private static final String SDK_START_ITEM_NAME = "sdk-start";
    private static final String SDK_STOP_ITEM_NAME = "sdk-stop";
    private static final long UPDATE_POWER_INFO_ALARM_DELAY = 60000;

    @SuppressLint
    private static Sentiance sInstance;
    private final Context mContext;
    private boolean mIsBootstrapComplete;
    private volatile boolean mIsInitInProgress;
    private volatile boolean mIsNewInitializerCalled;
    private boolean mIsSdkStartingOrStopping;
    private volatile boolean mIsUserCreationInProgress;
    private parseLonglambda0 mLogger;
    private final List<removeGeofencesRegisteredWithGeofencingClientlambda20> mOnBootstrapCompleteListeners;
    private OnInitCallback mOnInitCallback;
    private final setNewlyReceivedPushStory mSdkInitState;
    private final BrazeActionReceiverActionReceiverExternalSyntheticLambda0 mSdkStartStopQueue;
    private performWorklambda6 mTokenRefreshControlMessageConsumer;
    private final Set<r8lambdaMuUi1RM08ko_9tUvxYcERI7MB2c<TokenResultCallback>> mTokenResultCallbacks;
    private BrazeNotificationUtilsExternalSyntheticLambda14<UserCreationResult, UserCreationError> mUserCreationPendingOperation;
    private final Object mStartSdkLock = new Object();
    private final Object mTokenRefreshLock = new Object();
    private volatile boolean initFailedDueToAppInstability = false;
    private UserActivityListener mUserActivityListener = null;
    private readandroid_sdk_base_release mSerialExecutor = null;
    private TripTimeoutListener mTripTimeoutListener = null;
    private String mOngoingUserCreationAppId = null;
    private Long mAsyncInitDuration = null;

    private void createLegacyUser(final String str, final String str2, final UserLinkerAsync userLinkerAsync, final BrazeNotificationUtilsExternalSyntheticLambda14<UserCreationResult, UserCreationError> brazeNotificationUtilsExternalSyntheticLambda14) {
        synchronized (this) {
            ifSdkIsInitialized(new r8lambdaA5Nojo_weyBvRJwWwexNGN83YI() { // from class: o.putBitmapIntoCachelambda0
                @Override // o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI
                public final void RemoteActionCompatParcelizer() {
                    this.write.lambda$createLegacyUser$1(brazeNotificationUtilsExternalSyntheticLambda14, str, userLinkerAsync, str2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public readandroid_sdk_base_release getSerialExecutor() {
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar;
        synchronized (this) {
            if (this.mSerialExecutor == null) {
                this.mSerialExecutor = ((Executors) setPushUniqueId.read(Executors.class)).read();
            }
            readandroid_sdk_base_releaseVar = this.mSerialExecutor;
        }
        return readandroid_sdk_base_releaseVar;
    }

    private void handleLegacyUserCreationResult(int i, String str) {
        this.mIsUserCreationInProgress = false;
        if (i == 3) {
            log("Legacy user creation succeeded", new Object[0]);
            setUserCreationOperationResult();
        } else {
            logErr(c8$$ExternalSyntheticOutline0.m(i, "Legacy user creation failed due auth result "), new Object[0]);
            resetAuthInfo();
            Pair<UserCreationFailureReason, String> userCreationFailureReasonFromAuthResult = getUserCreationFailureReasonFromAuthResult(i, str);
            setUserCreationOperationError((UserCreationFailureReason) userCreationFailureReasonFromAuthResult.first, (String) userCreationFailureReasonFromAuthResult.second);
        }
    }

    @SuppressLint
    private InitializationResult initializeInternal(SentianceOptions sentianceOptions, long j, boolean z) {
        synchronized (this) {
            if (this.initFailedDueToAppInstability) {
                return getInitFailureDueToAppInstability();
            }
            if (this.mSdkInitState.serializer() == 1) {
                throw new SdkException("Calling `initialize` after having called `init` is not allowed.");
            }
            if (sentianceOptions == null) {
                throw new SdkException("Passing null SentianceOptions is not allowed");
            }
            if (!this.mSdkInitState.MediaSessionCompatToken()) {
                return getInitInterruptedReason();
            }
            try {
                if (isOSVersionNotSupported()) {
                    InitializationResult initializationResult = new InitializationResult(false, InitializationFailureReason.UNSUPPORTED_OS_VERSION, new SdkException(getUnsupportedOSVersionMessage()));
                    this.mIsInitInProgress = false;
                    this.mSdkInitState.ParcelableVolumeInfo();
                    return initializationResult;
                }
                if (!isAllowedToInitializeInCurrentProcess()) {
                    InitializationResult initializationResult2 = new InitializationResult(false, InitializationFailureReason.EXCEPTION_OR_ERROR, new SdkException(getExceptionMessageForInitInIncorrectProcess()));
                    this.mIsInitInProgress = false;
                    this.mSdkInitState.ParcelableVolumeInfo();
                    return initializationResult2;
                }
                if (this.mSdkInitState.MediaSessionCompatQueueItem()) {
                    InitializationResult initializationResult3 = new InitializationResult(false, InitializationFailureReason.SDK_RESET_IN_PROGRESS, null);
                    this.mIsInitInProgress = false;
                    this.mSdkInitState.ParcelableVolumeInfo();
                    return initializationResult3;
                }
                r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs = (r8lambdaw447glWJfoun4bg91upXnaDQEZs) setPushUniqueId.read(r8lambdaw447glWJfoun4bg91upXnaDQEZs.class);
                r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer = r8lambdaw447glwjfoun4bg91upxnadqezs.write().RemoteActionCompatParcelizer();
                if (r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer != null && !r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer.MediaMetadataCompat()) {
                    r8lambdaw447glwjfoun4bg91upxnadqezs.clearData();
                }
                boolean zUserExists = userExists();
                if (zUserExists && this.mIsNewInitializerCalled && this.mSdkInitState.IconCompatParcelizer()) {
                    InitializationResult initializationResult4 = new InitializationResult(false, InitializationFailureReason.REINITIALIZATION_NOT_ALLOWED, null);
                    this.mIsInitInProgress = false;
                    this.mSdkInitState.ParcelableVolumeInfo();
                    return initializationResult4;
                }
                this.mIsInitInProgress = true;
                r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg r8lambda7zcvodb3ypljdzjmgkbnvobyklg = (r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg) setPushUniqueId.read(r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg.class);
                r8lambda7zcvodb3ypljdzjmgkbnvobyklg.RemoteActionCompatParcelizer(sentianceOptions);
                ((ServiceManager) setPushUniqueId.read(ServiceManager.class)).IconCompatParcelizer(r8lambda7zcvodb3ypljdzjmgkbnvobyklg.serializer(), r8lambda7zcvodb3ypljdzjmgkbnvobyklg.read());
                this.mLogger = new parseLonglambda0(this.mContext, LOG_TAG, (r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class), (r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0) setPushUniqueId.read(r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0.class));
                log("Initializing sdk (%s) on process %s", "6.27.1", getCurrentProcessName());
                log("Application start info: %s", ((BannersDataStoreProviderCompanionExternalSyntheticLambda6) setPushUniqueId.read(BannersDataStoreProviderCompanionExternalSyntheticLambda6.class)).read());
                handlePushNotificationPayloadlambda1 handlepushnotificationpayloadlambda1 = (handlePushNotificationPayloadlambda1) setPushUniqueId.read(handlePushNotificationPayloadlambda1.class);
                if (this.mSdkInitState.serializer() == 0 && !handlepushnotificationpayloadlambda1.serializer()) {
                    handlepushnotificationpayloadlambda1.write(false);
                }
                setupExceptionHandlers();
                if (!this.mSdkInitState.IconCompatParcelizer(2)) {
                    logErr("Initialization was interrupted", new Object[0]);
                    InitializationResult initInterruptedReason = getInitInterruptedReason();
                    this.mIsInitInProgress = false;
                    this.mSdkInitState.ParcelableVolumeInfo();
                    return initInterruptedReason;
                }
                this.mIsNewInitializerCalled = true;
                if (zUserExists) {
                    ((r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk) setPushUniqueId.read(r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk.class)).write();
                    if (!((r8lambdacjWcjm3stVKeZF_SundXc95EHE8) setPushUniqueId.read(r8lambdacjWcjm3stVKeZF_SundXc95EHE8.class)).RemoteActionCompatParcelizer()) {
                        this.initFailedDueToAppInstability = true;
                        this.mSdkInitState.IconCompatParcelizer(0);
                        logErr("Failing current initialization due to app instability, all the subsequent initializations will also fail during the same app lifetime", new Object[0]);
                        InitializationResult initFailureDueToAppInstability = getInitFailureDueToAppInstability();
                        this.mIsInitInProgress = false;
                        this.mSdkInitState.ParcelableVolumeInfo();
                        return initFailureDueToAppInstability;
                    }
                    authenticatedInit(false);
                    if (!this.mSdkInitState.IconCompatParcelizer(3)) {
                        logErr("Initialization was interrupted", new Object[0]);
                        InitializationResult initInterruptedReason2 = getInitInterruptedReason();
                        this.mIsInitInProgress = false;
                        this.mSdkInitState.ParcelableVolumeInfo();
                        return initInterruptedReason2;
                    }
                }
                logInitializationDuration(j, z);
                InitializationResult initializationResult5 = new InitializationResult(true, null, null);
                this.mIsInitInProgress = false;
                this.mSdkInitState.ParcelableVolumeInfo();
                return initializationResult5;
            } catch (Throwable th) {
                try {
                    logErr(th, "Initialization failed", new Object[0]);
                    this.mSdkInitState.IconCompatParcelizer(0);
                    return new InitializationResult(false, InitializationFailureReason.EXCEPTION_OR_ERROR, th);
                } finally {
                    this.mIsInitInProgress = false;
                    this.mSdkInitState.ParcelableVolumeInfo();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$initializeAsync$0(SentianceOptions sentianceOptions, long j, BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14) {
        InitializationResult initializationResultInitializeInternal = initializeInternal(sentianceOptions, j, true);
        if (initializationResultInitializeInternal.isSuccessful()) {
            brazeNotificationUtilsExternalSyntheticLambda14.write(new AsyncInitializationResult());
            return;
        }
        InitializationFailureReason failureReason = initializationResultInitializeInternal.getFailureReason();
        InitializationFailureReason initializationFailureReason = InitializationFailureReason.EXCEPTION_OR_ERROR;
        if (failureReason == null) {
            failureReason = initializationFailureReason;
        }
        brazeNotificationUtilsExternalSyntheticLambda14.serializer(new AsyncInitializationError(failureReason, initializationResultInitializeInternal.getThrowable()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processInitFailure$37(String str, OnInitCallback.InitIssue initIssue) {
        log(str, new Object[0]);
        this.mOnInitCallback.onInitFailure(initIssue, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTripTimeoutListener$31(TripTimeoutListener tripTimeoutListener) {
        this.mTripTimeoutListener = tripTimeoutListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startTrip$27(StartTripCallback startTripCallback, TransportMode transportMode, Map map) {
        log("Trip start requested", new Object[0]);
        Byte bIconCompatParcelizer = null;
        if (!((getCooldownEnterSeconds) setPushUniqueId.read(getCooldownEnterSeconds.class)).serializer((Long) null)) {
            log("SDK is not started. Ignoring trip start.", new Object[0]);
            if (startTripCallback != null) {
                readBoolean.serializer(new putBitmapIntoCache(this, startTripCallback));
                return;
            }
            return;
        }
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = (getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class);
        if (startTripCallback != null) {
            getanalyticsenabledenterannotations.read(ControlMessage.FORCED_MOVING_START_RESULT, new getMemoryCache(this, getSerialExecutor(), getanalyticsenabledenterannotations, startTripCallback));
        }
        if (transportMode != null) {
            ((getVerticalAccuracy) setPushUniqueId.read(getVerticalAccuracy.class)).getClass();
            bIconCompatParcelizer = getVerticalAccuracy.IconCompatParcelizer(transportMode);
        }
        getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.FORCED_MOVING_START, new isTestSend(map, bIconCompatParcelizer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stop$11() {
        stop(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$stopTrip$29(StopTripCallback stopTripCallback) {
        log("Trip stop requested", new Object[0]);
        if (((getCooldownEnterSeconds) setPushUniqueId.read(getCooldownEnterSeconds.class)).serializer((Long) null)) {
            getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = (getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class);
            if (stopTripCallback != null) {
                getanalyticsenabledenterannotations.read(ControlMessage.FORCED_MOVING_STOP_RESULT, new shouldSkipCaching(this, getSerialExecutor(), getanalyticsenabledenterannotations, stopTripCallback));
            }
            getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.FORCED_MOVING_STOP, (Object) null);
            return;
        }
        log("SDK is not started. Ignoring trip stop.", new Object[0]);
        if (stopTripCallback != null) {
            readBoolean.serializer(new getPushBitmapFromUrl(this, stopTripCallback));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$submitDetections$15(SubmitDetectionsCallback submitDetectionsCallback) {
        log("Forced payload submission requested", new Object[0]);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = (getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class);
        String string = UUID.randomUUID().toString();
        if (submitDetectionsCallback != null) {
            ((r8lambdaylNQm0hc21VPSChRAMa37hJE9XM) setPushUniqueId.read(r8lambdaylNQm0hc21VPSChRAMa37hJE9XM.class)).RemoteActionCompatParcelizer(string, new r8lambdaz9EGbeSzC7s1wOa1PXdUjIuP7p8(this, submitDetectionsCallback));
        }
        getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.PAYLOAD_FORCE_SUBMISSION, string);
        getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.DATA_SYNC_PAYLOAD_FORCE_SUBMISSION, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateSdkNotification$26(Notification notification) {
        log("Updating Notification", new Object[0]);
        if (notification == null) {
            log("null Notification", new Object[0]);
        } else {
            ((ServiceManager) setPushUniqueId.read(ServiceManager.class)).IconCompatParcelizer(((migrateBannerImpressionMapToJsonlambda0) setPushUniqueId.read(migrateBannerImpressionMapToJsonlambda0.class)).RemoteActionCompatParcelizer(), notification);
        }
    }

    private void reset(handlePushperformWorklambda1 handlepushperformworklambda1) {
        synchronized (this) {
            if (!this.mSdkInitState.MediaSessionCompatToken()) {
                handlepushperformworklambda1.RemoteActionCompatParcelizer(ResetFailureReason.EXCEPTION_OR_ERROR, new SdkException("Reset was interrupted"));
                return;
            }
            int iSerializer = this.mSdkInitState.serializer();
            try {
                boolean zEnsureResetIsPossible = ensureResetIsPossible(handlepushperformworklambda1);
                setNewlyReceivedPushStory setnewlyreceivedpushstory = this.mSdkInitState;
                if (!zEnsureResetIsPossible) {
                    setnewlyreceivedpushstory.ParcelableVolumeInfo();
                } else if (setnewlyreceivedpushstory.IconCompatParcelizer(4)) {
                    performAsyncReset(iSerializer, handlepushperformworklambda1);
                    this.mSdkInitState.ParcelableVolumeInfo();
                } else {
                    handlepushperformworklambda1.RemoteActionCompatParcelizer(ResetFailureReason.EXCEPTION_OR_ERROR, new SdkException("Reset was interrupted"));
                    this.mSdkInitState.ParcelableVolumeInfo();
                }
            } catch (Throwable th) {
                try {
                    handlepushperformworklambda1.RemoteActionCompatParcelizer(ResetFailureReason.EXCEPTION_OR_ERROR, th);
                } catch (Throwable th2) {
                    this.mSdkInitState.ParcelableVolumeInfo();
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runQueueIfPossible() {
        synchronized (this) {
            if (this.mSdkStartStopQueue.read() == 0) {
                return;
            }
            if (this.mIsSdkStartingOrStopping) {
                return;
            }
            performWork performworkIconCompatParcelizer = this.mSdkStartStopQueue.IconCompatParcelizer();
            log("Next item in queue: %s", performworkIconCompatParcelizer);
            if (performworkIconCompatParcelizer == null) {
                this.mSdkStartStopQueue.RemoteActionCompatParcelizer();
                runQueueIfPossible();
                return;
            }
            if (performworkIconCompatParcelizer.write() != requestGeofenceRefresh.class) {
                if (performworkIconCompatParcelizer.write() != unsubscribeFromBannersDismissedEvent.class) {
                    log("Ignoring invalid event. The event should be SdkStartedEvent or SdkStoppedEvent", new Object[0]);
                } else if (isLastOfEventsSdkStartedEvent()) {
                    log("Stopping the SDK", new Object[0]);
                    ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).RemoteActionCompatParcelizer(unsubscribeFromBannersDismissedEvent.class, createSdkStoppedEventConsumer());
                } else {
                    if (performworkIconCompatParcelizer.write != null) {
                        setBitmapUrl setbitmapurl = performworkIconCompatParcelizer.write;
                        lambda$disableDetections$12(((shouldSkipCachinglambda0) setbitmapurl).RemoteActionCompatParcelizer, getSdkStatus());
                    }
                    log("Sdk already stopped. Discard SdkStoppedEvent queue item", new Object[0]);
                }
                this.mSdkStartStopQueue.RemoteActionCompatParcelizer();
                runQueueIfPossible();
            }
            log("Starting the SDK", new Object[0]);
            ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).RemoteActionCompatParcelizer(requestGeofenceRefresh.class, createSdkStartedEventConsumer());
            this.mIsSdkStartingOrStopping = true;
            ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).serializer(performworkIconCompatParcelizer.read());
        }
    }

    @Override // com.sentiance.sdk.ISentiance
    public InitializationResult initialize() {
        InitializationResult initializationResultInitialize;
        synchronized (this) {
            initializationResultInitialize = initialize(new SentianceOptions.Builder(this.mContext).build());
        }
        return initializationResultInitialize;
    }

    @Override // com.sentiance.sdk.ISentiance
    public PendingOperation<AsyncInitializationResult, AsyncInitializationError> initializeAsync(SentianceOptions sentianceOptions) {
        BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14;
        synchronized (this) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            brazeNotificationUtilsExternalSyntheticLambda14 = new BrazeNotificationUtilsExternalSyntheticLambda14();
            brazeNotificationUtilsExternalSyntheticLambda14.read();
            HandlerThread handlerThreadWrite = readInt.write().write(LOG_TAG);
            prepareForDelayedSdkInitDetection(sentianceOptions);
            new containsandroid_sdk_base_release(LOG_TAG, handlerThreadWrite.getLooper()).RemoteActionCompatParcelizer(new removeGeofencesRegisteredWithGeofencingClientlambda24(this, sentianceOptions, jCurrentTimeMillis, brazeNotificationUtilsExternalSyntheticLambda14, 1));
            this.mAsyncInitDuration = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
        }
        return brazeNotificationUtilsExternalSyntheticLambda14;
    }

    private void activateFeatures() {
        ((getConversationPersonMap) setPushUniqueId.read(getConversationPersonMap.class)).IconCompatParcelizer();
    }

    private void addUserAccessTokenResultCallback(r8lambdaMuUi1RM08ko_9tUvxYcERI7MB2c<TokenResultCallback> r8lambdamuui1rm08ko_9tuvxyceri7mb2c) {
        synchronized (this.mTokenRefreshLock) {
            this.mTokenResultCallbacks.add(r8lambdamuui1rm08ko_9tuvxyceri7mb2c);
        }
    }

    private void authenticate(String str, String str2, UserCreationType userCreationType, UserLinkerAsync userLinkerAsync) {
        ((registerGeofencesWithGeofencingClient) setPushUniqueId.read(registerGeofencesWithGeofencingClient.class)).serializer(str, str2, userCreationType, userLinkerAsync, new renderUrlIntoCardView(this, userCreationType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void authenticatedInit(boolean z) {
        ConfigurationManager configurationManager = (ConfigurationManager) setPushUniqueId.read(ConfigurationManager.class);
        requestSingleLocationUpdateFromGooglePlaylambda30 requestsinglelocationupdatefromgoogleplaylambda30 = (requestSingleLocationUpdateFromGooglePlaylambda30) setPushUniqueId.read(requestSingleLocationUpdateFromGooglePlaylambda30.class);
        boolean zR8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = configurationManager.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw();
        if (!zR8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
            bootstrap(z);
        }
        if (zR8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
            requestsinglelocationupdatefromgoogleplaylambda30.IconCompatParcelizer(new renderUrlIntoInAppMessageView(this, !zR8lambdavCwjfXDiSGcirCy4I008VOiJ_lw, configurationManager));
            return;
        }
        if (!z) {
            requestsinglelocationupdatefromgoogleplaylambda30.write();
        }
        bootstrapIfNecessaryAndInitialize(true, configurationManager, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bootstrapIfNecessaryAndInitialize(boolean z, ConfigurationManager configurationManager, boolean z2) {
        if (!z && !configurationManager.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw()) {
            bootstrap(z2);
        }
        updateInitStateAndNotify(3, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callUserAccessTokenResultCallbacks(boolean z) {
        synchronized (this.mTokenRefreshLock) {
            Optional<Token> optionalSerializer = ((r8lambdaw447glWJfoun4bg91upXnaDQEZs) setPushUniqueId.read(r8lambdaw447glWJfoun4bg91upXnaDQEZs.class)).serializer();
            Iterator<r8lambdaMuUi1RM08ko_9tUvxYcERI7MB2c<TokenResultCallback>> it = this.mTokenResultCallbacks.iterator();
            while (it.hasNext()) {
                TokenResultCallback tokenResultCallback = it.next().get();
                if (tokenResultCallback != null) {
                    readBoolean.serializer(new IBrazeImageLoader(z, optionalSerializer, tokenResultCallback));
                }
            }
            this.mTokenResultCallbacks.clear();
        }
    }

    private getLatitudeannotations<requestGeofenceRefresh> createSdkStartedEventConsumer() {
        return new performWorklambda0(this, getSerialExecutor());
    }

    private getLatitudeannotations<unsubscribeFromBannersDismissedEvent> createSdkStoppedEventConsumer() {
        return new r8lambdaVASNITF2JtWbJ3L6rKMthGjKews(this, getSerialExecutor());
    }

    private PendingOperation<UserCreationResult, UserCreationError> createUnlinkedUser(String str, String str2) {
        BrazeNotificationUtilsExternalSyntheticLambda14<UserCreationResult, UserCreationError> brazeNotificationUtilsExternalSyntheticLambda14 = new BrazeNotificationUtilsExternalSyntheticLambda14<>();
        createLegacyUser(str, str2, null, brazeNotificationUtilsExternalSyntheticLambda14);
        return brazeNotificationUtilsExternalSyntheticLambda14;
    }

    private void doPostInit(boolean z) {
        ((populateNotificationBuilderlambda1) setPushUniqueId.read(populateNotificationBuilderlambda1.class)).RemoteActionCompatParcelizer();
        if (z) {
            ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).IconCompatParcelizer(ControlMessage.CONFIGURATION_UPDATED, (Object) null);
        }
    }

    private boolean ensureResetIsPossible(handlePushperformWorklambda1 handlepushperformworklambda1) {
        int iSerializer = this.mSdkInitState.serializer();
        if (iSerializer == 5) {
            handlepushperformworklambda1.RemoteActionCompatParcelizer(getInitState());
            return false;
        }
        if (iSerializer == 1) {
            handlepushperformworklambda1.RemoteActionCompatParcelizer(ResetFailureReason.SDK_INIT_IN_PROGRESS, null);
            return false;
        }
        if (!this.mSdkInitState.MediaSessionCompatQueueItem()) {
            return true;
        }
        handlepushperformworklambda1.RemoteActionCompatParcelizer(ResetFailureReason.SDK_RESET_IN_PROGRESS, null);
        return false;
    }

    private String getAppMainProcessName() {
        return ((migratePushMaxStorageToJsonlambda0) setPushUniqueId.read(migratePushMaxStorageToJsonlambda0.class)).read();
    }

    private Optional<r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY> getAuthInfo() {
        r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs = (r8lambdaw447glWJfoun4bg91upXnaDQEZs) setPushUniqueId.IconCompatParcelizer(r8lambdaw447glWJfoun4bg91upXnaDQEZs.class);
        return r8lambdaw447glwjfoun4bg91upxnadqezs != null ? r8lambdaw447glwjfoun4bg91upxnadqezs.write() : Optional.MediaSessionCompatQueueItem();
    }

    private String getCurrentProcessName() {
        ((migratePushMaxStorageToJsonlambda0) setPushUniqueId.read(migratePushMaxStorageToJsonlambda0.class)).getClass();
        return Application.getProcessName();
    }

    private SdkStatus getDefaultSdkStatus() {
        SdkStatus.StartStatus startStatus = SdkStatus.StartStatus.NOT_STARTED;
        SdkStatus.LocationSetting locationSetting = SdkStatus.LocationSetting.OK;
        SdkStatus.QuotaStatus quotaStatus = SdkStatus.QuotaStatus.OK;
        return new SdkStatus(startStatus, false, false, false, false, locationSetting, false, false, false, false, false, false, quotaStatus, quotaStatus, quotaStatus, SdkStatus.LocationPermission.NEVER, false, false);
    }

    private UserActivity getDefaultUserActivity() {
        return new UserActivity(UserActivityType.UNKNOWN, null, null);
    }

    private String getExceptionMessageForInitInIncorrectProcess() {
        migratePushMaxStorageToJsonlambda0 migratepushmaxstoragetojsonlambda0 = (migratePushMaxStorageToJsonlambda0) setPushUniqueId.read(migratePushMaxStorageToJsonlambda0.class);
        StringBuilder sb = new StringBuilder("Initialization is not allowed in the current process (");
        migratepushmaxstoragetojsonlambda0.getClass();
        sb.append(Application.getProcessName());
        sb.append("). It is only allowed in the app's main process (");
        sb.append(migratepushmaxstoragetojsonlambda0.read());
        sb.append(").");
        return sb.toString();
    }

    private InitializationResult getInitFailureDueToAppInstability() {
        return new InitializationResult(false, InitializationFailureReason.APP_INSTABILITY_DETECTED, null);
    }

    private InitializationResult getInitInterruptedReason() {
        return new InitializationResult(false, InitializationFailureReason.EXCEPTION_OR_ERROR, new SdkException("Initialization was interrupted"));
    }

    public static Sentiance getInstance(Context context) {
        Sentiance sentiance;
        synchronized (Sentiance.class) {
            if (sInstance == null) {
                sInstance = new Sentiance(context.getApplicationContext());
            }
            sentiance = sInstance;
        }
        return sentiance;
    }

    private String getUnsupportedOSVersionMessage() {
        MIN_SUPPORTED_ANDROID_VERSION.getClass();
        return "Unsupported OS version. Minimum supported version is Android 7.0.";
    }

    private boolean hasAppIDChanged(String str) {
        Optional<String> optional = ((r8lambdaw447glWJfoun4bg91upXnaDQEZs) setPushUniqueId.read(r8lambdaw447glWJfoun4bg91upXnaDQEZs.class)).read();
        return optional.IconCompatParcelizer() && !optional.write().equals(str);
    }

    private void invokeBootstrapCompleteListeners() {
        synchronized (this.mOnBootstrapCompleteListeners) {
            Iterator<removeGeofencesRegisteredWithGeofencingClientlambda20> it = this.mOnBootstrapCompleteListeners.iterator();
            while (it.hasNext()) {
                it.next().write();
            }
        }
    }

    private boolean isLastOfEventsSdkStartedEvent() {
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = ((getCooldownEnterSeconds) setPushUniqueId.read(getCooldownEnterSeconds.class)).RemoteActionCompatParcelizer(Arrays.asList(requestGeofenceRefresh.class, unsubscribeFromBannersDismissedEvent.class), (Long) null, false);
        if (optionalRemoteActionCompatParcelizer.IconCompatParcelizer()) {
            if (getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer.write(), (getVerticalAccuracy) setPushUniqueId.read(getVerticalAccuracy.class)) == requestGeofenceRefresh.class) {
                return true;
            }
        }
        return false;
    }

    private boolean isOSVersionNotSupported() {
        MIN_SUPPORTED_ANDROID_VERSION.getClass();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean lambda$addTripMetadata$32(Map map) {
        if (!isTripOngoing(TripType.EXTERNAL_TRIP) || map == null) {
            return Boolean.FALSE;
        }
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = (getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class);
        getVerticalAccuracy getverticalaccuracy = (getVerticalAccuracy) setPushUniqueId.read(getVerticalAccuracy.class);
        ((r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class)).getClass();
        getanalyticsenabledenterannotations.serializer(getverticalaccuracy.RemoteActionCompatParcelizer(map, System.currentTimeMillis()));
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$addUserMetadataFields$43(Map map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        map.remove(null);
        RecommendedEvent recommendedEvent = (RecommendedEvent) setPushUniqueId.read(RecommendedEvent.class);
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str != null) {
                if (str2 == null) {
                    str2 = "";
                }
                if (recommendedEvent.write(str, str2)) {
                    log("Adding user metadata (%s, %s)", str, str2);
                    map2.put(str, str2);
                }
            }
        }
        if (map2.isEmpty()) {
            return;
        }
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = (getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class);
        getVerticalAccuracy getverticalaccuracy = (getVerticalAccuracy) setPushUniqueId.read(getVerticalAccuracy.class);
        ((r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class)).getClass();
        getanalyticsenabledenterannotations.serializer(getverticalaccuracy.write(map2, (byte) 1, System.currentTimeMillis()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$disableDetections$12(BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14, SdkStatus sdkStatus) {
        brazeNotificationUtilsExternalSyntheticLambda14.write(new DisableDetectionsResult(sdkStatus));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$disableDetections$13(BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14) {
        stop(new shouldSkipCachinglambda0(brazeNotificationUtilsExternalSyntheticLambda14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$enableDetections$9(BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14, SdkStatus sdkStatus) {
        brazeNotificationUtilsExternalSyntheticLambda14.write(new EnableDetectionsResult(sdkStatus));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$getDiskQuotaLimit$23() {
        return Long.valueOf(((accesshandlePush) setPushUniqueId.read(accesshandlePush.class)).IconCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$getDiskQuotaUsage$24() {
        return Long.valueOf(((accesshandlePush) setPushUniqueId.read(accesshandlePush.class)).MediaDescriptionCompat());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$getMobileQuotaLimit$21() {
        return Long.valueOf(((BandwidthQuotaMonitor) setPushUniqueId.read(BandwidthQuotaMonitor.class)).serializer(BandwidthQuotaMonitor.NetworkType.MOBILE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$getMobileQuotaUsage$22() {
        return Long.valueOf(((BandwidthQuotaMonitor) setPushUniqueId.read(BandwidthQuotaMonitor.class)).read(BandwidthQuotaMonitor.NetworkType.MOBILE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SdkStatus lambda$getSdkStatus$33() {
        return ((BannersDataStoreProviderCompanionExternalSyntheticLambda3) setPushUniqueId.read(BannersDataStoreProviderCompanionExternalSyntheticLambda3.class)).read();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Set lambda$getTransmittableDataTypes$18() {
        return ((ConfigurationManager) setPushUniqueId.read(ConfigurationManager.class)).ResultReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ UserActivity lambda$getUserActivity$46() {
        return ((configureFromServerConfiglambda2) setPushUniqueId.read(configureFromServerConfiglambda2.class)).read();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getUserId$38() {
        Optional<r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY> optionalWrite = ((r8lambdaw447glWJfoun4bg91upXnaDQEZs) setPushUniqueId.read(r8lambdaw447glWJfoun4bg91upXnaDQEZs.class)).write();
        if (optionalWrite.IconCompatParcelizer()) {
            return optionalWrite.write().serializer();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$getWiFiQuotaLimit$19() {
        return Long.valueOf(((BandwidthQuotaMonitor) setPushUniqueId.read(BandwidthQuotaMonitor.class)).serializer(BandwidthQuotaMonitor.NetworkType.WIFI));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$getWiFiQuotaUsage$20() {
        return Long.valueOf(((BandwidthQuotaMonitor) setPushUniqueId.read(BandwidthQuotaMonitor.class)).read(BandwidthQuotaMonitor.NetworkType.WIFI));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$isAllowedToUseMobileData$50() {
        return Boolean.valueOf(((retrieveRegisteredGeofencesFromLocalStoragelambda0) setPushUniqueId.read(retrieveRegisteredGeofencesFromLocalStoragelambda0.class)).RemoteActionCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$isAppSessionDataCollectionEnabled$48() {
        return Boolean.valueOf(((r8lambdaMiz9IrkK7Q7UB6htOHoIqxpE3WQ) setPushUniqueId.read(r8lambdaMiz9IrkK7Q7UB6htOHoIqxpE3WQ.class)).RemoteActionCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$isSdkKillSwitched$51() {
        return Boolean.valueOf(((ConfigurationManager) setPushUniqueId.read(ConfigurationManager.class)).r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Boolean lambda$isTripOngoing$14(TripType tripType) {
        if (tripType == null) {
            tripType = TripType.ANY;
        }
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = ((getCooldownEnterSeconds) setPushUniqueId.read(getCooldownEnterSeconds.class)).RemoteActionCompatParcelizer(invokeFallbackFirebaseServicelambda2.IconCompatParcelizer, (Long) null, false);
        if (!optionalRemoteActionCompatParcelizer.IconCompatParcelizer()) {
            return Boolean.FALSE;
        }
        Class clsIconCompatParcelizer = getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer.write(), (getVerticalAccuracy) setPushUniqueId.read(getVerticalAccuracy.class));
        return Boolean.valueOf((clsIconCompatParcelizer == setShouldPersistWebView.class && (tripType == TripType.SDK_TRIP || tripType == TripType.ANY)) || (clsIconCompatParcelizer == r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class && (tripType == TripType.EXTERNAL_TRIP || tripType == TripType.ANY)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performAsyncReset$7(int i, handlePushperformWorklambda1 handlepushperformworklambda1) {
        ((handlePushNotificationPayloadlambda1) setPushUniqueId.read(handlePushNotificationPayloadlambda1.class)).write(true);
        if (!this.mSdkInitState.IconCompatParcelizer(getInitStateAfterReset(i))) {
            handlepushperformworklambda1.RemoteActionCompatParcelizer(ResetFailureReason.EXCEPTION_OR_ERROR, new SdkException("Reset was interrupted"));
        } else {
            this.initFailedDueToAppInstability = false;
            handlepushperformworklambda1.RemoteActionCompatParcelizer(getInitState());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processInitSuccess$36() {
        this.mOnInitCallback.onInitSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$publishSdkInitializedEvent$35() {
        setNotificationChannelId setnotificationchannelid = (setNotificationChannelId) setPushUniqueId.read(setNotificationChannelId.class);
        boolean zRemoteActionCompatParcelizer = setnotificationchannelid.RemoteActionCompatParcelizer();
        if (zRemoteActionCompatParcelizer) {
            setnotificationchannelid.read();
        }
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = (getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class);
        getVerticalAccuracy getverticalaccuracy = (getVerticalAccuracy) setPushUniqueId.read(getVerticalAccuracy.class);
        r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni = (r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class);
        ApplicationExitInfo applicationExitInfoCi_ = ((registerGeofencesWithGooglePlayIfNecessarylambda7) setPushUniqueId.read(registerGeofencesWithGooglePlayIfNecessarylambda7.class)).ci_();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        getverticalaccuracy.getClass();
        getanalyticsenabledenterannotations.serializer(getVerticalAccuracy.cj_(jCurrentTimeMillis, applicationExitInfoCi_, zRemoteActionCompatParcelizer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setAppSessionDataCollectionEnabled$47(boolean z) {
        ((r8lambdaMiz9IrkK7Q7UB6htOHoIqxpE3WQ) setPushUniqueId.read(r8lambdaMiz9IrkK7Q7UB6htOHoIqxpE3WQ.class)).RemoteActionCompatParcelizer(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setIsAllowedToUseMobileData$49(boolean z) {
        ((retrieveRegisteredGeofencesFromLocalStoragelambda0) setPushUniqueId.read(retrieveRegisteredGeofencesFromLocalStoragelambda0.class)).IconCompatParcelizer(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setTransmittableDataTypes$17(Set set) {
        ((ConfigurationManager) setPushUniqueId.read(ConfigurationManager.class)).RemoteActionCompatParcelizer((Set<TransmittableDataType>) set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$start$8(Date date, OnStartFinishedHandler onStartFinishedHandler) {
        synchronized (this.mStartSdkLock) {
            Context context = (Context) setPushUniqueId.read(Context.class);
            getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = (getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class);
            getVerticalAccuracy getverticalaccuracy = (getVerticalAccuracy) setPushUniqueId.read(getVerticalAccuracy.class);
            r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni = (r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class);
            log("Adding SdkStartedEvent to queue", new Object[0]);
            if (date == null) {
                registerGeofencesWithGooglePlayIfNecessarylambda2.read(context, getanalyticsenabledenterannotations);
            } else {
                long time = date.getTime();
                r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
                if (time >= System.currentTimeMillis()) {
                    registerGeofencesWithGooglePlayIfNecessarylambda2.RemoteActionCompatParcelizer(context, getanalyticsenabledenterannotations, date.getTime() - System.currentTimeMillis());
                } else {
                    registerGeofencesWithGooglePlayIfNecessarylambda2.read(context, getanalyticsenabledenterannotations);
                    date = x.RemoteActionCompatParcelizer();
                }
            }
            Long lValueOf = date == null ? null : Long.valueOf(date.getTime());
            r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            getverticalaccuracy.getClass();
            BrazeCompanionExternalSyntheticLambda8 brazeCompanionExternalSyntheticLambda8 = new BrazeCompanionExternalSyntheticLambda8();
            brazeCompanionExternalSyntheticLambda8.IconCompatParcelizer = lValueOf;
            requestGeofenceRefresh requestgeofencerefresh = new requestGeofenceRefresh(brazeCompanionExternalSyntheticLambda8);
            r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(jCurrentTimeMillis);
            r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
            r8lambdaromdixahini0blcevvl7ehebhj0.addOnTrimMemoryListener = requestgeofencerefresh;
            r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
            this.mSdkStartStopQueue.write(new performWork(SDK_START_ITEM_NAME, requestGeofenceRefresh.class, r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm, onStartFinishedHandler, null));
            runQueueIfPossible();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopTrip$30(BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14) {
        if (isTripOngoing(TripType.EXTERNAL_TRIP)) {
            stopTrip(new renderUrlIntoViewTaskandroid_sdk_base_release(this, brazeNotificationUtilsExternalSyntheticLambda14));
        } else {
            brazeNotificationUtilsExternalSyntheticLambda14.serializer(new StopTripError(StopTripFailureReason.NO_ONGOING_TRIP, getSdkStatus()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBootstrapComplete() {
        ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).read(ControlMessage.FORCED_MOVING_STOP_RESULT, new getBitmapFromUrl(this, getSerialExecutor()));
        ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).read(ControlMessage.NEW_USER_ACTIVITY, new getBitmapFromUrl(this));
    }

    private void prepareForDelayedSdkInitDetection(SentianceOptions sentianceOptions) {
        configureFromServerConfiglambda1 configurefromserverconfiglambda1 = new configureFromServerConfiglambda1(this.mContext);
        if (sentianceOptions.isIncorrectInitializationNotificationDisabled() || !configurefromserverconfiglambda1.read()) {
            return;
        }
        ((setNotificationChannelId) setPushUniqueId.read(setNotificationChannelId.class)).read(sentianceOptions);
    }

    private void resetAuthInfo() {
        ((registerGeofencesWithGeofencingClient) setPushUniqueId.read(registerGeofencesWithGeofencingClient.class)).write();
    }

    private void setupExceptionHandlers() {
        ((getCustomNotificationId) setPushUniqueId.read(getCustomNotificationId.class)).RemoteActionCompatParcelizer();
    }

    private void stop(setBitmapUrl setbitmapurl) {
        synchronized (this.mStartSdkLock) {
            log("Adding SdkStoppedEvent to queue", new Object[0]);
            Context context = (Context) setPushUniqueId.read(Context.class);
            getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = (getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class);
            getVerticalAccuracy getverticalaccuracy = (getVerticalAccuracy) setPushUniqueId.read(getVerticalAccuracy.class);
            r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni = (r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class);
            registerGeofencesWithGooglePlayIfNecessarylambda2.read(context, getanalyticsenabledenterannotations);
            r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            unsubscribeFromBannersDismissedEvent unsubscribefrombannersdismissedevent = new unsubscribeFromBannersDismissedEvent();
            getverticalaccuracy.getClass();
            r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(jCurrentTimeMillis);
            r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
            r8lambdaromdixahini0blcevvl7ehebhj0.enterPictureInPictureMode = unsubscribefrombannersdismissedevent;
            r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
            this.mSdkStartStopQueue.write(new performWork(SDK_STOP_ITEM_NAME, unsubscribeFromBannersDismissedEvent.class, r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm, null, setbitmapurl));
            runQueueIfPossible();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StartTripFailureReason toTripStartFailureReason(SdkStatus sdkStatus) {
        SdkStatus.StartStatus startStatus = sdkStatus.startStatus;
        if (startStatus == SdkStatus.StartStatus.NOT_STARTED || startStatus == SdkStatus.StartStatus.START_EXPIRED) {
            return StartTripFailureReason.DETECTIONS_DISABLED;
        }
        if (startStatus == SdkStatus.StartStatus.PENDING) {
            return StartTripFailureReason.DETECTIONS_BLOCKED;
        }
        return null;
    }

    public void addOnBootstrapCompleteListener(removeGeofencesRegisteredWithGeofencingClientlambda20 removegeofencesregisteredwithgeofencingclientlambda20) {
        synchronized (this.mOnBootstrapCompleteListeners) {
            this.mOnBootstrapCompleteListeners.add(removegeofencesregisteredwithgeofencingclientlambda20);
        }
        this.mSdkInitState.MediaBrowserCompatMediaItem();
        boolean zWrite = this.mSdkInitState.write();
        setNewlyReceivedPushStory setnewlyreceivedpushstory = this.mSdkInitState;
        if (!zWrite) {
            setnewlyreceivedpushstory.MediaMetadataCompat();
        } else {
            setnewlyreceivedpushstory.MediaMetadataCompat();
            removegeofencesregisteredwithgeofencingclientlambda20.write();
        }
    }

    @Override // com.sentiance.sdk.ISentiance
    public PendingOperation<DisableDetectionsResult, DisableDetectionsError> disableDetections() {
        BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14 = new BrazeNotificationUtilsExternalSyntheticLambda14();
        ifSdkIsInitialized(new renderUrlIntoViewlambda0(this, brazeNotificationUtilsExternalSyntheticLambda14, 0));
        return brazeNotificationUtilsExternalSyntheticLambda14;
    }

    @Override // com.sentiance.sdk.ISentiance
    public PendingOperation<EnableDetectionsResult, EnableDetectionsError> enableDetections(Date date) {
        BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14 = new BrazeNotificationUtilsExternalSyntheticLambda14();
        ifSdkIsInitialized(new initDiskCacheTask(this, brazeNotificationUtilsExternalSyntheticLambda14, date, 1));
        return brazeNotificationUtilsExternalSyntheticLambda14;
    }

    @Override // com.sentiance.sdk.ISentiance
    public String getUserId() {
        return (String) ifSdkIsInitializedWithUser(new SdkMetadataDataStoreProviderCompanion() { // from class: o.getBitmapFromUrllambda0
            @Override // o.SdkMetadataDataStoreProviderCompanion
            public final Object serializer() {
                return Sentiance.lambda$getUserId$38();
            }
        });
    }

    @Override // com.sentiance.sdk.ISentiance
    public String getVersion() {
        return "6.27.1";
    }

    @Override // com.sentiance.sdk.ISentiance
    @SuppressLint
    @Deprecated
    public void init(SdkConfig sdkConfig, OnInitCallback onInitCallback) {
        synchronized (this) {
            if (this.mIsNewInitializerCalled) {
                throw new SdkException("Calling `init` after having called `initialize` is not allowed.");
            }
            if (this.mSdkInitState.serializer() == 1) {
                throw new SdkException("Multiple init calls are not allowed");
            }
            if (this.mSdkInitState.serializer() == 3) {
                throw new SdkException("Calling init on an initialized Sdk is not allowed");
            }
            if (!Patterns.WEB_URL.matcher(sdkConfig.getBaseURL()).matches()) {
                throw new SdkException("Invalid platform base URL provided");
            }
            if (this.mSdkInitState.MediaSessionCompatQueueItem()) {
                Log.e(LOG_TAG, "Not allowed to initialize the SDK while a reset is in progress.");
                readBoolean.write(new BrazeActionReceiverActionReceiver(onInitCallback));
                return;
            }
            if (isOSVersionNotSupported()) {
                if (onInitCallback != null) {
                    failInitWithOSNotSupportedReason(onInitCallback);
                }
                return;
            }
            this.mSdkInitState.IconCompatParcelizer(1);
            this.mOnInitCallback = onInitCallback;
            try {
                r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg r8lambda7zcvodb3ypljdzjmgkbnvobyklg = (r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg) setPushUniqueId.read(r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg.class);
                r8lambda7zcvodb3ypljdzjmgkbnvobyklg.write(sdkConfig);
                ((registerGeofencesWithGooglePlayIfNecessarylambda10) setPushUniqueId.read(registerGeofencesWithGooglePlayIfNecessarylambda10.class)).serializer(sdkConfig.getBaseURL());
                if (!((handlePushNotificationPayloadlambda1) setPushUniqueId.read(handlePushNotificationPayloadlambda1.class)).serializer()) {
                    completePreviousResetAndInitialize(sdkConfig, onInitCallback);
                    return;
                }
                if (hasAppIDChanged(sdkConfig.getAppId())) {
                    if (onInitCallback != null) {
                        onInitCallback.onInitFailure(OnInitCallback.InitIssue.CHANGED_CREDENTIALS, null);
                    }
                    this.mSdkInitState.IconCompatParcelizer(0);
                    return;
                }
                parseLonglambda0 parselonglambda0 = new parseLonglambda0(this.mContext, LOG_TAG, (r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class), (r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0) setPushUniqueId.read(r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0.class));
                this.mLogger = parselonglambda0;
                parselonglambda0.IconCompatParcelizer("Initializing sdk (%s)", "6.27.1");
                this.mLogger.IconCompatParcelizer("Triggered trips is %s locally, and %s remotely.", Boolean.valueOf(sdkConfig.isTriggeredTripsEnabled()), ((retrieveRegisteredGeofencesFromLocalStorageandroid_sdk_location_release) setPushUniqueId.read(retrieveRegisteredGeofencesFromLocalStorageandroid_sdk_location_release.class)).IconCompatParcelizer());
                setupExceptionHandlers();
                ((BannersDataStoreProviderCompanionExternalSyntheticLambda3) setPushUniqueId.read(BannersDataStoreProviderCompanionExternalSyntheticLambda3.class)).read(sdkConfig.getOnSdkStatusUpdateHandler());
                ((ServiceManager) setPushUniqueId.read(ServiceManager.class)).IconCompatParcelizer(sdkConfig.getNotificationId(), sdkConfig.getNotification());
                this.mOngoingUserCreationAppId = sdkConfig.getAppId();
                authenticate(sdkConfig.getAppId(), sdkConfig.getSecret(), UserCreationType.LEGACY_INIT, r8lambda7zcvodb3ypljdzjmgkbnvobyklg.RemoteActionCompatParcelizer());
            } catch (Throwable th) {
                this.mSdkInitState.IconCompatParcelizer(0);
                Log.e(LOG_TAG, "Failed to initialize the Sentiance SDK\n" + Log.getStackTraceString(th));
                readBoolean.write(new r8lambdaA7HtEaFcO66TIYU2_NPKLeRVvQ(onInitCallback, th));
            }
        }
    }

    @Override // com.sentiance.sdk.ISentiance
    public boolean isUserLinked() {
        r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer;
        r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs = (r8lambdaw447glWJfoun4bg91upXnaDQEZs) setPushUniqueId.IconCompatParcelizer(r8lambdaw447glWJfoun4bg91upXnaDQEZs.class);
        return r8lambdaw447glwjfoun4bg91upxnadqezs != null && (r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer = r8lambdaw447glwjfoun4bg91upxnadqezs.write().RemoteActionCompatParcelizer()) != null && r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer.MediaMetadataCompat() && r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem();
    }

    @Override // com.sentiance.sdk.ISentiance
    @SuppressLint
    public PendingOperation<UserLinkingResult, UserLinkingError> linkUser(UserLinker userLinker) {
        BrazeNotificationUtilsExternalSyntheticLambda14<UserLinkingResult, UserLinkingError> brazeNotificationUtilsExternalSyntheticLambda14 = new BrazeNotificationUtilsExternalSyntheticLambda14<>();
        if (userLinker != UserLinker.NO_OP) {
            linkLegacyUser(brazeNotificationUtilsExternalSyntheticLambda14, new createNotificationlambda0(2, userLinker));
            return brazeNotificationUtilsExternalSyntheticLambda14;
        }
        MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("UserLinker.NO_OP can not be used with `linkUser`");
        return null;
    }

    @Override // com.sentiance.sdk.ISentiance
    public PendingOperation<Token, UserAccessTokenError> requestUserAccessToken() {
        BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14 = new BrazeNotificationUtilsExternalSyntheticLambda14();
        ifSdkIsInitialized(new renderUrlIntoViewlambda0(this, brazeNotificationUtilsExternalSyntheticLambda14, 2));
        return brazeNotificationUtilsExternalSyntheticLambda14;
    }

    @Override // com.sentiance.sdk.ISentiance
    public PendingOperation<StartTripResult, StartTripError> startTrip(Map<String, String> map, TransportMode transportMode) {
        BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14 = new BrazeNotificationUtilsExternalSyntheticLambda14();
        ifSdkIsInitialized(new renderUrlIntoView(this, brazeNotificationUtilsExternalSyntheticLambda14, map, transportMode));
        return brazeNotificationUtilsExternalSyntheticLambda14;
    }

    @Override // com.sentiance.sdk.ISentiance
    public PendingOperation<StopTripResult, StopTripError> stopTrip() {
        BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14 = new BrazeNotificationUtilsExternalSyntheticLambda14();
        ifSdkIsInitialized(new renderUrlIntoViewlambda0(this, brazeNotificationUtilsExternalSyntheticLambda14, 1));
        return brazeNotificationUtilsExternalSyntheticLambda14;
    }

    @Override // com.sentiance.sdk.ISentiance
    public PendingOperation<SubmitDetectionsResult, SubmitDetectionsError> submitDetections() {
        BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14 = new BrazeNotificationUtilsExternalSyntheticLambda14();
        if (!((Boolean) ifSdkIsInitializedWithUser(Boolean.FALSE, new putBitmapIntoCachelambda20(this, brazeNotificationUtilsExternalSyntheticLambda14, 1))).booleanValue()) {
            brazeNotificationUtilsExternalSyntheticLambda14.serializer(new SubmitDetectionsError(SubmitDetectionsFailureReason.NO_USER));
            return brazeNotificationUtilsExternalSyntheticLambda14;
        }
        if (isSdkKillSwitched()) {
            brazeNotificationUtilsExternalSyntheticLambda14.serializer(new SubmitDetectionsError(SubmitDetectionsFailureReason.USER_DISABLED_REMOTELY));
        }
        return brazeNotificationUtilsExternalSyntheticLambda14;
    }

    @Override // com.sentiance.sdk.ISentiance
    public boolean userExists() {
        r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs = (r8lambdaw447glWJfoun4bg91upXnaDQEZs) setPushUniqueId.IconCompatParcelizer(r8lambdaw447glWJfoun4bg91upXnaDQEZs.class);
        return r8lambdaw447glwjfoun4bg91upxnadqezs != null && r8lambdaw447glwjfoun4bg91upxnadqezs.MediaDescriptionCompat();
    }

    private void completePreviousResetAndInitialize(SdkConfig sdkConfig, OnInitCallback onInitCallback) {
        this.mSdkInitState.IconCompatParcelizer(0);
        reset(new r8lambdaTDxYAs0BD_svpym_2igOwG7FG0(this, sdkConfig, onInitCallback));
    }

    private void failInitWithOSNotSupportedReason(OnInitCallback onInitCallback) {
        readBoolean.write(new getBitmapFromDiskCachelambda00(this, 3, onInitCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addUserMetadataField$41(String str, String str2) {
        if (str == null) {
            log("Trying to add user metadata with null label", new Object[0]);
            return;
        }
        log("Adding user metadata (%s, %s)", str, str2);
        HashMap map = new HashMap();
        map.put(str, str2);
        addUserMetadataFields(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$disableBatteryOptimization$25() {
        log("disableBatteryOptimization", new Object[0]);
        onLocationRequestCompletelambda1 onlocationrequestcompletelambda1 = (onLocationRequestCompletelambda1) setPushUniqueId.read(onLocationRequestCompletelambda1.class);
        onlocationrequestcompletelambda1.getClass();
        if (!onlocationrequestcompletelambda1.write(Permission.IGNORE_BATTERY_OPTIMIZATIONS)) {
            log("disableBatteryOptimization failed: permission not granted", new Object[0]);
            return;
        }
        if (((PowerManager) setPushUniqueId.read(PowerManager.class)).isIgnoringBatteryOptimizations(this.mContext.getPackageName())) {
            log("disableBatteryOptimization failed: already ignoring battery optimizations", new Object[0]);
            return;
        }
        try {
            Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
            intent.setData(Uri.parse("package:" + this.mContext.getPackageName()));
            intent.addFlags(268435456);
            this.mContext.startActivity(intent);
            ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).IconCompatParcelizer(ControlMessage.CHECK_POWER_INFO, Long.valueOf(UPDATE_POWER_INFO_ALARM_DELAY));
        } catch (ActivityNotFoundException e) {
            logErr(e, "Failed to disable battery optimization", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$removeUserMetadataField$42(String str) {
        if (str == null) {
            return;
        }
        log("Removing user metadata %s", str);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = (getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class);
        getVerticalAccuracy getverticalaccuracy = (getVerticalAccuracy) setPushUniqueId.read(getVerticalAccuracy.class);
        r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni = (r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class);
        HashMap map = new HashMap();
        map.put(str, "");
        if (((RecommendedEvent) setPushUniqueId.read(RecommendedEvent.class)).write(str)) {
            r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
            getanalyticsenabledenterannotations.serializer(getverticalaccuracy.write(map, (byte) 2, System.currentTimeMillis()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$submitDetections$16(BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14) {
        submitDetections(new getBitmapFromMemCache(0, brazeNotificationUtilsExternalSyntheticLambda14));
        return Boolean.TRUE;
    }

    private void linkLegacyUser(BrazeNotificationUtilsExternalSyntheticLambda14<UserLinkingResult, UserLinkingError> brazeNotificationUtilsExternalSyntheticLambda14, UserLinkerAsync userLinkerAsync) {
        ifSdkIsInitialized(new initDiskCacheTask(this, brazeNotificationUtilsExternalSyntheticLambda14, userLinkerAsync, 0));
    }

    @Override // com.sentiance.sdk.ISentiance
    public void addUserMetadataField(String str, String str2) {
        ifSdkIsInitializedWithUser(new initDiskCacheTask(this, str, str2, 2));
    }

    @Override // com.sentiance.sdk.ISentiance
    public void addUserMetadataFields(Map<String, String> map) {
        ifSdkIsInitializedWithUser(new getBitmapFromUrllambda3(this, map, 0));
    }

    @Override // com.sentiance.sdk.ISentiance
    public void disableBatteryOptimization() {
        ifSdkIsInitialized(new setOfflinelambda0(this, 1));
    }

    @Override // com.sentiance.sdk.ISentiance
    @Deprecated
    public void getUserAccessToken(TokenResultCallback tokenResultCallback) {
        ifSdkIsInitializedWithUser(new getBitmapFromUrllambda3(this, tokenResultCallback, 4));
    }

    @Override // com.sentiance.sdk.ISentiance
    public void removeUserMetadataField(String str) {
        ifSdkIsInitializedWithUser(new getBitmapFromUrllambda3(this, str, 3));
    }

    @Override // com.sentiance.sdk.ISentiance
    public void setAppSessionDataCollectionEnabled(boolean z) {
        ifSdkIsInitialized(new downloadBitmapFromUrl(z, 1));
    }

    @Override // com.sentiance.sdk.ISentiance
    public void setIsAllowedToUseMobileData(boolean z) {
        ifSdkIsInitialized(new downloadBitmapFromUrl(z, 0));
    }

    @Override // com.sentiance.sdk.ISentiance
    public void setSdkStatusUpdateListener(SdkStatusUpdateListener sdkStatusUpdateListener) {
        ifSdkIsInitialized(new getBitmapFromDiskCache(0, sdkStatusUpdateListener));
    }

    @Override // com.sentiance.sdk.ISentiance
    public void setTransmittableDataTypes(Set<TransmittableDataType> set) {
        ifSdkIsInitialized(new getBitmapFromDiskCache(1, set));
    }

    @Override // com.sentiance.sdk.ISentiance
    public void setTripTimeoutListener(TripTimeoutListener tripTimeoutListener) {
        ifSdkIsInitialized(new getBitmapFromUrllambda3(this, tripTimeoutListener, 5));
    }

    @Override // com.sentiance.sdk.ISentiance
    public void setUserActivityListener(UserActivityListener userActivityListener) {
        ifSdkIsInitialized(new getBitmapFromUrllambda3(this, userActivityListener, 2));
    }

    @Override // com.sentiance.sdk.ISentiance
    @Deprecated
    public void start(Date date, OnStartFinishedHandler onStartFinishedHandler) {
        ifSdkIsInitializedWithUser(new initDiskCacheTask(this, date, onStartFinishedHandler, 3));
    }

    @Override // com.sentiance.sdk.ISentiance
    public void updateSdkNotification(Notification notification) {
        ifSdkIsInitialized(new getBitmapFromUrllambda3(this, notification, 6));
    }

    @SuppressLint
    private boolean canUserCreationProceed(BrazeNotificationUtilsExternalSyntheticLambda14<UserCreationResult, UserCreationError> brazeNotificationUtilsExternalSyntheticLambda14) {
        if (!this.mIsNewInitializerCalled) {
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("User creation is not supported with the legacy SDK initialization.Please use the `Sentiance.initialize(SentianceOptions)` method instead.");
            return false;
        }
        if (this.mSdkInitState.MediaSessionCompatQueueItem()) {
            brazeNotificationUtilsExternalSyntheticLambda14.serializer(new UserCreationError(UserCreationFailureReason.SDK_RESET_IN_PROGRESS, ""));
            return false;
        }
        if (this.mSdkInitState.write()) {
            brazeNotificationUtilsExternalSyntheticLambda14.serializer(new UserCreationError(UserCreationFailureReason.USER_ALREADY_EXISTS, ""));
            return false;
        }
        if (!this.mIsUserCreationInProgress) {
            return true;
        }
        brazeNotificationUtilsExternalSyntheticLambda14.serializer(new UserCreationError(UserCreationFailureReason.USER_CREATION_IN_PROGRESS, ""));
        return false;
    }

    @SuppressLint
    private PendingOperation<UserCreationResult, UserCreationError> createLinkedUser(String str, String str2, UserLinkerAsync userLinkerAsync) {
        if (userLinkerAsync != null) {
            BrazeNotificationUtilsExternalSyntheticLambda14<UserCreationResult, UserCreationError> brazeNotificationUtilsExternalSyntheticLambda14 = new BrazeNotificationUtilsExternalSyntheticLambda14<>();
            createLegacyUser(str, str2, userLinkerAsync, brazeNotificationUtilsExternalSyntheticLambda14);
            return brazeNotificationUtilsExternalSyntheticLambda14;
        }
        MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("UserLinkerAsync cannot be null");
        return null;
    }

    private PendingOperation<UserCreationResult, UserCreationError> createUserWithAppCredentials(r8lambdaHBPYx5q7eaode3KBM3evVdD_7Kk r8lambdahbpyx5q7eaode3kbm3evvdd_7kk) {
        return r8lambdahbpyx5q7eaode3kbm3evvdd_7kk.write() == UserLinkerAsync.NO_OP ? createUnlinkedUser(r8lambdahbpyx5q7eaode3kbm3evvdd_7kk.IconCompatParcelizer(), r8lambdahbpyx5q7eaode3kbm3evvdd_7kk.RemoteActionCompatParcelizer()) : createLinkedUser(r8lambdahbpyx5q7eaode3kbm3evvdd_7kk.IconCompatParcelizer(), r8lambdahbpyx5q7eaode3kbm3evvdd_7kk.RemoteActionCompatParcelizer(), r8lambdahbpyx5q7eaode3kbm3evvdd_7kk.write());
    }

    private int getInitStateAfterReset(int i) {
        if (i == 0) {
            return 0;
        }
        return this.mIsNewInitializerCalled ? 2 : 5;
    }

    private UserInfo getUserInfo(r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqty) {
        r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA r8lambdazgdcm_k4mtbwe6bmdwjk2beesa = r8lambdazcbg_e0hjusjy78mvgh54swzqty.RatingCompat().read();
        if (r8lambdazgdcm_k4mtbwe6bmdwjk2beesa == null) {
            return null;
        }
        Date dateA = x.a(r8lambdazgdcm_k4mtbwe6bmdwjk2beesa.serializer());
        if (dateA == null) {
            dateA = x.RemoteActionCompatParcelizer();
        }
        return new UserInfo(r8lambdazcbg_e0hjusjy78mvgh54swzqty.serializer(), new Token(r8lambdazgdcm_k4mtbwe6bmdwjk2beesa.read(), dateA));
    }

    private boolean isAllowedToInitializeInCurrentProcess() {
        String currentProcessName = getCurrentProcessName();
        return currentProcessName != null && currentProcessName.equals(getAppMainProcessName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$failInitWithOSNotSupportedReason$6(OnInitCallback onInitCallback) {
        onInitCallback.onInitFailure(OnInitCallback.InitIssue.INITIALIZATION_ERROR, new SdkException(getUnsupportedOSVersionMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUserActivityListener$44(UserActivityListener userActivityListener) {
        userActivityListener.onUserActivityChange(getUserActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startTrip$28(BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14, Map map, TransportMode transportMode) {
        if (canStartTrip(brazeNotificationUtilsExternalSyntheticLambda14, getSdkStatus())) {
            startTrip(map, transportMode, new getInAppMessageBitmapFromUrl(this, brazeNotificationUtilsExternalSyntheticLambda14));
        }
    }

    @SuppressLint
    private boolean linkingPossible(BrazeNotificationUtilsExternalSyntheticLambda14<UserLinkingResult, UserLinkingError> brazeNotificationUtilsExternalSyntheticLambda14) {
        if (!this.mIsNewInitializerCalled) {
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("User linking is not supported with the legacy SDK initialization.Please use the `Sentiance.initialize(SentianceOptions)` method instead.");
            return false;
        }
        if (!userExists()) {
            brazeNotificationUtilsExternalSyntheticLambda14.serializer(new UserLinkingError(UserLinkingFailureReason.NO_USER, "No user exists. Please create user first before linking."));
            return false;
        }
        if (isUserLinked()) {
            brazeNotificationUtilsExternalSyntheticLambda14.serializer(new UserLinkingError(UserLinkingFailureReason.USER_ALREADY_LINKED, ""));
            return false;
        }
        if (!isSdkKillSwitched()) {
            return true;
        }
        brazeNotificationUtilsExternalSyntheticLambda14.serializer(new UserLinkingError(UserLinkingFailureReason.USER_DISABLED_REMOTELY, "User is disabled remotely"));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void log(String str, Object... objArr) {
        parseLonglambda0 parselonglambda0 = this.mLogger;
        if (parselonglambda0 != null) {
            parselonglambda0.IconCompatParcelizer(str, objArr);
        }
    }

    private void processInitFailure(int i, String str) {
        OnInitCallback.InitIssue initIssue;
        String str2;
        if (this.mIsUserCreationInProgress) {
            handleLegacyUserCreationResult(i, str);
            return;
        }
        if (this.mOnInitCallback != null) {
            int i2 = 4;
            if (i == 1) {
                initIssue = OnInitCallback.InitIssue.INVALID_CREDENTIALS;
                str2 = "Returning init failure to enclosing app with invalid credentials";
            } else if (i == 4 || i == 5 || i == 6 || i == 7) {
                initIssue = OnInitCallback.InitIssue.LINK_FAILED;
                str2 = "Returning init failure to enclosing app with linking failure";
            } else {
                initIssue = OnInitCallback.InitIssue.SERVICE_UNREACHABLE;
                str2 = "Returning init failure to enclosing app with service unreachable";
            }
            readBoolean.write(new j$$ExternalSyntheticLambda1(this, str2, initIssue, i2));
        }
    }

    @Override // com.sentiance.sdk.ISentiance
    @SuppressLint
    public PendingOperation<UserCreationResult, UserCreationError> createUser(UserCreationOptions userCreationOptions) {
        r8lambdaHBPYx5q7eaode3KBM3evVdD_7Kk r8lambdahbpyx5q7eaode3kbm3evvdd_7kk = r8lambdaHBPYx5q7eaode3KBM3evVdD_7Kk.read(userCreationOptions);
        PushDeliveryDataStoreProviderCompanion pushDeliveryDataStoreProviderCompanion = userCreationOptions.getAuthCode() != null ? new PushDeliveryDataStoreProviderCompanion(userCreationOptions.getAuthCode()) : null;
        if (r8lambdahbpyx5q7eaode3kbm3evvdd_7kk == null && pushDeliveryDataStoreProviderCompanion == null) {
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Invalid UserCreationOptions");
            return null;
        }
        ((registerGeofencesWithGooglePlayIfNecessarylambda10) setPushUniqueId.read(registerGeofencesWithGooglePlayIfNecessarylambda10.class)).serializer(userCreationOptions.getPlatformUrl());
        return r8lambdahbpyx5q7eaode3kbm3evvdd_7kk != null ? createUserWithAppCredentials(r8lambdahbpyx5q7eaode3kbm3evvdd_7kk) : createLinkedUser(pushDeliveryDataStoreProviderCompanion.write());
    }

    @Override // com.sentiance.sdk.ISentiance
    public DetectionStatus getDetectionStatus() {
        return getSdkStatus().detectionStatus;
    }

    @Override // com.sentiance.sdk.ISentiance
    public InitState getInitState() {
        if (this.mIsInitInProgress) {
            return InitState.INIT_IN_PROGRESS;
        }
        int iSerializer = this.mSdkInitState.serializer();
        if (iSerializer == 1) {
            return InitState.INIT_IN_PROGRESS;
        }
        if (iSerializer == 2 || iSerializer == 3) {
            return InitState.INITIALIZED;
        }
        return iSerializer != 4 ? InitState.NOT_INITIALIZED : InitState.RESETTING;
    }

    @Override // com.sentiance.sdk.ISentiance
    public boolean isTripOngoing(final TripType tripType) {
        return ((Boolean) ifSdkIsInitializedWithUser(Boolean.FALSE, (r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk<Boolean>) new r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk() { // from class: o.shouldSkipCachinglambda21
            @Override // o.r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk
            public final Object IconCompatParcelizer() {
                return Sentiance.lambda$isTripOngoing$14(tripType);
            }
        })).booleanValue();
    }

    private Sentiance(Context context) {
        setPushUniqueId.write(context);
        this.mContext = context;
        this.mSdkStartStopQueue = new BrazeActionReceiverActionReceiverExternalSyntheticLambda0();
        this.mTokenResultCallbacks = new HashSet();
        this.mOnBootstrapCompleteListeners = new ArrayList();
        this.mSdkInitState = setNotificationBadgeNumber.RemoteActionCompatParcelizer();
        addOnBootstrapCompleteListener(new removeGeofencesRegisteredWithGeofencingClientlambda20() { // from class: o.putBitmapIntoMemCache
            @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda20
            public final void write() {
                this.write.onBootstrapComplete();
            }
        });
    }

    private void bootstrap(boolean z) {
        activateFeatures();
        ((removeGeofencesRegisteredWithGeofencingClientlambda23) setPushUniqueId.read(removeGeofencesRegisteredWithGeofencingClientlambda23.class)).read();
        invokeBootstrapCompleteListeners();
        doPostInit(z);
        this.mIsBootstrapComplete = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getUserAccessToken$39(TokenResultCallback tokenResultCallback) {
        if (tokenResultCallback == null) {
            return;
        }
        if (((r8lambdaw447glWJfoun4bg91upXnaDQEZs) setPushUniqueId.read(r8lambdaw447glWJfoun4bg91upXnaDQEZs.class)).write().read()) {
            readBoolean.serializer(new r8lambdal_awVTFE12STYFaoAFGTfNdTTsU(tokenResultCallback));
            return;
        }
        synchronized (this.mTokenRefreshLock) {
            if (this.mTokenRefreshControlMessageConsumer == null) {
                this.mTokenRefreshControlMessageConsumer = new performWorklambda6(this);
                ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).read(ControlMessage.TOKEN_REFRESH_COMPLETE, this.mTokenRefreshControlMessageConsumer);
            }
            registerGeofencesWithGooglePlayIfNecessarylambda0 registergeofenceswithgoogleplayifnecessarylambda0 = (registerGeofencesWithGooglePlayIfNecessarylambda0) setPushUniqueId.read(registerGeofencesWithGooglePlayIfNecessarylambda0.class);
            if (!registergeofenceswithgoogleplayifnecessarylambda0.write()) {
                readBoolean.serializer(new onReceivelambda1(((r8lambdaw447glWJfoun4bg91upXnaDQEZs) setPushUniqueId.read(r8lambdaw447glWJfoun4bg91upXnaDQEZs.class)).serializer(), tokenResultCallback));
            } else {
                addUserAccessTokenResultCallback(new r8lambdaMuUi1RM08ko_9tUvxYcERI7MB2c<>(tokenResultCallback));
                registergeofenceswithgoogleplayifnecessarylambda0.serializer(null);
            }
        }
    }

    private void logErr(Throwable th, String str, Object... objArr) {
        parseLonglambda0 parselonglambda0 = this.mLogger;
        if (parselonglambda0 != null) {
            parselonglambda0.IconCompatParcelizer(false, th, str, objArr);
        }
    }

    @Override // com.sentiance.sdk.ISentiance
    public boolean addTripMetadata(Map<String, String> map) {
        return ((Boolean) ifSdkIsInitializedWithUser(Boolean.FALSE, new putBitmapIntoCachelambda20(this, map, 0))).booleanValue();
    }

    @Override // com.sentiance.sdk.ISentiance
    public Set<TransmittableDataType> getTransmittableDataTypes() {
        return (Set) ifSdkIsInitialized(Collections.EMPTY_SET, new getDiskCacheDir(3));
    }

    @Override // com.sentiance.sdk.ISentiance
    public boolean isAppSessionDataCollectionEnabled() {
        return ((Boolean) ifSdkIsInitializedWithUser(Boolean.FALSE, new getDiskCacheDir(4))).booleanValue();
    }

    private boolean canStartTrip(BrazeNotificationUtilsExternalSyntheticLambda14<StartTripResult, StartTripError> brazeNotificationUtilsExternalSyntheticLambda14, SdkStatus sdkStatus) {
        StartTripFailureReason tripStartFailureReason;
        if (!userExists()) {
            tripStartFailureReason = StartTripFailureReason.NO_USER;
        } else if (isSdkKillSwitched()) {
            tripStartFailureReason = StartTripFailureReason.USER_DISABLED_REMOTELY;
        } else {
            tripStartFailureReason = isTripOngoing(TripType.EXTERNAL_TRIP) ? StartTripFailureReason.TRIP_ALREADY_STARTED : toTripStartFailureReason(sdkStatus);
        }
        if (tripStartFailureReason != null) {
            brazeNotificationUtilsExternalSyntheticLambda14.serializer(new StartTripError(tripStartFailureReason, sdkStatus));
        }
        return tripStartFailureReason == null;
    }

    private boolean isSdkKillSwitched() {
        return ((Boolean) ifSdkIsInitializedWithUser(Boolean.FALSE, new getDiskCacheDir(8))).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$linkLegacyUser$5(BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14, UserLinkerAsync userLinkerAsync) {
        if (linkingPossible(brazeNotificationUtilsExternalSyntheticLambda14)) {
            ((registerGeofencesWithGeofencingClient) setPushUniqueId.read(registerGeofencesWithGeofencingClient.class)).read(userLinkerAsync, new r8lambdaSSzQFAg6bhoXOyJDO2xWrJylVQA(this, brazeNotificationUtilsExternalSyntheticLambda14), getAuthInfo().write());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$linkUser$4(UserLinker userLinker, String str, UserLinkerCallback userLinkerCallback) {
        if (userLinker.link(str)) {
            userLinkerCallback.onSuccess();
        } else {
            userLinkerCallback.onFailure();
        }
    }

    private void logInitializationDuration(long j, boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - j;
        Long lValueOf = this.mAsyncInitDuration;
        if (lValueOf == null) {
            lValueOf = Long.valueOf(j2);
        }
        long jLongValue = lValueOf.longValue();
        if (!z) {
            jLongValue = j2;
        }
        if (!userExists() || isSdkKillSwitched()) {
            return;
        }
        getVerticalAccuracy getverticalaccuracy = (getVerticalAccuracy) setPushUniqueId.read(getVerticalAccuracy.class);
        getCooldownEnterSeconds getcooldownenterseconds = (getCooldownEnterSeconds) setPushUniqueId.read(getCooldownEnterSeconds.class);
        boolean z2 = this.mIsBootstrapComplete;
        getverticalaccuracy.getClass();
        String str = z ? "async" : "sync";
        HashMap map = new HashMap();
        map.put("duration_millis", String.valueOf(j2));
        map.put("internal_init_complete", String.valueOf(z2));
        map.put("impact_duration_millis", String.valueOf(jLongValue));
        map.put("init_mode", str);
        getcooldownenterseconds.IconCompatParcelizer(getVerticalAccuracy.RemoteActionCompatParcelizer("sdk_init", (byte) 3, map, null, jCurrentTimeMillis));
    }

    @Override // com.sentiance.sdk.ISentiance
    public boolean isAllowedToUseMobileData() {
        return ((Boolean) ifSdkIsInitialized(Boolean.TRUE, new getDiskCacheDir(10))).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createLegacyUser$1(BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14, String str, UserLinkerAsync userLinkerAsync, String str2) {
        if (canUserCreationProceed(brazeNotificationUtilsExternalSyntheticLambda14)) {
            this.mOngoingUserCreationAppId = str;
            this.mIsUserCreationInProgress = true;
            this.mUserCreationPendingOperation = brazeNotificationUtilsExternalSyntheticLambda14;
            authenticate(str, str2, userLinkerAsync != null ? UserCreationType.FULL : UserCreationType.HARD, userLinkerAsync);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setSdkStatusUpdateListener$34(SdkStatusUpdateListener sdkStatusUpdateListener) {
        ((BannersDataStoreProviderCompanionExternalSyntheticLambda3) setPushUniqueId.read(BannersDataStoreProviderCompanionExternalSyntheticLambda3.class)).read(sdkStatusUpdateListener == null ? null : new createNotificationlambda0(1, sdkStatusUpdateListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUserActivityListener$45(UserActivityListener userActivityListener) {
        this.mUserActivityListener = userActivityListener;
        if (userActivityListener != null) {
            readBoolean.serializer(new getBitmapFromDiskCachelambda00(this, 2, userActivityListener));
        }
    }

    private void performAsyncReset(int i, handlePushperformWorklambda1 handlepushperformworklambda1) {
        if (!this.mIsNewInitializerCalled) {
            ((getCustomNotificationId) setPushUniqueId.read(getCustomNotificationId.class)).read();
            ((BannersDataStoreProviderCompanionExternalSyntheticLambda3) setPushUniqueId.read(BannersDataStoreProviderCompanionExternalSyntheticLambda3.class)).read((OnSdkStatusUpdateHandler) null);
        }
        int i2 = 0;
        this.mIsBootstrapComplete = false;
        this.mIsUserCreationInProgress = false;
        this.mIsSdkStartingOrStopping = false;
        this.mAsyncInitDuration = null;
        this.mSdkStartStopQueue.write();
        synchronized (this.mTokenRefreshLock) {
            this.mTokenResultCallbacks.clear();
        }
        getSentianceHandler().RemoteActionCompatParcelizer(new renderUrlIntoViewlambda1(i, i2, this, handlepushperformworklambda1));
    }

    private void processInitSuccess() {
        int i = 3;
        if (this.mIsUserCreationInProgress) {
            handleLegacyUserCreationResult(3, "");
        } else if (this.mOnInitCallback != null) {
            log("Returning init success to enclosing app", new Object[0]);
            readBoolean.write(new removeGeofencesRegisteredWithGeofencingClientlambda25(i, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserCreationOperationError(UserCreationFailureReason userCreationFailureReason, String str) {
        BrazeNotificationUtilsExternalSyntheticLambda14<UserCreationResult, UserCreationError> brazeNotificationUtilsExternalSyntheticLambda14 = this.mUserCreationPendingOperation;
        if (brazeNotificationUtilsExternalSyntheticLambda14 == null) {
            return;
        }
        brazeNotificationUtilsExternalSyntheticLambda14.serializer(new UserCreationError(userCreationFailureReason, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserCreationOperationResult() {
        BrazeNotificationUtilsExternalSyntheticLambda14<UserCreationResult, UserCreationError> brazeNotificationUtilsExternalSyntheticLambda14 = this.mUserCreationPendingOperation;
        if (brazeNotificationUtilsExternalSyntheticLambda14 == null) {
            return;
        }
        r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs = (r8lambdaw447glWJfoun4bg91upXnaDQEZs) setPushUniqueId.read(r8lambdaw447glWJfoun4bg91upXnaDQEZs.class);
        Optional<r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY> optionalWrite = r8lambdaw447glwjfoun4bg91upxnadqezs.write();
        String strSerializer = optionalWrite.IconCompatParcelizer() ? optionalWrite.write().serializer() : null;
        Token tokenRemoteActionCompatParcelizer = r8lambdaw447glwjfoun4bg91upxnadqezs.serializer().RemoteActionCompatParcelizer();
        if (strSerializer != null && tokenRemoteActionCompatParcelizer != null) {
            brazeNotificationUtilsExternalSyntheticLambda14.write(new UserCreationResult(new UserInfo(strSerializer, tokenRemoteActionCompatParcelizer)));
        } else {
            logErr("Successful legacy user creation, but missing userId and/or token in the auth store", new Object[0]);
            brazeNotificationUtilsExternalSyntheticLambda14.serializer(new UserCreationError(UserCreationFailureReason.UNEXPECTED_ERROR, "User ID or token is null"));
        }
    }

    @Override // com.sentiance.sdk.ISentiance
    public UserActivity getUserActivity() {
        return (UserActivity) ifSdkIsInitializedWithUser(getDefaultUserActivity(), new getDiskCacheDir(7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createLinkedUser$2(BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14, String str) {
        if (canUserCreationProceed(brazeNotificationUtilsExternalSyntheticLambda14)) {
            this.mIsUserCreationInProgress = true;
            this.mUserCreationPendingOperation = brazeNotificationUtilsExternalSyntheticLambda14;
            ((registerGeofencesWithGooglePlayIfNecessarylambda11) setPushUniqueId.read(registerGeofencesWithGooglePlayIfNecessarylambda11.class)).write(str, new getBitmapFromMemCache(1, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableDetections$10(BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14, Date date) {
        if (!userExists()) {
            brazeNotificationUtilsExternalSyntheticLambda14.serializer(new EnableDetectionsError(getSdkStatus(), EnableDetectionsFailureReason.NO_USER));
            return;
        }
        if (isSdkKillSwitched()) {
            brazeNotificationUtilsExternalSyntheticLambda14.serializer(new EnableDetectionsError(getSdkStatus(), EnableDetectionsFailureReason.USER_DISABLED_REMOTELY));
        } else if (date == null || !date.before(new Date())) {
            start(date, new shouldSkipCachinglambda0(brazeNotificationUtilsExternalSyntheticLambda14));
        } else {
            brazeNotificationUtilsExternalSyntheticLambda14.serializer(new EnableDetectionsError(getSdkStatus(), EnableDetectionsFailureReason.PAST_EXPIRY_DATE));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$linkUser$3(BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14, String str) {
        if (linkingPossible(brazeNotificationUtilsExternalSyntheticLambda14)) {
            ((r8lambdadjZXVOGWIc3ngZy46ZXLciOGj2U) setPushUniqueId.read(r8lambdadjZXVOGWIc3ngZy46ZXLciOGj2U.class)).IconCompatParcelizer(str, new r8lambdaSl3af_1zCuD6DwNVG4BIatmaN14(this, brazeNotificationUtilsExternalSyntheticLambda14));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestUserAccessToken$40(BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14) {
        if (!userExists()) {
            brazeNotificationUtilsExternalSyntheticLambda14.serializer(new UserAccessTokenError(UserAccessTokenFailureReason.NO_USER));
        } else if (isSdkKillSwitched()) {
            brazeNotificationUtilsExternalSyntheticLambda14.serializer(new UserAccessTokenError(UserAccessTokenFailureReason.USER_DISABLED_REMOTELY));
        } else {
            getUserAccessToken(new BrazeActionReceiver(brazeNotificationUtilsExternalSyntheticLambda14));
        }
    }

    private void publishSdkInitializedEvent() {
        getParallelExecutor().RemoteActionCompatParcelizer(new pNP$$ExternalSyntheticLambda0(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserLinkingOperationResult(BrazeNotificationUtilsExternalSyntheticLambda14<UserLinkingResult, UserLinkingError> brazeNotificationUtilsExternalSyntheticLambda14, r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqty) {
        UserInfo userInfo = getUserInfo(r8lambdazcbg_e0hjusjy78mvgh54swzqty);
        if (userInfo == null) {
            brazeNotificationUtilsExternalSyntheticLambda14.serializer(new UserLinkingError(UserLinkingFailureReason.UNEXPECTED_ERROR, "User token is unavailable"));
        } else {
            brazeNotificationUtilsExternalSyntheticLambda14.write(new UserLinkingResult(userInfo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public UserLinkingFailureReason toUserLinkingFailureReason(int i) {
        if (i != 0) {
            if (i == 4) {
                return UserLinkingFailureReason.APP_SIDE_LINKING_FAILED;
            }
            if (i != 6) {
                return UserLinkingFailureReason.SERVER_ERROR;
            }
        }
        return UserLinkingFailureReason.NETWORK_ERROR;
    }

    @Override // com.sentiance.sdk.ISentiance
    public SdkStatus getSdkStatus() {
        return (SdkStatus) ifSdkIsInitializedWithUser(getDefaultSdkStatus(), new getDiskCacheDir(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logErr(String str, Object... objArr) {
        parseLonglambda0 parselonglambda0 = this.mLogger;
        if (parselonglambda0 != null) {
            parselonglambda0.RemoteActionCompatParcelizer(str, objArr);
        }
    }

    @Override // com.sentiance.sdk.ISentiance
    public long getDiskQuotaLimit() {
        return ((Long) ifSdkIsInitializedWithUser(0L, new getDiskCacheDir(2))).longValue();
    }

    @Override // com.sentiance.sdk.ISentiance
    public long getDiskQuotaUsage() {
        return ((Long) ifSdkIsInitializedWithUser(0L, new getDiskCacheDir(6))).longValue();
    }

    @Override // com.sentiance.sdk.ISentiance
    public long getMobileQuotaLimit() {
        return ((Long) ifSdkIsInitializedWithUser(0L, new getDiskCacheDir(1))).longValue();
    }

    @Override // com.sentiance.sdk.ISentiance
    public long getWiFiQuotaLimit() {
        return ((Long) ifSdkIsInitializedWithUser(0L, new getDiskCacheDir(0))).longValue();
    }

    @Override // com.sentiance.sdk.ISentiance
    public long getWiFiQuotaUsage() {
        return ((Long) ifSdkIsInitializedWithUser(0L, new getDiskCacheDir(5))).longValue();
    }

    @Override // com.sentiance.sdk.ISentiance
    public long getMobileQuotaUsage() {
        return ((Long) ifSdkIsInitializedWithUser(0L, new getDiskCacheDir(11))).longValue();
    }

    @Override // com.sentiance.sdk.ISentiance
    @Deprecated
    public void start(OnStartFinishedHandler onStartFinishedHandler) {
        start(null, onStartFinishedHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint
    public void updateInitStateAndNotify(int i, String str) {
        int i2 = this.mIsNewInitializerCalled ? 2 : 0;
        if (i == 3) {
            i2 = 3;
        }
        boolean zIconCompatParcelizer = this.mSdkInitState.IconCompatParcelizer(i2);
        if (i != 3 || !zIconCompatParcelizer) {
            processInitFailure(i, str);
            return;
        }
        if (this.mOngoingUserCreationAppId != null) {
            ((r8lambdaw447glWJfoun4bg91upXnaDQEZs) setPushUniqueId.read(r8lambdaw447glWJfoun4bg91upXnaDQEZs.class)).serializer(this.mOngoingUserCreationAppId);
        }
        publishSdkInitializedEvent();
        processInitSuccess();
    }

    @Override // com.sentiance.sdk.ISentiance
    @Deprecated
    public void startTrip(Map<String, String> map, TransportMode transportMode, StartTripCallback startTripCallback) {
        ifSdkIsInitializedWithUser(new renderUrlIntoView(this, startTripCallback, transportMode, map));
    }

    @Override // com.sentiance.sdk.ISentiance
    public PendingOperation<EnableDetectionsResult, EnableDetectionsError> enableDetections() {
        return enableDetections(null);
    }

    @Override // com.sentiance.sdk.ISentiance
    @Deprecated
    public void stopTrip(StopTripCallback stopTripCallback) {
        ifSdkIsInitializedWithUser(new getBitmapFromUrllambda3(this, stopTripCallback, 1));
    }

    private PendingOperation<UserCreationResult, UserCreationError> createLinkedUser(String str) {
        BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14 = new BrazeNotificationUtilsExternalSyntheticLambda14();
        ifSdkIsInitialized(new putBitmapIntoCachelambda1(this, brazeNotificationUtilsExternalSyntheticLambda14, str, 1));
        return brazeNotificationUtilsExternalSyntheticLambda14;
    }

    @Override // com.sentiance.sdk.ISentiance
    public InitializationResult initialize(SentianceOptions sentianceOptions) {
        InitializationResult initializationResultInitializeInternal;
        synchronized (this) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            prepareForDelayedSdkInitDetection(sentianceOptions);
            initializationResultInitializeInternal = initializeInternal(sentianceOptions, jCurrentTimeMillis, false);
        }
        return initializationResultInitializeInternal;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0022  */
    /* JADX WARN: Code duplicated, block: B:21:0x002c  */
    private Pair<UserCreationFailureReason, String> getUserCreationFailureReasonFromAuthResult(int i, String str) {
        String str2;
        UserCreationFailureReason userCreationFailureReason = UserCreationFailureReason.UNEXPECTED_ERROR;
        if (i == 0) {
            userCreationFailureReason = UserCreationFailureReason.NETWORK_ERROR;
            str2 = "Connectivity failure";
        } else if (i == 1) {
            userCreationFailureReason = UserCreationFailureReason.SERVER_ERROR;
            str2 = "Invalid credentials";
        } else if (i == 2) {
            userCreationFailureReason = UserCreationFailureReason.SERVER_ERROR;
            str2 = "Server error";
        } else if (i == 4) {
            userCreationFailureReason = UserCreationFailureReason.APP_SIDE_LINKING_FAILED;
            str2 = str;
        } else if (i == 5) {
            userCreationFailureReason = UserCreationFailureReason.SERVER_ERROR;
            str2 = "User linking is disabled for this app ID";
        } else if (i == 6) {
            userCreationFailureReason = UserCreationFailureReason.NETWORK_ERROR;
            str2 = "Connectivity failure";
        } else if (i != 7) {
            str2 = "";
        } else {
            userCreationFailureReason = UserCreationFailureReason.SERVER_ERROR;
            str2 = "Server error";
        }
        if (str.isEmpty()) {
            str = str2;
        }
        return new Pair<>(userCreationFailureReason, str);
    }

    @Override // com.sentiance.sdk.ISentiance
    @SuppressLint
    public PendingOperation<UserLinkingResult, UserLinkingError> linkUser(UserLinkerAsync userLinkerAsync) {
        BrazeNotificationUtilsExternalSyntheticLambda14<UserLinkingResult, UserLinkingError> brazeNotificationUtilsExternalSyntheticLambda14 = new BrazeNotificationUtilsExternalSyntheticLambda14<>();
        if (userLinkerAsync != UserLinkerAsync.NO_OP) {
            linkLegacyUser(brazeNotificationUtilsExternalSyntheticLambda14, userLinkerAsync);
            return brazeNotificationUtilsExternalSyntheticLambda14;
        }
        MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("UserLinkerAsync.NO_OP can not be used with `linkUser`");
        return null;
    }

    @Override // com.sentiance.sdk.ISentiance
    public PendingOperation<UserLinkingResult, UserLinkingError> linkUser(String str) {
        BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14 = new BrazeNotificationUtilsExternalSyntheticLambda14();
        ifSdkIsInitialized(new putBitmapIntoCachelambda1(this, brazeNotificationUtilsExternalSyntheticLambda14, str, 0));
        return brazeNotificationUtilsExternalSyntheticLambda14;
    }

    @Override // com.sentiance.sdk.ISentiance
    @Deprecated
    public void submitDetections(SubmitDetectionsCallback submitDetectionsCallback) {
        ifSdkIsInitializedWithUser(new getBitmapFromUrllambda3(this, submitDetectionsCallback, 7));
    }

    @Override // com.sentiance.sdk.ISentiance
    public PendingOperation<ResetResult, ResetError> reset() {
        BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14;
        synchronized (this) {
            brazeNotificationUtilsExternalSyntheticLambda14 = new BrazeNotificationUtilsExternalSyntheticLambda14();
            brazeNotificationUtilsExternalSyntheticLambda14.read();
            reset(new handlePushperformWorklambda1((BrazeNotificationUtilsExternalSyntheticLambda14<ResetResult, ResetError>) brazeNotificationUtilsExternalSyntheticLambda14));
        }
        return brazeNotificationUtilsExternalSyntheticLambda14;
    }

    @Override // com.sentiance.sdk.ISentiance
    @Deprecated
    public void reset(ResetCallback resetCallback) {
        synchronized (this) {
            reset(new handlePushperformWorklambda1(resetCallback));
        }
    }

    @Override // com.sentiance.sdk.ISentiance
    @Deprecated
    public void stop() {
        ifSdkIsInitializedWithUser(new setOfflinelambda0(this, 0));
    }
}
