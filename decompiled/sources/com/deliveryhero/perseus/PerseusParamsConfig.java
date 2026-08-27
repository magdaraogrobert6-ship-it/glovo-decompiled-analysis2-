package com.deliveryhero.perseus;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Map;
import o.ensureNotConsumed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public class PerseusParamsConfig {
    private String adjustId;
    private String advertisingId;
    private String appBuildVersion;
    private final String appId;
    private final String appName;
    private final String appVersionName;
    private final String baseUrl;
    private int batchSize;
    private final String clientId;
    private Consent consent;
    private String countryCode;
    private boolean debounceSessionLocalStorage;
    private boolean debuggable;
    private long dispatchDelay;
    private final String entity;
    private String firebaseInstanceId;
    private String globalEntityId;
    private ensureNotConsumed infrastructureType;
    private long maxBackoffTime;
    private Map<Integer, ? extends List<? extends r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> priorityMapping;
    private String rechargeTo;
    private long retentionTime;
    private final Map<String, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM> routing;
    private String sdkVersionName;
    private long telemetryDelay;
    private final String uaId;
    private String userId;

    public final String getAdjustId() {
        return this.adjustId;
    }

    public final String getAdvertisingId() {
        return this.advertisingId;
    }

    public final String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getAppVersionName() {
        return this.appVersionName;
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final int getBatchSize() {
        return this.batchSize;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final Consent getConsent() {
        return this.consent;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final boolean getDebounceSessionLocalStorage() {
        return this.debounceSessionLocalStorage;
    }

    public final boolean getDebuggable() {
        return this.debuggable;
    }

    public final long getDispatchDelay() {
        return this.dispatchDelay;
    }

    public final String getEntity() {
        return this.entity;
    }

    public final String getFirebaseInstanceId() {
        return this.firebaseInstanceId;
    }

    public final String getGlobalEntityId() {
        return this.globalEntityId;
    }

    public final ensureNotConsumed getInfrastructureType() {
        return this.infrastructureType;
    }

    public final long getMaxBackoffTime() {
        return this.maxBackoffTime;
    }

    public final Map<Integer, List<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> getPriorityMapping() {
        return this.priorityMapping;
    }

    public final String getRechargeTo() {
        return this.rechargeTo;
    }

    public final long getRetentionTime() {
        return this.retentionTime;
    }

    public final Map<String, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM> getRouting() {
        return this.routing;
    }

    public final String getSdkVersionName() {
        return this.sdkVersionName;
    }

    public final long getTelemetryDelay() {
        return this.telemetryDelay;
    }

    public final String getUaId() {
        return this.uaId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setAdjustId(String str) {
        this.adjustId = str;
    }

    public final void setAdvertisingId(String str) {
        this.advertisingId = str;
    }

    public final void setAppBuildVersion(String str) {
        this.appBuildVersion = str;
    }

    public final void setBatchSize(int i) {
        this.batchSize = i;
    }

    public final void setConsent(Consent consent) {
        this.consent = consent;
    }

    public final void setDebounceSessionLocalStorage(boolean z) {
        this.debounceSessionLocalStorage = z;
    }

    public final void setDebuggable(boolean z) {
        this.debuggable = z;
    }

    public final void setDispatchDelay(long j) {
        this.dispatchDelay = j;
    }

    public final void setGlobalEntityId(String str) {
        this.globalEntityId = str;
    }

    public final void setMaxBackoffTime(long j) {
        this.maxBackoffTime = j;
    }

    public final void setRechargeTo(String str) {
        this.rechargeTo = str;
    }

    public final void setRetentionTime(long j) {
        this.retentionTime = j;
    }

    public final void setTelemetryDelay(long j) {
        this.telemetryDelay = j;
    }

    public final String getDefaultEndpoint$perseus_release() {
        return this.baseUrl + "/v1" + this.infrastructureType.getUrlPrefix() + "insert/" + this.entity + "/hits";
    }

    public PerseusParamsConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, int i, long j, String str9, String str10, String str11, Consent consent, String str12, boolean z2, String str13, Map map, String str14, String str15, Map map2, long j2, long j3, long j4, ensureNotConsumed ensurenotconsumed) {
        m1$$ExternalSyntheticOutline0.m(str2, str3, str4, str7, str8);
        str9.getClass();
        str10.getClass();
        map.getClass();
        str15.getClass();
        map2.getClass();
        ensurenotconsumed.getClass();
        this.advertisingId = str;
        this.appId = str2;
        this.appName = str3;
        this.appVersionName = str4;
        this.adjustId = str5;
        this.uaId = str6;
        this.entity = str7;
        this.debuggable = z;
        this.baseUrl = str8;
        this.batchSize = i;
        this.retentionTime = j;
        this.countryCode = str9;
        this.userId = str10;
        this.globalEntityId = str11;
        this.consent = consent;
        this.clientId = str12;
        this.debounceSessionLocalStorage = z2;
        this.appBuildVersion = str13;
        this.routing = map;
        this.rechargeTo = str14;
        this.firebaseInstanceId = str15;
        this.priorityMapping = map2;
        this.dispatchDelay = j2;
        this.maxBackoffTime = j3;
        this.telemetryDelay = j4;
        this.infrastructureType = ensurenotconsumed;
        this.sdkVersionName = "5.8.1";
    }

    public final void setCountryCode(String str) {
        str.getClass();
        this.countryCode = str;
    }

    public final void setFirebaseInstanceId(String str) {
        str.getClass();
        this.firebaseInstanceId = str;
    }

    public final void setInfrastructureType(ensureNotConsumed ensurenotconsumed) {
        ensurenotconsumed.getClass();
        this.infrastructureType = ensurenotconsumed;
    }

    public final void setPriorityMapping(Map<Integer, ? extends List<? extends r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> map) {
        map.getClass();
        this.priorityMapping = map;
    }

    public final void setSdkVersionName$perseus_release(String str) {
        str.getClass();
        this.sdkVersionName = str;
    }

    public final void setUserId(String str) {
        str.getClass();
        this.userId = str;
    }
}
