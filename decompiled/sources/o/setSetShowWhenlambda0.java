package o;

import android.location.Location;
import com.sentiance.core.model.thrift.DetectionTrigger;
import com.sentiance.sdk.payload.creation.DetectionIdManager;
import com.sentiance.sdk.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class setSetShowWhenlambda0 extends setNotificationDurationAlarmlambda0<r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4> {
    final /* synthetic */ setDeleteIntentlambda0 RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setSetShowWhenlambda0(setDeleteIntentlambda0 setdeleteintentlambda0) {
        super(setdeleteintentlambda0);
        this.RemoteActionCompatParcelizer = setdeleteintentlambda0;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0138  */
    /* JADX WARN: Code duplicated, block: B:54:0x0291  */
    @Override // o.setNotificationDurationAlarmlambda0
    public final List<logBaiduNotificationClicklambda1> IconCompatParcelizer(getLongitudeannotations<r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4> getlongitudeannotations) {
        setDeleteIntentlambda0 setdeleteintentlambda0;
        Iterator<getCooldownEnterSeconds.read> it;
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        invokeSuspendlambda0 invokesuspendlambda0;
        DetectionTrigger detectionTrigger;
        DetectionTrigger detectionTrigger2;
        int i;
        DetectionTrigger detectionTrigger3;
        ArrayList arrayList = new ArrayList();
        long jMediaMetadataCompat = getlongitudeannotations.MediaMetadataCompat();
        long jWrite = getlongitudeannotations.write();
        setDeleteIntentlambda0 setdeleteintentlambda1 = this.RemoteActionCompatParcelizer;
        setdeleteintentlambda1.ComponentActivity.IconCompatParcelizer("StoppedStateEvent arrived.", new Object[0]);
        Optional optional = setdeleteintentlambda1.read(jMediaMetadataCompat);
        if (optional.IconCompatParcelizer()) {
            Class clsIconCompatParcelizer = getBitmapFromCache.IconCompatParcelizer((getCooldownEnterSeconds.read) optional.write(), setdeleteintentlambda1.ResultReceiver);
            Optional<getCooldownEnterSeconds.read> optional2 = setdeleteintentlambda1.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.read(((getCooldownEnterSeconds.read) optional.write()).serializer(), jWrite);
            lValueOf = null;
            Long lValueOf = null;
            byte b = 3;
            if (Arrays.asList(setShouldPersistWebView.class, r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class, BrazeActivityLifecycleCallbackListeneronActivityCreated2.class).contains(clsIconCompatParcelizer)) {
                if (clsIconCompatParcelizer == BrazeActivityLifecycleCallbackListeneronActivityCreated2.class) {
                    Optional optional3 = setdeleteintentlambda1.read(((getCooldownEnterSeconds.read) optional.write()).RemoteActionCompatParcelizer());
                    if ((optional3.IconCompatParcelizer() ? getBitmapFromCache.IconCompatParcelizer((getCooldownEnterSeconds.read) optional3.write(), setdeleteintentlambda1.ResultReceiver) : null) == BrazeBootReceiver.class) {
                        setdeleteintentlambda1.ComponentActivity.IconCompatParcelizer("Previous state was of type unconfirmed stationary, preceded by an unknown state.", new Object[0]);
                        lValueOf = Long.valueOf(((getCooldownEnterSeconds.read) optional3.write()).serializer());
                    } else {
                        setdeleteintentlambda1.ComponentActivity.IconCompatParcelizer("Previous state was of type unconfirmed stationary, preceded by a moving state type.", new Object[0]);
                    }
                } else {
                    setdeleteintentlambda1.ComponentActivity.IconCompatParcelizer("Previous state was of type moving. Stopping the ongoing trip.", new Object[0]);
                }
                DetectionTrigger detectionTrigger4 = DetectionTrigger.EXTERNAL;
                boolean z = setdeleteintentlambda1.read.IconCompatParcelizer().read();
                if (optional2.IconCompatParcelizer()) {
                    setdeleteintentlambda1.ComponentActivity.IconCompatParcelizer("There was an OTG event at time %s. Setting close reason to OTG.", com.sentiance.sdk.util.x.c(optional2.write().serializer()));
                    detectionTrigger2 = DetectionTrigger.SDK;
                    jWrite = optional2.write().serializer();
                } else {
                    if (!z) {
                        b = 2;
                        detectionTrigger = detectionTrigger4;
                    } else if (jWrite - ((getCooldownEnterSeconds.read) optional.write()).serializer() > TimeUnit.MINUTES.toMillis(setdeleteintentlambda1.RemoteActionCompatParcelizer.ComponentActivity())) {
                        setdeleteintentlambda1.ComponentActivity.IconCompatParcelizer("Trip is more than %d mins long, and triggered trips is enabled. Treating this as a timeout.", Integer.valueOf(setdeleteintentlambda1.RemoteActionCompatParcelizer.ComponentActivity()));
                        detectionTrigger = DetectionTrigger.SDK;
                        b = 1;
                    } else {
                        b = 2;
                        detectionTrigger = detectionTrigger4;
                    }
                    detectionTrigger2 = detectionTrigger;
                }
                if (lValueOf == null) {
                    setdeleteintentlambda1.ComponentActivity.IconCompatParcelizer("Creating trip stop payload", new Object[0]);
                    arrayList.addAll(setdeleteintentlambda1.RemoteActionCompatParcelizer(jWrite, true));
                    arrayList.add(setdeleteintentlambda1.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write(jWrite, detectionTrigger2, b, setdeleteintentlambda1.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer(DetectionIdManager.Detection.TRIP)));
                    if (clsIconCompatParcelizer == setShouldPersistWebView.class) {
                        i = 0;
                        setdeleteintentlambda1.ComponentActivity.IconCompatParcelizer("Setting detection trigger to SDK", new Object[0]);
                        detectionTrigger3 = DetectionTrigger.SDK;
                    } else {
                        i = 0;
                        detectionTrigger3 = detectionTrigger4;
                    }
                    setdeleteintentlambda1.ComponentActivity.IconCompatParcelizer("Creating trip(s)", new Object[i]);
                    arrayList.addAll(setdeleteintentlambda1.serializer(jWrite, detectionTrigger3, detectionTrigger2, Byte.valueOf(b)));
                } else {
                    arrayList.addAll(setdeleteintentlambda1.read(lValueOf.longValue(), jWrite, (Location) null, (Location) null, Byte.valueOf(b)));
                }
            } else if (setDeleteIntentlambda0.IconCompatParcelizer(clsIconCompatParcelizer)) {
                setdeleteintentlambda1.ComponentActivity.IconCompatParcelizer("Previous state was stationary.", new Object[0]);
                arrayList.addAll((Collection) setDeleteIntentlambda0.IconCompatParcelizer(setdeleteintentlambda1, jWrite, (getCooldownEnterSeconds.read) optional.write(), (byte) 3).second);
            } else {
                if (clsIconCompatParcelizer == r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class) {
                    Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = setdeleteintentlambda1.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer(invokeFallbackFirebaseServicelambda2.IconCompatParcelizer, Long.valueOf(((getCooldownEnterSeconds.read) optional.write()).serializer()), false);
                    Class clsIconCompatParcelizer2 = optionalRemoteActionCompatParcelizer.IconCompatParcelizer() ? getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer.write(), setdeleteintentlambda1.ResultReceiver) : null;
                    if (setDeleteIntentlambda0.IconCompatParcelizer(clsIconCompatParcelizer2)) {
                        setdeleteintentlambda1.ComponentActivity.IconCompatParcelizer("Previous state was unconfirmed moving,", new Object[0]);
                        arrayList.addAll((Collection) setDeleteIntentlambda0.IconCompatParcelizer(setdeleteintentlambda1, jWrite, optionalRemoteActionCompatParcelizer.write(), (byte) 3).second);
                    } else if (clsIconCompatParcelizer2 == BrazeBootReceiver.class) {
                        setdeleteintentlambda0 = setdeleteintentlambda1;
                        arrayList.addAll(setDeleteIntentlambda0.read(setdeleteintentlambda1, optionalRemoteActionCompatParcelizer.write().serializer(), jWrite, jMediaMetadataCompat, (Byte) null));
                    }
                } else {
                    setdeleteintentlambda0 = setdeleteintentlambda1;
                    if (clsIconCompatParcelizer == BrazeBootReceiver.class) {
                        arrayList.addAll(setDeleteIntentlambda0.read(setdeleteintentlambda0, ((getCooldownEnterSeconds.read) optional.write()).serializer(), jWrite, jMediaMetadataCompat, (Byte) null));
                    }
                }
                long jRemoteActionCompatParcelizer = ((getCooldownEnterSeconds.read) optional.write()).RemoteActionCompatParcelizer();
                ArrayList arrayList2 = new ArrayList();
                it = setdeleteintentlambda0.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer(invokeSuspendlambda0.class, Long.valueOf(jRemoteActionCompatParcelizer), Long.valueOf(jMediaMetadataCompat + 1), true, false).iterator();
                while (it.hasNext()) {
                    r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = it.next().RemoteActionCompatParcelizer(setdeleteintentlambda0.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                    if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer == null && (invokesuspendlambda0 = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.getFullyDrawnReporter) != null) {
                        arrayList2.addAll(setDeleteIntentlambda0.write(setdeleteintentlambda0, invokesuspendlambda0, r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.RemoteActionCompatParcelizer.longValue()));
                    }
                }
                arrayList.addAll(arrayList2);
            }
            setdeleteintentlambda0 = setdeleteintentlambda1;
            long jRemoteActionCompatParcelizer2 = ((getCooldownEnterSeconds.read) optional.write()).RemoteActionCompatParcelizer();
            ArrayList arrayList3 = new ArrayList();
            it = setdeleteintentlambda0.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer(invokeSuspendlambda0.class, Long.valueOf(jRemoteActionCompatParcelizer2), Long.valueOf(jMediaMetadataCompat + 1), true, false).iterator();
            while (it.hasNext()) {
                r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = it.next().RemoteActionCompatParcelizer(setdeleteintentlambda0.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer == null) {
                }
            }
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }
}
