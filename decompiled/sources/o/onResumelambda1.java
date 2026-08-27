package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.thrift.O$b;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.sensorstream.SensorType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "SensorDataReSampler")
public class onResumelambda1 implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final onPauselambda0 IconCompatParcelizer;
    private final getVerticalAccuracy RemoteActionCompatParcelizer;
    private final getAnalyticsEnabledEnterannotations read;
    private final readandroid_sdk_base_release write;

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        this.read.RemoteActionCompatParcelizer(BrazeUser.class, new onResumelambda4(this, this.write));
    }

    public onResumelambda1(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, onResumelambda5 onresumelambda5, getVerticalAccuracy getverticalaccuracy) {
        this.read = getanalyticsenabledenterannotations;
        this.write = readandroid_sdk_base_releaseVar;
        this.RemoteActionCompatParcelizer = getverticalaccuracy;
        onresumelambda5.getClass();
        this.IconCompatParcelizer = new onPauselambda0(100);
    }

    public static void serializer(onResumelambda1 onresumelambda1, getLongitudeannotations getlongitudeannotations) {
        BrazeUser brazeUser = (BrazeUser) getlongitudeannotations.read();
        SensorType sensorTypeFromEvenTypeConstant = SensorType.fromEvenTypeConstant(((BrazeUser) getlongitudeannotations.read()).write.byteValue());
        onPauselambda0 onpauselambda0 = onresumelambda1.IconCompatParcelizer;
        onpauselambda0.getClass();
        if (Arrays.asList(SensorType.ACCELEROMETER, SensorType.GYROSCOPE).contains(sensorTypeFromEvenTypeConstant)) {
            Byte b = brazeUser.write;
            Long l = brazeUser.RemoteActionCompatParcelizer;
            onResumelambda2 onresumelambda2 = new onResumelambda2(b.byteValue());
            r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk r8lambdak_msz2dnanoyi5bwwe2hzkactfk = new r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk();
            Iterator it = brazeUser.serializer.iterator();
            while (it.hasNext()) {
                r8lambdak_msz2dnanoyi5bwwe2hzkactfk.serializer(l.longValue() + ((long) ((Integer) it.next()).intValue()));
            }
            onresumelambda2.RemoteActionCompatParcelizer(r8lambdak_msz2dnanoyi5bwwe2hzkactfk, brazeUser.IconCompatParcelizer);
            onpauselambda0.read(onresumelambda2);
            if (onresumelambda2.MediaSessionCompatQueueItem()) {
                return;
            }
            getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = onresumelambda1.read;
            long jWrite = getlongitudeannotations.write();
            r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk r8lambdak_msz2dnanoyi5bwwe2hzkactfkRemoteActionCompatParcelizer = onresumelambda2.RemoteActionCompatParcelizer();
            long j = r8lambdak_msz2dnanoyi5bwwe2hzkactfkRemoteActionCompatParcelizer.read(0);
            long jLongValue = l.longValue();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < r8lambdak_msz2dnanoyi5bwwe2hzkactfkRemoteActionCompatParcelizer.size(); i++) {
                arrayList.add(Integer.valueOf((int) (r8lambdak_msz2dnanoyi5bwwe2hzkactfkRemoteActionCompatParcelizer.read(i) - j)));
            }
            getVerticalAccuracy getverticalaccuracy = onresumelambda1.RemoteActionCompatParcelizer;
            Byte b2 = brazeUser.write;
            b2.getClass();
            List listAsList = Arrays.asList(onresumelambda2.read(), onresumelambda2.IconCompatParcelizer(), onresumelambda2.MediaMetadataCompat());
            Map map = brazeUser.MediaBrowserCompatMediaItem;
            getverticalaccuracy.getClass();
            O$b o$b = new O$b();
            o$b.RemoteActionCompatParcelizer = b2;
            o$b.write = Long.valueOf(j);
            o$b.IconCompatParcelizer = map;
            o$b.serializer = arrayList;
            if (listAsList == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'i32_measurements' cannot be null");
                return;
            }
            o$b.read = listAsList;
            logLocationRecordedEvent loglocationrecordedeventRemoteActionCompatParcelizer = o$b.RemoteActionCompatParcelizer();
            r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read((j - jLongValue) + jWrite);
            r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
            r8lambdaromdixahini0blcevvl7ehebhj0.fullyDrawnReporter_delegatelambda00 = loglocationrecordedeventRemoteActionCompatParcelizer;
            r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
            getanalyticsenabledenterannotations.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
        }
    }
}
