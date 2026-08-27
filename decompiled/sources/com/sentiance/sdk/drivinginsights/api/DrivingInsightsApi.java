package com.sentiance.sdk.drivinginsights.api;

import android.annotation.SuppressLint;
import android.content.Context;
import com.incognia.internal.ZM$$ExternalSyntheticLambda0;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.util.N;
import io.sentry.Scopes$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.List;
import o.GooglePlayLocationUtilsretrieveRegisteredGeofencesFromLocalStorageinlinedreadList1;
import o.createFromParcel;
import o.doesKeyExist;
import o.getAnalyticsEnabledEnterannotations;
import o.getLargeIcon;
import o.migrateFeatureFlagStorageToJsonlambda20;
import o.onLocationRequestComplete;
import o.parseLonglambda0;
import o.populateNotificationBuilderlambda0;
import o.r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI;
import o.r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0;
import o.readBoolean;
import o.registerGeofenceslambda21;
import o.registerGeofenceslambda22;
import o.registerGeofenceslambda23;
import o.setConfiguredCustomEndpointandroid_sdk_base_release;
import o.setPushUniqueId;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class DrivingInsightsApi extends N implements IDrivingInsightsApi {
    private static final String GUARD_TAG = "DrivingInsightsApi";
    private static final String LOG_TAG = "DrivingInsightsApi";

    @SuppressLint
    private static DrivingInsightsApi sInstance;
    private final Context mContext;
    private onLocationRequestComplete mDrivingInsightsProvider;
    private HarshDrivingEventListener mHarshDrivingEventListener = null;
    private parseLonglambda0 mLogger;
    private migrateFeatureFlagStorageToJsonlambda20 mTimelineUtil;

    private parseLonglambda0 getLogger() {
        parseLonglambda0 parselonglambda0;
        synchronized (this) {
            if (this.mLogger == null) {
                this.mLogger = new parseLonglambda0(this.mContext, "DrivingInsightsApi", (r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class), (r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0) setPushUniqueId.read(r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0.class));
            }
            parselonglambda0 = this.mLogger;
        }
        return parselonglambda0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ HarshDrivingEventListener lambda$setHarshDrivingEventListener$0(HarshDrivingEventListener harshDrivingEventListener) {
        this.mHarshDrivingEventListener = harshDrivingEventListener;
        return harshDrivingEventListener;
    }

    private void addOnBootstrapCompleteListener() {
        populateNotificationBuilderlambda0.RemoteActionCompatParcelizer(this.mContext).RemoteActionCompatParcelizer(new registerGeofenceslambda23(this, 0));
    }

    public static DrivingInsightsApi getInstance(Context context) {
        DrivingInsightsApi drivingInsightsApi;
        synchronized (DrivingInsightsApi.class) {
            if (sInstance == null) {
                sInstance = new DrivingInsightsApi(context.getApplicationContext());
            }
            drivingInsightsApi = sInstance;
        }
        return drivingInsightsApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBootstrapComplete() {
        ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).RemoteActionCompatParcelizer(setConfiguredCustomEndpointandroid_sdk_base_release.class, new registerGeofenceslambda22(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ createFromParcel lambda$setDrivingInsightsReadyListener$5(DrivingInsightsReadyListener drivingInsightsReadyListener, DrivingInsights drivingInsights) {
        readBoolean.serializer(new Scopes$$ExternalSyntheticLambda0(drivingInsightsReadyListener, 1, drivingInsights));
        return createFromParcel.INSTANCE;
    }

    @Override // com.sentiance.sdk.drivinginsights.api.IDrivingInsightsApi
    public Float getAverageOverallSafetyScore(SafetyScoreRequestParameters safetyScoreRequestParameters) {
        return (Float) ifSdkIsInitializedWithUser((Object) null, new getLargeIcon(this, 1, safetyScoreRequestParameters));
    }

    @Override // com.sentiance.sdk.drivinginsights.api.IDrivingInsightsApi
    public DrivingInsights getDrivingInsights(String str) {
        return (DrivingInsights) ifSdkIsInitializedWithUser(new GooglePlayLocationUtilsretrieveRegisteredGeofencesFromLocalStorageinlinedreadList1(this, str, 3));
    }

    @Override // com.sentiance.sdk.drivinginsights.api.IDrivingInsightsApi
    public void setDrivingInsightsReadyListener(DrivingInsightsReadyListener drivingInsightsReadyListener) {
        ifSdkIsInitialized(new doesKeyExist(this, drivingInsightsReadyListener, 2));
    }

    public void setHarshDrivingEventListener(HarshDrivingEventListener harshDrivingEventListener) {
        ifSdkIsInitialized(new GooglePlayLocationUtilsretrieveRegisteredGeofencesFromLocalStorageinlinedreadList1(this, harshDrivingEventListener, 2));
        if (harshDrivingEventListener != null) {
            log("Harsh driving listener has been set", new Object[0]);
        } else {
            log("Harsh driving listener has been unset", new Object[0]);
        }
    }

    public void setPhoneUsageEventListener(PhoneUsageEventListener phoneUsageEventListener) {
        ifSdkIsInitialized(new doesKeyExist(this, phoneUsageEventListener, 1));
        if (phoneUsageEventListener != null) {
            log("Phone usage listener has been set", new Object[0]);
        } else {
            log("Phone usage listener has been unset", new Object[0]);
        }
    }

    public DrivingInsightsApi(Context context) {
        this.mContext = context;
        addOnBootstrapCompleteListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Float lambda$getAverageOverallSafetyScore$14(SafetyScoreRequestParameters safetyScoreRequestParameters) {
        return getDrivingInsightsProvider().read(safetyScoreRequestParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getCallEvents$11(String str) {
        return getDrivingInsightsProvider().write(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getCallWhileMovingEvents$10(String str) {
        return getDrivingInsightsProvider().RemoteActionCompatParcelizer(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DrivingInsights lambda$getDrivingInsights$7(String str) {
        return getDrivingInsightsProvider().IconCompatParcelizer(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getHarshDrivingEvents$8(String str) {
        return getDrivingInsightsProvider().serializer(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getPhoneUsageEvents$9(String str) {
        return getDrivingInsightsProvider().read(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getSpeedingEvents$12(String str) {
        return getDrivingInsightsProvider().MediaDescriptionCompat(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getWrongWayDrivingEvents$13(String str) {
        return getDrivingInsightsProvider().MediaSessionCompatQueueItem(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ createFromParcel lambda$setPhoneUsageEventListener$2(PhoneUsageEventListener phoneUsageEventListener, PhoneUsageEvent phoneUsageEvent) {
        readBoolean.serializer(new ZM$$ExternalSyntheticLambda0(phoneUsageEventListener, 29, phoneUsageEvent));
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void log(String str, Object... objArr) {
        getLogger().IconCompatParcelizer(str, objArr);
    }

    @Override // com.sentiance.sdk.drivinginsights.api.IDrivingInsightsApi
    public List<CallEvent> getCallEvents(String str) {
        return (List) ifSdkIsInitializedWithUser(Collections.EMPTY_LIST, new registerGeofenceslambda21(this, str, 0));
    }

    @Override // com.sentiance.sdk.drivinginsights.api.IDrivingInsightsApi
    @Deprecated(since = "6.20.0")
    public List<CallWhileMovingEvent> getCallWhileMovingEvents(String str) {
        return (List) ifSdkIsInitializedWithUser(Collections.EMPTY_LIST, new registerGeofenceslambda21(this, str, 2));
    }

    @Override // com.sentiance.sdk.drivinginsights.api.IDrivingInsightsApi
    public List<HarshDrivingEvent> getHarshDrivingEvents(String str) {
        return (List) ifSdkIsInitializedWithUser(Collections.EMPTY_LIST, new registerGeofenceslambda21(this, str, 5));
    }

    @Override // com.sentiance.sdk.drivinginsights.api.IDrivingInsightsApi
    public List<PhoneUsageEvent> getPhoneUsageEvents(String str) {
        return (List) ifSdkIsInitializedWithUser(Collections.EMPTY_LIST, new registerGeofenceslambda21(this, str, 4));
    }

    @Override // com.sentiance.sdk.drivinginsights.api.IDrivingInsightsApi
    public List<SpeedingEvent> getSpeedingEvents(String str) {
        return (List) ifSdkIsInitializedWithUser(Collections.EMPTY_LIST, new registerGeofenceslambda21(this, str, 3));
    }

    @Override // com.sentiance.sdk.drivinginsights.api.IDrivingInsightsApi
    public List<WrongWayDrivingEvent> getWrongWayDrivingEvents(String str) {
        return (List) ifSdkIsInitializedWithUser(Collections.EMPTY_LIST, new registerGeofenceslambda21(this, str, 1));
    }

    private onLocationRequestComplete getDrivingInsightsProvider() {
        if (this.mDrivingInsightsProvider == null) {
            this.mDrivingInsightsProvider = (onLocationRequestComplete) setPushUniqueId.read(onLocationRequestComplete.class);
        }
        return this.mDrivingInsightsProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public migrateFeatureFlagStorageToJsonlambda20 getTimelineUtil() {
        if (this.mTimelineUtil == null) {
            this.mTimelineUtil = (migrateFeatureFlagStorageToJsonlambda20) setPushUniqueId.read(migrateFeatureFlagStorageToJsonlambda20.class);
        }
        return this.mTimelineUtil;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDrivingInsightsReadyListener$6(DrivingInsightsReadyListener drivingInsightsReadyListener) {
        getDrivingInsightsProvider().IconCompatParcelizer(drivingInsightsReadyListener == null ? null : new TncContentKt$$ExternalSyntheticLambda2(27, drivingInsightsReadyListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPhoneUsageEventListener$3(PhoneUsageEventListener phoneUsageEventListener) {
        getDrivingInsightsProvider().write(phoneUsageEventListener == null ? null : new TncContentKt$$ExternalSyntheticLambda2(26, phoneUsageEventListener));
    }
}
