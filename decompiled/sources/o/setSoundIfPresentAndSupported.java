package o;

import com.sentiance.core.model.thrift.DetectionTrigger;
import com.sentiance.sdk.payload.creation.DetectionIdManager;
import com.sentiance.sdk.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class setSoundIfPresentAndSupported extends setNotificationDurationAlarmlambda0<BrazeBootReceiver> {
    final /* synthetic */ setDeleteIntentlambda0 IconCompatParcelizer;

    @Override // o.setNotificationDurationAlarmlambda0
    public final List<logBaiduNotificationClicklambda1> IconCompatParcelizer(getLongitudeannotations<BrazeBootReceiver> getlongitudeannotations) {
        Class clsIconCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        long jMediaMetadataCompat = getlongitudeannotations.MediaMetadataCompat();
        long jWrite = getlongitudeannotations.write();
        setDeleteIntentlambda0 setdeleteintentlambda0 = this.IconCompatParcelizer;
        setdeleteintentlambda0.ComponentActivity.IconCompatParcelizer("UnknownStateEvent arrived", new Object[0]);
        Optional optional = setdeleteintentlambda0.read(jMediaMetadataCompat);
        if (!optional.read()) {
            Class clsIconCompatParcelizer2 = getBitmapFromCache.IconCompatParcelizer((getCooldownEnterSeconds.read) optional.write(), setdeleteintentlambda0.ResultReceiver);
            if (clsIconCompatParcelizer2 == r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class) {
                setdeleteintentlambda0.ComponentActivity.IconCompatParcelizer("Previous state was forced-moving", new Object[0]);
                setdeleteintentlambda0.RemoteActionCompatParcelizer(jWrite, true);
                setDeleteIntent setdeleteintent = setdeleteintentlambda0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                DetectionTrigger detectionTrigger = DetectionTrigger.EXTERNAL;
                arrayList.add(setdeleteintent.write(jWrite, detectionTrigger, (byte) 2, setdeleteintentlambda0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer(DetectionIdManager.Detection.TRIP)));
                arrayList.addAll(setdeleteintentlambda0.serializer(jWrite, detectionTrigger, detectionTrigger, (Byte) (byte) 2));
                return arrayList;
            }
            if (clsIconCompatParcelizer2 == setShouldPersistWebView.class) {
                setdeleteintentlambda0.ComponentActivity.IconCompatParcelizer("Previous state was of type moving. Stopping the ongoing trip.", new Object[0]);
                DetectionTrigger detectionTrigger2 = DetectionTrigger.SDK;
                setdeleteintentlambda0.ComponentActivity.IconCompatParcelizer("Creating trip stop payload", new Object[0]);
                setdeleteintentlambda0.RemoteActionCompatParcelizer(jWrite, true);
                arrayList.add(setdeleteintentlambda0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write(jWrite, detectionTrigger2, (byte) 1, setdeleteintentlambda0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer(DetectionIdManager.Detection.TRIP)));
                setdeleteintentlambda0.ComponentActivity.IconCompatParcelizer("Creating trip(s)", new Object[0]);
                arrayList.addAll(setdeleteintentlambda0.serializer(jWrite, detectionTrigger2, detectionTrigger2, (Byte) (byte) 1));
                return arrayList;
            }
            if (setDeleteIntentlambda0.IconCompatParcelizer(clsIconCompatParcelizer2)) {
                setdeleteintentlambda0.ComponentActivity.IconCompatParcelizer("Previous state was stationary.", new Object[0]);
                arrayList.addAll((Collection) setDeleteIntentlambda0.IconCompatParcelizer(setdeleteintentlambda0, jWrite, (getCooldownEnterSeconds.read) optional.write(), (byte) 1).second);
                return arrayList;
            }
            if (clsIconCompatParcelizer2 == r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class) {
                Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = setdeleteintentlambda0.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer(invokeFallbackFirebaseServicelambda2.IconCompatParcelizer, Long.valueOf(((getCooldownEnterSeconds.read) optional.write()).serializer()), false);
                if (optionalRemoteActionCompatParcelizer.IconCompatParcelizer()) {
                    clsIconCompatParcelizer = getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer.write(), setdeleteintentlambda0.ResultReceiver);
                } else {
                    clsIconCompatParcelizer = null;
                }
                if (setDeleteIntentlambda0.IconCompatParcelizer(clsIconCompatParcelizer)) {
                    setdeleteintentlambda0.ComponentActivity.IconCompatParcelizer("Previous state was unconfirmed moving, preceded by stationary.", new Object[0]);
                    arrayList.addAll((Collection) setDeleteIntentlambda0.IconCompatParcelizer(setdeleteintentlambda0, jWrite, optionalRemoteActionCompatParcelizer.write(), (byte) 1).second);
                    return arrayList;
                }
                if (clsIconCompatParcelizer == BrazeBootReceiver.class) {
                    arrayList.addAll(setDeleteIntentlambda0.read(setdeleteintentlambda0, optionalRemoteActionCompatParcelizer.write().serializer(), jWrite, jMediaMetadataCompat, (Byte) (byte) 1));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setSoundIfPresentAndSupported(setDeleteIntentlambda0 setdeleteintentlambda0) {
        super(setdeleteintentlambda0);
        this.IconCompatParcelizer = setdeleteintentlambda0;
    }
}
