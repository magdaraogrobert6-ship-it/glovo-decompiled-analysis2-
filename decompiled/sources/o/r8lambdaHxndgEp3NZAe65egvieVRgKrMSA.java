package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.protobuf.ByteString;
import com.sentiance.protobuf.GeneratedMessageLite;
import com.sentiance.protobuf.WireFormat$FieldType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaHxndgEp3NZAe65egvieVRgKrMSA {
    public static Object serializer(Object obj, com.sentiance.protobuf.v vVar, getServerKeyFromCardType getserverkeyfromcardtype, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior, ImageStyle imageStyle, Object obj2, com.sentiance.protobuf.c1 c1Var) throws com.sentiance.protobuf.InvalidProtocolBufferException {
        Object objValueOf;
        Object obj3;
        ArrayList arrayList;
        com.sentiance.protobuf.u uVar = vVar.read;
        accessgetCardTypeMapcp accessgetcardtypemapcp = getserverkeyfromcardtype.IconCompatParcelizer;
        accessgetDiskCacheLockp accessgetdiskcachelockp = getserverkeyfromcardtype.serializer;
        int i = accessgetcardtypemapcp.RemoteActionCompatParcelizer;
        WireFormat$FieldType wireFormat$FieldType = accessgetcardtypemapcp.read;
        if (accessgetcardtypemapcp.IconCompatParcelizer && accessgetcardtypemapcp.serializer) {
            switch (keyMap_delegatelambda0.write[wireFormat$FieldType.ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    vVar.RatingCompat(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    vVar.serializer(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    vVar.MediaBrowserCompatMediaItem(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    vVar.IconCompatParcelizer(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    vVar.ParcelableVolumeInfo(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    vVar.MediaSessionCompatResultReceiverWrapper(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    vVar.write(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    vVar.PlaybackStateCompatCustomAction(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    vVar.MediaMetadataCompat(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    vVar.read(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    vVar.MediaSessionCompatToken(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    vVar.RemoteActionCompatParcelizer(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    vVar.MediaSessionCompatQueueItem(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    vVar.PlaybackStateCompat(arrayList);
                    obj2 = GeofenceTransitionType.write(obj, i, arrayList, accessgetcardtypemapcp.write, obj2, c1Var);
                    break;
                default:
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(accessgetcardtypemapcp.read, "Type cannot be packed: ");
                    return null;
            }
            imageStyle.RemoteActionCompatParcelizer(accessgetcardtypemapcp, arrayList);
            return obj2;
        }
        if (wireFormat$FieldType != WireFormat$FieldType.ENUM) {
            switch (keyMap_delegatelambda0.write[wireFormat$FieldType.ordinal()]) {
                case 1:
                    vVar.write(1);
                    objValueOf = Double.valueOf(uVar.PlaybackStateCompat());
                    break;
                case 2:
                    vVar.write(5);
                    objValueOf = Float.valueOf(uVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus());
                    break;
                case 3:
                    vVar.write(0);
                    objValueOf = Long.valueOf(uVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
                    break;
                case 4:
                    vVar.write(0);
                    objValueOf = Long.valueOf(uVar.MediaDescriptionCompat());
                    break;
                case 5:
                    vVar.write(0);
                    objValueOf = Integer.valueOf(uVar.ComponentActivity());
                    break;
                case 6:
                    vVar.write(1);
                    objValueOf = Long.valueOf(uVar.ResultReceiver());
                    break;
                case 7:
                    vVar.write(5);
                    objValueOf = Integer.valueOf(uVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                    break;
                case 8:
                    vVar.write(0);
                    objValueOf = Boolean.valueOf(uVar.MediaSessionCompatResultReceiverWrapper());
                    break;
                case 9:
                    vVar.write(0);
                    objValueOf = Integer.valueOf(uVar.serializer());
                    break;
                case 10:
                    vVar.write(5);
                    objValueOf = Integer.valueOf(uVar.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8());
                    break;
                case 11:
                    vVar.write(1);
                    objValueOf = Long.valueOf(uVar.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4());
                    break;
                case 12:
                    vVar.write(0);
                    objValueOf = Integer.valueOf(uVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM());
                    break;
                case 13:
                    vVar.write(0);
                    objValueOf = Long.valueOf(uVar.IconCompatParcelizer());
                    break;
                case 14:
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Shouldn't reach here.");
                    return null;
                case 15:
                    objValueOf = vVar.serializer();
                    break;
                case 16:
                    vVar.write(2);
                    objValueOf = uVar.RemoteActionCompatParcelizer();
                    break;
                case 17:
                    if (!accessgetcardtypemapcp.IconCompatParcelizer) {
                        Object obj4 = imageStyle.serializer.get(accessgetcardtypemapcp);
                        if (obj4 instanceof GeneratedMessageLite) {
                            BrazeViewBounds brazeViewBounds = BrazeViewBounds.read;
                            brazeViewBounds.getClass();
                            fromStringlambda1 fromstringlambda1 = brazeViewBounds.read(obj4.getClass());
                            if (!((GeneratedMessageLite) obj4).isMutable()) {
                                Object objSerializer = fromstringlambda1.serializer();
                                fromstringlambda1.write(objSerializer, obj4);
                                imageStyle.RemoteActionCompatParcelizer(accessgetcardtypemapcp, objSerializer);
                                obj4 = objSerializer;
                            }
                            vVar.write(3);
                            vVar.serializer(obj4, fromstringlambda1, delayedInitializationAnalyticsBehavior);
                            return obj2;
                        }
                    }
                    Class<?> cls = accessgetdiskcachelockp.getClass();
                    vVar.write(3);
                    fromStringlambda1 fromstringlambda2 = BrazeViewBounds.read.read(cls);
                    Object objSerializer2 = fromstringlambda2.serializer();
                    vVar.serializer(objSerializer2, fromstringlambda2, delayedInitializationAnalyticsBehavior);
                    fromstringlambda2.IconCompatParcelizer(objSerializer2);
                    objValueOf = objSerializer2;
                    break;
                case 18:
                    if (!accessgetcardtypemapcp.IconCompatParcelizer) {
                        Object obj5 = imageStyle.serializer.get(accessgetcardtypemapcp);
                        if (obj5 instanceof GeneratedMessageLite) {
                            BrazeViewBounds brazeViewBounds2 = BrazeViewBounds.read;
                            brazeViewBounds2.getClass();
                            fromStringlambda1 fromstringlambda3 = brazeViewBounds2.read(obj5.getClass());
                            if (!((GeneratedMessageLite) obj5).isMutable()) {
                                Object objSerializer3 = fromstringlambda3.serializer();
                                fromstringlambda3.write(objSerializer3, obj5);
                                imageStyle.RemoteActionCompatParcelizer(accessgetcardtypemapcp, objSerializer3);
                                obj5 = objSerializer3;
                            }
                            vVar.write(2);
                            vVar.read(obj5, fromstringlambda3, delayedInitializationAnalyticsBehavior);
                            return obj2;
                        }
                    }
                    objValueOf = vVar.write(accessgetdiskcachelockp.getClass(), delayedInitializationAnalyticsBehavior);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            vVar.write(0);
            int iComponentActivity = uVar.ComponentActivity();
            if (accessgetcardtypemapcp.write.read(iComponentActivity) == null) {
                return GeofenceTransitionType.read(obj, i, iComponentActivity, obj2, c1Var);
            }
            objValueOf = Integer.valueOf(iComponentActivity);
        }
        if (accessgetcardtypemapcp.IconCompatParcelizer) {
            imageStyle.read(accessgetcardtypemapcp, objValueOf);
            return obj2;
        }
        int i2 = keyMap_delegatelambda0.write[accessgetcardtypemapcp.read.ordinal()];
        if ((i2 == 17 || i2 == 18) && (obj3 = imageStyle.serializer.get(accessgetcardtypemapcp)) != null) {
            accessgetDiskCacheLockp accessgetdiskcachelockp2 = (accessgetDiskCacheLockp) objValueOf;
            CardKey cardKey = (CardKey) ((accessgetDiskCacheLockp) obj3).toBuilder();
            if (!cardKey.IconCompatParcelizer.getClass().isInstance(accessgetdiskcachelockp2)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("mergeFrom(MessageLite) can only merge messages of the same type.");
                return null;
            }
            cardKey.serializer((GeneratedMessageLite) ((com.sentiance.protobuf.a) accessgetdiskcachelockp2));
            objValueOf = cardKey.IconCompatParcelizer();
        }
        imageStyle.RemoteActionCompatParcelizer(accessgetcardtypemapcp, objValueOf);
        return obj2;
    }

    public static void serializer(accessisOfflinep accessisofflinep, Map.Entry entry) {
        accessgetCardTypeMapcp accessgetcardtypemapcp = (accessgetCardTypeMapcp) entry.getKey();
        boolean z = accessgetcardtypemapcp.IconCompatParcelizer;
        WireFormat$FieldType wireFormat$FieldType = accessgetcardtypemapcp.read;
        boolean z2 = accessgetcardtypemapcp.serializer;
        int i = accessgetcardtypemapcp.RemoteActionCompatParcelizer;
        if (z) {
            switch (keyMap_delegatelambda0.write[wireFormat$FieldType.ordinal()]) {
                case 1:
                    GeofenceTransitionType.read(i, (List) entry.getValue(), accessisofflinep, z2);
                    break;
                case 2:
                    GeofenceTransitionType.RatingCompat(i, (List) entry.getValue(), accessisofflinep, z2);
                    break;
                case 3:
                    GeofenceTransitionType.MediaDescriptionCompat(i, (List) entry.getValue(), accessisofflinep, z2);
                    break;
                case 4:
                    GeofenceTransitionType.PlaybackStateCompat(i, (List) entry.getValue(), accessisofflinep, z2);
                    break;
                case 5:
                    GeofenceTransitionType.MediaMetadataCompat(i, (List) entry.getValue(), accessisofflinep, z2);
                    break;
                case 6:
                    GeofenceTransitionType.RemoteActionCompatParcelizer(i, (List) entry.getValue(), accessisofflinep, z2);
                    break;
                case 7:
                    GeofenceTransitionType.serializer(i, (List) entry.getValue(), accessisofflinep, z2);
                    break;
                case 8:
                    GeofenceTransitionType.IconCompatParcelizer(i, (List) entry.getValue(), accessisofflinep, z2);
                    break;
                case 9:
                    GeofenceTransitionType.ParcelableVolumeInfo(i, (List) entry.getValue(), accessisofflinep, z2);
                    break;
                case 10:
                    GeofenceTransitionType.MediaSessionCompatQueueItem(i, (List) entry.getValue(), accessisofflinep, z2);
                    break;
                case 11:
                    GeofenceTransitionType.MediaBrowserCompatMediaItem(i, (List) entry.getValue(), accessisofflinep, z2);
                    break;
                case 12:
                    GeofenceTransitionType.MediaSessionCompatResultReceiverWrapper(i, (List) entry.getValue(), accessisofflinep, z2);
                    break;
                case 13:
                    GeofenceTransitionType.MediaSessionCompatToken(i, (List) entry.getValue(), accessisofflinep, z2);
                    break;
                case 14:
                    GeofenceTransitionType.MediaMetadataCompat(i, (List) entry.getValue(), accessisofflinep, z2);
                    break;
                case 15:
                    GeofenceTransitionType.RemoteActionCompatParcelizer(i, (List) entry.getValue(), accessisofflinep);
                    break;
                case 16:
                    GeofenceTransitionType.serializer(i, (List) entry.getValue(), accessisofflinep);
                    break;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        GeofenceTransitionType.IconCompatParcelizer(i, (List) entry.getValue(), accessisofflinep, BrazeViewBounds.read.read(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        GeofenceTransitionType.serializer(i, (List) entry.getValue(), accessisofflinep, BrazeViewBounds.read.read(list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (keyMap_delegatelambda0.write[wireFormat$FieldType.ordinal()]) {
            case 1:
                double dDoubleValue = ((Double) entry.getValue()).doubleValue();
                setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
                setruntimeappconfigurationprovider.getClass();
                setruntimeappconfigurationprovider.RemoteActionCompatParcelizer(i, Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 2:
                float fFloatValue = ((Float) entry.getValue()).floatValue();
                setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider2 = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
                setruntimeappconfigurationprovider2.getClass();
                setruntimeappconfigurationprovider2.read(i, Float.floatToRawIntBits(fFloatValue));
                break;
            case 3:
                accessisofflinep.serializer(i, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).write(i, ((Long) entry.getValue()).longValue());
                break;
            case 5:
                accessisofflinep.RemoteActionCompatParcelizer(i, ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                accessisofflinep.RemoteActionCompatParcelizer(i, ((Long) entry.getValue()).longValue());
                break;
            case 7:
                accessisofflinep.write(i, ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).read(i, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).serializer(i, ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).read(i, ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(i, ((Long) entry.getValue()).longValue());
                break;
            case 12:
                int iIntValue = ((Integer) entry.getValue()).intValue();
                ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).serializer(i, (iIntValue << 1) ^ (iIntValue >> 31));
                break;
            case 13:
                long jLongValue = ((Long) entry.getValue()).longValue();
                ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).write(i, (jLongValue << 1) ^ (jLongValue >> 63));
                break;
            case 14:
                accessisofflinep.RemoteActionCompatParcelizer(i, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                accessisofflinep.RemoteActionCompatParcelizer(i, (ByteString) entry.getValue());
                break;
            case 16:
                ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).IconCompatParcelizer(i, (String) entry.getValue());
                break;
            case 17:
                accessisofflinep.read(i, entry.getValue(), BrazeViewBounds.read.read(entry.getValue().getClass()));
                break;
            case 18:
                accessisofflinep.serializer(i, entry.getValue(), BrazeViewBounds.read.read(entry.getValue().getClass()));
                break;
        }
    }
}
