package o;

import android.location.Location;
import android.util.Pair;
import com.sentiance.core.model.thrift.DetectionTrigger;
import com.sentiance.sdk.payload.creation.DetectionIdManager;
import com.sentiance.sdk.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class setPublicVersionIfPresentAndSupported extends setNotificationDurationAlarmlambda0<setShouldPersistWebView> {
    final /* synthetic */ setDeleteIntentlambda0 IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setPublicVersionIfPresentAndSupported(setDeleteIntentlambda0 setdeleteintentlambda0) {
        super(setdeleteintentlambda0);
        this.IconCompatParcelizer = setdeleteintentlambda0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x019c A[PHI: r2
  0x019c: PHI (r2v6 long) = (r2v5 long), (r2v5 long), (r2v5 long), (r2v5 long), (r2v8 long) binds: [B:18:0x0106, B:20:0x0124, B:27:0x017e, B:29:0x0190, B:30:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x01e6  */
    @Override // o.setNotificationDurationAlarmlambda0
    public final List<logBaiduNotificationClicklambda1> IconCompatParcelizer(getLongitudeannotations<setShouldPersistWebView> getlongitudeannotations) {
        boolean z;
        long j;
        Location location;
        DetectionIdManager.Detection detection;
        boolean zBooleanValue;
        setDeleteIntentlambda0 setdeleteintentlambda0 = this.IconCompatParcelizer;
        setdeleteintentlambda0.ComponentActivity.IconCompatParcelizer("MovingStateEvent arrived", new Object[0]);
        ArrayList arrayList = new ArrayList();
        long jWrite = getlongitudeannotations.write();
        Optional optional = setdeleteintentlambda0.read(getlongitudeannotations.MediaMetadataCompat());
        Location locationWrite = null;
        if (optional.IconCompatParcelizer()) {
            Class clsIconCompatParcelizer = getBitmapFromCache.IconCompatParcelizer((getCooldownEnterSeconds.read) optional.write(), setdeleteintentlambda0.ResultReceiver);
            if (setDeleteIntentlambda0.IconCompatParcelizer(clsIconCompatParcelizer)) {
                setdeleteintentlambda0.ComponentActivity.IconCompatParcelizer("Previous state was stationary.", new Object[0]);
                Pair pairIconCompatParcelizer = setDeleteIntentlambda0.IconCompatParcelizer(setdeleteintentlambda0, jWrite, (getCooldownEnterSeconds.read) optional.write(), (byte) 1);
                zBooleanValue = ((Boolean) pairIconCompatParcelizer.first).booleanValue();
                arrayList.addAll((Collection) pairIconCompatParcelizer.second);
                locationWrite = zBooleanValue ? null : setdeleteintentlambda0.write(((getCooldownEnterSeconds.read) optional.write()).RemoteActionCompatParcelizer(setdeleteintentlambda0.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus), (Long) null);
                setdeleteintentlambda0.IconCompatParcelizer(jWrite);
            } else if (clsIconCompatParcelizer == BrazeActivityLifecycleCallbackListeneronActivityCreated2.class) {
                setdeleteintentlambda0.ComponentActivity.IconCompatParcelizer("Previous state was unconfirmed stationary.", new Object[0]);
                Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = setdeleteintentlambda0.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer(invokeFallbackFirebaseServicelambda2.IconCompatParcelizer, Long.valueOf(((getCooldownEnterSeconds.read) optional.write()).serializer()), false);
                if (optionalRemoteActionCompatParcelizer.IconCompatParcelizer()) {
                    if (getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer.write(), setdeleteintentlambda0.ResultReceiver) == BrazeBootReceiver.class) {
                        setdeleteintentlambda0.ComponentActivity.IconCompatParcelizer("Unconfirmed stationary state is preceded by an unknown state.", new Object[0]);
                        jWrite = optionalRemoteActionCompatParcelizer.write().serializer();
                        setdeleteintentlambda0.ComponentActivity.IconCompatParcelizer("Backdating trip start to " + com.sentiance.sdk.util.x.c(jWrite), new Object[0]);
                        setdeleteintentlambda0.IconCompatParcelizer(jWrite);
                        z = false;
                        j = jWrite;
                        location = null;
                        setdeleteintentlambda0.ComponentActivity.IconCompatParcelizer("Creating trip start payload.", new Object[0]);
                        DetectionTrigger detectionTrigger = DetectionTrigger.SDK;
                        DetectionIdManager detectionIdManager = setdeleteintentlambda0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                        detection = DetectionIdManager.Detection.TRIP;
                        arrayList.addAll(setdeleteintentlambda0.read(j, detectionTrigger, detectionIdManager.IconCompatParcelizer(detection), null, null, z));
                        if (location != null) {
                            location.setProvider("stationary");
                            location.setTime(j);
                            arrayList.add(setdeleteintentlambda0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer(location, setdeleteintentlambda0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer(detection)));
                        }
                    }
                }
            } else {
                jWrite = ((getCooldownEnterSeconds.read) optional.write()).serializer();
                if (getBitmapFromCache.IconCompatParcelizer((getCooldownEnterSeconds.read) optional.write(), setdeleteintentlambda0.ResultReceiver) == r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class) {
                    Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer2 = setdeleteintentlambda0.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer(invokeFallbackFirebaseServicelambda2.IconCompatParcelizer, Long.valueOf(((getCooldownEnterSeconds.read) optional.write()).serializer()), false);
                    if (optionalRemoteActionCompatParcelizer2.IconCompatParcelizer()) {
                        getVerticalAccuracy getverticalaccuracy = setdeleteintentlambda0.ResultReceiver;
                        int iMediaSessionCompatQueueItem = optionalRemoteActionCompatParcelizer2.write().MediaSessionCompatQueueItem();
                        getverticalaccuracy.getClass();
                        if (setDeleteIntentlambda0.IconCompatParcelizer(getVerticalAccuracy.write(iMediaSessionCompatQueueItem))) {
                            setdeleteintentlambda0.ComponentActivity.IconCompatParcelizer("Previous state was unconfirmed moving, preceded by stationary.", new Object[0]);
                            Pair pairIconCompatParcelizer2 = setDeleteIntentlambda0.IconCompatParcelizer(setdeleteintentlambda0, jWrite, optionalRemoteActionCompatParcelizer2.write(), (byte) 1);
                            zBooleanValue = ((Boolean) pairIconCompatParcelizer2.first).booleanValue();
                            arrayList.addAll((Collection) pairIconCompatParcelizer2.second);
                            if (!zBooleanValue) {
                                locationWrite = setdeleteintentlambda0.write(optionalRemoteActionCompatParcelizer2.write().RemoteActionCompatParcelizer(setdeleteintentlambda0.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus), (Long) null);
                            }
                        } else {
                            if (optionalRemoteActionCompatParcelizer2.IconCompatParcelizer()) {
                                if (getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer2.write(), setdeleteintentlambda0.ResultReceiver) == BrazeBootReceiver.class) {
                                    jWrite = optionalRemoteActionCompatParcelizer2.write().serializer();
                                }
                            }
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = false;
                    }
                } else {
                    zBooleanValue = false;
                }
                setdeleteintentlambda0.ComponentActivity.IconCompatParcelizer("Backdating trip to " + com.sentiance.sdk.util.x.c(jWrite), new Object[0]);
                setdeleteintentlambda0.IconCompatParcelizer(jWrite);
            }
            j = jWrite;
            location = locationWrite;
            z = zBooleanValue;
            setdeleteintentlambda0.ComponentActivity.IconCompatParcelizer("Creating trip start payload.", new Object[0]);
            DetectionTrigger detectionTrigger2 = DetectionTrigger.SDK;
            DetectionIdManager detectionIdManager2 = setdeleteintentlambda0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            detection = DetectionIdManager.Detection.TRIP;
            arrayList.addAll(setdeleteintentlambda0.read(j, detectionTrigger2, detectionIdManager2.IconCompatParcelizer(detection), null, null, z));
            if (location != null) {
                location.setProvider("stationary");
                location.setTime(j);
                arrayList.add(setdeleteintentlambda0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer(location, setdeleteintentlambda0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer(detection)));
            }
        } else {
            z = false;
            j = jWrite;
            location = null;
            setdeleteintentlambda0.ComponentActivity.IconCompatParcelizer("Creating trip start payload.", new Object[0]);
            DetectionTrigger detectionTrigger3 = DetectionTrigger.SDK;
            DetectionIdManager detectionIdManager3 = setdeleteintentlambda0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            detection = DetectionIdManager.Detection.TRIP;
            arrayList.addAll(setdeleteintentlambda0.read(j, detectionTrigger3, detectionIdManager3.IconCompatParcelizer(detection), null, null, z));
            if (location != null) {
                location.setProvider("stationary");
                location.setTime(j);
                arrayList.add(setdeleteintentlambda0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer(location, setdeleteintentlambda0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer(detection)));
            }
        }
        return arrayList;
    }
}
