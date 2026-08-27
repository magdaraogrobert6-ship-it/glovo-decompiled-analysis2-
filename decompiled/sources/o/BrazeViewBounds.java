package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.protobuf.GeneratedMessageLite;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeViewBounds {
    public static final BrazeViewBounds read = new BrazeViewBounds();
    public final ConcurrentHashMap serializer = new ConcurrentHashMap();
    public final accessisOfflinep IconCompatParcelizer = new accessisOfflinep();

    public final fromStringlambda1 read(Class cls) {
        fromStringlambda1 v0Var;
        Class cls2;
        isFromOfflineStorage.read(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.serializer;
        fromStringlambda1 fromstringlambda1 = (fromStringlambda1) concurrentHashMap.get(cls);
        if (fromstringlambda1 != null) {
            return fromstringlambda1;
        }
        accessisOfflinep accessisofflinep = this.IconCompatParcelizer;
        accessisofflinep.getClass();
        Class cls3 = GeofenceTransitionType.write;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = GeofenceTransitionType.write) != null && !cls2.isAssignableFrom(cls)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            return null;
        }
        DataStoreValueType dataStoreValueTypeWrite = ((r8lambdaIcNz1bHvg4Utyu5TBPbPtI15cq4) accessisofflinep.RemoteActionCompatParcelizer).write(cls);
        if ((dataStoreValueTypeWrite.read & 2) == 2) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                v0Var = new com.sentiance.protobuf.v0(GeofenceTransitionType.IconCompatParcelizer, DeviceKey.write, dataStoreValueTypeWrite.IconCompatParcelizer);
            } else {
                com.sentiance.protobuf.c1 c1Var = GeofenceTransitionType.serializer;
                r8lambdaHxndgEp3NZAe65egvieVRgKrMSA r8lambdahxndgep3nzae65egvievrgkrmsa = DeviceKey.serializer;
                if (r8lambdahxndgep3nzae65egvievrgkrmsa == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                v0Var = new com.sentiance.protobuf.v0(c1Var, r8lambdahxndgep3nzae65egvievrgkrmsa, dataStoreValueTypeWrite.IconCompatParcelizer);
            }
        } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            v0Var = r8lambdaEiF3hcbXltwYjyOM3chLrVBH_mU.IconCompatParcelizer[dataStoreValueTypeWrite.RemoteActionCompatParcelizer().ordinal()] != 1 ? com.sentiance.protobuf.u0.read(dataStoreValueTypeWrite, getStringSetValue.write, SdkDataWipeEvent.RemoteActionCompatParcelizer, GeofenceTransitionType.IconCompatParcelizer, DeviceKey.write, r8lambdam_1WhsWrPszKGVIKx1cZrbf7qFY.serializer) : com.sentiance.protobuf.u0.read(dataStoreValueTypeWrite, getStringSetValue.write, SdkDataWipeEvent.RemoteActionCompatParcelizer, GeofenceTransitionType.IconCompatParcelizer, null, r8lambdam_1WhsWrPszKGVIKx1cZrbf7qFY.serializer);
        } else if (r8lambdaEiF3hcbXltwYjyOM3chLrVBH_mU.IconCompatParcelizer[dataStoreValueTypeWrite.RemoteActionCompatParcelizer().ordinal()] != 1) {
            getDrawableValue getdrawablevalue = getStringSetValue.RemoteActionCompatParcelizer;
            SessionStateChangedEvent sessionStateChangedEvent = SdkDataWipeEvent.IconCompatParcelizer;
            com.sentiance.protobuf.c1 c1Var2 = GeofenceTransitionType.serializer;
            r8lambdaHxndgEp3NZAe65egvieVRgKrMSA r8lambdahxndgep3nzae65egvievrgkrmsa2 = DeviceKey.serializer;
            if (r8lambdahxndgep3nzae65egvievrgkrmsa2 == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Protobuf runtime is not correctly loaded.");
                return null;
            }
            v0Var = com.sentiance.protobuf.u0.read(dataStoreValueTypeWrite, getdrawablevalue, sessionStateChangedEvent, c1Var2, r8lambdahxndgep3nzae65egvievrgkrmsa2, r8lambdam_1WhsWrPszKGVIKx1cZrbf7qFY.read);
        } else {
            v0Var = com.sentiance.protobuf.u0.read(dataStoreValueTypeWrite, getStringSetValue.RemoteActionCompatParcelizer, SdkDataWipeEvent.IconCompatParcelizer, GeofenceTransitionType.serializer, null, r8lambdam_1WhsWrPszKGVIKx1cZrbf7qFY.read);
        }
        fromStringlambda1 fromstringlambda2 = (fromStringlambda1) concurrentHashMap.putIfAbsent(cls, v0Var);
        return fromstringlambda2 != null ? fromstringlambda2 : v0Var;
    }
}
