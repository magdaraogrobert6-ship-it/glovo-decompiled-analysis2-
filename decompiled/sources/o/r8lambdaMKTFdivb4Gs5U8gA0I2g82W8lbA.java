package o;

import android.location.Location;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.thrift.O$b;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.eventtimeline.transportclassification.ClassifiedTransportMode;
import com.sentiance.sdk.util.Optional;
import io.sentry.Scopes$$ExternalSyntheticLambda0;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.util.network.NetworkBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "TransportClassifier")
public class r8lambdaMKTFdivb4Gs5U8gA0I2g82W8lbA implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final parseLonglambda0 IconCompatParcelizer;
    private final BrazeProperties MediaBrowserCompatMediaItem;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaDescriptionCompat;
    private final component4android_sdk_base_release MediaMetadataCompat;
    private final r8lambdadBZji8Dz7KdOXrNRd269izkUo MediaSessionCompatQueueItem;
    private boolean MediaSessionCompatToken = false;
    private final addPropertylambda0 ParcelableVolumeInfo;
    private final getNotificationId RatingCompat;
    private final r8lambda59SWxCYBPdsiW8mt9H_rosbR8qQ RemoteActionCompatParcelizer;
    private final getCooldownEnterSeconds read;
    private final addPropertylambda1 serializer;
    private final getAnalyticsEnabledEnterannotations write;

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        HashMap map = new HashMap();
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = this.read.IconCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, (Long) null);
        if (optionalIconCompatParcelizer.IconCompatParcelizer()) {
            int iMediaSessionCompatQueueItem = optionalIconCompatParcelizer.write().MediaSessionCompatQueueItem();
            this.RemoteActionCompatParcelizer.getClass();
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalIconCompatParcelizer.write(), map, getVerticalAccuracy.write(iMediaSessionCompatQueueItem));
        }
        return map;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        ControlMessage controlMessage = ControlMessage.ONDEVICE_TRANSPORT_CLASSIFIER_START;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.write;
        addPropertylambda0 addpropertylambda0 = this.ParcelableVolumeInfo;
        getanalyticsenabledenterannotations.read(controlMessage, addpropertylambda0);
        getanalyticsenabledenterannotations.read(ControlMessage.ONDEVICE_TRANSPORT_CLASSIFIER_STOP, addpropertylambda0);
    }

    public r8lambdaMKTFdivb4Gs5U8gA0I2g82W8lbA(parseLonglambda0 parselonglambda0, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, r8lambda59SWxCYBPdsiW8mt9H_rosbR8qQ r8lambda59swxcybpdsiw8mt9h_rosbr8qq, getCooldownEnterSeconds getcooldownenterseconds, component4android_sdk_base_release component4android_sdk_base_releaseVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, addPropertylambda1 addpropertylambda1, getNotificationId getnotificationid) {
        this.IconCompatParcelizer = parselonglambda0;
        this.write = getanalyticsenabledenterannotations;
        this.read = getcooldownenterseconds;
        this.MediaMetadataCompat = component4android_sdk_base_releaseVar;
        this.MediaDescriptionCompat = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.RatingCompat = getnotificationid;
        this.serializer = addpropertylambda1;
        this.RemoteActionCompatParcelizer = r8lambda59swxcybpdsiw8mt9h_rosbr8qq;
        this.MediaBrowserCompatMediaItem = new BrazeProperties(this, readandroid_sdk_base_releaseVar);
        this.MediaSessionCompatQueueItem = new r8lambdadBZji8Dz7KdOXrNRd269izkUo(this, readandroid_sdk_base_releaseVar);
        this.ParcelableVolumeInfo = new addPropertylambda0(this, readandroid_sdk_base_releaseVar);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        RemoteActionCompatParcelizer();
        synchronized (this) {
            this.serializer.RemoteActionCompatParcelizer();
        }
    }

    private void serializer(List<addPropertylambda1.RemoteActionCompatParcelizer> list) {
        clearInstanceandroid_sdk_base_release clearinstanceandroid_sdk_base_releaseIconCompatParcelizer;
        for (addPropertylambda1.RemoteActionCompatParcelizer remoteActionCompatParcelizer : list) {
            this.IconCompatParcelizer.IconCompatParcelizer("Trip level classification: " + remoteActionCompatParcelizer.read(), new Object[0]);
            r8lambdax7jFbnuaviBhW8Q6CXBAdQQk_KQ r8lambdax7jfbnuavibhw8q6cxbadqqk_kq = remoteActionCompatParcelizer.read();
            if (r8lambdax7jfbnuavibhw8q6cxbadqqk_kq != null && r8lambdax7jfbnuavibhw8q6cxbadqqk_kq.write() != null) {
                this.RemoteActionCompatParcelizer.getClass();
                r8lambdax7jFbnuaviBhW8Q6CXBAdQQk_KQ r8lambdax7jfbnuavibhw8q6cxbadqqk_kq2 = remoteActionCompatParcelizer.read();
                r8lambdabuq0kpt9xWGgh2Z3gBfct3eoBM r8lambdabuq0kpt9xwggh2z3gbfct3eobmIconCompatParcelizer = remoteActionCompatParcelizer.IconCompatParcelizer();
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (Map.Entry entry : r8lambdax7jfbnuavibhw8q6cxbadqqk_kq2.IconCompatParcelizer().entrySet()) {
                    map.put(((ClassifiedTransportMode) entry.getKey()).toEventConstant(), Byte.valueOf((byte) (((Float) entry.getValue()).floatValue() * 100.0f)));
                    map2.put(((ClassifiedTransportMode) entry.getKey()).toEventConstant(), Double.valueOf(((double) ((Float) entry.getValue()).floatValue()) * 1.0d));
                }
                ClassifiedTransportMode classifiedTransportModeWrite = r8lambdax7jfbnuavibhw8q6cxbadqqk_kq2.write();
                if (classifiedTransportModeWrite == null) {
                    ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Attempting to create a transport classification event with null classified mode");
                    return;
                }
                O$b o$b = new O$b();
                o$b.write = Integer.valueOf((int) (r8lambdax7jfbnuavibhw8q6cxbadqqk_kq2.RemoteActionCompatParcelizer() - r8lambdax7jfbnuavibhw8q6cxbadqqk_kq2.read()));
                o$b.RemoteActionCompatParcelizer = map;
                o$b.IconCompatParcelizer = map2;
                ArrayList arrayList = new ArrayList();
                if (r8lambdabuq0kpt9xwggh2z3gbfct3eobmIconCompatParcelizer != null && r8lambdabuq0kpt9xwggh2z3gbfct3eobmIconCompatParcelizer.RemoteActionCompatParcelizer().size() == r8lambdabuq0kpt9xwggh2z3gbfct3eobmIconCompatParcelizer.write().size()) {
                    for (int i = 0; i < r8lambdabuq0kpt9xwggh2z3gbfct3eobmIconCompatParcelizer.RemoteActionCompatParcelizer().size(); i++) {
                        Location location = r8lambdabuq0kpt9xwggh2z3gbfct3eobmIconCompatParcelizer.RemoteActionCompatParcelizer().get(i);
                        DataStoreProvidera dataStoreProvidera = r8lambdabuq0kpt9xwggh2z3gbfct3eobmIconCompatParcelizer.write().get(i);
                        NetworkBody networkBody = new NetworkBody(15);
                        networkBody.IconCompatParcelizer = getVerticalAccuracy.serializer(location);
                        if (dataStoreProvidera == null) {
                            clearinstanceandroid_sdk_base_releaseIconCompatParcelizer = null;
                        } else {
                            getDeviceDataProviderandroid_sdk_base_release getdevicedataproviderandroid_sdk_base_release = new getDeviceDataProviderandroid_sdk_base_release();
                            getdevicedataproviderandroid_sdk_base_release.write = Boolean.valueOf(dataStoreProvidera.IconCompatParcelizer());
                            getdevicedataproviderandroid_sdk_base_release.serializer = Boolean.valueOf(dataStoreProvidera.write());
                            getdevicedataproviderandroid_sdk_base_release.IconCompatParcelizer = Boolean.valueOf(dataStoreProvidera.serializer());
                            clearinstanceandroid_sdk_base_releaseIconCompatParcelizer = getdevicedataproviderandroid_sdk_base_release.IconCompatParcelizer();
                        }
                        networkBody.RemoteActionCompatParcelizer = clearinstanceandroid_sdk_base_releaseIconCompatParcelizer;
                        if (((BrazeCompanionExternalSyntheticLambda4) networkBody.IconCompatParcelizer) == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'location' is missing");
                            return;
                        }
                        arrayList.add(new r8lambdaUwXDSMrlNtZuDA6i1VDnmBTUWe4(networkBody));
                    }
                }
                o$b.read = arrayList;
                o$b.serializer = classifiedTransportModeWrite.toEventConstant();
                r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs r8lambdavyxnhk9sdraxwugvbef6izzxidsMediaMetadataCompat = o$b.MediaMetadataCompat();
                r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
                r8lambdaromdixahini0blcevvl7ehebhj0.ComponentActivity = r8lambdavyxnhk9sdraxwugvbef6izzxidsMediaMetadataCompat;
                r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwaIconCompatParcelizer = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
                r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(r8lambdax7jfbnuavibhw8q6cxbadqqk_kq2.read());
                r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaturwertf3otevz1wenzex5tdwaIconCompatParcelizer;
                this.write.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm, (Object) remoteActionCompatParcelizer.IconCompatParcelizer(), true, (Scopes$$ExternalSyntheticLambda0) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer() {
        if (this.MediaSessionCompatToken) {
            this.MediaSessionCompatToken = false;
            this.write.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem);
            this.write.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem);
            synchronized (this) {
                serializer(this.serializer.IconCompatParcelizer());
                this.serializer.read();
            }
            this.write.IconCompatParcelizer(ControlMessage.ONDEVICE_TRANSPORT_CLASSIFIER_STOPPED, (Object) null);
        }
    }

    public static void serializer(r8lambdaMKTFdivb4Gs5U8gA0I2g82W8lbA r8lambdamktfdivb4gs5u8ga0i2g82w8lba, r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku) {
        r8lambda59SWxCYBPdsiW8mt9H_rosbR8qQ r8lambda59swxcybpdsiw8mt9h_rosbr8qq = r8lambdamktfdivb4gs5u8ga0i2g82w8lba.RemoteActionCompatParcelizer;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer;
        r8lambda59swxcybpdsiw8mt9h_rosbr8qq.getClass();
        Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
        synchronized (r8lambdamktfdivb4gs5u8ga0i2g82w8lba) {
            r8lambdamktfdivb4gs5u8ga0i2g82w8lba.serializer.serializer(locationWrite);
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
    public static void serializer(r8lambdaMKTFdivb4Gs5U8gA0I2g82W8lbA r8lambdamktfdivb4gs5u8ga0i2g82w8lba, cancelNotificationlambda0 cancelnotificationlambda0) {
        synchronized (r8lambdamktfdivb4gs5u8ga0i2g82w8lba) {
            r8lambdamktfdivb4gs5u8ga0i2g82w8lba.serializer((List<addPropertylambda1.RemoteActionCompatParcelizer>) r8lambdamktfdivb4gs5u8ga0i2g82w8lba.serializer.write(cancelnotificationlambda0.write(), cancelnotificationlambda0.read(), cancelnotificationlambda0.IconCompatParcelizer(), cancelnotificationlambda0.RemoteActionCompatParcelizer()));
        }
    }

    public static void read(r8lambdaMKTFdivb4Gs5U8gA0I2g82W8lbA r8lambdamktfdivb4gs5u8ga0i2g82w8lba, long j) {
        r8lambdamktfdivb4gs5u8ga0i2g82w8lba.serializer.IconCompatParcelizer(j);
    }

    public static void write(r8lambdaMKTFdivb4Gs5U8gA0I2g82W8lbA r8lambdamktfdivb4gs5u8ga0i2g82w8lba) {
        boolean zWrite;
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        if (r8lambdamktfdivb4gs5u8ga0i2g82w8lba.MediaSessionCompatToken) {
            return;
        }
        synchronized (r8lambdamktfdivb4gs5u8ga0i2g82w8lba) {
            zWrite = r8lambdamktfdivb4gs5u8ga0i2g82w8lba.serializer.write();
            if (!zWrite) {
                r8lambdamktfdivb4gs5u8ga0i2g82w8lba.IconCompatParcelizer.IconCompatParcelizer("Failed to start executor", new Object[0]);
            }
        }
        if (zWrite) {
            r8lambdamktfdivb4gs5u8ga0i2g82w8lba.MediaSessionCompatToken = true;
            Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = r8lambdamktfdivb4gs5u8ga0i2g82w8lba.read.IconCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, (Long) null);
            if (optionalIconCompatParcelizer.IconCompatParcelizer() && (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = optionalIconCompatParcelizer.write().RemoteActionCompatParcelizer(r8lambdamktfdivb4gs5u8ga0i2g82w8lba.MediaMetadataCompat)) != null) {
                r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwa = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer;
                if (r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 != null) {
                    r8lambdamktfdivb4gs5u8ga0i2g82w8lba.MediaDescriptionCompat.getClass();
                    if (System.currentTimeMillis() - r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.RemoteActionCompatParcelizer.longValue() <= 60000) {
                        r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                        r8lambda59SWxCYBPdsiW8mt9H_rosbR8qQ r8lambda59swxcybpdsiw8mt9h_rosbr8qq = r8lambdamktfdivb4gs5u8ga0i2g82w8lba.RemoteActionCompatParcelizer;
                        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer;
                        r8lambda59swxcybpdsiw8mt9h_rosbr8qq.getClass();
                        Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
                        synchronized (r8lambdamktfdivb4gs5u8ga0i2g82w8lba) {
                            r8lambdamktfdivb4gs5u8ga0i2g82w8lba.serializer.serializer(locationWrite);
                        }
                    }
                }
            }
            r8lambdamktfdivb4gs5u8ga0i2g82w8lba.write.RemoteActionCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, r8lambdamktfdivb4gs5u8ga0i2g82w8lba.MediaBrowserCompatMediaItem);
            r8lambdamktfdivb4gs5u8ga0i2g82w8lba.write.RemoteActionCompatParcelizer(logLocationRecordedEvent.class, r8lambdamktfdivb4gs5u8ga0i2g82w8lba.MediaSessionCompatQueueItem);
            r8lambdamktfdivb4gs5u8ga0i2g82w8lba.write.IconCompatParcelizer(ControlMessage.ONDEVICE_TRANSPORT_CLASSIFIER_STARTED, (Object) null);
        }
    }
}
