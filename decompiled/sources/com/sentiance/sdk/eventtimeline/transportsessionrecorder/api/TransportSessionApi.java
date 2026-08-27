package com.sentiance.sdk.eventtimeline.transportsessionrecorder.api;

import android.content.Context;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.util.N;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.GooglePlayLocationUtilsretrieveRegisteredGeofencesFromLocalStorageinlinedreadList1;
import o.doesKeyExist;
import o.getAnalyticsEnabledEnterannotations;
import o.getFlushMinMinutesannotations;
import o.getTemplateFieldAtIndex;
import o.migrateTriggersReeligibilityToJsonlambda1;
import o.parseLonglambda0;
import o.parseNonBlankString;
import o.parsePayloadFieldsFromBundleparseBigImageStyle;
import o.populateNotificationBuilderlambda0;
import o.r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI;
import o.r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0;
import o.r8lambdarcipOqcS6djQ2doA9q9WF7Og3g;
import o.registerGeofenceslambda23;
import o.setPushUniqueId;

/* JADX INFO: loaded from: classes5.dex */
@DontObfuscate
public class TransportSessionApi extends N implements ITransportSessionApi {
    private static final String GUARD_TAG = "EventTimelineApi";
    private static TransportSessionApi INSTANCE = null;
    private static final String LOG_TAG = "EventTimelineApi";
    private final Context mContext;
    private parseLonglambda0 mLogger;
    private final migrateTriggersReeligibilityToJsonlambda1<parsePayloadFieldsFromBundleparseBigImageStyle> mTransportSesionRecorder = new getFlushMinMinutesannotations();
    private TransportSessionListener mTransportSessionListener;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ TransportSessionListener lambda$setTransportSessionListener$3(TransportSessionListener transportSessionListener) {
        this.mTransportSessionListener = transportSessionListener;
        return transportSessionListener;
    }

    private void addOnBootstrapCompleteListener() {
        populateNotificationBuilderlambda0.RemoteActionCompatParcelizer(this.mContext).RemoteActionCompatParcelizer(new registerGeofenceslambda23(this, 1));
    }

    public static TransportSessionApi getInstance(Context context) {
        TransportSessionApi transportSessionApi;
        synchronized (TransportSessionApi.class) {
            if (INSTANCE == null) {
                INSTANCE = new TransportSessionApi(context.getApplicationContext());
            }
            transportSessionApi = INSTANCE;
        }
        return transportSessionApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteTransportSession$5(String str) {
        this.mTransportSesionRecorder.read().IconCompatParcelizer(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$disableTransportSessionRecording$2() {
        this.mTransportSesionRecorder.read().IconCompatParcelizer(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableTransportSessionRecording$1() {
        this.mTransportSesionRecorder.read().IconCompatParcelizer(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getAvailableTransportSessions$4() {
        return this.mTransportSesionRecorder.read().RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$isTransportSessionRecordingEnabled$0() {
        return Boolean.valueOf(this.mTransportSesionRecorder.read().read());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBootstrapComplete() {
        ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).read(ControlMessage.TRANSPORT_SESSION_COMPLETED, new parseNonBlankString(this));
    }

    @Override // com.sentiance.sdk.eventtimeline.transportsessionrecorder.api.ITransportSessionApi
    public List<TransportSession> getAvailableTransportSessions() {
        return (List) ifSdkIsInitialized(new ArrayList(), new getTemplateFieldAtIndex(this, 0));
    }

    public TransportSessionApi(Context context) {
        this.mContext = context;
        addOnBootstrapCompleteListener();
    }

    @Override // com.sentiance.sdk.eventtimeline.transportsessionrecorder.api.ITransportSessionApi
    public void deleteTransportSession(String str) {
        ifSdkIsInitialized(new doesKeyExist(this, str, 3));
    }

    @Override // com.sentiance.sdk.eventtimeline.transportsessionrecorder.api.ITransportSessionApi
    public void disableTransportSessionRecording() {
        ifSdkIsInitialized(new r8lambdarcipOqcS6djQ2doA9q9WF7Og3g(1, this));
    }

    @Override // com.sentiance.sdk.eventtimeline.transportsessionrecorder.api.ITransportSessionApi
    public void enableTransportSessionRecording() {
        ifSdkIsInitialized(new r8lambdarcipOqcS6djQ2doA9q9WF7Og3g(2, this));
    }

    @Override // com.sentiance.sdk.eventtimeline.transportsessionrecorder.api.ITransportSessionApi
    public void setTransportSessionListener(TransportSessionListener transportSessionListener) {
        ifSdkIsInitialized(new GooglePlayLocationUtilsretrieveRegisteredGeofencesFromLocalStorageinlinedreadList1(this, transportSessionListener, 4));
        if (transportSessionListener != null) {
            log("Transport session listener has been set", new Object[0]);
        } else {
            log("Transport session listener has been unset", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteAllTransportSessions$6(TransportSession transportSession) {
        deleteTransportSession(transportSession.getId());
    }

    @Override // com.sentiance.sdk.eventtimeline.transportsessionrecorder.api.ITransportSessionApi
    public void deleteAllTransportSessions() {
        Iterator<TransportSession> it = getAvailableTransportSessions().iterator();
        while (it.hasNext()) {
            ifSdkIsInitialized(new doesKeyExist(this, it.next(), 4));
        }
    }

    @Override // com.sentiance.sdk.eventtimeline.transportsessionrecorder.api.ITransportSessionApi
    public boolean isTransportSessionRecordingEnabled() {
        return ((Boolean) ifSdkIsInitialized(Boolean.FALSE, new getTemplateFieldAtIndex(this, 1))).booleanValue();
    }

    private void log(String str, Object... objArr) {
        if (this.mLogger == null) {
            this.mLogger = new parseLonglambda0(this.mContext, "EventTimelineApi", (r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class), (r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0) setPushUniqueId.read(r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0.class));
        }
        this.mLogger.IconCompatParcelizer(str, objArr);
    }
}
