package o;

import com.sentiance.protobuf.ByteString;
import com.sentiance.protobuf.GeneratedMessageLite;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GeofenceTransitionType {
    public static final getTriggerEvent IconCompatParcelizer;
    public static final com.sentiance.protobuf.c1 serializer;
    public static final Class write;

    public static void IconCompatParcelizer(int i, List list, accessisOfflinep accessisofflinep, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                setruntimeappconfigurationprovider.read(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        setruntimeappconfigurationprovider.write(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            java.util.logging.Logger logger = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer;
            i3++;
        }
        setruntimeappconfigurationprovider.RatingCompat(i3);
        while (i2 < list.size()) {
            setruntimeappconfigurationprovider.write(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void MediaBrowserCompatMediaItem(int i, List list, accessisOfflinep accessisofflinep, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                setruntimeappconfigurationprovider.RemoteActionCompatParcelizer(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        setruntimeappconfigurationprovider.write(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            java.util.logging.Logger logger = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer;
            i3 += 8;
        }
        setruntimeappconfigurationprovider.RatingCompat(i3);
        while (i2 < list.size()) {
            setruntimeappconfigurationprovider.serializer(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void MediaDescriptionCompat(int i, List list, accessisOfflinep accessisofflinep, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                setruntimeappconfigurationprovider.write(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        setruntimeappconfigurationprovider.write(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += setRuntimeAppConfigurationProvider.read(((Long) list.get(i4)).longValue());
        }
        setruntimeappconfigurationprovider.RatingCompat(i3);
        while (i2 < list.size()) {
            setruntimeappconfigurationprovider.RemoteActionCompatParcelizer(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void MediaMetadataCompat(int i, List list, accessisOfflinep accessisofflinep, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                setruntimeappconfigurationprovider.IconCompatParcelizer(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        setruntimeappconfigurationprovider.write(i, 2);
        int iRemoteActionCompatParcelizer = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iRemoteActionCompatParcelizer += setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer(((Integer) list.get(i3)).intValue());
        }
        setruntimeappconfigurationprovider.RatingCompat(iRemoteActionCompatParcelizer);
        while (i2 < list.size()) {
            setruntimeappconfigurationprovider.write(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void MediaSessionCompatQueueItem(int i, List list, accessisOfflinep accessisofflinep, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                setruntimeappconfigurationprovider.read(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        setruntimeappconfigurationprovider.write(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            java.util.logging.Logger logger = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer;
            i3 += 4;
        }
        setruntimeappconfigurationprovider.RatingCompat(i3);
        while (i2 < list.size()) {
            setruntimeappconfigurationprovider.IconCompatParcelizer(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void MediaSessionCompatResultReceiverWrapper(int i, List list, accessisOfflinep accessisofflinep, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                setruntimeappconfigurationprovider.serializer(i, (iIntValue << 1) ^ (iIntValue >> 31));
                i2++;
            }
            return;
        }
        setruntimeappconfigurationprovider.write(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            i3 += setRuntimeAppConfigurationProvider.read((iIntValue2 << 1) ^ (iIntValue2 >> 31));
        }
        setruntimeappconfigurationprovider.RatingCompat(i3);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            setruntimeappconfigurationprovider.RatingCompat((iIntValue3 << 1) ^ (iIntValue3 >> 31));
            i2++;
        }
    }

    public static void MediaSessionCompatToken(int i, List list, accessisOfflinep accessisofflinep, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                setruntimeappconfigurationprovider.write(i, (jLongValue << 1) ^ (jLongValue >> 63));
                i2++;
            }
            return;
        }
        setruntimeappconfigurationprovider.write(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long jLongValue2 = ((Long) list.get(i4)).longValue();
            i3 += setRuntimeAppConfigurationProvider.read((jLongValue2 << 1) ^ (jLongValue2 >> 63));
        }
        setruntimeappconfigurationprovider.RatingCompat(i3);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            setruntimeappconfigurationprovider.RemoteActionCompatParcelizer((jLongValue3 << 1) ^ (jLongValue3 >> 63));
            i2++;
        }
    }

    public static void ParcelableVolumeInfo(int i, List list, accessisOfflinep accessisofflinep, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                setruntimeappconfigurationprovider.serializer(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        setruntimeappconfigurationprovider.write(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += setRuntimeAppConfigurationProvider.read(((Integer) list.get(i4)).intValue());
        }
        setruntimeappconfigurationprovider.RatingCompat(i3);
        while (i2 < list.size()) {
            setruntimeappconfigurationprovider.RatingCompat(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void PlaybackStateCompat(int i, List list, accessisOfflinep accessisofflinep, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                setruntimeappconfigurationprovider.write(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        setruntimeappconfigurationprovider.write(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += setRuntimeAppConfigurationProvider.read(((Long) list.get(i4)).longValue());
        }
        setruntimeappconfigurationprovider.RatingCompat(i3);
        while (i2 < list.size()) {
            setruntimeappconfigurationprovider.RemoteActionCompatParcelizer(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void RatingCompat(int i, List list, accessisOfflinep accessisofflinep, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                setruntimeappconfigurationprovider.getClass();
                setruntimeappconfigurationprovider.read(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        setruntimeappconfigurationprovider.write(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            java.util.logging.Logger logger = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer;
            i3 += 4;
        }
        setruntimeappconfigurationprovider.RatingCompat(i3);
        while (i2 < list.size()) {
            setruntimeappconfigurationprovider.IconCompatParcelizer(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void RemoteActionCompatParcelizer(int i, List list, accessisOfflinep accessisofflinep, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                setruntimeappconfigurationprovider.RemoteActionCompatParcelizer(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        setruntimeappconfigurationprovider.write(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            java.util.logging.Logger logger = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer;
            i3 += 8;
        }
        setruntimeappconfigurationprovider.RatingCompat(i3);
        while (i2 < list.size()) {
            setruntimeappconfigurationprovider.serializer(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void read(int i, List list, accessisOfflinep accessisofflinep, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                setruntimeappconfigurationprovider.getClass();
                setruntimeappconfigurationprovider.RemoteActionCompatParcelizer(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        setruntimeappconfigurationprovider.write(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            java.util.logging.Logger logger = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer;
            i3 += 8;
        }
        setruntimeappconfigurationprovider.RatingCompat(i3);
        while (i2 < list.size()) {
            setruntimeappconfigurationprovider.serializer(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void serializer(int i, List list, accessisOfflinep accessisofflinep, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                setruntimeappconfigurationprovider.read(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        setruntimeappconfigurationprovider.write(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            java.util.logging.Logger logger = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer;
            i3 += 4;
        }
        setruntimeappconfigurationprovider.RatingCompat(i3);
        while (i2 < list.size()) {
            setruntimeappconfigurationprovider.IconCompatParcelizer(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void write(int i, List list, accessisOfflinep accessisofflinep, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                setruntimeappconfigurationprovider.IconCompatParcelizer(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        setruntimeappconfigurationprovider.write(i, 2);
        int iRemoteActionCompatParcelizer = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iRemoteActionCompatParcelizer += setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer(((Integer) list.get(i3)).intValue());
        }
        setruntimeappconfigurationprovider.RatingCompat(iRemoteActionCompatParcelizer);
        while (i2 < list.size()) {
            setruntimeappconfigurationprovider.write(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    static {
        Class<?> cls;
        Class<?> cls2;
        com.sentiance.protobuf.c1 c1Var = null;
        try {
            cls = Class.forName("com.sentiance.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        write = cls;
        try {
            cls2 = Class.forName("com.sentiance.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                c1Var = (com.sentiance.protobuf.c1) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        serializer = c1Var;
        IconCompatParcelizer = new getTriggerEvent();
    }

    public static int MediaSessionCompatQueueItem(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0)) {
            int i2 = 0;
            while (i < size) {
                i2 += setRuntimeAppConfigurationProvider.read(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0 r8lambdawenh2zfjpauxgrrcztm8m6cjb0 = (r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0) list;
        int i3 = 0;
        while (i < size) {
            r8lambdawenh2zfjpauxgrrcztm8m6cjb0.write(i);
            i3 += setRuntimeAppConfigurationProvider.read(r8lambdawenh2zfjpauxgrrcztm8m6cjb0.serializer[i]);
            i++;
        }
        return i3;
    }

    public static int RatingCompat(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof getUnviewedCardCount)) {
            int i2 = 0;
            while (i < size) {
                i2 += setRuntimeAppConfigurationProvider.read(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        getUnviewedCardCount getunviewedcardcount = (getUnviewedCardCount) list;
        int i3 = 0;
        while (i < size) {
            getunviewedcardcount.RemoteActionCompatParcelizer(i);
            i3 += setRuntimeAppConfigurationProvider.read(getunviewedcardcount.IconCompatParcelizer[i]);
            i++;
        }
        return i3;
    }

    public static int serializer(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (setRuntimeAppConfigurationProvider.serializer(i) + 8) * size;
    }

    public static void serializer(int i, List list, accessisOfflinep accessisofflinep) {
        if (list == null || list.isEmpty()) {
            return;
        }
        setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (list instanceof SessionStateChangedEventChangeType) {
            SessionStateChangedEventChangeType sessionStateChangedEventChangeType = (SessionStateChangedEventChangeType) list;
            while (i2 < list.size()) {
                Object objIconCompatParcelizer = sessionStateChangedEventChangeType.IconCompatParcelizer(i2);
                if (objIconCompatParcelizer instanceof String) {
                    setruntimeappconfigurationprovider.IconCompatParcelizer(i, (String) objIconCompatParcelizer);
                } else {
                    setruntimeappconfigurationprovider.serializer(i, (ByteString) objIconCompatParcelizer);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            setruntimeappconfigurationprovider.IconCompatParcelizer(i, (String) list.get(i2));
            i2++;
        }
    }

    public static void RemoteActionCompatParcelizer(int i, List list, accessisOfflinep accessisofflinep) {
        if (list == null || list.isEmpty()) {
            return;
        }
        accessisofflinep.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).serializer(i, (ByteString) list.get(i2));
        }
    }

    public static int read(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (setRuntimeAppConfigurationProvider.serializer(i) + 4) * size;
    }

    public static int serializer(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0)) {
            int i2 = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                i2 += setRuntimeAppConfigurationProvider.read((jLongValue << 1) ^ (jLongValue >> 63));
                i++;
            }
            return i2;
        }
        r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0 r8lambdawenh2zfjpauxgrrcztm8m6cjb0 = (r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0) list;
        int i3 = 0;
        while (i < size) {
            r8lambdawenh2zfjpauxgrrcztm8m6cjb0.write(i);
            long j = r8lambdawenh2zfjpauxgrrcztm8m6cjb0.serializer[i];
            i3 += setRuntimeAppConfigurationProvider.read((j << 1) ^ (j >> 63));
            i++;
        }
        return i3;
    }

    public static int write(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof getUnviewedCardCount)) {
            int i2 = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                i2 += setRuntimeAppConfigurationProvider.read((iIntValue << 1) ^ (iIntValue >> 31));
                i++;
            }
            return i2;
        }
        getUnviewedCardCount getunviewedcardcount = (getUnviewedCardCount) list;
        int i3 = 0;
        while (i < size) {
            getunviewedcardcount.RemoteActionCompatParcelizer(i);
            int i4 = getunviewedcardcount.IconCompatParcelizer[i];
            i3 += setRuntimeAppConfigurationProvider.read((i4 << 1) ^ (i4 >> 31));
            i++;
        }
        return i3;
    }

    public static void IconCompatParcelizer(int i, List list, accessisOfflinep accessisofflinep, fromStringlambda1 fromstringlambda1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        accessisofflinep.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            accessisofflinep.read(i, list.get(i2), fromstringlambda1);
        }
    }

    public static boolean write(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void write(com.sentiance.protobuf.c1 c1Var, Object obj, Object obj2) {
        ((getTriggerEvent) c1Var).getClass();
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        IValueCallback iValueCallbackIconCompatParcelizer = generatedMessageLite.serializer;
        IValueCallback iValueCallback = ((GeneratedMessageLite) obj2).serializer;
        IValueCallback iValueCallback2 = IValueCallback.write;
        if (!iValueCallback2.equals(iValueCallback)) {
            if (iValueCallback2.equals(iValueCallbackIconCompatParcelizer)) {
                iValueCallbackIconCompatParcelizer = IValueCallback.IconCompatParcelizer(iValueCallbackIconCompatParcelizer, iValueCallback);
            } else {
                iValueCallbackIconCompatParcelizer.getClass();
                if (!iValueCallback.equals(iValueCallback2)) {
                    iValueCallbackIconCompatParcelizer.serializer();
                    int i = iValueCallbackIconCompatParcelizer.IconCompatParcelizer + iValueCallback.IconCompatParcelizer;
                    iValueCallbackIconCompatParcelizer.serializer(i);
                    System.arraycopy(iValueCallback.serializer, 0, iValueCallbackIconCompatParcelizer.serializer, iValueCallbackIconCompatParcelizer.IconCompatParcelizer, iValueCallback.IconCompatParcelizer);
                    System.arraycopy(iValueCallback.read, 0, iValueCallbackIconCompatParcelizer.read, iValueCallbackIconCompatParcelizer.IconCompatParcelizer, iValueCallback.IconCompatParcelizer);
                    iValueCallbackIconCompatParcelizer.IconCompatParcelizer = i;
                }
            }
        }
        generatedMessageLite.serializer = iValueCallbackIconCompatParcelizer;
    }

    public static int IconCompatParcelizer(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof getUnviewedCardCount)) {
            int iRemoteActionCompatParcelizer = 0;
            while (i < size) {
                iRemoteActionCompatParcelizer += setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer(((Integer) list.get(i)).intValue());
                i++;
            }
            return iRemoteActionCompatParcelizer;
        }
        getUnviewedCardCount getunviewedcardcount = (getUnviewedCardCount) list;
        int iRemoteActionCompatParcelizer2 = 0;
        while (i < size) {
            getunviewedcardcount.RemoteActionCompatParcelizer(i);
            iRemoteActionCompatParcelizer2 += setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer(getunviewedcardcount.IconCompatParcelizer[i]);
            i++;
        }
        return iRemoteActionCompatParcelizer2;
    }

    public static int RemoteActionCompatParcelizer(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0)) {
            int i2 = 0;
            while (i < size) {
                i2 += setRuntimeAppConfigurationProvider.read(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0 r8lambdawenh2zfjpauxgrrcztm8m6cjb0 = (r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0) list;
        int i3 = 0;
        while (i < size) {
            r8lambdawenh2zfjpauxgrrcztm8m6cjb0.write(i);
            i3 += setRuntimeAppConfigurationProvider.read(r8lambdawenh2zfjpauxgrrcztm8m6cjb0.serializer[i]);
            i++;
        }
        return i3;
    }

    public static void serializer(int i, List list, accessisOfflinep accessisofflinep, fromStringlambda1 fromstringlambda1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        accessisofflinep.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            accessisofflinep.serializer(i, list.get(i2), fromstringlambda1);
        }
    }

    public static int read(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof getUnviewedCardCount)) {
            int iRemoteActionCompatParcelizer = 0;
            while (i < size) {
                iRemoteActionCompatParcelizer += setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer(((Integer) list.get(i)).intValue());
                i++;
            }
            return iRemoteActionCompatParcelizer;
        }
        getUnviewedCardCount getunviewedcardcount = (getUnviewedCardCount) list;
        int iRemoteActionCompatParcelizer2 = 0;
        while (i < size) {
            getunviewedcardcount.RemoteActionCompatParcelizer(i);
            iRemoteActionCompatParcelizer2 += setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer(getunviewedcardcount.IconCompatParcelizer[i]);
            i++;
        }
        return iRemoteActionCompatParcelizer2;
    }

    public static Object write(Object obj, int i, AbstractList abstractList, getFeatureFlags getfeatureflags, Object obj2, com.sentiance.protobuf.c1 c1Var) {
        if (getfeatureflags == null) {
            return obj2;
        }
        int size = abstractList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) abstractList.get(i3);
            int iIntValue = num.intValue();
            if (getfeatureflags.read(iIntValue) != null) {
                if (i3 != i2) {
                    abstractList.set(i2, num);
                }
                i2++;
            } else {
                obj2 = read(obj, i, iIntValue, obj2, c1Var);
            }
        }
        if (i2 != size) {
            abstractList.subList(i2, size).clear();
        }
        return obj2;
    }

    public static Object serializer(Object obj, int i, List list, FeatureFlagsUpdatedEventCompanion featureFlagsUpdatedEventCompanion, Object obj2, com.sentiance.protobuf.c1 c1Var) {
        if (featureFlagsUpdatedEventCompanion == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int iIntValue = num.intValue();
                if (featureFlagsUpdatedEventCompanion.write(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = read(obj, i, iIntValue, obj2, c1Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
            return obj2;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Integer) it.next()).intValue();
            if (!featureFlagsUpdatedEventCompanion.write(iIntValue2)) {
                obj2 = read(obj, i, iIntValue2, obj2, c1Var);
                it.remove();
            }
        }
        return obj2;
    }

    public static Object read(Object obj, int i, int i2, Object obj2, com.sentiance.protobuf.c1 c1Var) {
        if (obj2 == null) {
            obj2 = c1Var.write(obj);
        }
        ((getTriggerEvent) c1Var).getClass();
        ((IValueCallback) obj2).write(i << 3, Long.valueOf(i2));
        return obj2;
    }
}
