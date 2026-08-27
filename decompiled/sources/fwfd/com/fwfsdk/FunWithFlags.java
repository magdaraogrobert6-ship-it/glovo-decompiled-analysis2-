package fwfd.com.fwfsdk;

import android.content.Context;
import fwfd.com.fwfsdk.constant.FWFConstants;
import fwfd.com.fwfsdk.manager.FWFFallbackManager;
import fwfd.com.fwfsdk.manager.FWFFeatureManager;
import fwfd.com.fwfsdk.manager.callback.FWFFeatureCallback;
import fwfd.com.fwfsdk.manager.callback.FWFFeaturesCallback;
import fwfd.com.fwfsdk.manager.callback.FWFFlagKeysCallback;
import fwfd.com.fwfsdk.model.api.FWFSubscribeResult;
import fwfd.com.fwfsdk.model.api.FlagKeysContainer;
import fwfd.com.fwfsdk.model.db.FWFConfig;
import fwfd.com.fwfsdk.model.db.FWFFallback;
import fwfd.com.fwfsdk.model.db.FWFUser;
import fwfd.com.fwfsdk.tracker.FWFTracker;
import fwfd.com.fwfsdk.util.FWFLogger;
import fwfd.com.fwfsdk.util.FWFSubscribeObserverCallback;
import fwfd.com.fwfsdk.util.FWFTimerTask;
import fwfd.com.fwfsdk.util.FWFTrackingCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.getShortEdge;

/* JADX INFO: loaded from: classes5.dex */
public class FunWithFlags {
    private static FunWithFlags instance;
    private Context context;
    private FWFUser user = new FWFUser();
    private FWFConfig fwfConfig = new FWFConfig.Builder("").build();
    private List<FWFTracker> trackers = new ArrayList();

    public static FWFLogger.FWFLogLevel getLogLevel() {
        return FWFLogger.logLevel;
    }

    public static void setLogLevel(FWFLogger.FWFLogLevel fWFLogLevel) {
        FWFLogger.logLevel = fWFLogLevel;
    }

    public void eraseData() {
        FWFFeatureManager.eraseData();
    }

    public Context getContext() {
        return this.context;
    }

    public FWFConfig getFwfConfig() {
        return this.fwfConfig;
    }

    public List<FWFTracker> getTrackers() {
        return this.trackers;
    }

    public FWFUser getUser() {
        return this.user;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setUser(FWFUser fWFUser) {
        this.user = fWFUser;
    }

    public void subscribeObserver(FWFSubscribeObserverCallback fWFSubscribeObserverCallback) {
        FWFFeatureManager.subscribeObserver(null, fWFSubscribeObserverCallback);
    }

    private Boolean isValidUser() {
        String userId = this.user.getUserId();
        String googleClientId = this.user.getGoogleClientId();
        boolean z = userId == null || userId.isEmpty();
        boolean z2 = googleClientId == null || googleClientId.isEmpty();
        if (!z || !z2) {
            return Boolean.TRUE;
        }
        FWFLogger.logWarning("FunWithFlags: you must provide an identifier (key, userId, googleClientId)\"");
        return Boolean.FALSE;
    }

    public void addCustomHttpClientInterceptor(getShortEdge getshortedge) {
        this.fwfConfig.addCustomInterceptor(getshortedge);
        FWFLogger.logVerbose("FunWithFlags: Adding custom HttpClient interceptor");
    }

    public void addTracker(FWFTracker fWFTracker) {
        this.trackers.add(fWFTracker);
    }

    @Deprecated
    public void configureWith(FWFConstants.Region region, String str, FWFConstants.API api, float f, float f2, float f3, FWFLogger.FWFLogLevel fWFLogLevel, Boolean bool, boolean z) {
        this.fwfConfig.setBaseUrl(region);
        this.fwfConfig.setAccessToken(str);
        this.fwfConfig.setApiVersion(api);
        this.fwfConfig.setConnectionTimeout(f);
        this.fwfConfig.setFlagKeysExpirationTime(Float.valueOf(f3));
        this.fwfConfig.setFeatureExpirationTime(f2);
        this.fwfConfig.setDebugMode(z);
        if (z) {
            FWFLogger.logLevel = FWFLogger.FWFLogLevel.debug;
        } else {
            FWFLogger.logLevel = fWFLogLevel;
        }
        if (bool.booleanValue()) {
            cleanDBOnVersionUpdate();
        }
        FWFLogger.logInfo("FunWithFlags: configured with Base url: " + this.fwfConfig.getBaseUrl() + " Access Token: " + str);
    }

    public String getAccessToken() {
        return this.fwfConfig.getAccessToken();
    }

    public String getApiVersion() {
        return this.fwfConfig.getApiVersion();
    }

    public String getBaseUrl() {
        return this.fwfConfig.getBaseUrl();
    }

    public float getConnectionTimeout() {
        return this.fwfConfig.getConnectionTimeout();
    }

    public Float getFeatureExpirationTime() {
        return this.fwfConfig.getFeatureExpirationTime();
    }

    public Float getFlagKeysExpirationTime() {
        return this.fwfConfig.getFlagKeysExpirationTime();
    }

    public String getLocalUrl() {
        return this.fwfConfig.getLocalUrl();
    }

    public void getVariation(String str, String str2, FWFFallback fWFFallback, boolean z, FWFFeatureCallback fWFFeatureCallback) {
        if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty()) {
            getFWFVariation(str, str2, fWFFallback, z, fWFFeatureCallback);
        } else {
            FWFFallbackManager.createFWFResultFallback(this.context, str, str2, fWFFallback, "FunWithFlags: Required values missing. You must provide a valid Access Token or Flag Key", fWFFeatureCallback);
            FWFLogger.logWarning("FunWithFlags: you must provide a valid Access Token");
        }
    }

    public void getVariationWithTrackEvent(String str, String str2, FWFFallback fWFFallback, boolean z, Map<String, String> map, FWFFeatureCallback fWFFeatureCallback) {
        if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty()) {
            getFWFVariationWithTracking(str, str2, fWFFallback, z, map, fWFFeatureCallback);
        } else {
            FWFFallbackManager.createFWFResultFallback(this.context, str, str2, fWFFallback, "FunWithFlags: Required values missing. You must provide a valid Access Token or Flag Key", fWFFeatureCallback);
            FWFLogger.logWarning("FunWithFlags: you must provide a valid Access Token");
        }
    }

    public void getVariations(HashMap<String, FWFFallback> map, String str, boolean z, FWFFeaturesCallback fWFFeaturesCallback) {
        if (str != null && !str.isEmpty()) {
            getFWFVariations(map, str, z, fWFFeaturesCallback);
        } else {
            FWFFallbackManager.createFWFResultsFallback(this.context, map, str, "FunWithFlags: Required values missing", fWFFeaturesCallback);
            FWFLogger.logWarning("FunWithFlags: you must provide a valid Access Token");
        }
    }

    public void getVariationsWithTrackEvents(HashMap<String, FWFFallback> map, String str, boolean z, Map<String, String> map2, FWFFeaturesCallback fWFFeaturesCallback) {
        if (str != null && !str.isEmpty()) {
            getFWFVariationsWithTracking(map, str, z, map2, fWFFeaturesCallback);
        } else {
            FWFFallbackManager.createFWFResultsFallback(this.context, map, str, "FunWithFlags: Required values missing", fWFFeaturesCallback);
            FWFLogger.logWarning("FunWithFlags: you must provide a valid Access Token");
        }
    }

    public boolean isDebugMode() {
        return this.fwfConfig.isDebugMode();
    }

    public void removeLocalUrl() {
        this.fwfConfig.removeLocalUrl();
        FWFLogger.logVerbose("FunWithFlags: Local url removed");
    }

    public void setBaseUrl(FWFConstants.Region region) {
        this.fwfConfig.setBaseUrl(region);
        FWFLogger.logVerbose("FunWithFlags: baseUrl changed to: " + this.fwfConfig.getBaseUrl());
    }

    public void setLocalUrl(String str) {
        this.fwfConfig.setLocalUrl(str);
        FWFLogger.logVerbose("FunWithFlags: API Url changed to: " + this.fwfConfig.getLocalUrl());
    }

    public void cleanDBOnVersionUpdate() {
        if (this.context != null) {
            FWFFeatureManager.cleanDBOnVersionUpdate();
        }
    }

    public void getExperimentsToTrack(FWFTrackingCallback fWFTrackingCallback) {
        Context context = this.context;
        if (context != null) {
            FWFFeatureManager.getExperimentsToTrack(context, fWFTrackingCallback);
        } else {
            fWFTrackingCallback.onResponse("");
            FWFLogger.logError("FunWithFlags: you must provide application context");
        }
    }

    public void getFlags(String str, Boolean bool, FWFFeaturesCallback fWFFeaturesCallback) {
        if (!getApiVersion().equals(FWFConstants.API.API_VERSION_V3.getValue())) {
            FWFLogger.logWarning("FunWithFlags: Required api version v3 for this feature to work.");
            fWFFeaturesCallback.onFwfResponse(new HashMap<>());
        } else if (this.context != null && str != null && !str.isEmpty() && isValidUser().booleanValue()) {
            FWFFeatureManager.getFlags(str, bool, fWFFeaturesCallback);
        } else {
            fWFFeaturesCallback.onFwfResponse(new HashMap<>());
            FWFLogger.logWarning("FunWithFlags: Required values missing.");
        }
    }

    public void getFlagsToTrack(FWFTrackingCallback fWFTrackingCallback) {
        Context context = this.context;
        if (context != null) {
            FWFFeatureManager.getFlagsToTrack(context, fWFTrackingCallback);
        } else {
            fWFTrackingCallback.onResponse("");
            FWFLogger.logError("FunWithFlags: you must provide application context");
        }
    }

    public void getFlagsWithTrackEvents(String str, Boolean bool, Map<String, String> map, FWFFeaturesCallback fWFFeaturesCallback) {
        if (!getApiVersion().equals(FWFConstants.API.API_VERSION_V3.getValue())) {
            FWFLogger.logWarning("FunWithFlags: Required api version v3 for this feature to work.");
            fWFFeaturesCallback.onFwfResponse(new HashMap<>());
        } else if (this.context != null && str != null && !str.isEmpty() && isValidUser().booleanValue()) {
            FWFFeatureManager.getFlagsFromApiWithTracking(str, bool, map, fWFFeaturesCallback);
        } else {
            fWFFeaturesCallback.onFwfResponse(new HashMap<>());
            FWFLogger.logWarning("FunWithFlags: Required values missing.");
        }
    }

    public void setAccessToken(String str) {
        FWFLogger.logVerbose("FunWithFlags: accessToken changed to: " + str);
        this.fwfConfig.setAccessToken(str);
    }

    public void setApiVersion(FWFConstants.API api) {
        FWFLogger.logVerbose("FunWithFlags: apiVersion changed to: " + api);
        this.fwfConfig.setApiVersion(api);
    }

    public void setConnectionTimeout(float f) {
        FWFLogger.logVerbose("FunWithFlags: connectionTimeout changed to: " + f);
        this.fwfConfig.setConnectionTimeout(f);
    }

    public void setFeatureExpirationTime(float f) {
        FWFLogger.logVerbose("FunWithFlags: featureExpirationTime changed to: " + f);
        this.fwfConfig.setFeatureExpirationTime(f);
        if (this.context != null) {
            FWFTimerTask.getInstance().restartTimerOnFeatureExpirationTimeChanged();
        }
    }

    public void startTrackingSubscribedFlags() {
        if (this.context == null) {
            FWFLogger.logError("FunWithFlags: Error starting flag tracking. Context is null. Flag tracking is disabled.");
        } else {
            FWFTimerTask.getInstance().startTimer();
            FWFLogger.logDebug("FunWithFlags: Subscribed flags tracking started.");
        }
    }

    public void stopTrackingSubscribedFlags() {
        if (this.context != null) {
            FWFTimerTask.getInstance().stopTimer();
            FWFLogger.logDebug("FunWithFlags: Subscribed flags tracking stopped.");
        }
    }

    public void subscribeObserver(String str, FWFSubscribeObserverCallback fWFSubscribeObserverCallback) {
        FWFFeatureManager.subscribeObserver(str, fWFSubscribeObserverCallback);
    }

    private void getFWFVariation(String str, String str2, FWFFallback fWFFallback, boolean z, FWFFeatureCallback fWFFeatureCallback) {
        if (!requiredValuesAreConfigured()) {
            FWFFallbackManager.createFWFResultFallback(this.context, str, str2, fWFFallback, "FunWithFlags: Required values missing", fWFFeatureCallback);
        } else if (z) {
            FWFFeatureManager.getVariationFromApi(str, str2, fWFFallback, FWFSubscribeResult.FWFSubscribeCallbackExplanation.SINGLE_FLAG_UPDATE, fWFFeatureCallback);
        } else {
            FWFFeatureManager.getVariationFromDB(str, str2, fWFFallback, FWFSubscribeResult.FWFSubscribeCallbackExplanation.SINGLE_FLAG_UPDATE, fWFFeatureCallback);
        }
    }

    private void getFWFVariationWithTracking(String str, String str2, FWFFallback fWFFallback, boolean z, Map<String, String> map, FWFFeatureCallback fWFFeatureCallback) {
        if (!requiredValuesAreConfigured()) {
            FWFFallbackManager.createFWFResultFallback(this.context, str, str2, fWFFallback, "FunWithFlags: Required values missing", fWFFeatureCallback);
        } else if (z) {
            FWFFeatureManager.getVariationFromApiWithTracking(str, str2, fWFFallback, FWFSubscribeResult.FWFSubscribeCallbackExplanation.SINGLE_FLAG_UPDATE, map, fWFFeatureCallback);
        } else {
            FWFFeatureManager.getVariationFromDBWithTracking(str, str2, fWFFallback, FWFSubscribeResult.FWFSubscribeCallbackExplanation.SINGLE_FLAG_UPDATE, map, fWFFeatureCallback);
        }
    }

    private void getFWFVariations(HashMap<String, FWFFallback> map, String str, boolean z, FWFFeaturesCallback fWFFeaturesCallback) {
        if (!requiredValuesAreConfigured()) {
            FWFFallbackManager.createFWFResultsFallback(this.context, map, str, "FunWithFlags: Required values missing", fWFFeaturesCallback);
        } else if (z) {
            FWFFeatureManager.getVariationsFromApi(map, str, FWFSubscribeResult.FWFSubscribeCallbackExplanation.MULTI_FLAG_UPDATE, fWFFeaturesCallback);
        } else {
            FWFFeatureManager.getVariationsFromDB(map, str, FWFSubscribeResult.FWFSubscribeCallbackExplanation.MULTI_FLAG_UPDATE, fWFFeaturesCallback);
        }
    }

    private void getFWFVariationsWithTracking(HashMap<String, FWFFallback> map, String str, boolean z, Map<String, String> map2, FWFFeaturesCallback fWFFeaturesCallback) {
        if (!requiredValuesAreConfigured()) {
            FWFFallbackManager.createFWFResultsFallback(this.context, map, str, "FunWithFlags: Required values missing", fWFFeaturesCallback);
        } else if (z) {
            FWFFeatureManager.getVariationsFromApiWithTracking(map, str, FWFSubscribeResult.FWFSubscribeCallbackExplanation.MULTI_FLAG_UPDATE, map2, fWFFeaturesCallback);
        } else {
            FWFFeatureManager.getVariationsFromDBWithTracking(map, str, FWFSubscribeResult.FWFSubscribeCallbackExplanation.MULTI_FLAG_UPDATE, map2, fWFFeaturesCallback);
        }
    }

    public static FunWithFlags getInstance() {
        if (instance == null) {
            instance = new FunWithFlags();
        }
        return instance;
    }

    public void getFlagKeys(FWFFlagKeysCallback fWFFlagKeysCallback) {
        if (getAccessToken() != null && !getAccessToken().isEmpty()) {
            FWFFeatureManager.getFlagKeys(getAccessToken(), fWFFlagKeysCallback);
        } else {
            FWFLogger.logError("FunWithFlags: you must provide a valid access token.");
            fWFFlagKeysCallback.onResponse(new FlagKeysContainer(new ArrayList()));
        }
    }

    public void subscribeFeatures(String[] strArr, String str) {
        if (requiredValuesAreConfigured()) {
            FWFFeatureManager.subscribeFeatures(strArr, str);
        }
    }

    private boolean requiredValuesAreConfigured() {
        if (this.context == null) {
            FWFLogger.logWarning("FunWithFlags: you must provide application context");
            return false;
        }
        if (this.fwfConfig.getBaseUrl().isEmpty() && this.fwfConfig.getLocalUrl().isEmpty()) {
            FWFLogger.logWarning("FunWithFlags: you must provide a valid Url");
            return false;
        }
        if (this.fwfConfig.getAccessToken() != null && !this.fwfConfig.getAccessToken().isEmpty()) {
            return isValidUser().booleanValue();
        }
        FWFLogger.logWarning("FunWithFlags: you must provide a valid Access Token");
        return false;
    }

    public void subscribeFeatures(String[] strArr, String str, FWFFeaturesCallback fWFFeaturesCallback) {
        if (requiredValuesAreConfigured()) {
            FWFFeatureManager.subscribeFeatures(strArr, str, fWFFeaturesCallback);
        }
    }

    public void getVariations(HashMap<String, FWFFallback> map, boolean z, FWFFeaturesCallback fWFFeaturesCallback) {
        getFWFVariations(map, getAccessToken(), z, fWFFeaturesCallback);
    }

    public void getVariationsWithTrackEvents(HashMap<String, FWFFallback> map, boolean z, Map<String, String> map2, FWFFeaturesCallback fWFFeaturesCallback) {
        getFWFVariationsWithTracking(map, getAccessToken(), z, map2, fWFFeaturesCallback);
    }

    public void getVariation(String str, FWFFallback fWFFallback, boolean z, FWFFeatureCallback fWFFeatureCallback) {
        getVariation(str, getAccessToken(), fWFFallback, z, fWFFeatureCallback);
    }

    public void getVariationWithTrackEvent(String str, FWFFallback fWFFallback, boolean z, Map<String, String> map, FWFFeatureCallback fWFFeatureCallback) {
        getVariationWithTrackEvent(str, getAccessToken(), fWFFallback, z, map, fWFFeatureCallback);
    }

    public void getFlagKeys(String str, FWFFlagKeysCallback fWFFlagKeysCallback) {
        if (str != null && !str.isEmpty()) {
            FWFFeatureManager.getFlagKeys(str, fWFFlagKeysCallback);
        } else {
            FWFLogger.logWarning("FunWithFlags: you must provide a valid access token.");
        }
    }

    public void getFlagKeys(String str, Float f, FWFFlagKeysCallback fWFFlagKeysCallback) {
        if (str != null && !str.isEmpty() && f != null) {
            this.fwfConfig.setFlagKeysExpirationTime(f);
            FWFFeatureManager.getFlagKeys(str, fWFFlagKeysCallback);
        } else {
            FWFLogger.logError("FunWithFlags: you must provide a valid access token.");
            fWFFlagKeysCallback.onResponse(new FlagKeysContainer(new ArrayList()));
        }
    }

    public void getFlags(Boolean bool, FWFFeaturesCallback fWFFeaturesCallback) {
        getFlags(getAccessToken(), bool, fWFFeaturesCallback);
    }

    public void getFlagsWithTrackEvents(Boolean bool, Map<String, String> map, FWFFeaturesCallback fWFFeaturesCallback) {
        getFlagsWithTrackEvents(getAccessToken(), bool, map, fWFFeaturesCallback);
    }

    @Deprecated
    public void configureWith(FWFConstants.Region region, String str, FWFConstants.API api, float f, float f2, FWFLogger.FWFLogLevel fWFLogLevel, boolean z) {
        this.fwfConfig.setBaseUrl(region);
        this.fwfConfig.setAccessToken(str);
        this.fwfConfig.setApiVersion(api);
        this.fwfConfig.setConnectionTimeout(f);
        this.fwfConfig.setFeatureExpirationTime(f2);
        this.fwfConfig.setDebugMode(z);
        if (z) {
            FWFLogger.logLevel = FWFLogger.FWFLogLevel.debug;
        } else {
            FWFLogger.logLevel = fWFLogLevel;
        }
        FWFLogger.logInfo("FunWithFlags: configured with Base url: " + this.fwfConfig.getBaseUrl() + " Access Token: " + str);
    }

    @Deprecated
    public void configureWith(FWFConstants.Region region, String str, FWFConstants.API api, float f, float f2, FWFLogger.FWFLogLevel fWFLogLevel, Boolean bool, boolean z) {
        this.fwfConfig.setBaseUrl(region);
        this.fwfConfig.setAccessToken(str);
        this.fwfConfig.setApiVersion(api);
        this.fwfConfig.setConnectionTimeout(f);
        this.fwfConfig.setFeatureExpirationTime(f2);
        this.fwfConfig.setDebugMode(z);
        if (z) {
            FWFLogger.logLevel = FWFLogger.FWFLogLevel.debug;
        } else {
            FWFLogger.logLevel = fWFLogLevel;
        }
        if (bool.booleanValue()) {
            cleanDBOnVersionUpdate();
        }
        FWFLogger.logInfo("FunWithFlags: configured with Base url: " + this.fwfConfig.getBaseUrl() + " Access Token: " + str);
    }

    @Deprecated
    public void configureWith(String str, FWFConstants.API api, float f, float f2, FWFLogger.FWFLogLevel fWFLogLevel, Boolean bool, boolean z) {
        this.fwfConfig.setAccessToken(str);
        this.fwfConfig.setApiVersion(api);
        this.fwfConfig.setConnectionTimeout(f);
        this.fwfConfig.setFeatureExpirationTime(f2);
        this.fwfConfig.setDebugMode(z);
        if (z) {
            FWFLogger.logLevel = FWFLogger.FWFLogLevel.debug;
        } else {
            FWFLogger.logLevel = fWFLogLevel;
        }
        if (bool.booleanValue()) {
            cleanDBOnVersionUpdate();
        }
    }

    public void configureWith(FWFConfig fWFConfig) {
        this.fwfConfig = fWFConfig;
        if (fWFConfig.isDebugMode()) {
            FWFLogger.logLevel = FWFLogger.FWFLogLevel.debug;
        } else {
            FWFLogger.logLevel = this.fwfConfig.getLogLevel();
        }
        FWFLogger.logInfo("FunWithFlags: configured with Base url: " + this.fwfConfig.getBaseUrl() + " Access Token: " + fWFConfig.getAccessToken());
        if (fWFConfig.getCleanDBOnVersionUpdate().booleanValue()) {
            cleanDBOnVersionUpdate();
        }
    }

    @Deprecated
    public void configureWith(FWFConstants.Region region, String str) {
        this.fwfConfig.setBaseUrl(region);
        this.fwfConfig.setAccessToken(str);
        this.fwfConfig.setApiVersion(FWFConstants.API.API_VERSION_V2);
        this.fwfConfig.setConnectionTimeout(FWFConstants.Time.CONNECTIONTIMEOUT.getValue());
        this.fwfConfig.setFeatureExpirationTime(FWFConstants.Time.FEATUREEXPIRATIONTIME.getValue());
        FWFLogger.logLevel = FWFConstants.Defaults.LOG_LEVEL.getValue();
        FWFLogger.logInfo("FunWithFlags: configured with Base url: " + this.fwfConfig.getBaseUrl() + " Access Token: " + str);
    }

    @Deprecated
    public void configureWith(FWFConstants.Region region, String str, FWFConstants.API api) {
        this.fwfConfig.setBaseUrl(region);
        this.fwfConfig.setAccessToken(str);
        this.fwfConfig.setApiVersion(api);
        this.fwfConfig.setConnectionTimeout(FWFConstants.Time.CONNECTIONTIMEOUT.getValue());
        this.fwfConfig.setFeatureExpirationTime(FWFConstants.Time.FEATUREEXPIRATIONTIME.getValue());
        FWFLogger.logLevel = FWFConstants.Defaults.LOG_LEVEL.getValue();
        FWFLogger.logInfo("FunWithFlags: configured with Base url: " + this.fwfConfig.getBaseUrl() + " Access Token: " + str);
    }
}
