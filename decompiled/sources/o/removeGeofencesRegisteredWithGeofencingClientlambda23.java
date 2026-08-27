package o;

import com.sentiance.sdk.exception.NativeExceptionHandler;
import com.sentiance.sdk.payload.batching.PayloadBatcher;
import com.sentiance.sdk.payload.submission.PayloadSubmitter;
import com.sentiance.sdk.quota.BandwidthQuotaMonitor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class removeGeofencesRegisteredWithGeofencingClientlambda23 {
    private static removeGeofencesRegisteredWithGeofencingClientlambda23 IconCompatParcelizer;
    private final HashSet RemoteActionCompatParcelizer = new HashSet();

    public static removeGeofencesRegisteredWithGeofencingClientlambda23 serializer() {
        removeGeofencesRegisteredWithGeofencingClientlambda23 removegeofencesregisteredwithgeofencingclientlambda23;
        synchronized (removeGeofencesRegisteredWithGeofencingClientlambda23.class) {
            if (IconCompatParcelizer == null) {
                IconCompatParcelizer = new removeGeofencesRegisteredWithGeofencingClientlambda23();
            }
            removegeofencesregisteredwithgeofencingclientlambda23 = IconCompatParcelizer;
        }
        return removegeofencesregisteredwithgeofencingclientlambda23;
    }

    public final HashMap IconCompatParcelizer() {
        HashMap map = new HashMap();
        Iterator it = RatingCompat().iterator();
        while (it.hasNext()) {
            Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> requiredEvents = ((removeGeofencesRegisteredWithGeofencingClientlambda2) setPushUniqueId.read((Class) it.next())).getRequiredEvents();
            if (requiredEvents != null) {
                for (Map.Entry<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> entry : requiredEvents.entrySet()) {
                    Long l = (Long) map.get(entry.getKey());
                    Long value = entry.getValue();
                    if (value != null && (l == null || l.longValue() > value.longValue())) {
                        map.put(entry.getKey(), value);
                    }
                }
            }
        }
        return map;
    }

    public final void RemoteActionCompatParcelizer() {
        this.RemoteActionCompatParcelizer.clear();
    }

    public final void read() {
        ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).serializer();
        Iterator it = RatingCompat().iterator();
        while (it.hasNext()) {
            ((removeGeofencesRegisteredWithGeofencingClientlambda2) setPushUniqueId.read((Class) it.next())).subscribe();
        }
    }

    public final void write() {
        ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).write();
        Iterator it = RatingCompat().iterator();
        while (it.hasNext()) {
            ((removeGeofencesRegisteredWithGeofencingClientlambda2) setPushUniqueId.read((Class) it.next())).onKillswitchActivated();
        }
    }

    private ArrayList RatingCompat() {
        ArrayList arrayList = new ArrayList(this.RemoteActionCompatParcelizer);
        arrayList.addAll(Arrays.asList(r8lambdagOO4V9ME2CU2X5ntv9kK0bIySLE.class, handleGeofenceEventlambda3.class, r8lambdaH1qlE4ZDsxnFJ2uM0yQ5JRmvaYk.class, r8lambdaMiz9IrkK7Q7UB6htOHoIqxpE3WQ.class, registerGeofencesWithGeofencingClient.class, removeGeofencesRegisteredWithGeofencingClientlambda00.class, requestSingleLocationUpdateFromGooglePlaylambda30.class, retrieveRegisteredGeofencesFromLocalStoragelambda0.class, r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk.class, configureFromServerConfiglambda2.class, initializeGeofenceslambda1.class, forJsonPutlambda1.class, r8lambdaJvvdxZf_wI8IlMo_UBnPuJBuDT0.class, r8lambdaUFnBhWdf8H_x6QqDQ9Qrinf84Z4.class, forJsonPutlambda0.class, getBigSummaryText.class, NativeExceptionHandler.class, getCustomNotificationId.class, getConversationPersonMap.class, getUseWebView.class, setInlineImagePush.class, setNotificationCategory.class, setTitleText.class, setUninstallTrackingPush.class, setActionId.class, r8lambda7xdj8Hz3fhe1sOrYgyl0CHrOnM.class, r8lambdaXT0nPvLtCfK_WynrAwNr8TFIamk.class, parseNonBlankStringlambda0.class, stringAndKey.class, onMessageReceived.class, r8lambda_OYW2CZnqbidZYnUPSCCpYK7kHQ.class, handleOnNewTokenlambda2.class, r8lambda1mlF560MCjaA_ExgR2d0icEgcF0.class, addNotificationActionlambda2.class, addNotificationActionlambda0.class, addNotificationActionslambda1.class, r8lambdaJAzuAI86BqHAUWuq3a942DKIySE.class, populateNotificationBuilderlambda1.class, PayloadBatcher.class, setDeleteIntentlambda0.class, PayloadSubmitter.class, getBrazePushEventType.class, r8lambdaI90we4_tg_9aaM1nBxPMKmLPck.class, BandwidthQuotaMonitor.class, accesshandlePush.class, handlePushperformWork.class, handlePushNotificationPayloadlambda0.class, handlePushNotificationPayloadlambda14.class, r8lambdaPOgRaUPUTYLJT1DxZPTbNt44SWI.class, onResumelambda1.class, com.sentiance.sdk.status.a.class, BannersDataStoreProviderCompanionExternalSyntheticLambda3.class, r8lambda5l9iaoWfq17IIiUdmbHKrQzx4oA.class, r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs.class, createOrGetDataStorelambda010.class, migrateFeatureFlagImpressionMapToJsonlambda20.class, migrateTriggersStorageToJsonlambda21.class));
        return arrayList;
    }

    private removeGeofencesRegisteredWithGeofencingClientlambda23() {
    }

    public final void read(Class<? extends removeGeofencesRegisteredWithGeofencingClientlambda2> cls) {
        this.RemoteActionCompatParcelizer.add(cls);
    }
}
