package com.sentiance.sdk.eventtimeline.vehicledetection;

import android.location.Location;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.eventtimeline.transportclassification.ClassifiedTransportMode;
import com.sentiance.sdk.eventtimeline.vehicledetection.PotentialVehicleTransportStartDetector;
import com.sentiance.sdk.eventtimeline.vehicledetection.PotentialVehicleTransportStartDetector$removeOld$1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.BrazeCompanionExternalSyntheticLambda4;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.getAccentColor;
import o.getAnalyticsEnabledEnterannotations;
import o.getCooldownEnterSeconds;
import o.getEnterEventsannotations;
import o.getLongitudeannotations;
import o.getVerticalAccuracy;
import o.handleHmsRemoteMessageDatalambda1;
import o.invokeFallbackFirebaseServicelambda2;
import o.migrateTriggersReeligibilityToJsonlambda4;
import o.migrateTriggersStorageToJsonlambda0;
import o.onContentCardDismissed;
import o.onMove;
import o.parseLonglambda0;
import o.r8lambda9zISiqWdkc3dd5mJTZ1F1xGFCGs;
import o.r8lambdaHUsxibeO4ooX9Axd9NEyh79TAY;
import o.r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU;
import o.r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k;
import o.r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs;
import o.readandroid_sdk_base_release;
import o.removeGeofencesRegisteredWithGeofencingClientlambda2;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "PotentialVehicleTransportStartDetector")
public final class PotentialVehicleTransportStartDetector extends handleHmsRemoteMessageDatalambda1 implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    private final getVerticalAccuracy IconCompatParcelizer;
    private final migrateTriggersStorageToJsonlambda0 MediaBrowserCompatMediaItem;
    private final ArrayList MediaDescriptionCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaMetadataCompat;
    private final parseLonglambda0 MediaSessionCompatQueueItem;
    private boolean PlaybackStateCompat;
    private final getAccentColor RatingCompat;
    private final readandroid_sdk_base_release read;
    private final getCooldownEnterSeconds serializer;
    private final getAnalyticsEnabledEnterannotations write;

    public static final class IconCompatParcelizer {
        public IconCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: com.sentiance.sdk.eventtimeline.vehicledetection.PotentialVehicleTransportStartDetector$subscribe$1, reason: invalid class name and case insensitive filesystem */
    final /* synthetic */ class C01491 extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            getLongitudeannotations getlongitudeannotations = (getLongitudeannotations) obj;
            getlongitudeannotations.getClass();
            PotentialVehicleTransportStartDetector.RemoteActionCompatParcelizer((PotentialVehicleTransportStartDetector) this.MediaMetadataCompat, getlongitudeannotations);
            return createFromParcel.INSTANCE;
        }

        public C01491(int i, int i2, Class cls, Object obj, String str, String str2) {
            super(i, i2, cls, obj, str, str2);
        }
    }

    /* JADX INFO: renamed from: com.sentiance.sdk.eventtimeline.vehicledetection.PotentialVehicleTransportStartDetector$subscribe$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            getLongitudeannotations getlongitudeannotations = (getLongitudeannotations) obj;
            getlongitudeannotations.getClass();
            PotentialVehicleTransportStartDetector.read((PotentialVehicleTransportStartDetector) this.MediaMetadataCompat, getlongitudeannotations);
            return createFromParcel.INSTANCE;
        }

        public AnonymousClass2(int i, int i2, Class cls, Object obj, String str, String str2) {
            super(i, i2, cls, obj, str, str2);
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        this.PlaybackStateCompat = false;
        ArrayList arrayList = this.MediaDescriptionCompat;
        synchronized (arrayList) {
            arrayList.clear();
        }
        this.MediaBrowserCompatMediaItem.IconCompatParcelizer(null);
    }

    public static final void RemoteActionCompatParcelizer(PotentialVehicleTransportStartDetector potentialVehicleTransportStartDetector, getLongitudeannotations getlongitudeannotations) {
        List<? extends Location> listPlaybackStateCompat;
        getVerticalAccuracy getverticalaccuracy = potentialVehicleTransportStartDetector.IconCompatParcelizer;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = ((r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU) getlongitudeannotations.read()).RemoteActionCompatParcelizer;
        getverticalaccuracy.getClass();
        Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
        ArrayList arrayList = potentialVehicleTransportStartDetector.MediaDescriptionCompat;
        synchronized (arrayList) {
            arrayList.add(locationWrite);
            potentialVehicleTransportStartDetector.RatingCompat.getClass();
            long jSerializer = r8lambda9zISiqWdkc3dd5mJTZ1F1xGFCGs.serializer(2);
            potentialVehicleTransportStartDetector.MediaMetadataCompat.getClass();
            final PotentialVehicleTransportStartDetector$removeOld$1 potentialVehicleTransportStartDetector$removeOld$1 = new PotentialVehicleTransportStartDetector$removeOld$1(System.currentTimeMillis(), jSerializer);
            arrayList.removeIf(new Predicate() { // from class: o.parseStringAsInteger
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i = PotentialVehicleTransportStartDetector.RemoteActionCompatParcelizer;
                    return ((Boolean) ((PotentialVehicleTransportStartDetector$removeOld$1) potentialVehicleTransportStartDetector$removeOld$1).invoke(obj)).booleanValue();
                }
            });
        }
        if (!r8lambdaHUsxibeO4ooX9Axd9NEyh79TAY.serializer((Class) potentialVehicleTransportStartDetector.MediaBrowserCompatMediaItem.read())) {
            potentialVehicleTransportStartDetector.MediaSessionCompatQueueItem.IconCompatParcelizer("Not checking for potential vehicle transport start, user is not moving", new Object[0]);
            return;
        }
        if (potentialVehicleTransportStartDetector.PlaybackStateCompat) {
            potentialVehicleTransportStartDetector.MediaSessionCompatQueueItem.IconCompatParcelizer("Not checking for potential vehicle transport start, already notified for current trip", new Object[0]);
            return;
        }
        getAccentColor getaccentcolor = potentialVehicleTransportStartDetector.RatingCompat;
        ArrayList arrayList2 = potentialVehicleTransportStartDetector.MediaDescriptionCompat;
        synchronized (arrayList2) {
            listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(arrayList2);
        }
        if (getaccentcolor.serializer(listPlaybackStateCompat)) {
            potentialVehicleTransportStartDetector.write.IconCompatParcelizer(ControlMessage.POTENTIAL_VEHICLE_TRANSPORT_START_DETECTED, (Object) null);
            potentialVehicleTransportStartDetector.PlaybackStateCompat = true;
        }
    }

    public static final void read(PotentialVehicleTransportStartDetector potentialVehicleTransportStartDetector, getLongitudeannotations getlongitudeannotations) {
        parseLonglambda0 parselonglambda0 = potentialVehicleTransportStartDetector.MediaSessionCompatQueueItem;
        ClassifiedTransportMode classifiedTransportModeFromEventConstant = ClassifiedTransportMode.fromEventConstant(((r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs) getlongitudeannotations.read()).serializer);
        if (classifiedTransportModeFromEventConstant != null && classifiedTransportModeFromEventConstant.isMotorizedVehicle()) {
            if (!r8lambdaHUsxibeO4ooX9Axd9NEyh79TAY.serializer((Class) potentialVehicleTransportStartDetector.MediaBrowserCompatMediaItem.read())) {
                parselonglambda0.IconCompatParcelizer("Ignoring motorized vehicle result, user is not moving", new Object[0]);
            } else if (potentialVehicleTransportStartDetector.PlaybackStateCompat) {
                parselonglambda0.IconCompatParcelizer("Ignoring motorized vehicle result, already notified for current trip", new Object[0]);
            } else {
                potentialVehicleTransportStartDetector.write.IconCompatParcelizer(ControlMessage.POTENTIAL_VEHICLE_TRANSPORT_START_DETECTED, (Object) null);
                potentialVehicleTransportStartDetector.PlaybackStateCompat = true;
            }
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        this.MediaMetadataCompat.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        getCooldownEnterSeconds getcooldownenterseconds = this.serializer;
        getcooldownenterseconds.getClass();
        List<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> list = invokeFallbackFirebaseServicelambda2.IconCompatParcelizer;
        getCooldownEnterSeconds.read readVarRemoteActionCompatParcelizer = getcooldownenterseconds.RemoteActionCompatParcelizer(list, Long.valueOf(jCurrentTimeMillis), false).RemoteActionCompatParcelizer();
        Long lValueOf = readVarRemoteActionCompatParcelizer != null ? Long.valueOf(readVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) : null;
        if (lValueOf == null) {
            return new LinkedHashMap();
        }
        list.getClass();
        int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(list, 10));
        if (iRemoteActionCompatParcelizer < 16) {
            iRemoteActionCompatParcelizer = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
        for (Object obj : list) {
            linkedHashMap.put(obj, lValueOf);
        }
        return new LinkedHashMap(linkedHashMap);
    }

    static {
        new IconCompatParcelizer(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PotentialVehicleTransportStartDetector(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getCooldownEnterSeconds getcooldownenterseconds, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getVerticalAccuracy getverticalaccuracy, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, parseLonglambda0 parselonglambda0, getAccentColor getaccentcolor) {
        super("PotentialVehicleTransportStartDetector", getanalyticsenabledenterannotations);
        getanalyticsenabledenterannotations.getClass();
        getcooldownenterseconds.getClass();
        readandroid_sdk_base_releaseVar.getClass();
        getverticalaccuracy.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        parselonglambda0.getClass();
        getaccentcolor.getClass();
        this.write = getanalyticsenabledenterannotations;
        this.serializer = getcooldownenterseconds;
        this.read = readandroid_sdk_base_releaseVar;
        this.IconCompatParcelizer = getverticalaccuracy;
        this.MediaMetadataCompat = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaSessionCompatQueueItem = parselonglambda0;
        this.RatingCompat = getaccentcolor;
        this.MediaDescriptionCompat = new ArrayList();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.MediaBrowserCompatMediaItem = new migrateTriggersStorageToJsonlambda0(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.sentiance.sdk.eventtimeline.vehicledetection.PotentialVehicleTransportStartDetector.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                ((migrateTriggersReeligibilityToJsonlambda4) obj).getClass();
                return r8lambdaHUsxibeO4ooX9Axd9NEyh79TAY.write(PotentialVehicleTransportStartDetector.this.serializer, jCurrentTimeMillis, PotentialVehicleTransportStartDetector.this.IconCompatParcelizer);
            }
        });
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        C01491 c01491 = new C01491(1, 0, PotentialVehicleTransportStartDetector.class, this, "onLocationEvent", "onLocationEvent(Lcom/sentiance/sdk/events/EventInfo;)V");
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.write;
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.read;
        getEnterEventsannotations.IconCompatParcelizer(getanalyticsenabledenterannotations, r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, readandroid_sdk_base_releaseVar, "PotentialVehicleTransportStartDetector", c01491);
        getEnterEventsannotations.IconCompatParcelizer(getanalyticsenabledenterannotations, r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs.class, readandroid_sdk_base_releaseVar, "PotentialVehicleTransportStartDetector", new AnonymousClass2(1, 0, PotentialVehicleTransportStartDetector.class, this, "onTransportClassificationEvent", "onTransportClassificationEvent(Lcom/sentiance/sdk/events/EventInfo;)V"));
        this.MediaMetadataCompat.getClass();
        read(readandroid_sdk_base_releaseVar, System.currentTimeMillis());
    }

    @Override // o.handleHmsRemoteMessageDatalambda1
    public final void serializer(long j, Class cls) {
        migrateTriggersStorageToJsonlambda0 migratetriggersstoragetojsonlambda0 = this.MediaBrowserCompatMediaItem;
        migratetriggersstoragetojsonlambda0.IconCompatParcelizer(cls);
        if (r8lambdaHUsxibeO4ooX9Axd9NEyh79TAY.serializer((Class) migratetriggersstoragetojsonlambda0.read())) {
            return;
        }
        this.PlaybackStateCompat = false;
    }
}
