package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class getDualLoadedSignificandannotations {
    public static final androidx.datastore.preferences.protobuf.UnknownFieldSchema RemoteActionCompatParcelizer;
    public static final getDualUnsignedFloatMaskannotations read;
    public static final androidx.datastore.preferences.protobuf.UnknownFieldSchema serializer;
    public static final Class write;

    public static int read(List list) {
        return list.size() * 4;
    }

    public static int write(List list) {
        return list.size() * 8;
    }

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        write = cls;
        RemoteActionCompatParcelizer = serializer(false);
        serializer = serializer(true);
        read = new getDualUnsignedFloatMaskannotations();
    }

    public static void IconCompatParcelizer(int i, List list, copyOHQCggkdefault copyohqcggkdefault) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        RequestChildFocusKt requestChildFocusKt = (RequestChildFocusKt) copyohqcggkdefault.read;
        int i2 = 0;
        if (!(list instanceof twoDimensionalFocusSearchsMXa3k8)) {
            while (i2 < list.size()) {
                requestChildFocusKt.write(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        twoDimensionalFocusSearchsMXa3k8 twodimensionalfocussearchsmxa3k8 = (twoDimensionalFocusSearchsMXa3k8) list;
        while (i2 < list.size()) {
            Object objIconCompatParcelizer = twodimensionalfocussearchsmxa3k8.IconCompatParcelizer(i2);
            if (objIconCompatParcelizer instanceof String) {
                requestChildFocusKt.write(i, (String) objIconCompatParcelizer);
            } else {
                requestChildFocusKt.serializer(i, (moveFocusInChildren3ESFkO8) objIconCompatParcelizer);
            }
            i2++;
        }
    }

    public static void IconCompatParcelizer(int i, List list, copyOHQCggkdefault copyohqcggkdefault, toStringAsFixed tostringasfixed) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        copyohqcggkdefault.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            copyohqcggkdefault.serializer(i, list.get(i2), tostringasfixed);
        }
    }

    public static void IconCompatParcelizer(int i, List list, copyOHQCggkdefault copyohqcggkdefault, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        RequestChildFocusKt requestChildFocusKt = (RequestChildFocusKt) copyohqcggkdefault.read;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                requestChildFocusKt.getClass();
                requestChildFocusKt.RemoteActionCompatParcelizer(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        requestChildFocusKt.RemoteActionCompatParcelizer(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            java.util.logging.Logger logger = RequestChildFocusKt.IconCompatParcelizer;
            i3 += 8;
        }
        requestChildFocusKt.ParcelableVolumeInfo(i3);
        while (i2 < list.size()) {
            requestChildFocusKt.serializer(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void IconCompatParcelizer(androidx.datastore.preferences.protobuf.UnknownFieldSchema unknownFieldSchema, Object obj, Object obj2) {
        ((getDualUnsignedFloatMaskannotations) unknownFieldSchema).getClass();
        isBetterCandidate_I7lrPNgminorAxisDistance isbettercandidate_i7lrpngminoraxisdistance = (isBetterCandidate_I7lrPNgminorAxisDistance) obj;
        getUnspecifiedPackedFloatsannotations getunspecifiedpackedfloatsannotations = isbettercandidate_i7lrpngminoraxisdistance.serializer;
        getUnspecifiedPackedFloatsannotations getunspecifiedpackedfloatsannotations2 = ((isBetterCandidate_I7lrPNgminorAxisDistance) obj2).serializer;
        if (!getunspecifiedpackedfloatsannotations2.equals(getUnspecifiedPackedFloatsannotations.RemoteActionCompatParcelizer)) {
            int i = getunspecifiedpackedfloatsannotations.serializer + getunspecifiedpackedfloatsannotations2.serializer;
            int[] iArrCopyOf = Arrays.copyOf(getunspecifiedpackedfloatsannotations.RatingCompat, i);
            System.arraycopy(getunspecifiedpackedfloatsannotations2.RatingCompat, 0, iArrCopyOf, getunspecifiedpackedfloatsannotations.serializer, getunspecifiedpackedfloatsannotations2.serializer);
            Object[] objArrCopyOf = Arrays.copyOf(getunspecifiedpackedfloatsannotations.read, i);
            System.arraycopy(getunspecifiedpackedfloatsannotations2.read, 0, objArrCopyOf, getunspecifiedpackedfloatsannotations.serializer, getunspecifiedpackedfloatsannotations2.serializer);
            getunspecifiedpackedfloatsannotations = new getUnspecifiedPackedFloatsannotations(i, iArrCopyOf, objArrCopyOf, true);
        }
        isbettercandidate_i7lrpngminoraxisdistance.serializer = getunspecifiedpackedfloatsannotations;
    }

    public static void MediaBrowserCompatMediaItem(int i, List list, copyOHQCggkdefault copyohqcggkdefault, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        RequestChildFocusKt requestChildFocusKt = (RequestChildFocusKt) copyohqcggkdefault.read;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                requestChildFocusKt.write(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        requestChildFocusKt.RemoteActionCompatParcelizer(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            java.util.logging.Logger logger = RequestChildFocusKt.IconCompatParcelizer;
            i3 += 4;
        }
        requestChildFocusKt.ParcelableVolumeInfo(i3);
        while (i2 < list.size()) {
            requestChildFocusKt.RatingCompat(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void MediaDescriptionCompat(int i, List list, copyOHQCggkdefault copyohqcggkdefault, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        RequestChildFocusKt requestChildFocusKt = (RequestChildFocusKt) copyohqcggkdefault.read;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                requestChildFocusKt.read(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        requestChildFocusKt.RemoteActionCompatParcelizer(i, 2);
        int iIconCompatParcelizer = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iIconCompatParcelizer += RequestChildFocusKt.IconCompatParcelizer(((Long) list.get(i3)).longValue());
        }
        requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer);
        while (i2 < list.size()) {
            requestChildFocusKt.RemoteActionCompatParcelizer(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void MediaMetadataCompat(int i, List list, copyOHQCggkdefault copyohqcggkdefault, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        RequestChildFocusKt requestChildFocusKt = (RequestChildFocusKt) copyohqcggkdefault.read;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                requestChildFocusKt.read(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        requestChildFocusKt.RemoteActionCompatParcelizer(i, 2);
        int iRemoteActionCompatParcelizer = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iRemoteActionCompatParcelizer += RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) list.get(i3)).intValue());
        }
        requestChildFocusKt.ParcelableVolumeInfo(iRemoteActionCompatParcelizer);
        while (i2 < list.size()) {
            requestChildFocusKt.MediaBrowserCompatMediaItem(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void MediaSessionCompatQueueItem(int i, List list, copyOHQCggkdefault copyohqcggkdefault, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        RequestChildFocusKt requestChildFocusKt = (RequestChildFocusKt) copyohqcggkdefault.read;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                requestChildFocusKt.RemoteActionCompatParcelizer(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        requestChildFocusKt.RemoteActionCompatParcelizer(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            java.util.logging.Logger logger = RequestChildFocusKt.IconCompatParcelizer;
            i3 += 8;
        }
        requestChildFocusKt.ParcelableVolumeInfo(i3);
        while (i2 < list.size()) {
            requestChildFocusKt.serializer(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void MediaSessionCompatResultReceiverWrapper(int i, List list, copyOHQCggkdefault copyohqcggkdefault, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        RequestChildFocusKt requestChildFocusKt = (RequestChildFocusKt) copyohqcggkdefault.read;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                requestChildFocusKt.read(i, (jLongValue << 1) ^ (jLongValue >> 63));
                i2++;
            }
            return;
        }
        requestChildFocusKt.RemoteActionCompatParcelizer(i, 2);
        int iIconCompatParcelizer = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iIconCompatParcelizer += RequestChildFocusKt.IconCompatParcelizer((jLongValue2 << 1) ^ (jLongValue2 >> 63));
        }
        requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            requestChildFocusKt.RemoteActionCompatParcelizer((jLongValue3 << 1) ^ (jLongValue3 >> 63));
            i2++;
        }
    }

    public static void MediaSessionCompatToken(int i, List list, copyOHQCggkdefault copyohqcggkdefault, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        RequestChildFocusKt requestChildFocusKt = (RequestChildFocusKt) copyohqcggkdefault.read;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                requestChildFocusKt.serializer(i, (iIntValue << 1) ^ (iIntValue >> 31));
                i2++;
            }
            return;
        }
        requestChildFocusKt.RemoteActionCompatParcelizer(i, 2);
        int iWrite = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iWrite += RequestChildFocusKt.write((iIntValue2 << 1) ^ (iIntValue2 >> 31));
        }
        requestChildFocusKt.ParcelableVolumeInfo(iWrite);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            requestChildFocusKt.ParcelableVolumeInfo((iIntValue3 << 1) ^ (iIntValue3 >> 31));
            i2++;
        }
    }

    public static void PlaybackStateCompat(int i, List list, copyOHQCggkdefault copyohqcggkdefault, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        RequestChildFocusKt requestChildFocusKt = (RequestChildFocusKt) copyohqcggkdefault.read;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                requestChildFocusKt.read(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        requestChildFocusKt.RemoteActionCompatParcelizer(i, 2);
        int iIconCompatParcelizer = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iIconCompatParcelizer += RequestChildFocusKt.IconCompatParcelizer(((Long) list.get(i3)).longValue());
        }
        requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer);
        while (i2 < list.size()) {
            requestChildFocusKt.RemoteActionCompatParcelizer(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void PlaybackStateCompatCustomAction(int i, List list, copyOHQCggkdefault copyohqcggkdefault, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        RequestChildFocusKt requestChildFocusKt = (RequestChildFocusKt) copyohqcggkdefault.read;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                requestChildFocusKt.serializer(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        requestChildFocusKt.RemoteActionCompatParcelizer(i, 2);
        int iWrite = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iWrite += RequestChildFocusKt.write(((Integer) list.get(i3)).intValue());
        }
        requestChildFocusKt.ParcelableVolumeInfo(iWrite);
        while (i2 < list.size()) {
            requestChildFocusKt.ParcelableVolumeInfo(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void RatingCompat(int i, List list, copyOHQCggkdefault copyohqcggkdefault, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        RequestChildFocusKt requestChildFocusKt = (RequestChildFocusKt) copyohqcggkdefault.read;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                requestChildFocusKt.getClass();
                requestChildFocusKt.write(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        requestChildFocusKt.RemoteActionCompatParcelizer(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            java.util.logging.Logger logger = RequestChildFocusKt.IconCompatParcelizer;
            i3 += 4;
        }
        requestChildFocusKt.ParcelableVolumeInfo(i3);
        while (i2 < list.size()) {
            requestChildFocusKt.RatingCompat(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void RemoteActionCompatParcelizer(int i, List list, copyOHQCggkdefault copyohqcggkdefault, toStringAsFixed tostringasfixed) {
        if (list == null || list.isEmpty()) {
            return;
        }
        copyohqcggkdefault.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            copyohqcggkdefault.RemoteActionCompatParcelizer(i, list.get(i2), tostringasfixed);
        }
    }

    public static void RemoteActionCompatParcelizer(int i, List list, copyOHQCggkdefault copyohqcggkdefault, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        RequestChildFocusKt requestChildFocusKt = (RequestChildFocusKt) copyohqcggkdefault.read;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                requestChildFocusKt.IconCompatParcelizer(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        requestChildFocusKt.RemoteActionCompatParcelizer(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            java.util.logging.Logger logger = RequestChildFocusKt.IconCompatParcelizer;
            i3++;
        }
        requestChildFocusKt.ParcelableVolumeInfo(i3);
        while (i2 < list.size()) {
            requestChildFocusKt.read(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void read(int i, List list, copyOHQCggkdefault copyohqcggkdefault, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        RequestChildFocusKt requestChildFocusKt = (RequestChildFocusKt) copyohqcggkdefault.read;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                requestChildFocusKt.read(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        requestChildFocusKt.RemoteActionCompatParcelizer(i, 2);
        int iRemoteActionCompatParcelizer = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iRemoteActionCompatParcelizer += RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) list.get(i3)).intValue());
        }
        requestChildFocusKt.ParcelableVolumeInfo(iRemoteActionCompatParcelizer);
        while (i2 < list.size()) {
            requestChildFocusKt.MediaBrowserCompatMediaItem(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void serializer(int i, List list, copyOHQCggkdefault copyohqcggkdefault) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        copyohqcggkdefault.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((RequestChildFocusKt) copyohqcggkdefault.read).serializer(i, (moveFocusInChildren3ESFkO8) list.get(i2));
        }
    }

    public static void serializer(int i, List list, copyOHQCggkdefault copyohqcggkdefault, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        RequestChildFocusKt requestChildFocusKt = (RequestChildFocusKt) copyohqcggkdefault.read;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                requestChildFocusKt.RemoteActionCompatParcelizer(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        requestChildFocusKt.RemoteActionCompatParcelizer(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            java.util.logging.Logger logger = RequestChildFocusKt.IconCompatParcelizer;
            i3 += 8;
        }
        requestChildFocusKt.ParcelableVolumeInfo(i3);
        while (i2 < list.size()) {
            requestChildFocusKt.serializer(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void write(int i, List list, copyOHQCggkdefault copyohqcggkdefault, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        RequestChildFocusKt requestChildFocusKt = (RequestChildFocusKt) copyohqcggkdefault.read;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                requestChildFocusKt.write(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        requestChildFocusKt.RemoteActionCompatParcelizer(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            java.util.logging.Logger logger = RequestChildFocusKt.IconCompatParcelizer;
            i3 += 4;
        }
        requestChildFocusKt.ParcelableVolumeInfo(i3);
        while (i2 < list.size()) {
            requestChildFocusKt.RatingCompat(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static androidx.datastore.preferences.protobuf.UnknownFieldSchema serializer(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (androidx.datastore.preferences.protobuf.UnknownFieldSchema) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static boolean write(Object obj, Object obj2) {
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
        return (RequestChildFocusKt.serializer(i) * size) + serializer(list);
    }

    public static int IconCompatParcelizer(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof isBetterCandidate_I7lrPNgmajorAxisDistance) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iRemoteActionCompatParcelizer = 0;
        for (int i = 0; i < size; i++) {
            iRemoteActionCompatParcelizer += RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) list.get(i)).intValue());
        }
        return iRemoteActionCompatParcelizer;
    }

    public static int MediaBrowserCompatMediaItem(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (RequestChildFocusKt.serializer(i) * size) + MediaDescriptionCompat(list);
    }

    public static int MediaBrowserCompatMediaItem(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof copyOHQCggk) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iIconCompatParcelizer = 0;
        for (int i = 0; i < size; i++) {
            iIconCompatParcelizer += RequestChildFocusKt.IconCompatParcelizer(((Long) list.get(i)).longValue());
        }
        return iIconCompatParcelizer;
    }

    public static int MediaDescriptionCompat(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (RequestChildFocusKt.serializer(i) * size) + MediaSessionCompatQueueItem(list);
    }

    public static int MediaDescriptionCompat(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof copyOHQCggk)) {
                int iIconCompatParcelizer = 0;
                for (int i = 0; i < size; i++) {
                    long jLongValue = ((Long) list.get(i)).longValue();
                    iIconCompatParcelizer += RequestChildFocusKt.IconCompatParcelizer((jLongValue << 1) ^ (jLongValue >> 63));
                }
                return iIconCompatParcelizer;
            }
            m1$$ExternalSyntheticOutline0.m(list);
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int MediaMetadataCompat(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iSerializer = RequestChildFocusKt.serializer(i) * size;
        if (!(list instanceof twoDimensionalFocusSearchsMXa3k8)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof moveFocusInChildren3ESFkO8) {
                    int iWrite = ((moveFocusInChildren3ESFkO8) obj).write();
                    iSerializer = RequestChildFocusKt.write(iWrite) + iWrite + iSerializer;
                } else {
                    iSerializer = RequestChildFocusKt.RemoteActionCompatParcelizer((String) obj) + iSerializer;
                }
                i2++;
            }
            return iSerializer;
        }
        twoDimensionalFocusSearchsMXa3k8 twodimensionalfocussearchsmxa3k8 = (twoDimensionalFocusSearchsMXa3k8) list;
        while (i2 < size) {
            Object objIconCompatParcelizer = twodimensionalfocussearchsmxa3k8.IconCompatParcelizer(i2);
            if (objIconCompatParcelizer instanceof moveFocusInChildren3ESFkO8) {
                int iWrite2 = ((moveFocusInChildren3ESFkO8) objIconCompatParcelizer).write();
                iSerializer = RequestChildFocusKt.write(iWrite2) + iWrite2 + iSerializer;
            } else {
                iSerializer = RequestChildFocusKt.RemoteActionCompatParcelizer((String) objIconCompatParcelizer) + iSerializer;
            }
            i2++;
        }
        return iSerializer;
    }

    public static int MediaSessionCompatQueueItem(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (RequestChildFocusKt.serializer(i) * size) + RatingCompat(list);
    }

    public static int MediaSessionCompatQueueItem(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof isBetterCandidate_I7lrPNgmajorAxisDistance)) {
                int iWrite = 0;
                for (int i = 0; i < size; i++) {
                    int iIntValue = ((Integer) list.get(i)).intValue();
                    iWrite += RequestChildFocusKt.write((iIntValue << 1) ^ (iIntValue >> 31));
                }
                return iWrite;
            }
            m1$$ExternalSyntheticOutline0.m(list);
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int ParcelableVolumeInfo(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (RequestChildFocusKt.serializer(i) * size) + MediaBrowserCompatMediaItem(list);
    }

    public static int RatingCompat(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (RequestChildFocusKt.serializer(i) * list.size()) + RemoteActionCompatParcelizer(list);
    }

    public static int RatingCompat(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof isBetterCandidate_I7lrPNgmajorAxisDistance) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iWrite = 0;
        for (int i = 0; i < size; i++) {
            iWrite += RequestChildFocusKt.write(((Integer) list.get(i)).intValue());
        }
        return iWrite;
    }

    public static int RemoteActionCompatParcelizer(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iSerializer = RequestChildFocusKt.serializer(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iSerializer += RequestChildFocusKt.write((moveFocusInChildren3ESFkO8) list.get(i2));
        }
        return iSerializer;
    }

    public static int RemoteActionCompatParcelizer(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof copyOHQCggk) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iIconCompatParcelizer = 0;
        for (int i = 0; i < size; i++) {
            iIconCompatParcelizer += RequestChildFocusKt.IconCompatParcelizer(((Long) list.get(i)).longValue());
        }
        return iIconCompatParcelizer;
    }

    public static int read(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return RequestChildFocusKt.read(i) * size;
    }

    public static int serializer(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (RequestChildFocusKt.serializer(i) * size) + IconCompatParcelizer(list);
    }

    public static int serializer(int i, List list, toStringAsFixed tostringasfixed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iSerializer = RequestChildFocusKt.serializer(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int iRemoteActionCompatParcelizer = ((PlatformFocusOwner) list.get(i2)).RemoteActionCompatParcelizer(tostringasfixed);
            iSerializer += RequestChildFocusKt.write(iRemoteActionCompatParcelizer) + iRemoteActionCompatParcelizer;
        }
        return iSerializer;
    }

    public static int serializer(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof isBetterCandidate_I7lrPNgmajorAxisDistance) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iRemoteActionCompatParcelizer = 0;
        for (int i = 0; i < size; i++) {
            iRemoteActionCompatParcelizer += RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) list.get(i)).intValue());
        }
        return iRemoteActionCompatParcelizer;
    }

    public static int write(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return RequestChildFocusKt.IconCompatParcelizer(i) * size;
    }
}
