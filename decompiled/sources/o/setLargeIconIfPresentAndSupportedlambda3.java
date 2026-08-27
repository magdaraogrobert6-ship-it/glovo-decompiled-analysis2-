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
final class setLargeIconIfPresentAndSupportedlambda3 extends setNotificationDurationAlarmlambda0<r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I> {
    final /* synthetic */ setDeleteIntentlambda0 read;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.setNotificationDurationAlarmlambda0
    public final List<logBaiduNotificationClicklambda1> IconCompatParcelizer(getLongitudeannotations<r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I> getlongitudeannotations) {
        setDeleteIntentlambda0 setdeleteintentlambda0;
        int i;
        r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I r8lambdaxnkp5mxo9act549dmvgqnyhj0i;
        long j;
        Location location;
        long j2;
        boolean z;
        long j3;
        boolean z2;
        Location locationWrite;
        boolean zBooleanValue;
        ArrayList arrayList = new ArrayList();
        long jMediaMetadataCompat = getlongitudeannotations.MediaMetadataCompat();
        long jWrite = getlongitudeannotations.write();
        r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I r8lambdaxnkp5mxo9act549dmvgqnyhj0i2 = getlongitudeannotations.read();
        setDeleteIntentlambda0 setdeleteintentlambda1 = this.read;
        setdeleteintentlambda1.ComponentActivity.IconCompatParcelizer("ForcedMovingStateEvent arrived", new Object[0]);
        Optional optional = setdeleteintentlambda1.read(jMediaMetadataCompat);
        Location locationWrite2 = null;
        if (optional.IconCompatParcelizer()) {
            Class clsIconCompatParcelizer = getBitmapFromCache.IconCompatParcelizer((getCooldownEnterSeconds.read) optional.write(), setdeleteintentlambda1.ResultReceiver);
            if (setDeleteIntentlambda0.IconCompatParcelizer(clsIconCompatParcelizer)) {
                setdeleteintentlambda1.ComponentActivity.IconCompatParcelizer("Previous state was stationary.", new Object[0]);
                Pair pairIconCompatParcelizer = setDeleteIntentlambda0.IconCompatParcelizer(setdeleteintentlambda1, jWrite, (getCooldownEnterSeconds.read) optional.write(), (byte) 2);
                zBooleanValue = ((Boolean) pairIconCompatParcelizer.first).booleanValue();
                arrayList.addAll((Collection) pairIconCompatParcelizer.second);
                if (!zBooleanValue) {
                    locationWrite2 = setdeleteintentlambda1.write(((getCooldownEnterSeconds.read) optional.write()).RemoteActionCompatParcelizer(setdeleteintentlambda1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus), (Long) null);
                }
            } else {
                if (clsIconCompatParcelizer == setShouldPersistWebView.class || clsIconCompatParcelizer == BrazeActivityLifecycleCallbackListeneronActivityCreated2.class) {
                    setdeleteintentlambda1.ComponentActivity.IconCompatParcelizer("Previous state was moving. Creating trip stop payload.", new Object[0]);
                    setdeleteintentlambda1.RemoteActionCompatParcelizer(jWrite, true);
                    setDeleteIntent setdeleteintent = setdeleteintentlambda1.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    DetectionTrigger detectionTrigger = DetectionTrigger.EXTERNAL;
                    j = jWrite;
                    arrayList.add(setdeleteintent.write(jWrite, detectionTrigger, (byte) 2, setdeleteintentlambda1.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer(DetectionIdManager.Detection.TRIP)));
                    r8lambdaxnkp5mxo9act549dmvgqnyhj0i = r8lambdaxnkp5mxo9act549dmvgqnyhj0i2;
                    i = 0;
                    setdeleteintentlambda0 = setdeleteintentlambda1;
                    arrayList.addAll(setdeleteintentlambda1.serializer(j, DetectionTrigger.SDK, detectionTrigger, (Byte) (byte) 2));
                } else if (clsIconCompatParcelizer == r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class) {
                    setdeleteintentlambda1.ComponentActivity.IconCompatParcelizer("Previous state was unconfirmed moving. Injecting a trip.", new Object[0]);
                    long jSerializer = ((getCooldownEnterSeconds.read) optional.write()).serializer();
                    Optional optional2 = setdeleteintentlambda1.read(((getCooldownEnterSeconds.read) optional.write()).RemoteActionCompatParcelizer());
                    if (optional2.IconCompatParcelizer()) {
                        Class clsIconCompatParcelizer2 = getBitmapFromCache.IconCompatParcelizer((getCooldownEnterSeconds.read) optional2.write(), setdeleteintentlambda1.ResultReceiver);
                        if (setDeleteIntentlambda0.IconCompatParcelizer(clsIconCompatParcelizer2)) {
                            Pair pairIconCompatParcelizer2 = setDeleteIntentlambda0.IconCompatParcelizer(setdeleteintentlambda1, jSerializer, (getCooldownEnterSeconds.read) optional2.write(), (byte) 1);
                            boolean zBooleanValue2 = ((Boolean) pairIconCompatParcelizer2.first).booleanValue();
                            arrayList.addAll((Collection) pairIconCompatParcelizer2.second);
                            locationWrite = !zBooleanValue2 ? setdeleteintentlambda1.write(((getCooldownEnterSeconds.read) optional2.write()).RemoteActionCompatParcelizer(setdeleteintentlambda1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus), (Long) null) : null;
                            z2 = zBooleanValue2;
                            j3 = jSerializer;
                        } else {
                            if (clsIconCompatParcelizer2 == BrazeBootReceiver.class) {
                                jSerializer = ((getCooldownEnterSeconds.read) optional2.write()).serializer();
                            }
                            j3 = jSerializer;
                            z2 = false;
                            locationWrite = null;
                        }
                    } else {
                        j3 = jSerializer;
                        z2 = false;
                        locationWrite = null;
                    }
                    arrayList.addAll(setdeleteintentlambda1.read(j3, jWrite, locationWrite, (Location) null, (Byte) (byte) 2));
                    zBooleanValue = z2;
                } else {
                    if (clsIconCompatParcelizer == BrazeBootReceiver.class) {
                        arrayList.addAll(setdeleteintentlambda1.read(((getCooldownEnterSeconds.read) optional.write()).serializer(), jWrite, (Location) null, (Location) null, (Byte) (byte) 2));
                    }
                    setdeleteintentlambda0 = setdeleteintentlambda1;
                    i = 0;
                    r8lambdaxnkp5mxo9act549dmvgqnyhj0i = r8lambdaxnkp5mxo9act549dmvgqnyhj0i2;
                    j = jWrite;
                }
                location = null;
                j2 = j;
                z = i;
            }
            setdeleteintentlambda0 = setdeleteintentlambda1;
            i = 0;
            r8lambdaxnkp5mxo9act549dmvgqnyhj0i = r8lambdaxnkp5mxo9act549dmvgqnyhj0i2;
            location = locationWrite2;
            z = zBooleanValue;
            j2 = jWrite;
        } else {
            setdeleteintentlambda0 = setdeleteintentlambda1;
            i = 0;
            r8lambdaxnkp5mxo9act549dmvgqnyhj0i = r8lambdaxnkp5mxo9act549dmvgqnyhj0i2;
            j = jWrite;
            location = null;
            j2 = j;
            z = i;
        }
        setdeleteintentlambda0.IconCompatParcelizer(j2);
        setdeleteintentlambda0.ComponentActivity.IconCompatParcelizer("Creating trip start payload.", new Object[i]);
        DetectionTrigger detectionTrigger2 = DetectionTrigger.EXTERNAL;
        DetectionIdManager detectionIdManager = setdeleteintentlambda0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        DetectionIdManager.Detection detection = DetectionIdManager.Detection.TRIP;
        arrayList.addAll(setdeleteintentlambda0.read(j2, detectionTrigger2, detectionIdManager.IconCompatParcelizer(detection), r8lambdaxnkp5mxo9act549dmvgqnyhj0i.IconCompatParcelizer, r8lambdaxnkp5mxo9act549dmvgqnyhj0i.read, z));
        if (location != null) {
            location.setProvider("stationary");
            location.setTime(j2);
            arrayList.add(setdeleteintentlambda0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer(location, setdeleteintentlambda0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer(detection)));
        }
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setLargeIconIfPresentAndSupportedlambda3(setDeleteIntentlambda0 setdeleteintentlambda0) {
        super(setdeleteintentlambda0);
        this.read = setdeleteintentlambda0;
    }
}
