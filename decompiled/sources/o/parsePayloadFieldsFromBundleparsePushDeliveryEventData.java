package o;

import android.location.Location;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.events.controlmessageextras.StartLocationFixRequest$Purpose;
import com.sentiance.sdk.eventtimeline.api.TripLocation;
import com.sentiance.sdk.eventtimeline.api.TripLocationUpdatesListener;
import com.sentiance.sdk.eventtimeline.api.TripLocationUpdatesStartResult;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import com.sentiance.sdk.feature.FeatureType;
import com.sentiance.sdk.ondevice.api.event.TransportMode;
import com.sentiance.sdk.services.ServiceForegroundMode;
import com.sentiance.sdk.util.Optional;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.BrazeCompanionExternalSyntheticLambda4;
import o.createFromParcel;
import o.getLongitudeannotations;
import o.migrateTriggersReeligibilityToJsonlambda1;
import o.migrateTriggersReeligibilityToJsonlambda4;
import o.parsePayloadFieldsFromBundleparsePushDeliveryEventData;
import o.parseStringAsLong;
import o.r8lambdaHUsxibeO4ooX9Axd9NEyh79TAY;
import o.r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU;
import o.r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "TripLocationUpdatesProvider")
public final class parsePayloadFieldsFromBundleparsePushDeliveryEventData extends handleHmsRemoteMessageDatalambda1 implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI IconCompatParcelizer;
    private final setHeaderTextColor MediaBrowserCompatMediaItem;
    private getNotificationResponsivenessMsannotations MediaDescriptionCompat;
    private getNotificationResponsivenessMsannotations MediaMetadataCompat;
    private final getConversationPersonMap MediaSessionCompatQueueItem;
    private boolean MediaSessionCompatResultReceiverWrapper;
    private parseStringAsLong MediaSessionCompatToken;
    private final migrateTriggersStorageToJsonlambda0 ParcelableVolumeInfo;
    private final migrateTriggersReeligibilityToJsonlambda20 PlaybackStateCompat;
    private final readandroid_sdk_base_release RatingCompat;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final getAnalyticsEnabledEnterannotations read;
    private final getCooldownEnterSeconds serializer;
    private final getVerticalAccuracy write;

    public static final class read {
        public read(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final parseStringAsLong RemoteActionCompatParcelizer() {
        return this.MediaSessionCompatToken;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        this.MediaSessionCompatToken = null;
        this.ParcelableVolumeInfo.write();
        this.PlaybackStateCompat.write();
        IconCompatParcelizer();
    }

    private final void IconCompatParcelizer() {
        getNotificationResponsivenessMsannotations getnotificationresponsivenessmsannotations = this.MediaDescriptionCompat;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.read;
        if (getnotificationresponsivenessmsannotations != null) {
            getanalyticsenabledenterannotations.serializer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, getnotificationresponsivenessmsannotations);
        }
        getNotificationResponsivenessMsannotations getnotificationresponsivenessmsannotations2 = this.MediaMetadataCompat;
        if (getnotificationresponsivenessmsannotations2 != null) {
            getanalyticsenabledenterannotations.serializer(r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog.class, getnotificationresponsivenessmsannotations2);
        }
        this.MediaSessionCompatResultReceiverWrapper = false;
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        parselonglambda0.serializer("Unsubscribed from events.", new Object[0]);
        parselonglambda0.serializer("Cancelling location request", new Object[0]);
        getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.LOCATION_FIX_STOP, new getDismissalTimeMsannotations("TripLocationProvider"));
    }

    public static final void read(parsePayloadFieldsFromBundleparsePushDeliveryEventData parsepayloadfieldsfrombundleparsepushdeliveryeventdata) {
        parsepayloadfieldsfrombundleparsepushdeliveryeventdata.PlaybackStateCompat.read(RemoteActionCompatParcelizer(parsepayloadfieldsfrombundleparsepushdeliveryeventdata.MediaBrowserCompatMediaItem));
    }

    private final void write(int i) {
        this.PlaybackStateCompat.read(RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem));
        boolean z = this.MediaSessionCompatResultReceiverWrapper;
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.read;
        if (!z) {
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.sentiance.sdk.eventtimeline.triplocation.TripLocationUpdatesProvider$subscribeToEvents$1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Object invoke(Object obj) {
                    getLongitudeannotations getlongitudeannotations = (getLongitudeannotations) obj;
                    getlongitudeannotations.getClass();
                    parseStringAsLong parsestringaslongRemoteActionCompatParcelizer = this.this$0.RemoteActionCompatParcelizer();
                    if (parsestringaslongRemoteActionCompatParcelizer != null) {
                        TripLocationUpdatesListener tripLocationUpdatesListenerIconCompatParcelizer = parsestringaslongRemoteActionCompatParcelizer.IconCompatParcelizer();
                        parsePayloadFieldsFromBundleparsePushDeliveryEventData parsepayloadfieldsfrombundleparsepushdeliveryeventdata = this.this$0;
                        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = ((r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU) getlongitudeannotations.read()).RemoteActionCompatParcelizer;
                        brazeCompanionExternalSyntheticLambda4.getClass();
                        tripLocationUpdatesListenerIconCompatParcelizer.onLocationReceived(parsePayloadFieldsFromBundleparsePushDeliveryEventData.serializer(parsepayloadfieldsfrombundleparsepushdeliveryeventdata, brazeCompanionExternalSyntheticLambda4));
                    }
                    return createFromParcel.INSTANCE;
                }

                {
                    super(1);
                }
            };
            readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.RatingCompat;
            this.MediaDescriptionCompat = getEnterEventsannotations.IconCompatParcelizer(getanalyticsenabledenterannotations, r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, readandroid_sdk_base_releaseVar, "TripLocationProvider", r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            this.MediaMetadataCompat = getEnterEventsannotations.IconCompatParcelizer(getanalyticsenabledenterannotations, r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog.class, readandroid_sdk_base_releaseVar, "TripLocationProvider", new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.sentiance.sdk.eventtimeline.triplocation.TripLocationUpdatesProvider$subscribeToEvents$2
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Object invoke(Object obj) {
                    getLongitudeannotations getlongitudeannotations = (getLongitudeannotations) obj;
                    getlongitudeannotations.getClass();
                    List<Byte> list = ((r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog) getlongitudeannotations.read()).write;
                    list.getClass();
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (Byte b : list) {
                            if (b != null && b.byteValue() == 1) {
                                parsePayloadFieldsFromBundleparsePushDeliveryEventData.read(this.this$0);
                                break;
                            }
                        }
                    }
                    return createFromParcel.INSTANCE;
                }

                {
                    super(1);
                }
            });
            this.MediaSessionCompatResultReceiverWrapper = true;
            parselonglambda0.serializer("Subscribed to events.", new Object[0]);
        }
        parselonglambda0.serializer(d$$ExternalSyntheticOutline0.m(i, "Issuing a new location request with an interval of ", " seconds"), new Object[0]);
        getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.LOCATION_FIX_START, r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0.read("TripLocationProvider", 1000 * ((long) i), ServiceForegroundMode.O_ONLY, true, true, StartLocationFixRequest$Purpose.TRIP_LOCATIONS));
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        Class clsIconCompatParcelizer;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = this.serializer.RemoteActionCompatParcelizer(invokeFallbackFirebaseServicelambda2.IconCompatParcelizer, (Long) null, false);
        if (optionalRemoteActionCompatParcelizer.IconCompatParcelizer() && (clsIconCompatParcelizer = getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer.write(), this.write)) != null) {
        }
        return linkedHashMap;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        this.IconCompatParcelizer.getClass();
        read(this.RatingCompat, System.currentTimeMillis());
    }

    static {
        new read(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public parsePayloadFieldsFromBundleparsePushDeliveryEventData(parseLonglambda0 parselonglambda0, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getCooldownEnterSeconds getcooldownenterseconds, getVerticalAccuracy getverticalaccuracy, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, setHeaderTextColor setheadertextcolor, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getConversationPersonMap getconversationpersonmap) {
        super("TripLocationProvider", getanalyticsenabledenterannotations);
        parselonglambda0.getClass();
        getanalyticsenabledenterannotations.getClass();
        getcooldownenterseconds.getClass();
        getverticalaccuracy.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        setheadertextcolor.getClass();
        readandroid_sdk_base_releaseVar.getClass();
        getconversationpersonmap.getClass();
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.read = getanalyticsenabledenterannotations;
        this.serializer = getcooldownenterseconds;
        this.write = getverticalaccuracy;
        this.IconCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaBrowserCompatMediaItem = setheadertextcolor;
        this.RatingCompat = readandroid_sdk_base_releaseVar;
        this.MediaSessionCompatQueueItem = getconversationpersonmap;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.PlaybackStateCompat = new migrateTriggersReeligibilityToJsonlambda20(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.sentiance.sdk.eventtimeline.triplocation.TripLocationUpdatesProvider$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                ((migrateTriggersReeligibilityToJsonlambda1) obj).getClass();
                parsePayloadFieldsFromBundleparsePushDeliveryEventData parsepayloadfieldsfrombundleparsepushdeliveryeventdata = this.this$0;
                return parsePayloadFieldsFromBundleparsePushDeliveryEventData.IconCompatParcelizer(parsepayloadfieldsfrombundleparsepushdeliveryeventdata, parsepayloadfieldsfrombundleparsepushdeliveryeventdata.MediaBrowserCompatMediaItem);
            }

            {
                super(1);
            }
        });
        this.ParcelableVolumeInfo = new migrateTriggersStorageToJsonlambda0(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.sentiance.sdk.eventtimeline.triplocation.TripLocationUpdatesProvider$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                ((migrateTriggersReeligibilityToJsonlambda4) obj).getClass();
                return r8lambdaHUsxibeO4ooX9Axd9NEyh79TAY.write(this.this$0.serializer, jCurrentTimeMillis, this.this$0.write);
            }
        });
    }

    public static void serializer(parsePayloadFieldsFromBundleparsePushDeliveryEventData parsepayloadfieldsfrombundleparsepushdeliveryeventdata, int i, d0$$ExternalSyntheticLambda0 d0__externalsyntheticlambda0) {
        parseStringAsLong parsestringaslong = parsepayloadfieldsfrombundleparsepushdeliveryeventdata.MediaSessionCompatToken;
        Integer numValueOf = parsestringaslong != null ? Integer.valueOf(parsestringaslong.write()) : null;
        if (numValueOf == null || i != numValueOf.intValue()) {
            numValueOf = Integer.valueOf(i);
            if (dispatchKeyEventYhN2O0w.RemoteActionCompatParcelizer(parsepayloadfieldsfrombundleparsepushdeliveryeventdata.ParcelableVolumeInfo)) {
                parsepayloadfieldsfrombundleparsepushdeliveryeventdata.write(i);
            }
        }
        parsepayloadfieldsfrombundleparsepushdeliveryeventdata.MediaSessionCompatToken = new parseStringAsLong(numValueOf.intValue(), d0__externalsyntheticlambda0);
    }

    public final void read() {
        this.RatingCompat.RemoteActionCompatParcelizer(new ZM$$ExternalSyntheticLambda2(24, this));
    }

    @Override // o.handleHmsRemoteMessageDatalambda1
    public final void serializer(long j, Class cls) {
        String str;
        parseStringAsLong parsestringaslong = this.MediaSessionCompatToken;
        if (cls.equals(r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class)) {
            str = "StationaryStateEvent";
        } else if (cls.equals(wipeDatalambda0.class)) {
            str = "GeofencelessStationaryStateEvent";
        } else if (cls.equals(r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4.class)) {
            str = "StoppedStateEvent";
        } else if (cls.equals(r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class)) {
            str = "ForcedMovingStateEvent";
        } else if (cls.equals(setShouldPersistWebView.class)) {
            str = "MovingStateEvent";
        } else if (cls.equals(r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class)) {
            str = "UnconfirmedMovingStateEvent";
        } else {
            str = cls.equals(BrazeBootReceiver.class) ? "UnknownStateEvent" : "unknown moving state";
        }
        this.RemoteActionCompatParcelizer.serializer("Moving state changed to ".concat(str), new Object[0]);
        migrateTriggersStorageToJsonlambda0 migratetriggersstoragetojsonlambda0 = this.ParcelableVolumeInfo;
        if (!r8lambdaHUsxibeO4ooX9Axd9NEyh79TAY.serializer((Class) migratetriggersstoragetojsonlambda0.read()) && r8lambdaHUsxibeO4ooX9Axd9NEyh79TAY.serializer(cls) && parsestringaslong != null) {
            write(parsestringaslong.write());
        } else if (dispatchKeyEventYhN2O0w.RemoteActionCompatParcelizer(migratetriggersstoragetojsonlambda0) && !r8lambdaHUsxibeO4ooX9Axd9NEyh79TAY.serializer(cls)) {
            IconCompatParcelizer();
        }
        migratetriggersstoragetojsonlambda0.IconCompatParcelizer(cls);
    }

    public static void write(parsePayloadFieldsFromBundleparsePushDeliveryEventData parsepayloadfieldsfrombundleparsepushdeliveryeventdata) {
        if (parsepayloadfieldsfrombundleparsepushdeliveryeventdata.MediaSessionCompatToken == null) {
            return;
        }
        parsepayloadfieldsfrombundleparsepushdeliveryeventdata.MediaSessionCompatToken = null;
        parsepayloadfieldsfrombundleparsepushdeliveryeventdata.IconCompatParcelizer();
    }

    public static final /* synthetic */ TransportMode IconCompatParcelizer(parsePayloadFieldsFromBundleparsePushDeliveryEventData parsepayloadfieldsfrombundleparsepushdeliveryeventdata, setHeaderTextColor setheadertextcolor) {
        parsepayloadfieldsfrombundleparsepushdeliveryeventdata.getClass();
        return RemoteActionCompatParcelizer(setheadertextcolor);
    }

    public final TripLocationUpdatesStartResult IconCompatParcelizer(int i, d0$$ExternalSyntheticLambda0 d0__externalsyntheticlambda0) {
        getConversationPersonMap getconversationpersonmap = this.MediaSessionCompatQueueItem;
        getconversationpersonmap.getClass();
        if (!getconversationpersonmap.read(FeatureType.EVENT_TIMELINING)) {
            return TripLocationUpdatesStartResult.FEATURE_IS_NOT_AVAILABLE;
        }
        if (i < 1) {
            this.RemoteActionCompatParcelizer.serializer(m1$$ExternalSyntheticOutline0.m("Cannot request location updates, the provided interval is invalid. (", i, ')'), new Object[0]);
            return TripLocationUpdatesStartResult.INVALID_INTERVAL;
        }
        this.RatingCompat.RemoteActionCompatParcelizer(new renderUrlIntoViewlambda1(i, 9, this, d0__externalsyntheticlambda0));
        return TripLocationUpdatesStartResult.SUCCESS;
    }

    public static final TripLocation serializer(parsePayloadFieldsFromBundleparsePushDeliveryEventData parsepayloadfieldsfrombundleparsepushdeliveryeventdata, BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4) {
        parsepayloadfieldsfrombundleparsepushdeliveryeventdata.write.getClass();
        Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
        Object obj = parsepayloadfieldsfrombundleparsepushdeliveryeventdata.PlaybackStateCompat.read();
        obj.getClass();
        TripLocation.Builder builder = new TripLocation.Builder(locationWrite.getLatitude(), locationWrite.getLongitude(), locationWrite.getTime(), (TransportMode) obj);
        if (locationWrite.hasAccuracy()) {
            builder.accuracy(locationWrite.getAccuracy());
        }
        if (locationWrite.hasAltitude()) {
            builder.altitude(locationWrite.getAltitude());
        }
        if (locationWrite.hasSpeed()) {
            builder.speed(locationWrite.getSpeed());
        }
        if (locationWrite.hasBearing()) {
            builder.bearing(locationWrite.getBearing());
        }
        if (locationWrite.hasBearingAccuracy()) {
            builder.bearingAccuracy(locationWrite.getBearingAccuracyDegrees());
        }
        if (locationWrite.hasSpeedAccuracy()) {
            builder.speedAccuracy(locationWrite.getSpeedAccuracyMetersPerSecond());
        }
        if (locationWrite.hasVerticalAccuracy()) {
            builder.verticalAccuracy(locationWrite.getVerticalAccuracyMeters());
        }
        TripLocation tripLocationBuild = builder.build();
        tripLocationBuild.getClass();
        return tripLocationBuild;
    }

    private static TransportMode RemoteActionCompatParcelizer(setHeaderTextColor setheadertextcolor) {
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq = (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) setheadertextcolor.serializer(InAppMessageFull.read());
        if (r8lambdali8uu9krigfjg6en6xj7af4cwaq != null) {
            TransportChangeType transportChangeType = r8lambdali8uu9krigfjg6en6xj7af4cwaq.read();
            int i = transportChangeType == null ? -1 : parsePayloadFieldsFromBundleparseVisibleContent.serializer[transportChangeType.ordinal()];
            TransportMode externalTransportMode = (i == 1 || i == 2) ? null : r8lambdali8uu9krigfjg6en6xj7af4cwaq.read().toClassifiedTransportMode().toExternalTransportMode();
            if (externalTransportMode != null) {
                return externalTransportMode;
            }
        }
        return TransportMode.UNKNOWN;
    }
}
