package com.sentiance.sdk.eventtimeline.api;

import android.annotation.SuppressLint;
import android.content.Context;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.NoSentianceUserException;
import com.sentiance.sdk.SdkException;
import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.eventtimeline.api.EventTimelineApi;
import com.sentiance.sdk.ondevice.api.event.Event;
import com.sentiance.sdk.util.N;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;
import io.sentry.Scopes$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o.IPropertiesObject;
import o.doesKeyExist;
import o.doesKeyExistlambda0;
import o.getFlushMinMinutes;
import o.getJSONProperty;
import o.getTrackingStringandroid_sdk_base_release;
import o.parseLonglambda0;
import o.parsePayloadFieldsFromBundleparsePushDeliveryEventData;
import o.parsePayloadFieldsFromBundleparsePushStoryData;
import o.r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk;
import o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI;
import o.r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI;
import o.r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0;
import o.r8lambdarcipOqcS6djQ2doA9q9WF7Og3g;
import o.readBoolean;
import o.setPushUniqueId;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class EventTimelineApi extends N implements IEventTimelineApi {
    private static final String LOG_TAG = "EventTimelineApi";

    @SuppressLint
    private static EventTimelineApi sInstance;
    private final Context mContext;
    private parseLonglambda0 mLogger;

    @Override // com.sentiance.sdk.eventtimeline.api.IEventTimelineApi
    public void setProvisionalAwareTimelineUpdateListener(EventTimelineUpdateListener eventTimelineUpdateListener) {
        setTimelineUpdateListenerInternal(eventTimelineUpdateListener, true);
    }

    @Override // com.sentiance.sdk.eventtimeline.api.IEventTimelineApi
    public void setTimelineUpdateListener(EventTimelineUpdateListener eventTimelineUpdateListener) {
        setTimelineUpdateListenerInternal(eventTimelineUpdateListener, false);
    }

    public static EventTimelineApi getInstance(Context context) {
        EventTimelineApi eventTimelineApi;
        synchronized (EventTimelineApi.class) {
            if (sInstance == null) {
                sInstance = new EventTimelineApi(context.getApplicationContext());
            }
            eventTimelineApi = sInstance;
        }
        return eventTimelineApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Event lambda$getTimelineEvent$4(String str) {
        return ((doesKeyExistlambda0) setPushUniqueId.read(doesKeyExistlambda0.class)).write(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$getTimelineEvents$2(Date date, Date date2) {
        return ((doesKeyExistlambda0) setPushUniqueId.read(doesKeyExistlambda0.class)).serializer(date, date2, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$getTimelineEventsIncludingProvisionalOnes$3(Date date, Date date2) {
        return ((doesKeyExistlambda0) setPushUniqueId.read(doesKeyExistlambda0.class)).serializer(date, date2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$getTimelineUpdates$0(Date date) {
        return ((doesKeyExistlambda0) setPushUniqueId.read(doesKeyExistlambda0.class)).read(date, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$getTimelineUpdatesIncludingProvisionalEvents$1(Date date) {
        return ((doesKeyExistlambda0) setPushUniqueId.read(doesKeyExistlambda0.class)).read(date, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setPotentialVehicleTransportStartListener$7(PotentialVehicleTransportStartListener potentialVehicleTransportStartListener) {
        ((getJSONProperty) setPushUniqueId.read(getJSONProperty.class)).IconCompatParcelizer(potentialVehicleTransportStartListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTimelineUpdateListenerInternal$5(boolean z, EventTimelineUpdateListener eventTimelineUpdateListener) {
        doesKeyExistlambda0 doeskeyexistlambda0 = (doesKeyExistlambda0) setPushUniqueId.read(doesKeyExistlambda0.class);
        if (z) {
            doeskeyexistlambda0.IconCompatParcelizer(eventTimelineUpdateListener);
        } else {
            doeskeyexistlambda0.serializer(eventTimelineUpdateListener);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "Provisional-aware" : "Non-provisional aware");
        sb.append(" event timeline update listener was ");
        sb.append(eventTimelineUpdateListener != null ? "set" : "unset");
        log(sb.toString(), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTransportTags$6(Map map) {
        if (!Sentiance.getInstance(this.mContext).userExists()) {
            throw new NoSentianceUserException();
        }
        ((parsePayloadFieldsFromBundleparsePushStoryData) setPushUniqueId.read(parsePayloadFieldsFromBundleparsePushStoryData.class)).read((Map<String, String>) map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TripLocationUpdatesStartResult lambda$startReceivingTripLocationUpdates$10(int i, TripLocationUpdatesListener tripLocationUpdatesListener) {
        return ((parsePayloadFieldsFromBundleparsePushDeliveryEventData) setPushUniqueId.read(parsePayloadFieldsFromBundleparsePushDeliveryEventData.class)).IconCompatParcelizer(i, new d0$$ExternalSyntheticLambda0(6, tripLocationUpdatesListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$stopReceivingTripLocationUpdates$11() {
        ((parsePayloadFieldsFromBundleparsePushDeliveryEventData) setPushUniqueId.read(parsePayloadFieldsFromBundleparsePushDeliveryEventData.class)).read();
    }

    private void setTimelineUpdateListenerInternal(final EventTimelineUpdateListener eventTimelineUpdateListener, final boolean z) {
        ifSdkIsInitialized(new r8lambdaA5Nojo_weyBvRJwWwexNGN83YI() { // from class: o.r8lambdaXUK6S1Qh64cr82v9LY0FXkNsfOc
            @Override // o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI
            public final void RemoteActionCompatParcelizer() {
                this.IconCompatParcelizer.lambda$setTimelineUpdateListenerInternal$5(z, eventTimelineUpdateListener);
            }
        });
    }

    @Override // com.sentiance.sdk.eventtimeline.api.IEventTimelineApi
    public List<Event> getTimelineEvents(Date date, Date date2) {
        return (List) ifSdkIsInitializedWithUser(new ArrayList(), new getTrackingStringandroid_sdk_base_release(date, date2, 1));
    }

    @Override // com.sentiance.sdk.eventtimeline.api.IEventTimelineApi
    public List<Event> getTimelineEventsIncludingProvisionalOnes(Date date, Date date2) {
        return (List) ifSdkIsInitializedWithUser(new ArrayList(), new getTrackingStringandroid_sdk_base_release(date, date2, 0));
    }

    @Override // com.sentiance.sdk.eventtimeline.api.IEventTimelineApi
    public List<Event> getTimelineUpdates(Date date) {
        return (List) ifSdkIsInitializedWithUser(new ArrayList(), new IPropertiesObject(1, date));
    }

    @Override // com.sentiance.sdk.eventtimeline.api.IEventTimelineApi
    public List<Event> getTimelineUpdatesIncludingProvisionalEvents(Date date) {
        return (List) ifSdkIsInitializedWithUser(new ArrayList(), new IPropertiesObject(0, date));
    }

    @Override // com.sentiance.sdk.eventtimeline.api.IEventTimelineApi
    public TripLocationUpdatesStartResult startReceivingTripLocationUpdates(final int i, final TripLocationUpdatesListener tripLocationUpdatesListener) {
        Objects.requireNonNull(tripLocationUpdatesListener, "listener cannot be null");
        return (TripLocationUpdatesStartResult) ifSdkIsInitializedWithUser(TripLocationUpdatesStartResult.NO_USER, (r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk<TripLocationUpdatesStartResult>) new r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk() { // from class: o.getAltitude
            @Override // o.r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk
            public final Object IconCompatParcelizer() {
                return EventTimelineApi.lambda$startReceivingTripLocationUpdates$10(i, tripLocationUpdatesListener);
            }
        });
    }

    @Override // com.sentiance.sdk.eventtimeline.api.IEventTimelineApi
    public void stopReceivingTripLocationUpdates() {
        ifSdkIsInitializedWithUser(new r8lambdaA5Nojo_weyBvRJwWwexNGN83YI() { // from class: o.IBrazeLocation
            @Override // o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI
            public final void RemoteActionCompatParcelizer() {
                EventTimelineApi.lambda$stopReceivingTripLocationUpdates$11();
            }
        });
    }

    private EventTimelineApi(Context context) {
        this.mContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startReceivingTripLocationUpdates$9(TripLocationUpdatesListener tripLocationUpdatesListener, TripLocation tripLocation) {
        readBoolean.write(new Scopes$$ExternalSyntheticLambda0(tripLocationUpdatesListener, 7, tripLocation));
    }

    @Override // com.sentiance.sdk.eventtimeline.api.IEventTimelineApi
    public Event getTimelineEvent(String str) {
        return (Event) ifSdkIsInitializedWithUser((Object) null, new getFlushMinMinutes(1, str));
    }

    @Override // com.sentiance.sdk.eventtimeline.api.IEventTimelineApi
    public void setPotentialVehicleTransportStartListener(PotentialVehicleTransportStartListener potentialVehicleTransportStartListener) {
        ifSdkIsInitialized(new r8lambdarcipOqcS6djQ2doA9q9WF7Og3g(0, potentialVehicleTransportStartListener));
    }

    @Override // com.sentiance.sdk.eventtimeline.api.IEventTimelineApi
    @SuppressLint
    public void setTransportTags(Map<String, String> map) throws NoSentianceUserException, SdkException, IllegalArgumentException {
        ifSdkIsInitialized(new doesKeyExist(this, map, 0));
    }

    private void log(String str, Object... objArr) {
        if (this.mLogger == null) {
            this.mLogger = new parseLonglambda0(this.mContext, LOG_TAG, (r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class), (r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0) setPushUniqueId.read(r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0.class));
        }
        this.mLogger.IconCompatParcelizer(str, objArr);
    }
}
