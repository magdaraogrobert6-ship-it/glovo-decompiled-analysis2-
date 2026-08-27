package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.drivinginsights.api.CallEvent;
import com.sentiance.sdk.drivinginsights.api.CallWhileMovingEvent;
import com.sentiance.sdk.drivinginsights.api.DrivingInsights;
import com.sentiance.sdk.drivinginsights.api.HarshDrivingEvent;
import com.sentiance.sdk.drivinginsights.api.PhoneUsageEvent;
import com.sentiance.sdk.drivinginsights.api.SafetyScoreRequestParameters;
import com.sentiance.sdk.drivinginsights.api.SpeedingEvent;
import com.sentiance.sdk.drivinginsights.api.WrongWayDrivingEvent;
import com.sentiance.sdk.events.eventextras.TimelineUpdateDetails;
import com.sentiance.sdk.ondevice.api.event.OccupantRole;
import com.sentiance.sdk.ondevice.api.event.TransportMode;
import com.sentiance.sdk.util.DateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.BrazeGeofenceManagerExternalSyntheticLambda35;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.migrateFeatureFlagStorageToJsonlambda20;
import o.onLocationRequestComplete;
import o.r8lambdaRleDsXHyrU7hnnAyr0DPXgvoX80;
import o.r8lambdaSfG0H956DzQ3kMqujvKuyGX6Fc;
import o.r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0;
import o.r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ;
import o.r8lambdaW2zGEWorkx0MWNt812pRuFSWtQ;
import o.r8lambdaxHkJqKUHkuBvtHvtOlqgehcIRIA;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "DrivingInsightsProvider")
public final class onLocationRequestComplete implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private static final TimelineUpdateDetails.UpdatedDataType serializer;
    private final migrateFeatureFlagStorageToJsonlambda20 IconCompatParcelizer;
    private final setIconColor MediaBrowserCompatMediaItem;
    private final readandroid_sdk_base_release MediaDescriptionCompat;
    private final migrateTriggersStorageToJsonlambda1 MediaMetadataCompat;
    private final setMessageTextAlign MediaSessionCompatQueueItem;
    private final setExpirationTimestamp MediaSessionCompatResultReceiverWrapper;
    private final setClickBehavior MediaSessionCompatToken;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM ParcelableVolumeInfo;
    private final IBrazeGeofenceLocationUpdateListener PlaybackStateCompat;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM PlaybackStateCompatCustomAction;
    private final registerGeofencesWithGooglePlay RatingCompat;
    private final getAnalyticsEnabledEnterannotations RemoteActionCompatParcelizer;
    private final setHeaderTextColor read;
    private final parseLonglambda0 write;

    public static final class serializer {
        public serializer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @runlambda0
    public final ArrayList IconCompatParcelizer() {
        this.write.IconCompatParcelizer("Retrieving the whole harsh driving timeline", new Object[0]);
        BrazeGeofenceManagerExternalSyntheticLambda35.RemoteActionCompatParcelizer remoteActionCompatParcelizer = BrazeGeofenceManagerExternalSyntheticLambda35.IconCompatParcelizer;
        ArrayList arrayListRemoteActionCompatParcelizer = this.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer();
        remoteActionCompatParcelizer.getClass();
        return BrazeGeofenceManagerExternalSyntheticLambda35.RemoteActionCompatParcelizer.read(arrayListRemoteActionCompatParcelizer, this.IconCompatParcelizer, false);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
    }

    @runlambda0
    public final ArrayList serializer() {
        this.write.IconCompatParcelizer("Retrieving the whole phone usage timeline", new Object[0]);
        BrazeGeofenceManagerExternalSyntheticLambda35.RemoteActionCompatParcelizer remoteActionCompatParcelizer = BrazeGeofenceManagerExternalSyntheticLambda35.IconCompatParcelizer;
        List<r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0> listSerializer = this.MediaBrowserCompatMediaItem.serializer();
        remoteActionCompatParcelizer.getClass();
        return BrazeGeofenceManagerExternalSyntheticLambda35.RemoteActionCompatParcelizer.IconCompatParcelizer(listSerializer, this.IconCompatParcelizer);
    }

    public static final DrivingInsights read(onLocationRequestComplete onlocationrequestcomplete, String str) {
        migrateTriggersStorageToJsonlambda1 migratetriggersstoragetojsonlambda1 = onlocationrequestcomplete.MediaMetadataCompat;
        List listSerializer = onlocationrequestcomplete.read.serializer(InAppMessageFull.read(), str);
        listSerializer.getClass();
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq = (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) onContentCardDismissed.MediaMetadataCompat(listSerializer);
        if (r8lambdali8uu9krigfjg6en6xj7af4cwaq == null || migratetriggersstoragetojsonlambda1.write(r8lambdali8uu9krigfjg6en6xj7af4cwaq) == null || r8lambdali8uu9krigfjg6en6xj7af4cwaq.MediaDescriptionCompat() || !r8lambdali8uu9krigfjg6en6xj7af4cwaq.read().isOfTypeTransport() || !r8lambdali8uu9krigfjg6en6xj7af4cwaq.MediaBrowserCompatMediaItem()) {
            return null;
        }
        return new DrivingInsights(migratetriggersstoragetojsonlambda1.RemoteActionCompatParcelizer(r8lambdali8uu9krigfjg6en6xj7af4cwaq), onlocationrequestcomplete.RatingCompat.IconCompatParcelizer(r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()));
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog.class, new retrieveBrazeGeofencesFromLocalStorage(this, this.MediaDescriptionCompat));
    }

    static {
        new serializer(null);
        serializer = TimelineUpdateDetails.UpdatedDataType.TRANSPORT_SAFETY_SCORE;
    }

    public onLocationRequestComplete(parseLonglambda0 parselonglambda0, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, setHeaderTextColor setheadertextcolor, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, migrateTriggersStorageToJsonlambda1 migratetriggersstoragetojsonlambda1, registerGeofencesWithGooglePlay registergeofenceswithgoogleplay, setMessageTextAlign setmessagetextalign, setIconColor seticoncolor, setExpirationTimestamp setexpirationtimestamp, setClickBehavior setclickbehavior, IBrazeGeofenceLocationUpdateListener iBrazeGeofenceLocationUpdateListener) {
        parselonglambda0.getClass();
        getanalyticsenabledenterannotations.getClass();
        migratefeatureflagstoragetojsonlambda20.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        setheadertextcolor.getClass();
        readandroid_sdk_base_releaseVar.getClass();
        migratetriggersstoragetojsonlambda1.getClass();
        registergeofenceswithgoogleplay.getClass();
        setmessagetextalign.getClass();
        seticoncolor.getClass();
        setexpirationtimestamp.getClass();
        setclickbehavior.getClass();
        iBrazeGeofenceLocationUpdateListener.getClass();
        this.write = parselonglambda0;
        this.RemoteActionCompatParcelizer = getanalyticsenabledenterannotations;
        this.IconCompatParcelizer = migratefeatureflagstoragetojsonlambda20;
        this.read = setheadertextcolor;
        this.MediaDescriptionCompat = readandroid_sdk_base_releaseVar;
        this.MediaMetadataCompat = migratetriggersstoragetojsonlambda1;
        this.RatingCompat = registergeofenceswithgoogleplay;
        this.MediaSessionCompatQueueItem = setmessagetextalign;
        this.MediaBrowserCompatMediaItem = seticoncolor;
        this.MediaSessionCompatResultReceiverWrapper = setexpirationtimestamp;
        this.MediaSessionCompatToken = setclickbehavior;
        this.PlaybackStateCompat = iBrazeGeofenceLocationUpdateListener;
    }

    public final DrivingInsights IconCompatParcelizer(final String str) {
        str.getClass();
        this.write.IconCompatParcelizer("Retrieving driving insights for transport with ID: %s", str);
        return (DrivingInsights) serializer(str, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.sentiance.sdk.drivinginsights.providers.DrivingInsightsProvider$getDrivingInsightsByTransportId$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                return onLocationRequestComplete.read(this.this$0, str);
            }
        });
    }

    public final List<SpeedingEvent> MediaDescriptionCompat(final String str) {
        str.getClass();
        this.write.IconCompatParcelizer("Retrieving speeding events for transport with ID: %s", str);
        List<SpeedingEvent> list = (List) serializer(str, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.sentiance.sdk.drivinginsights.providers.DrivingInsightsProvider$getSpeedingEventsByTransportId$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                BrazeGeofenceManagerExternalSyntheticLambda35.RemoteActionCompatParcelizer remoteActionCompatParcelizer = BrazeGeofenceManagerExternalSyntheticLambda35.IconCompatParcelizer;
                List<r8lambdaRleDsXHyrU7hnnAyr0DPXgvoX80> listSerializer = this.this$0.MediaSessionCompatQueueItem.serializer(str);
                migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20 = this.this$0.IconCompatParcelizer;
                remoteActionCompatParcelizer.getClass();
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listSerializer, 10));
                for (r8lambdaRleDsXHyrU7hnnAyr0DPXgvoX80 r8lambdarledsxhyru7hnnayr0dpxgvox80 : listSerializer) {
                    arrayList.add(new SpeedingEvent(migratefeatureflagstoragetojsonlambda20.read(Long.valueOf(r8lambdarledsxhyru7hnnayr0dpxgvox80.serializer())), migratefeatureflagstoragetojsonlambda20.read(Long.valueOf(r8lambdarledsxhyru7hnnayr0dpxgvox80.IconCompatParcelizer())), r8lambdaxHkJqKUHkuBvtHvtOlqgehcIRIA.write(r8lambdarledsxhyru7hnnayr0dpxgvox80.MediaDescriptionCompat())));
                }
                return arrayList;
            }
        });
        return list == null ? instance_delegatelambda0.write : list;
    }

    public final List<WrongWayDrivingEvent> MediaSessionCompatQueueItem(final String str) {
        str.getClass();
        this.write.IconCompatParcelizer("Retrieving wrong way driving events for transport with ID: %s", str);
        List<WrongWayDrivingEvent> list = (List) serializer(str, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.sentiance.sdk.drivinginsights.providers.DrivingInsightsProvider$getWrongWayDrivingEventsByTransportId$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                BrazeGeofenceManagerExternalSyntheticLambda35.RemoteActionCompatParcelizer remoteActionCompatParcelizer = BrazeGeofenceManagerExternalSyntheticLambda35.IconCompatParcelizer;
                r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ r8lambdavofb8wwxngiixelwle1ybluc3iq = this.this$0.PlaybackStateCompat.read(str);
                migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20 = this.this$0.IconCompatParcelizer;
                remoteActionCompatParcelizer.getClass();
                List<r8lambdaW2zGEWorkx0MWNt812pRuFSWtQ> listRemoteActionCompatParcelizer = r8lambdavofb8wwxngiixelwle1ybluc3iq.RemoteActionCompatParcelizer();
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listRemoteActionCompatParcelizer, 10));
                for (r8lambdaW2zGEWorkx0MWNt812pRuFSWtQ r8lambdaw2zgeworkx0mwnt812prufswtq : listRemoteActionCompatParcelizer) {
                    arrayList.add(new WrongWayDrivingEvent(migratefeatureflagstoragetojsonlambda20.read(Long.valueOf(r8lambdaw2zgeworkx0mwnt812prufswtq.serializer())), migratefeatureflagstoragetojsonlambda20.read(Long.valueOf(r8lambdaw2zgeworkx0mwnt812prufswtq.IconCompatParcelizer())), r8lambdaxHkJqKUHkuBvtHvtOlqgehcIRIA.write(r8lambdaw2zgeworkx0mwnt812prufswtq.MediaDescriptionCompat())));
                }
                return arrayList;
            }
        });
        return list == null ? instance_delegatelambda0.write : list;
    }

    public final List<CallWhileMovingEvent> RemoteActionCompatParcelizer(final String str) {
        str.getClass();
        this.write.IconCompatParcelizer("Retrieving call while moving events for transport with ID: %s", str);
        List<CallWhileMovingEvent> list = (List) serializer(str, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.sentiance.sdk.drivinginsights.providers.DrivingInsightsProvider$getCallWhileMovingEvents$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                BrazeGeofenceManagerExternalSyntheticLambda35.RemoteActionCompatParcelizer remoteActionCompatParcelizer = BrazeGeofenceManagerExternalSyntheticLambda35.IconCompatParcelizer;
                List<r8lambdaSfG0H956DzQ3kMqujvKuyGX6Fc> listIconCompatParcelizer = this.this$0.MediaSessionCompatToken.IconCompatParcelizer(str);
                migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20 = this.this$0.IconCompatParcelizer;
                remoteActionCompatParcelizer.getClass();
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listIconCompatParcelizer, 10));
                for (r8lambdaSfG0H956DzQ3kMqujvKuyGX6Fc r8lambdasfg0h956dzq3kmqujvkuygx6fc : listIconCompatParcelizer) {
                    arrayList.add(new CallWhileMovingEvent(migratefeatureflagstoragetojsonlambda20.read(Long.valueOf(r8lambdasfg0h956dzq3kmqujvkuygx6fc.serializer())), migratefeatureflagstoragetojsonlambda20.read(Long.valueOf(r8lambdasfg0h956dzq3kmqujvkuygx6fc.IconCompatParcelizer())), r8lambdasfg0h956dzq3kmqujvkuygx6fc.write(), r8lambdasfg0h956dzq3kmqujvkuygx6fc.read(), r8lambdaxHkJqKUHkuBvtHvtOlqgehcIRIA.write(r8lambdasfg0h956dzq3kmqujvkuygx6fc.MediaDescriptionCompat())));
                }
                return arrayList;
            }
        });
        return list == null ? instance_delegatelambda0.write : list;
    }

    public final List<PhoneUsageEvent> read(final String str) {
        str.getClass();
        this.write.IconCompatParcelizer("Retrieving phone usage events for transport with ID: %s", str);
        List<PhoneUsageEvent> list = (List) serializer(str, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.sentiance.sdk.drivinginsights.providers.DrivingInsightsProvider$getPhoneUsageEventsByTransportId$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                BrazeGeofenceManagerExternalSyntheticLambda35.RemoteActionCompatParcelizer remoteActionCompatParcelizer = BrazeGeofenceManagerExternalSyntheticLambda35.IconCompatParcelizer;
                List<r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0> listWrite = this.this$0.MediaBrowserCompatMediaItem.write(str);
                migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20 = this.this$0.IconCompatParcelizer;
                remoteActionCompatParcelizer.getClass();
                return BrazeGeofenceManagerExternalSyntheticLambda35.RemoteActionCompatParcelizer.IconCompatParcelizer(listWrite, migratefeatureflagstoragetojsonlambda20);
            }
        });
        return list == null ? instance_delegatelambda0.write : list;
    }

    public final List<HarshDrivingEvent> serializer(final String str) {
        str.getClass();
        this.write.IconCompatParcelizer("Retrieving harsh driving events for transport with ID: %s", str);
        final boolean zIconCompatParcelizer = this.MediaMetadataCompat.IconCompatParcelizer(str);
        List<HarshDrivingEvent> list = (List) serializer(str, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.sentiance.sdk.drivinginsights.providers.DrivingInsightsProvider$getHarshDrivingEventsByTransportId$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                BrazeGeofenceManagerExternalSyntheticLambda35.RemoteActionCompatParcelizer remoteActionCompatParcelizer = BrazeGeofenceManagerExternalSyntheticLambda35.IconCompatParcelizer;
                List listSerializer = this.this$0.MediaSessionCompatResultReceiverWrapper.serializer(str);
                migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20 = this.this$0.IconCompatParcelizer;
                boolean z = zIconCompatParcelizer;
                remoteActionCompatParcelizer.getClass();
                return BrazeGeofenceManagerExternalSyntheticLambda35.RemoteActionCompatParcelizer.read(listSerializer, migratefeatureflagstoragetojsonlambda20, z);
            }
        });
        return list == null ? instance_delegatelambda0.write : list;
    }

    public final List<CallEvent> write(final String str) {
        str.getClass();
        this.write.IconCompatParcelizer("Retrieving call events for transport with ID: %s", str);
        List<CallEvent> list = (List) serializer(str, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.sentiance.sdk.drivinginsights.providers.DrivingInsightsProvider$getCallEvents$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                CallEvent.HandsFreeState handsFreeState;
                BrazeGeofenceManagerExternalSyntheticLambda35.RemoteActionCompatParcelizer remoteActionCompatParcelizer = BrazeGeofenceManagerExternalSyntheticLambda35.IconCompatParcelizer;
                List<r8lambdaSfG0H956DzQ3kMqujvKuyGX6Fc> listIconCompatParcelizer = this.this$0.MediaSessionCompatToken.IconCompatParcelizer(str);
                migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20 = this.this$0.IconCompatParcelizer;
                remoteActionCompatParcelizer.getClass();
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listIconCompatParcelizer, 10));
                for (r8lambdaSfG0H956DzQ3kMqujvKuyGX6Fc r8lambdasfg0h956dzq3kmqujvkuygx6fc : listIconCompatParcelizer) {
                    DateTime dateTime = migratefeatureflagstoragetojsonlambda20.read(Long.valueOf(r8lambdasfg0h956dzq3kmqujvkuygx6fc.serializer()));
                    DateTime dateTime2 = migratefeatureflagstoragetojsonlambda20.read(Long.valueOf(r8lambdasfg0h956dzq3kmqujvkuygx6fc.IconCompatParcelizer()));
                    Float fWrite = r8lambdasfg0h956dzq3kmqujvkuygx6fc.write();
                    Float f = r8lambdasfg0h956dzq3kmqujvkuygx6fc.read();
                    ArrayList arrayListWrite = r8lambdaxHkJqKUHkuBvtHvtOlqgehcIRIA.write(r8lambdasfg0h956dzq3kmqujvkuygx6fc.MediaDescriptionCompat());
                    BrazeGeofenceManagerExternalSyntheticLambda35.IconCompatParcelizer.getClass();
                    Boolean boolRemoteActionCompatParcelizer = r8lambdasfg0h956dzq3kmqujvkuygx6fc.RemoteActionCompatParcelizer();
                    Object[] objArr = {boolRemoteActionCompatParcelizer, Boolean.TRUE};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                        handsFreeState = CallEvent.HandsFreeState.HANDS_FREE;
                    } else {
                        Object[] objArr2 = {boolRemoteActionCompatParcelizer, Boolean.FALSE};
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                            handsFreeState = CallEvent.HandsFreeState.HANDHELD;
                        } else {
                            if (boolRemoteActionCompatParcelizer != null) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                return null;
                            }
                            handsFreeState = CallEvent.HandsFreeState.UNAVAILABLE;
                        }
                    }
                    arrayList.add(new CallEvent(dateTime, dateTime2, fWrite, f, arrayListWrite, handsFreeState));
                }
                return arrayList;
            }
        });
        return list == null ? instance_delegatelambda0.write : list;
    }

    public final void write(TncContentKt$$ExternalSyntheticLambda2 tncContentKt$$ExternalSyntheticLambda2) {
        this.ParcelableVolumeInfo = tncContentKt$$ExternalSyntheticLambda2;
        parseLonglambda0 parselonglambda0 = this.write;
        if (tncContentKt$$ExternalSyntheticLambda2 == null) {
            parselonglambda0.IconCompatParcelizer("Unsubscribed from phone usage updates.", new Object[0]);
        } else {
            parselonglambda0.IconCompatParcelizer("Subscribed to phone usage updates.", new Object[0]);
        }
    }

    private final <T> T serializer(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        List listSerializer = this.read.serializer(InAppMessageFull.read(), str);
        listSerializer.getClass();
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq = (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) onContentCardDismissed.MediaMetadataCompat(listSerializer);
        if (r8lambdali8uu9krigfjg6en6xj7af4cwaq == null || r8lambdali8uu9krigfjg6en6xj7af4cwaq.MediaDescriptionCompat()) {
            r8lambdali8uu9krigfjg6en6xj7af4cwaq = null;
        }
        if (r8lambdali8uu9krigfjg6en6xj7af4cwaq != null) {
            return (T) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        }
        return null;
    }

    public final void IconCompatParcelizer(TncContentKt$$ExternalSyntheticLambda2 tncContentKt$$ExternalSyntheticLambda2) {
        this.PlaybackStateCompatCustomAction = tncContentKt$$ExternalSyntheticLambda2;
        parseLonglambda0 parselonglambda0 = this.write;
        if (tncContentKt$$ExternalSyntheticLambda2 == null) {
            parselonglambda0.IconCompatParcelizer("Unsubscribed from driving insights updates.", new Object[0]);
        } else {
            parselonglambda0.IconCompatParcelizer("Subscribed to driving insights updates.", new Object[0]);
        }
    }

    public final Float read(SafetyScoreRequestParameters safetyScoreRequestParameters) {
        safetyScoreRequestParameters.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - safetyScoreRequestParameters.getPeriod().toMillis();
        List<TransportMode> modes = safetyScoreRequestParameters.getTransportModes().getModes();
        modes.getClass();
        List<OccupantRole> roles = safetyScoreRequestParameters.getOccupantRoles().getRoles();
        roles.getClass();
        this.write.IconCompatParcelizer("Retrieving average overall safety score since %d for modes %s and roles %s", Long.valueOf(jCurrentTimeMillis), modes, roles);
        return this.RatingCompat.IconCompatParcelizer(jCurrentTimeMillis, modes, roles);
    }
}
