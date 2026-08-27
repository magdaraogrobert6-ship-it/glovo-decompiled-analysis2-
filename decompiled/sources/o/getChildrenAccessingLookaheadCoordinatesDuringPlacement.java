package o;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getChildrenAccessingLookaheadCoordinatesDuringPlacement {
    public static final getHeightui IconCompatParcelizer;
    public static final com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema read;
    public static final Class serializer;
    public static final com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema write;

    public static int read(List list) {
        return list.size() * 8;
    }

    public static int write(List list) {
        return list.size() * 4;
    }

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        serializer = cls;
        read = RemoteActionCompatParcelizer(false);
        write = RemoteActionCompatParcelizer(true);
        IconCompatParcelizer = new getHeightui();
    }

    public static Object IconCompatParcelizer(Object obj, int i, int i2, Object obj2, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema unknownFieldSchema) {
        if (obj2 == null) {
            obj2 = unknownFieldSchema.read(obj);
        }
        ((getHeightui) unknownFieldSchema).getClass();
        ((getCoordinatesAccessedDuringModifierPlacement) obj2).serializer(i << 3, Long.valueOf(i2));
        return obj2;
    }

    public static void IconCompatParcelizer(int i, List list, LayoutNode_foldedChildren1 layoutNode_foldedChildren1) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) layoutNode_foldedChildren1.RemoteActionCompatParcelizer;
        if (!(list instanceof LayoutNodeNoIntrinsicsMeasurePolicy)) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str = (String) list.get(i2);
                setsemanticsinvalidatedui.write(i, 2);
                int i3 = setsemanticsinvalidatedui.write;
                byte[] bArr = setsemanticsinvalidatedui.IconCompatParcelizer;
                int i4 = setsemanticsinvalidatedui.RemoteActionCompatParcelizer;
                try {
                    int i5 = setSemanticsInvalidatedui.read(str.length() * 3);
                    int i6 = setSemanticsInvalidatedui.read(str.length());
                    if (i6 == i5) {
                        int i7 = i4 + i6;
                        setsemanticsinvalidatedui.RemoteActionCompatParcelizer = i7;
                        int iRemoteActionCompatParcelizer = getNextChildPlaceOrderui.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(str, bArr, i7, i3 - i7);
                        setsemanticsinvalidatedui.RemoteActionCompatParcelizer = i4;
                        setsemanticsinvalidatedui.RatingCompat((iRemoteActionCompatParcelizer - i4) - i6);
                        setsemanticsinvalidatedui.RemoteActionCompatParcelizer = iRemoteActionCompatParcelizer;
                    } else {
                        setsemanticsinvalidatedui.RatingCompat(getNextChildPlaceOrderui.RemoteActionCompatParcelizer(str));
                        int i8 = setsemanticsinvalidatedui.RemoteActionCompatParcelizer;
                        setsemanticsinvalidatedui.RemoteActionCompatParcelizer = getNextChildPlaceOrderui.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(str, bArr, i8, i3 - i8);
                    }
                } catch (Utf8$UnpairedSurrogateException e) {
                    setsemanticsinvalidatedui.RemoteActionCompatParcelizer = i4;
                    setSemanticsInvalidatedui.read.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                    byte[] bytes = str.getBytes(getMinimumTouchTargetSizeMYxV2XQ.write);
                    try {
                        setsemanticsinvalidatedui.RatingCompat(bytes.length);
                        setsemanticsinvalidatedui.read(bytes, 0, bytes.length);
                    } catch (IndexOutOfBoundsException e2) {
                        throw new CodedOutputStream$OutOfSpaceException(e2);
                    }
                } catch (IndexOutOfBoundsException e3) {
                    throw new CodedOutputStream$OutOfSpaceException(e3);
                }
            }
            return;
        }
        LayoutNodeNoIntrinsicsMeasurePolicy layoutNodeNoIntrinsicsMeasurePolicy = (LayoutNodeNoIntrinsicsMeasurePolicy) list;
        for (int i9 = 0; i9 < list.size(); i9++) {
            Object objRemoteActionCompatParcelizer = layoutNodeNoIntrinsicsMeasurePolicy.RemoteActionCompatParcelizer(i9);
            if (objRemoteActionCompatParcelizer instanceof String) {
                String str2 = (String) objRemoteActionCompatParcelizer;
                setsemanticsinvalidatedui.write(i, 2);
                int i10 = setsemanticsinvalidatedui.write;
                byte[] bArr2 = setsemanticsinvalidatedui.IconCompatParcelizer;
                int i11 = setsemanticsinvalidatedui.RemoteActionCompatParcelizer;
                try {
                    int i12 = setSemanticsInvalidatedui.read(str2.length() * 3);
                    int i13 = setSemanticsInvalidatedui.read(str2.length());
                    if (i13 == i12) {
                        int i14 = i11 + i13;
                        setsemanticsinvalidatedui.RemoteActionCompatParcelizer = i14;
                        int iRemoteActionCompatParcelizer2 = getNextChildPlaceOrderui.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(str2, bArr2, i14, i10 - i14);
                        setsemanticsinvalidatedui.RemoteActionCompatParcelizer = i11;
                        setsemanticsinvalidatedui.RatingCompat((iRemoteActionCompatParcelizer2 - i11) - i13);
                        setsemanticsinvalidatedui.RemoteActionCompatParcelizer = iRemoteActionCompatParcelizer2;
                    } else {
                        setsemanticsinvalidatedui.RatingCompat(getNextChildPlaceOrderui.RemoteActionCompatParcelizer(str2));
                        int i15 = setsemanticsinvalidatedui.RemoteActionCompatParcelizer;
                        setsemanticsinvalidatedui.RemoteActionCompatParcelizer = getNextChildPlaceOrderui.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(str2, bArr2, i15, i10 - i15);
                    }
                } catch (Utf8$UnpairedSurrogateException e4) {
                    setsemanticsinvalidatedui.RemoteActionCompatParcelizer = i11;
                    setSemanticsInvalidatedui.read.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e4);
                    byte[] bytes2 = str2.getBytes(getMinimumTouchTargetSizeMYxV2XQ.write);
                    try {
                        setsemanticsinvalidatedui.RatingCompat(bytes2.length);
                        setsemanticsinvalidatedui.read(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e5) {
                        throw new CodedOutputStream$OutOfSpaceException(e5);
                    }
                } catch (IndexOutOfBoundsException e6) {
                    throw new CodedOutputStream$OutOfSpaceException(e6);
                }
            } else {
                setOnAttachui setonattachui = (setOnAttachui) objRemoteActionCompatParcelizer;
                setsemanticsinvalidatedui.write(i, 2);
                setsemanticsinvalidatedui.RatingCompat(setonattachui.IconCompatParcelizer());
                setOnDetachui setondetachui = (setOnDetachui) setonattachui;
                setsemanticsinvalidatedui.read(setondetachui.RatingCompat, setondetachui.write(), setondetachui.IconCompatParcelizer());
            }
        }
    }

    public static void IconCompatParcelizer(int i, List list, LayoutNode_foldedChildren1 layoutNode_foldedChildren1, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) layoutNode_foldedChildren1.RemoteActionCompatParcelizer;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                setsemanticsinvalidatedui.write(i, 0);
                setsemanticsinvalidatedui.read(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        setsemanticsinvalidatedui.write(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            java.util.logging.Logger logger = setSemanticsInvalidatedui.read;
            i3++;
        }
        setsemanticsinvalidatedui.RatingCompat(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            setsemanticsinvalidatedui.read(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static void MediaBrowserCompatMediaItem(int i, List list, LayoutNode_foldedChildren1 layoutNode_foldedChildren1, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) layoutNode_foldedChildren1.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                setsemanticsinvalidatedui.serializer(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        setsemanticsinvalidatedui.write(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            java.util.logging.Logger logger = setSemanticsInvalidatedui.read;
            i3 += 8;
        }
        setsemanticsinvalidatedui.RatingCompat(i3);
        while (i2 < list.size()) {
            setsemanticsinvalidatedui.write(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void MediaDescriptionCompat(int i, List list, LayoutNode_foldedChildren1 layoutNode_foldedChildren1, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) layoutNode_foldedChildren1.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                setsemanticsinvalidatedui.getClass();
                setsemanticsinvalidatedui.IconCompatParcelizer(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        setsemanticsinvalidatedui.write(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            java.util.logging.Logger logger = setSemanticsInvalidatedui.read;
            i3 += 4;
        }
        setsemanticsinvalidatedui.RatingCompat(i3);
        while (i2 < list.size()) {
            setsemanticsinvalidatedui.MediaSessionCompatQueueItem(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void MediaMetadataCompat(int i, List list, LayoutNode_foldedChildren1 layoutNode_foldedChildren1, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) layoutNode_foldedChildren1.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                setsemanticsinvalidatedui.IconCompatParcelizer(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        setsemanticsinvalidatedui.write(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            java.util.logging.Logger logger = setSemanticsInvalidatedui.read;
            i3 += 4;
        }
        setsemanticsinvalidatedui.RatingCompat(i3);
        while (i2 < list.size()) {
            setsemanticsinvalidatedui.MediaSessionCompatQueueItem(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void MediaSessionCompatQueueItem(int i, List list, LayoutNode_foldedChildren1 layoutNode_foldedChildren1, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) layoutNode_foldedChildren1.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                setsemanticsinvalidatedui.write(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        setsemanticsinvalidatedui.write(i, 2);
        int iIconCompatParcelizer = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iIconCompatParcelizer += setSemanticsInvalidatedui.IconCompatParcelizer(((Long) list.get(i3)).longValue());
        }
        setsemanticsinvalidatedui.RatingCompat(iIconCompatParcelizer);
        while (i2 < list.size()) {
            setsemanticsinvalidatedui.serializer(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void MediaSessionCompatToken(int i, List list, LayoutNode_foldedChildren1 layoutNode_foldedChildren1, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) layoutNode_foldedChildren1.RemoteActionCompatParcelizer;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                setsemanticsinvalidatedui.write(i, 0);
                setsemanticsinvalidatedui.RatingCompat(iIntValue);
            }
            return;
        }
        setsemanticsinvalidatedui.write(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += setSemanticsInvalidatedui.read(((Integer) list.get(i4)).intValue());
        }
        setsemanticsinvalidatedui.RatingCompat(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            setsemanticsinvalidatedui.RatingCompat(((Integer) list.get(i5)).intValue());
        }
    }

    public static void ParcelableVolumeInfo(int i, List list, LayoutNode_foldedChildren1 layoutNode_foldedChildren1, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) layoutNode_foldedChildren1.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                setsemanticsinvalidatedui.write(i, (jLongValue << 1) ^ (jLongValue >> 63));
                i2++;
            }
            return;
        }
        setsemanticsinvalidatedui.write(i, 2);
        int iIconCompatParcelizer = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iIconCompatParcelizer += setSemanticsInvalidatedui.IconCompatParcelizer((jLongValue2 << 1) ^ (jLongValue2 >> 63));
        }
        setsemanticsinvalidatedui.RatingCompat(iIconCompatParcelizer);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            setsemanticsinvalidatedui.serializer((jLongValue3 << 1) ^ (jLongValue3 >> 63));
            i2++;
        }
    }

    public static void PlaybackStateCompat(int i, List list, LayoutNode_foldedChildren1 layoutNode_foldedChildren1, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) layoutNode_foldedChildren1.RemoteActionCompatParcelizer;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                setsemanticsinvalidatedui.write(i, 0);
                setsemanticsinvalidatedui.RatingCompat((iIntValue << 1) ^ (iIntValue >> 31));
            }
            return;
        }
        setsemanticsinvalidatedui.write(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            i3 += setSemanticsInvalidatedui.read((iIntValue2 << 1) ^ (iIntValue2 >> 31));
        }
        setsemanticsinvalidatedui.RatingCompat(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            int iIntValue3 = ((Integer) list.get(i5)).intValue();
            setsemanticsinvalidatedui.RatingCompat((iIntValue3 << 1) ^ (iIntValue3 >> 31));
        }
    }

    public static void PlaybackStateCompatCustomAction(int i, List list, LayoutNode_foldedChildren1 layoutNode_foldedChildren1, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) layoutNode_foldedChildren1.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                setsemanticsinvalidatedui.write(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        setsemanticsinvalidatedui.write(i, 2);
        int iIconCompatParcelizer = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iIconCompatParcelizer += setSemanticsInvalidatedui.IconCompatParcelizer(((Long) list.get(i3)).longValue());
        }
        setsemanticsinvalidatedui.RatingCompat(iIconCompatParcelizer);
        while (i2 < list.size()) {
            setsemanticsinvalidatedui.serializer(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void RatingCompat(int i, List list, LayoutNode_foldedChildren1 layoutNode_foldedChildren1, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) layoutNode_foldedChildren1.RemoteActionCompatParcelizer;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                setsemanticsinvalidatedui.write(i, 0);
                setsemanticsinvalidatedui.MediaDescriptionCompat(iIntValue);
            }
            return;
        }
        setsemanticsinvalidatedui.write(i, 2);
        int iIconCompatParcelizer = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iIconCompatParcelizer += setSemanticsInvalidatedui.IconCompatParcelizer(((Integer) list.get(i3)).intValue());
        }
        setsemanticsinvalidatedui.RatingCompat(iIconCompatParcelizer);
        for (int i4 = 0; i4 < list.size(); i4++) {
            setsemanticsinvalidatedui.MediaDescriptionCompat(((Integer) list.get(i4)).intValue());
        }
    }

    public static void RemoteActionCompatParcelizer(int i, List list, LayoutNode_foldedChildren1 layoutNode_foldedChildren1, getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacement) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        layoutNode_foldedChildren1.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            layoutNode_foldedChildren1.IconCompatParcelizer(i, list.get(i2), getcoordinatesaccessedduringplacement);
        }
    }

    public static void RemoteActionCompatParcelizer(int i, List list, LayoutNode_foldedChildren1 layoutNode_foldedChildren1, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) layoutNode_foldedChildren1.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                setsemanticsinvalidatedui.serializer(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        setsemanticsinvalidatedui.write(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            java.util.logging.Logger logger = setSemanticsInvalidatedui.read;
            i3 += 8;
        }
        setsemanticsinvalidatedui.RatingCompat(i3);
        while (i2 < list.size()) {
            setsemanticsinvalidatedui.write(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void read(int i, List list, LayoutNode_foldedChildren1 layoutNode_foldedChildren1, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) layoutNode_foldedChildren1.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                setsemanticsinvalidatedui.IconCompatParcelizer(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        setsemanticsinvalidatedui.write(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            java.util.logging.Logger logger = setSemanticsInvalidatedui.read;
            i3 += 4;
        }
        setsemanticsinvalidatedui.RatingCompat(i3);
        while (i2 < list.size()) {
            setsemanticsinvalidatedui.MediaSessionCompatQueueItem(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void serializer(int i, List list, LayoutNode_foldedChildren1 layoutNode_foldedChildren1, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) layoutNode_foldedChildren1.RemoteActionCompatParcelizer;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                setsemanticsinvalidatedui.write(i, 0);
                setsemanticsinvalidatedui.MediaDescriptionCompat(iIntValue);
            }
            return;
        }
        setsemanticsinvalidatedui.write(i, 2);
        int iIconCompatParcelizer = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iIconCompatParcelizer += setSemanticsInvalidatedui.IconCompatParcelizer(((Integer) list.get(i3)).intValue());
        }
        setsemanticsinvalidatedui.RatingCompat(iIconCompatParcelizer);
        for (int i4 = 0; i4 < list.size(); i4++) {
            setsemanticsinvalidatedui.MediaDescriptionCompat(((Integer) list.get(i4)).intValue());
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
    public static void serializer(com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema unknownFieldSchema, Object obj, Object obj2) {
        ((getHeightui) unknownFieldSchema).getClass();
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        getCoordinatesAccessedDuringModifierPlacement getcoordinatesaccessedduringmodifierplacement = generatedMessageLite.IconCompatParcelizer;
        getCoordinatesAccessedDuringModifierPlacement getcoordinatesaccessedduringmodifierplacement2 = ((GeneratedMessageLite) obj2).IconCompatParcelizer;
        getCoordinatesAccessedDuringModifierPlacement getcoordinatesaccessedduringmodifierplacement3 = getCoordinatesAccessedDuringModifierPlacement.write;
        if (!getcoordinatesaccessedduringmodifierplacement3.equals(getcoordinatesaccessedduringmodifierplacement2)) {
            if (getcoordinatesaccessedduringmodifierplacement3.equals(getcoordinatesaccessedduringmodifierplacement)) {
                int i = getcoordinatesaccessedduringmodifierplacement.read + getcoordinatesaccessedduringmodifierplacement2.read;
                int[] iArrCopyOf = Arrays.copyOf(getcoordinatesaccessedduringmodifierplacement.MediaMetadataCompat, i);
                System.arraycopy(getcoordinatesaccessedduringmodifierplacement2.MediaMetadataCompat, 0, iArrCopyOf, getcoordinatesaccessedduringmodifierplacement.read, getcoordinatesaccessedduringmodifierplacement2.read);
                Object[] objArrCopyOf = Arrays.copyOf(getcoordinatesaccessedduringmodifierplacement.RemoteActionCompatParcelizer, i);
                System.arraycopy(getcoordinatesaccessedduringmodifierplacement2.RemoteActionCompatParcelizer, 0, objArrCopyOf, getcoordinatesaccessedduringmodifierplacement.read, getcoordinatesaccessedduringmodifierplacement2.read);
                getcoordinatesaccessedduringmodifierplacement = new getCoordinatesAccessedDuringModifierPlacement(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                getcoordinatesaccessedduringmodifierplacement.getClass();
                if (!getcoordinatesaccessedduringmodifierplacement2.equals(getcoordinatesaccessedduringmodifierplacement3)) {
                    if (!getcoordinatesaccessedduringmodifierplacement.serializer) {
                        getAlignmentLinesMap.write();
                        return;
                    }
                    int i2 = getcoordinatesaccessedduringmodifierplacement.read + getcoordinatesaccessedduringmodifierplacement2.read;
                    getcoordinatesaccessedduringmodifierplacement.IconCompatParcelizer(i2);
                    System.arraycopy(getcoordinatesaccessedduringmodifierplacement2.MediaMetadataCompat, 0, getcoordinatesaccessedduringmodifierplacement.MediaMetadataCompat, getcoordinatesaccessedduringmodifierplacement.read, getcoordinatesaccessedduringmodifierplacement2.read);
                    System.arraycopy(getcoordinatesaccessedduringmodifierplacement2.RemoteActionCompatParcelizer, 0, getcoordinatesaccessedduringmodifierplacement.RemoteActionCompatParcelizer, getcoordinatesaccessedduringmodifierplacement.read, getcoordinatesaccessedduringmodifierplacement2.read);
                    getcoordinatesaccessedduringmodifierplacement.read = i2;
                }
            }
        }
        generatedMessageLite.IconCompatParcelizer = getcoordinatesaccessedduringmodifierplacement;
    }

    public static void write(int i, List list, LayoutNode_foldedChildren1 layoutNode_foldedChildren1) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        layoutNode_foldedChildren1.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) layoutNode_foldedChildren1.RemoteActionCompatParcelizer;
            setOnAttachui setonattachui = (setOnAttachui) list.get(i2);
            setsemanticsinvalidatedui.write(i, 2);
            setsemanticsinvalidatedui.RatingCompat(setonattachui.IconCompatParcelizer());
            setOnDetachui setondetachui = (setOnDetachui) setonattachui;
            setsemanticsinvalidatedui.read(setondetachui.RatingCompat, setondetachui.write(), setondetachui.IconCompatParcelizer());
        }
    }

    public static void write(int i, List list, LayoutNode_foldedChildren1 layoutNode_foldedChildren1, getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacement) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        layoutNode_foldedChildren1.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            layoutNode_foldedChildren1.read(i, list.get(i2), getcoordinatesaccessedduringplacement);
        }
    }

    public static void write(int i, List list, LayoutNode_foldedChildren1 layoutNode_foldedChildren1, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) layoutNode_foldedChildren1.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                setsemanticsinvalidatedui.getClass();
                setsemanticsinvalidatedui.serializer(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        setsemanticsinvalidatedui.write(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            java.util.logging.Logger logger = setSemanticsInvalidatedui.read;
            i3 += 8;
        }
        setsemanticsinvalidatedui.RatingCompat(i3);
        while (i2 < list.size()) {
            setsemanticsinvalidatedui.write(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema RemoteActionCompatParcelizer(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static Object serializer(Object obj, int i, List list, getDoubleTapTimeoutMillis getdoubletaptimeoutmillis, Object obj2, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema unknownFieldSchema) {
        if (getdoubletaptimeoutmillis == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int iIntValue = num.intValue();
                if (getdoubletaptimeoutmillis.read(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = IconCompatParcelizer(obj, i, iIntValue, obj2, unknownFieldSchema);
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
            if (!getdoubletaptimeoutmillis.read(iIntValue2)) {
                obj2 = IconCompatParcelizer(obj, i, iIntValue2, obj2, unknownFieldSchema);
                it.remove();
            }
        }
        return obj2;
    }

    public static boolean IconCompatParcelizer(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int IconCompatParcelizer(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return setSemanticsInvalidatedui.RemoteActionCompatParcelizer(i) * size;
    }

    public static int IconCompatParcelizer(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof getLongPressTimeoutMillis)) {
            int iIconCompatParcelizer = 0;
            while (i < size) {
                iIconCompatParcelizer += setSemanticsInvalidatedui.IconCompatParcelizer(((Integer) list.get(i)).intValue());
                i++;
            }
            return iIconCompatParcelizer;
        }
        getLongPressTimeoutMillis getlongpresstimeoutmillis = (getLongPressTimeoutMillis) list;
        int iIconCompatParcelizer2 = 0;
        while (i < size) {
            iIconCompatParcelizer2 += setSemanticsInvalidatedui.IconCompatParcelizer(getlongpresstimeoutmillis.IconCompatParcelizer(i));
            i++;
        }
        return iIconCompatParcelizer2;
    }

    public static int MediaBrowserCompatMediaItem(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iSerializer = setSemanticsInvalidatedui.serializer(i) * size;
        if (!(list instanceof LayoutNodeNoIntrinsicsMeasurePolicy)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof setOnAttachui) {
                    int iIconCompatParcelizer = ((setOnAttachui) obj).IconCompatParcelizer();
                    iSerializer = setSemanticsInvalidatedui.read(iIconCompatParcelizer) + iIconCompatParcelizer + iSerializer;
                } else {
                    iSerializer = setSemanticsInvalidatedui.serializer((String) obj) + iSerializer;
                }
                i2++;
            }
            return iSerializer;
        }
        LayoutNodeNoIntrinsicsMeasurePolicy layoutNodeNoIntrinsicsMeasurePolicy = (LayoutNodeNoIntrinsicsMeasurePolicy) list;
        while (i2 < size) {
            Object objRemoteActionCompatParcelizer = layoutNodeNoIntrinsicsMeasurePolicy.RemoteActionCompatParcelizer(i2);
            if (objRemoteActionCompatParcelizer instanceof setOnAttachui) {
                int iIconCompatParcelizer2 = ((setOnAttachui) objRemoteActionCompatParcelizer).IconCompatParcelizer();
                iSerializer = setSemanticsInvalidatedui.read(iIconCompatParcelizer2) + iIconCompatParcelizer2 + iSerializer;
            } else {
                iSerializer = setSemanticsInvalidatedui.serializer((String) objRemoteActionCompatParcelizer) + iSerializer;
            }
            i2++;
        }
        return iSerializer;
    }

    public static int MediaBrowserCompatMediaItem(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof getLongPressTimeoutMillis)) {
            int i2 = 0;
            while (i < size) {
                i2 += setSemanticsInvalidatedui.read(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        getLongPressTimeoutMillis getlongpresstimeoutmillis = (getLongPressTimeoutMillis) list;
        int i3 = 0;
        while (i < size) {
            i3 += setSemanticsInvalidatedui.read(getlongpresstimeoutmillis.IconCompatParcelizer(i));
            i++;
        }
        return i3;
    }

    public static int MediaDescriptionCompat(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (setSemanticsInvalidatedui.serializer(i) * list.size()) + RemoteActionCompatParcelizer(list);
    }

    public static int MediaDescriptionCompat(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof getLongPressTimeoutMillis)) {
            int i2 = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                i2 += setSemanticsInvalidatedui.read((iIntValue << 1) ^ (iIntValue >> 31));
                i++;
            }
            return i2;
        }
        getLongPressTimeoutMillis getlongpresstimeoutmillis = (getLongPressTimeoutMillis) list;
        int i3 = 0;
        while (i < size) {
            int iIconCompatParcelizer = getlongpresstimeoutmillis.IconCompatParcelizer(i);
            i3 += setSemanticsInvalidatedui.read((iIconCompatParcelizer << 1) ^ (iIconCompatParcelizer >> 31));
            i++;
        }
        return i3;
    }

    public static int MediaMetadataCompat(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (setSemanticsInvalidatedui.serializer(i) * size) + RatingCompat(list);
    }

    public static int MediaSessionCompatQueueItem(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (setSemanticsInvalidatedui.serializer(i) * size) + MediaDescriptionCompat(list);
    }

    public static int MediaSessionCompatQueueItem(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof accessgetDrawNodep)) {
            int iIconCompatParcelizer = 0;
            while (i < size) {
                iIconCompatParcelizer += setSemanticsInvalidatedui.IconCompatParcelizer(((Long) list.get(i)).longValue());
                i++;
            }
            return iIconCompatParcelizer;
        }
        accessgetDrawNodep accessgetdrawnodep = (accessgetDrawNodep) list;
        int iIconCompatParcelizer2 = 0;
        while (i < size) {
            iIconCompatParcelizer2 += setSemanticsInvalidatedui.IconCompatParcelizer(accessgetdrawnodep.write(i));
            i++;
        }
        return iIconCompatParcelizer2;
    }

    public static int MediaSessionCompatResultReceiverWrapper(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (setSemanticsInvalidatedui.serializer(i) * size) + MediaSessionCompatQueueItem(list);
    }

    public static int RatingCompat(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (setSemanticsInvalidatedui.serializer(i) * size) + MediaBrowserCompatMediaItem(list);
    }

    public static int RatingCompat(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof accessgetDrawNodep)) {
            int iIconCompatParcelizer = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iIconCompatParcelizer += setSemanticsInvalidatedui.IconCompatParcelizer((jLongValue << 1) ^ (jLongValue >> 63));
                i++;
            }
            return iIconCompatParcelizer;
        }
        accessgetDrawNodep accessgetdrawnodep = (accessgetDrawNodep) list;
        int iIconCompatParcelizer2 = 0;
        while (i < size) {
            long jWrite = accessgetdrawnodep.write(i);
            iIconCompatParcelizer2 += setSemanticsInvalidatedui.IconCompatParcelizer((jWrite << 1) ^ (jWrite >> 63));
            i++;
        }
        return iIconCompatParcelizer2;
    }

    public static int RemoteActionCompatParcelizer(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (setSemanticsInvalidatedui.serializer(i) * size) + serializer(list);
    }

    public static int RemoteActionCompatParcelizer(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof accessgetDrawNodep)) {
            int iIconCompatParcelizer = 0;
            while (i < size) {
                iIconCompatParcelizer += setSemanticsInvalidatedui.IconCompatParcelizer(((Long) list.get(i)).longValue());
                i++;
            }
            return iIconCompatParcelizer;
        }
        accessgetDrawNodep accessgetdrawnodep = (accessgetDrawNodep) list;
        int iIconCompatParcelizer2 = 0;
        while (i < size) {
            iIconCompatParcelizer2 += setSemanticsInvalidatedui.IconCompatParcelizer(accessgetdrawnodep.write(i));
            i++;
        }
        return iIconCompatParcelizer2;
    }

    public static int read(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (setSemanticsInvalidatedui.serializer(i) * size) + IconCompatParcelizer(list);
    }

    public static int serializer(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iSerializer = setSemanticsInvalidatedui.serializer(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iSerializer += setSemanticsInvalidatedui.write((setOnAttachui) list.get(i2));
        }
        return iSerializer;
    }

    public static int serializer(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof getLongPressTimeoutMillis)) {
            int iIconCompatParcelizer = 0;
            while (i < size) {
                iIconCompatParcelizer += setSemanticsInvalidatedui.IconCompatParcelizer(((Integer) list.get(i)).intValue());
                i++;
            }
            return iIconCompatParcelizer;
        }
        getLongPressTimeoutMillis getlongpresstimeoutmillis = (getLongPressTimeoutMillis) list;
        int iIconCompatParcelizer2 = 0;
        while (i < size) {
            iIconCompatParcelizer2 += setSemanticsInvalidatedui.IconCompatParcelizer(getlongpresstimeoutmillis.IconCompatParcelizer(i));
            i++;
        }
        return iIconCompatParcelizer2;
    }

    public static int write(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return setSemanticsInvalidatedui.write(i) * size;
    }

    public static int write(int i, List list, getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacement) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iSerializer = setSemanticsInvalidatedui.serializer(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int iWrite = ((setInteropViewFactoryHolderui) list.get(i2)).write(getcoordinatesaccessedduringplacement);
            iSerializer += setSemanticsInvalidatedui.read(iWrite) + iWrite;
        }
        return iSerializer;
    }
}
