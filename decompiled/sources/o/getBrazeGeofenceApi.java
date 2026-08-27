package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.ThriftBool;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.ControlMessage;
import io.socket.parser.IOParser$Decoder;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "PhoneUsageDetector")
public class getBrazeGeofenceApi implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final readandroid_sdk_base_release IconCompatParcelizer;
    private final getNotificationId MediaBrowserCompatMediaItem;
    private final boolean MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private final getGeofenceDataStoreProvider MediaSessionCompatQueueItem;
    private final setGeofenceRequestLocation RatingCompat;
    private final getAnalyticsEnabledEnterannotations RemoteActionCompatParcelizer;
    private final parseLonglambda0 write;
    private final deepcopyandroid_sdk_base_release serializer = new getBrazeManager(this);
    private final getLatitudeannotations<logLocationRecordedEvent> read = new getBrazeGeofenceReEligibilityManager(this);

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return Collections.EMPTY_MAP;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        write();
    }

    public getBrazeGeofenceApi(parseLonglambda0 parselonglambda0, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getGeofenceDataStoreProvider getgeofencedatastoreprovider, setGeofenceRequestLocation setgeofencerequestlocation, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getNotificationId getnotificationid, initializeGeofenceslambda1 initializegeofenceslambda1) {
        this.write = parselonglambda0;
        this.RemoteActionCompatParcelizer = getanalyticsenabledenterannotations;
        this.MediaSessionCompatQueueItem = getgeofencedatastoreprovider;
        this.RatingCompat = setgeofencerequestlocation;
        this.IconCompatParcelizer = readandroid_sdk_base_releaseVar;
        this.MediaBrowserCompatMediaItem = getnotificationid;
        if (!initializegeofenceslambda1.write(1)) {
            parselonglambda0.IconCompatParcelizer("Device does not have an accelerometer sensor", new Object[0]);
        } else if (initializegeofenceslambda1.write(4)) {
            this.MediaDescriptionCompat = true;
        } else {
            parselonglambda0.IconCompatParcelizer("Device does not have a gyroscope sensor", new Object[0]);
        }
    }

    private void write(List<getBrazeGeofences> list) {
        for (getBrazeGeofences getbrazegeofences : list) {
            this.RatingCompat.getClass();
            getbrazegeofences.getClass();
            IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
            ThriftBool thriftBool = getbrazegeofences.RemoteActionCompatParcelizer() ? ThriftBool.TRUE : ThriftBool.FALSE;
            if (thriftBool == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'is_phone_usage' cannot be null");
                return;
            }
            iOParser$Decoder.RemoteActionCompatParcelizer = thriftBool;
            iOParser$Decoder.read = 2000;
            r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
            r8lambdaromdixahini0blcevvl7ehebhj0.defaultViewModelProviderFactory_delegatelambda0 = iOParser$Decoder.read();
            r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwaIconCompatParcelizer = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
            r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(getbrazegeofences.read());
            r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaturwertf3otevz1wenzex5tdwaIconCompatParcelizer;
            this.RemoteActionCompatParcelizer.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
        }
    }

    public static void write(getBrazeGeofenceApi getbrazegeofenceapi) {
        boolean zRemoteActionCompatParcelizer;
        if (getbrazegeofenceapi.MediaMetadataCompat) {
            return;
        }
        synchronized (getbrazegeofenceapi) {
            zRemoteActionCompatParcelizer = getbrazegeofenceapi.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
            if (!zRemoteActionCompatParcelizer) {
                getbrazegeofenceapi.write.IconCompatParcelizer("Failed to start executor", new Object[0]);
            }
        }
        if (zRemoteActionCompatParcelizer) {
            getbrazegeofenceapi.MediaMetadataCompat = true;
            getbrazegeofenceapi.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(logLocationRecordedEvent.class, getbrazegeofenceapi.read);
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        if (this.MediaDescriptionCompat) {
            ControlMessage controlMessage = ControlMessage.PHONE_USAGE_DETECTOR_START;
            getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.RemoteActionCompatParcelizer;
            deepcopyandroid_sdk_base_release deepcopyandroid_sdk_base_releaseVar = this.serializer;
            getanalyticsenabledenterannotations.read(controlMessage, deepcopyandroid_sdk_base_releaseVar);
            getanalyticsenabledenterannotations.read(ControlMessage.PHONE_USAGE_DETECTOR_STOP, deepcopyandroid_sdk_base_releaseVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write() {
        if (this.MediaMetadataCompat) {
            this.MediaMetadataCompat = false;
            this.RemoteActionCompatParcelizer.serializer(logLocationRecordedEvent.class, this.read);
            synchronized (this) {
                this.MediaSessionCompatQueueItem.IconCompatParcelizer();
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void RemoteActionCompatParcelizer(getBrazeGeofenceApi getbrazegeofenceapi, cancelNotificationlambda0 cancelnotificationlambda0) {
        synchronized (getbrazegeofenceapi) {
            getbrazegeofenceapi.write((List<getBrazeGeofences>) getbrazegeofenceapi.MediaSessionCompatQueueItem.read(cancelnotificationlambda0.write(), cancelnotificationlambda0.read(), cancelnotificationlambda0.IconCompatParcelizer(), cancelnotificationlambda0.RemoteActionCompatParcelizer()));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void write(getBrazeGeofenceApi getbrazegeofenceapi, cancelNotificationlambda0 cancelnotificationlambda0) {
        synchronized (getbrazegeofenceapi) {
            getbrazegeofenceapi.write((List<getBrazeGeofences>) getbrazegeofenceapi.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(cancelnotificationlambda0.write(), cancelnotificationlambda0.read(), cancelnotificationlambda0.IconCompatParcelizer(), cancelnotificationlambda0.RemoteActionCompatParcelizer()));
        }
    }
}
