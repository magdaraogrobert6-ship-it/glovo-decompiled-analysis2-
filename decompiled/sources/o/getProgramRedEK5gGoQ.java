package o;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface getProgramRedEK5gGoQ extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(getQEK5gGoQ getqek5ggoq);

    void getAppInstanceId(getQEK5gGoQ getqek5ggoq);

    void getCachedAppInstanceId(getQEK5gGoQ getqek5ggoq);

    void getConditionalUserProperties(String str, String str2, getQEK5gGoQ getqek5ggoq);

    void getCurrentScreenClass(getQEK5gGoQ getqek5ggoq);

    void getCurrentScreenName(getQEK5gGoQ getqek5ggoq);

    void getGmpAppId(getQEK5gGoQ getqek5ggoq);

    void getMaxUserProperties(String str, getQEK5gGoQ getqek5ggoq);

    void getSessionId(getQEK5gGoQ getqek5ggoq);

    void getTestFlag(getQEK5gGoQ getqek5ggoq, int i);

    void getUserProperties(String str, String str2, boolean z, getQEK5gGoQ getqek5ggoq);

    void initForTests(Map map);

    void initialize(accessgetTwocp accessgettwocp, zzdd zzddVar, long j);

    void isDataCollectionEnabled(getQEK5gGoQ getqek5ggoq);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, getQEK5gGoQ getqek5ggoq, long j);

    void logHealthData(int i, String str, accessgetTwocp accessgettwocp, accessgetTwocp accessgettwocp2, accessgetTwocp accessgettwocp3);

    void onActivityCreated(accessgetTwocp accessgettwocp, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j);

    void onActivityDestroyed(accessgetTwocp accessgettwocp, long j);

    void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j);

    void onActivityPaused(accessgetTwocp accessgettwocp, long j);

    void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j);

    void onActivityResumed(accessgetTwocp accessgettwocp, long j);

    void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j);

    void onActivitySaveInstanceState(accessgetTwocp accessgettwocp, getQEK5gGoQ getqek5ggoq, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, getQEK5gGoQ getqek5ggoq, long j);

    void onActivityStarted(accessgetTwocp accessgettwocp, long j);

    void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j);

    void onActivityStopped(accessgetTwocp accessgettwocp, long j);

    void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j);

    void performAction(Bundle bundle, getQEK5gGoQ getqek5ggoq, long j);

    void registerOnMeasurementEventListener(getProgramYellowEK5gGoQ getprogramyellowek5ggoq);

    void resetAnalyticsData(long j);

    void retrieveAndUploadBatches(getRightBracketEK5gGoQ getrightbracketek5ggoq);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(accessgetTwocp accessgettwocp, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(getProgramYellowEK5gGoQ getprogramyellowek5ggoq);

    void setInstanceIdProvider(getSemicolonEK5gGoQ getsemicolonek5ggoq);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, accessgetTwocp accessgettwocp, boolean z, long j);

    void unregisterOnMeasurementEventListener(getProgramYellowEK5gGoQ getprogramyellowek5ggoq);
}
