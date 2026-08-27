package o;

import com.google.protobuf.GeneratedMessageLite;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class registerProvider {
    public static final com.google.protobuf.UnknownFieldSchema IconCompatParcelizer;
    public static final GlobalSnapshotManagerensureStarted2 RemoteActionCompatParcelizer;
    public static final Class read;

    public static void IconCompatParcelizer(int i, List list, DefaultHapticFeedback defaultHapticFeedback, DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        defaultHapticFeedback.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            defaultHapticFeedback.write(i, list.get(i2), disposableSaveableStateRegistrylambda0);
        }
    }

    public static void IconCompatParcelizer(int i, List list, DefaultHapticFeedback defaultHapticFeedback, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ComposeView composeView = (ComposeView) defaultHapticFeedback.write;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                composeView.write(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        composeView.RemoteActionCompatParcelizer(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += ComposeView.read(((Integer) list.get(i4)).intValue());
        }
        composeView.MediaBrowserCompatMediaItem(i3);
        while (i2 < list.size()) {
            composeView.IconCompatParcelizer(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void MediaBrowserCompatMediaItem(int i, List list, DefaultHapticFeedback defaultHapticFeedback, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ComposeView composeView = (ComposeView) defaultHapticFeedback.write;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                composeView.RemoteActionCompatParcelizer(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        composeView.RemoteActionCompatParcelizer(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            java.util.logging.Logger logger = ComposeView.RemoteActionCompatParcelizer;
            i3 += 8;
        }
        composeView.MediaBrowserCompatMediaItem(i3);
        while (i2 < list.size()) {
            composeView.IconCompatParcelizer(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void MediaDescriptionCompat(int i, List list, DefaultHapticFeedback defaultHapticFeedback, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ComposeView composeView = (ComposeView) defaultHapticFeedback.write;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                composeView.read(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        composeView.RemoteActionCompatParcelizer(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            java.util.logging.Logger logger = ComposeView.RemoteActionCompatParcelizer;
            i3 += 4;
        }
        composeView.MediaBrowserCompatMediaItem(i3);
        while (i2 < list.size()) {
            composeView.write(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void MediaMetadataCompat(int i, List list, DefaultHapticFeedback defaultHapticFeedback, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ComposeView composeView = (ComposeView) defaultHapticFeedback.write;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                composeView.write(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        composeView.RemoteActionCompatParcelizer(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += ComposeView.read(((Integer) list.get(i4)).intValue());
        }
        composeView.MediaBrowserCompatMediaItem(i3);
        while (i2 < list.size()) {
            composeView.IconCompatParcelizer(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void MediaSessionCompatQueueItem(int i, List list, DefaultHapticFeedback defaultHapticFeedback, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ComposeView composeView = (ComposeView) defaultHapticFeedback.write;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                composeView.write(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        composeView.RemoteActionCompatParcelizer(i, 2);
        int iSerializer = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iSerializer += ComposeView.serializer(((Long) list.get(i3)).longValue());
        }
        composeView.MediaBrowserCompatMediaItem(iSerializer);
        while (i2 < list.size()) {
            composeView.read(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void MediaSessionCompatResultReceiverWrapper(int i, List list, DefaultHapticFeedback defaultHapticFeedback, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ComposeView composeView = (ComposeView) defaultHapticFeedback.write;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                composeView.write(i, (jLongValue << 1) ^ (jLongValue >> 63));
                i2++;
            }
            return;
        }
        composeView.RemoteActionCompatParcelizer(i, 2);
        int iSerializer = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iSerializer += ComposeView.serializer((jLongValue2 << 1) ^ (jLongValue2 >> 63));
        }
        composeView.MediaBrowserCompatMediaItem(iSerializer);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            composeView.read((jLongValue3 << 1) ^ (jLongValue3 >> 63));
            i2++;
        }
    }

    public static void MediaSessionCompatToken(int i, List list, DefaultHapticFeedback defaultHapticFeedback, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ComposeView composeView = (ComposeView) defaultHapticFeedback.write;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                composeView.IconCompatParcelizer(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        composeView.RemoteActionCompatParcelizer(i, 2);
        int iRemoteActionCompatParcelizer = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iRemoteActionCompatParcelizer += ComposeView.RemoteActionCompatParcelizer(((Integer) list.get(i3)).intValue());
        }
        composeView.MediaBrowserCompatMediaItem(iRemoteActionCompatParcelizer);
        while (i2 < list.size()) {
            composeView.MediaBrowserCompatMediaItem(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void ParcelableVolumeInfo(int i, List list, DefaultHapticFeedback defaultHapticFeedback, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ComposeView composeView = (ComposeView) defaultHapticFeedback.write;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                composeView.IconCompatParcelizer(i, (iIntValue << 1) ^ (iIntValue >> 31));
                i2++;
            }
            return;
        }
        composeView.RemoteActionCompatParcelizer(i, 2);
        int iRemoteActionCompatParcelizer = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iRemoteActionCompatParcelizer += ComposeView.RemoteActionCompatParcelizer((iIntValue2 << 1) ^ (iIntValue2 >> 31));
        }
        composeView.MediaBrowserCompatMediaItem(iRemoteActionCompatParcelizer);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            composeView.MediaBrowserCompatMediaItem((iIntValue3 << 1) ^ (iIntValue3 >> 31));
            i2++;
        }
    }

    public static void PlaybackStateCompatCustomAction(int i, List list, DefaultHapticFeedback defaultHapticFeedback, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ComposeView composeView = (ComposeView) defaultHapticFeedback.write;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                composeView.write(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        composeView.RemoteActionCompatParcelizer(i, 2);
        int iSerializer = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iSerializer += ComposeView.serializer(((Long) list.get(i3)).longValue());
        }
        composeView.MediaBrowserCompatMediaItem(iSerializer);
        while (i2 < list.size()) {
            composeView.read(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void RatingCompat(int i, List list, DefaultHapticFeedback defaultHapticFeedback, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ComposeView composeView = (ComposeView) defaultHapticFeedback.write;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                composeView.getClass();
                composeView.read(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        composeView.RemoteActionCompatParcelizer(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            java.util.logging.Logger logger = ComposeView.RemoteActionCompatParcelizer;
            i3 += 4;
        }
        composeView.MediaBrowserCompatMediaItem(i3);
        while (i2 < list.size()) {
            composeView.write(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static Object RemoteActionCompatParcelizer(Object obj, int i, int i2, Object obj2, com.google.protobuf.UnknownFieldSchema unknownFieldSchema) {
        if (obj2 == null) {
            obj2 = unknownFieldSchema.IconCompatParcelizer(obj);
        }
        ((GlobalSnapshotManagerensureStarted2) unknownFieldSchema).getClass();
        ((GraphicsLayerOwnerLayer) obj2).serializer(i << 3, Long.valueOf(i2));
        return obj2;
    }

    public static void RemoteActionCompatParcelizer(int i, List list, DefaultHapticFeedback defaultHapticFeedback) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ComposeView composeView = (ComposeView) defaultHapticFeedback.write;
        int i2 = 0;
        if (!(list instanceof decodeFontSynthesisGVVA2EU)) {
            while (i2 < list.size()) {
                composeView.write(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        decodeFontSynthesisGVVA2EU decodefontsynthesisgvva2eu = (decodeFontSynthesisGVVA2EU) list;
        while (i2 < list.size()) {
            Object objIconCompatParcelizer = decodefontsynthesisgvva2eu.IconCompatParcelizer(i2);
            if (objIconCompatParcelizer instanceof String) {
                composeView.write(i, (String) objIconCompatParcelizer);
            } else {
                composeView.write(i, (getClipMetadata) objIconCompatParcelizer);
            }
            i2++;
        }
    }

    public static void RemoteActionCompatParcelizer(int i, List list, DefaultHapticFeedback defaultHapticFeedback, DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        defaultHapticFeedback.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            defaultHapticFeedback.read(i, list.get(i2), disposableSaveableStateRegistrylambda0);
        }
    }

    public static void RemoteActionCompatParcelizer(int i, List list, DefaultHapticFeedback defaultHapticFeedback, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ComposeView composeView = (ComposeView) defaultHapticFeedback.write;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                composeView.RemoteActionCompatParcelizer(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        composeView.RemoteActionCompatParcelizer(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            java.util.logging.Logger logger = ComposeView.RemoteActionCompatParcelizer;
            i3++;
        }
        composeView.MediaBrowserCompatMediaItem(i3);
        while (i2 < list.size()) {
            composeView.RemoteActionCompatParcelizer(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void read(int i, List list, DefaultHapticFeedback defaultHapticFeedback, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ComposeView composeView = (ComposeView) defaultHapticFeedback.write;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                composeView.RemoteActionCompatParcelizer(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        composeView.RemoteActionCompatParcelizer(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            java.util.logging.Logger logger = ComposeView.RemoteActionCompatParcelizer;
            i3 += 8;
        }
        composeView.MediaBrowserCompatMediaItem(i3);
        while (i2 < list.size()) {
            composeView.IconCompatParcelizer(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void serializer(int i, List list, DefaultHapticFeedback defaultHapticFeedback, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ComposeView composeView = (ComposeView) defaultHapticFeedback.write;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                composeView.getClass();
                composeView.RemoteActionCompatParcelizer(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        composeView.RemoteActionCompatParcelizer(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            java.util.logging.Logger logger = ComposeView.RemoteActionCompatParcelizer;
            i3 += 8;
        }
        composeView.MediaBrowserCompatMediaItem(i3);
        while (i2 < list.size()) {
            composeView.IconCompatParcelizer(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void write(int i, List list, DefaultHapticFeedback defaultHapticFeedback) {
        if (list == null || list.isEmpty()) {
            return;
        }
        defaultHapticFeedback.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((ComposeView) defaultHapticFeedback.write).write(i, (getClipMetadata) list.get(i2));
        }
    }

    public static void write(int i, List list, DefaultHapticFeedback defaultHapticFeedback, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ComposeView composeView = (ComposeView) defaultHapticFeedback.write;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                composeView.read(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        composeView.RemoteActionCompatParcelizer(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            java.util.logging.Logger logger = ComposeView.RemoteActionCompatParcelizer;
            i3 += 4;
        }
        composeView.MediaBrowserCompatMediaItem(i3);
        while (i2 < list.size()) {
            composeView.write(((Integer) list.get(i2)).intValue());
            i2++;
        }
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
    public static void write(com.google.protobuf.UnknownFieldSchema unknownFieldSchema, Object obj, Object obj2) {
        ((GlobalSnapshotManagerensureStarted2) unknownFieldSchema).getClass();
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayerSerializer = generatedMessageLite.RemoteActionCompatParcelizer;
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = ((GeneratedMessageLite) obj2).RemoteActionCompatParcelizer;
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer2 = GraphicsLayerOwnerLayer.serializer;
        if (!graphicsLayerOwnerLayer2.equals(graphicsLayerOwnerLayer)) {
            if (graphicsLayerOwnerLayer2.equals(graphicsLayerOwnerLayerSerializer)) {
                graphicsLayerOwnerLayerSerializer = GraphicsLayerOwnerLayer.serializer(graphicsLayerOwnerLayerSerializer, graphicsLayerOwnerLayer);
            } else {
                graphicsLayerOwnerLayerSerializer.getClass();
                if (!graphicsLayerOwnerLayer.equals(graphicsLayerOwnerLayer2)) {
                    graphicsLayerOwnerLayerSerializer.serializer();
                    int i = graphicsLayerOwnerLayerSerializer.RemoteActionCompatParcelizer + graphicsLayerOwnerLayer.RemoteActionCompatParcelizer;
                    graphicsLayerOwnerLayerSerializer.IconCompatParcelizer(i);
                    System.arraycopy(graphicsLayerOwnerLayer.RatingCompat, 0, graphicsLayerOwnerLayerSerializer.RatingCompat, graphicsLayerOwnerLayerSerializer.RemoteActionCompatParcelizer, graphicsLayerOwnerLayer.RemoteActionCompatParcelizer);
                    System.arraycopy(graphicsLayerOwnerLayer.IconCompatParcelizer, 0, graphicsLayerOwnerLayerSerializer.IconCompatParcelizer, graphicsLayerOwnerLayerSerializer.RemoteActionCompatParcelizer, graphicsLayerOwnerLayer.RemoteActionCompatParcelizer);
                    graphicsLayerOwnerLayerSerializer.RemoteActionCompatParcelizer = i;
                }
            }
        }
        generatedMessageLite.RemoteActionCompatParcelizer = graphicsLayerOwnerLayerSerializer;
    }

    static {
        Class<?> cls;
        Class<?> cls2;
        com.google.protobuf.UnknownFieldSchema unknownFieldSchema = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        read = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                unknownFieldSchema = (com.google.protobuf.UnknownFieldSchema) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        IconCompatParcelizer = unknownFieldSchema;
        RemoteActionCompatParcelizer = new GlobalSnapshotManagerensureStarted2();
    }

    public static Object IconCompatParcelizer(Object obj, int i, List list, decodeByte decodebyte, Object obj2, com.google.protobuf.UnknownFieldSchema unknownFieldSchema) {
        if (decodebyte == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int iIntValue = num.intValue();
                if (decodebyte.write(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = RemoteActionCompatParcelizer(obj, i, iIntValue, obj2, unknownFieldSchema);
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
            if (!decodebyte.write(iIntValue2)) {
                obj2 = RemoteActionCompatParcelizer(obj, i, iIntValue2, obj2, unknownFieldSchema);
                it.remove();
            }
        }
        return obj2;
    }

    public static boolean read(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int IconCompatParcelizer(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof getDpSizeMYxV2XQ)) {
            int iSerializer = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iSerializer += ComposeView.serializer((jLongValue << 1) ^ (jLongValue >> 63));
                i++;
            }
            return iSerializer;
        }
        getDpSizeMYxV2XQ getdpsizemyxv2xq = (getDpSizeMYxV2XQ) list;
        int iSerializer2 = 0;
        while (i < size) {
            long jIconCompatParcelizer = getdpsizemyxv2xq.IconCompatParcelizer(i);
            iSerializer2 += ComposeView.serializer((jIconCompatParcelizer << 1) ^ (jIconCompatParcelizer >> 63));
            i++;
        }
        return iSerializer2;
    }

    public static int MediaDescriptionCompat(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof DebugUtilsKt)) {
            int iRemoteActionCompatParcelizer = 0;
            while (i < size) {
                iRemoteActionCompatParcelizer += ComposeView.RemoteActionCompatParcelizer(((Integer) list.get(i)).intValue());
                i++;
            }
            return iRemoteActionCompatParcelizer;
        }
        DebugUtilsKt debugUtilsKt = (DebugUtilsKt) list;
        int iRemoteActionCompatParcelizer2 = 0;
        while (i < size) {
            iRemoteActionCompatParcelizer2 += ComposeView.RemoteActionCompatParcelizer(debugUtilsKt.serializer(i));
            i++;
        }
        return iRemoteActionCompatParcelizer2;
    }

    public static int MediaSessionCompatQueueItem(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof getDpSizeMYxV2XQ)) {
            int iSerializer = 0;
            while (i < size) {
                iSerializer += ComposeView.serializer(((Long) list.get(i)).longValue());
                i++;
            }
            return iSerializer;
        }
        getDpSizeMYxV2XQ getdpsizemyxv2xq = (getDpSizeMYxV2XQ) list;
        int iSerializer2 = 0;
        while (i < size) {
            iSerializer2 += ComposeView.serializer(getdpsizemyxv2xq.IconCompatParcelizer(i));
            i++;
        }
        return iSerializer2;
    }

    public static int RemoteActionCompatParcelizer(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ComposeView.serializer(i) + 4) * size;
    }

    public static int RemoteActionCompatParcelizer(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof DebugUtilsKt)) {
            int i2 = 0;
            while (i < size) {
                i2 += ComposeView.read(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        DebugUtilsKt debugUtilsKt = (DebugUtilsKt) list;
        int i3 = 0;
        while (i < size) {
            i3 += ComposeView.read(debugUtilsKt.serializer(i));
            i++;
        }
        return i3;
    }

    public static int read(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof DebugUtilsKt)) {
            int i2 = 0;
            while (i < size) {
                i2 += ComposeView.read(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        DebugUtilsKt debugUtilsKt = (DebugUtilsKt) list;
        int i3 = 0;
        while (i < size) {
            i3 += ComposeView.read(debugUtilsKt.serializer(i));
            i++;
        }
        return i3;
    }

    public static int serializer(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ComposeView.serializer(i) + 8) * size;
    }

    public static int serializer(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof DebugUtilsKt)) {
            int iRemoteActionCompatParcelizer = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iRemoteActionCompatParcelizer += ComposeView.RemoteActionCompatParcelizer((iIntValue << 1) ^ (iIntValue >> 31));
                i++;
            }
            return iRemoteActionCompatParcelizer;
        }
        DebugUtilsKt debugUtilsKt = (DebugUtilsKt) list;
        int iRemoteActionCompatParcelizer2 = 0;
        while (i < size) {
            int iSerializer = debugUtilsKt.serializer(i);
            iRemoteActionCompatParcelizer2 += ComposeView.RemoteActionCompatParcelizer((iSerializer << 1) ^ (iSerializer >> 31));
            i++;
        }
        return iRemoteActionCompatParcelizer2;
    }

    public static int write(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof getDpSizeMYxV2XQ)) {
            int iSerializer = 0;
            while (i < size) {
                iSerializer += ComposeView.serializer(((Long) list.get(i)).longValue());
                i++;
            }
            return iSerializer;
        }
        getDpSizeMYxV2XQ getdpsizemyxv2xq = (getDpSizeMYxV2XQ) list;
        int iSerializer2 = 0;
        while (i < size) {
            iSerializer2 += ComposeView.serializer(getdpsizemyxv2xq.IconCompatParcelizer(i));
            i++;
        }
        return iSerializer2;
    }

    public static Object read(Object obj, int i, AbstractList abstractList, dataAvailable dataavailable, Object obj2, com.google.protobuf.UnknownFieldSchema unknownFieldSchema) {
        if (dataavailable == null) {
            return obj2;
        }
        int size = abstractList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) abstractList.get(i3);
            int iIntValue = num.intValue();
            if (dataavailable.IconCompatParcelizer(iIntValue) != null) {
                if (i3 != i2) {
                    abstractList.set(i2, num);
                }
                i2++;
            } else {
                obj2 = RemoteActionCompatParcelizer(obj, i, iIntValue, obj2, unknownFieldSchema);
            }
        }
        if (i2 != size) {
            abstractList.subList(i2, size).clear();
        }
        return obj2;
    }
}
