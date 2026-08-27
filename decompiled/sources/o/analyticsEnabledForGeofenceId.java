package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.E$b;
import com.sentiance.core.model.events.ThriftBool;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.ControlMessage;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "HarshEventDetector")
public class analyticsEnabledForGeofenceId implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final unregisterGeofenceslambda0 MediaBrowserCompatMediaItem;
    private boolean MediaDescriptionCompat;
    private final postGeofenceReport MediaMetadataCompat;
    private final getNotificationId MediaSessionCompatQueueItem;
    private final boolean RatingCompat;
    private final getAnalyticsEnabledEnterannotations read;
    private final readandroid_sdk_base_release serializer;
    private final parseLonglambda0 write;
    private final deepcopyandroid_sdk_base_release RemoteActionCompatParcelizer = new tearDownGeofenceslambda20(this);
    private final getLatitudeannotations<logLocationRecordedEvent> IconCompatParcelizer = new unregisterGeofenceslambda1(this);

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return Collections.EMPTY_MAP;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        serializer();
    }

    public analyticsEnabledForGeofenceId(parseLonglambda0 parselonglambda0, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, unregisterGeofenceslambda0 unregistergeofenceslambda0, postGeofenceReport postgeofencereport, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getNotificationId getnotificationid, initializeGeofenceslambda1 initializegeofenceslambda1) {
        this.write = parselonglambda0;
        this.read = getanalyticsenabledenterannotations;
        this.MediaBrowserCompatMediaItem = unregistergeofenceslambda0;
        this.MediaMetadataCompat = postgeofencereport;
        this.serializer = readandroid_sdk_base_releaseVar;
        this.MediaSessionCompatQueueItem = getnotificationid;
        if (initializegeofenceslambda1.write(1)) {
            this.RatingCompat = true;
        } else {
            parselonglambda0.IconCompatParcelizer("Device does not have an accelerometer", new Object[0]);
        }
    }

    public static void IconCompatParcelizer(analyticsEnabledForGeofenceId analyticsenabledforgeofenceid) {
        boolean zWrite;
        if (analyticsenabledforgeofenceid.MediaDescriptionCompat) {
            return;
        }
        synchronized (analyticsenabledforgeofenceid) {
            zWrite = analyticsenabledforgeofenceid.MediaBrowserCompatMediaItem.write();
            if (!zWrite) {
                analyticsenabledforgeofenceid.write.IconCompatParcelizer("Failed to start executor", new Object[0]);
            }
        }
        if (zWrite) {
            analyticsenabledforgeofenceid.MediaDescriptionCompat = true;
            analyticsenabledforgeofenceid.read.RemoteActionCompatParcelizer(logLocationRecordedEvent.class, analyticsenabledforgeofenceid.IconCompatParcelizer);
        }
    }

    private void RemoteActionCompatParcelizer(List<setUpGeofenceslambda2> list) {
        for (setUpGeofenceslambda2 setupgeofenceslambda2 : list) {
            this.MediaMetadataCompat.getClass();
            setupgeofenceslambda2.getClass();
            E$b e$b = new E$b(0);
            ThriftBool thriftBool = setupgeofenceslambda2.MediaMetadataCompat() ? ThriftBool.TRUE : ThriftBool.FALSE;
            if (thriftBool == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'is_harsh_driving' cannot be null");
                return;
            }
            e$b.read = thriftBool;
            if (setupgeofenceslambda2.write() != null) {
                e$b.RemoteActionCompatParcelizer = Byte.valueOf(setupgeofenceslambda2.write().toEventConstant());
            }
            if (setupgeofenceslambda2.read() != null) {
                e$b.IconCompatParcelizer = Byte.valueOf((byte) (setupgeofenceslambda2.read().floatValue() * 100.0f));
            }
            e$b.MediaDescriptionCompat = Byte.valueOf(setupgeofenceslambda2.MediaSessionCompatQueueItem().toEventConstant());
            if (setupgeofenceslambda2.IconCompatParcelizer() != null) {
                e$b.MediaBrowserCompatMediaItem = Byte.valueOf((byte) (setupgeofenceslambda2.IconCompatParcelizer().floatValue() * 100.0f));
            }
            if (setupgeofenceslambda2.serializer() != null) {
                e$b.write = Double.valueOf(setupgeofenceslambda2.serializer().floatValue());
            }
            if (setupgeofenceslambda2.RemoteActionCompatParcelizer() != null) {
                e$b.MediaMetadataCompat = setupgeofenceslambda2.RemoteActionCompatParcelizer();
            }
            r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
            if (((ThriftBool) e$b.read) == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'is_harsh_driving' is missing");
                return;
            }
            r8lambdaromdixahini0blcevvl7ehebhj0.createFullyDrawnExecutor = new setConfiguredCustomEndpointandroid_sdk_base_release(e$b);
            r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwaIconCompatParcelizer = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
            r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(setupgeofenceslambda2.RatingCompat());
            r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaturwertf3otevz1wenzex5tdwaIconCompatParcelizer;
            this.read.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        if (this.RatingCompat) {
            ControlMessage controlMessage = ControlMessage.HARSH_EVENT_DETECTOR_START;
            getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.read;
            deepcopyandroid_sdk_base_release deepcopyandroid_sdk_base_releaseVar = this.RemoteActionCompatParcelizer;
            getanalyticsenabledenterannotations.read(controlMessage, deepcopyandroid_sdk_base_releaseVar);
            getanalyticsenabledenterannotations.read(ControlMessage.HARSH_EVENT_DETECTOR_STOP, deepcopyandroid_sdk_base_releaseVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serializer() {
        if (this.MediaDescriptionCompat) {
            this.MediaDescriptionCompat = false;
            this.read.serializer(logLocationRecordedEvent.class, this.IconCompatParcelizer);
            synchronized (this) {
                this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
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
    public static void read(analyticsEnabledForGeofenceId analyticsenabledforgeofenceid, cancelNotificationlambda0 cancelnotificationlambda0) {
        synchronized (analyticsenabledforgeofenceid) {
            analyticsenabledforgeofenceid.RemoteActionCompatParcelizer((List<setUpGeofenceslambda2>) analyticsenabledforgeofenceid.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(cancelnotificationlambda0.write(), cancelnotificationlambda0.read(), cancelnotificationlambda0.IconCompatParcelizer(), cancelnotificationlambda0.RemoteActionCompatParcelizer()));
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
    public static void IconCompatParcelizer(analyticsEnabledForGeofenceId analyticsenabledforgeofenceid, cancelNotificationlambda0 cancelnotificationlambda0) {
        synchronized (analyticsenabledforgeofenceid) {
            analyticsenabledforgeofenceid.RemoteActionCompatParcelizer((List<setUpGeofenceslambda2>) analyticsenabledforgeofenceid.MediaBrowserCompatMediaItem.IconCompatParcelizer(cancelnotificationlambda0.write(), cancelnotificationlambda0.read(), cancelnotificationlambda0.IconCompatParcelizer(), cancelnotificationlambda0.RemoteActionCompatParcelizer()));
        }
    }
}
