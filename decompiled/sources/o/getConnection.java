package o;

import com.google.android.gms.internal.measurement.zzll;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getConnection {
    public static final onInterceptKeyBeforeSoftKeyboard write;

    public static void IconCompatParcelizer(int i, List list, getZenkakuHankaruEK5gGoQ getzenkakuhankaruek5ggoq, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        KeyInputModifierKt keyInputModifierKt = (KeyInputModifierKt) getzenkakuhankaruek5ggoq.write;
        int i2 = 0;
        if (!(list instanceof dispatchPostScrollDzOQY0M)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    keyInputModifierKt.write(i, (jLongValue + jLongValue) ^ (jLongValue >> 63));
                    i2++;
                }
                return;
            }
            keyInputModifierKt.read(i, 2);
            int iIconCompatParcelizer = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iIconCompatParcelizer += KeyInputModifierKt.IconCompatParcelizer((jLongValue2 + jLongValue2) ^ (jLongValue2 >> 63));
            }
            keyInputModifierKt.serializer(iIconCompatParcelizer);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                keyInputModifierKt.read((jLongValue3 + jLongValue3) ^ (jLongValue3 >> 63));
                i2++;
            }
            return;
        }
        dispatchPostScrollDzOQY0M dispatchpostscrolldzoqy0m = (dispatchPostScrollDzOQY0M) list;
        if (!z) {
            while (i2 < dispatchpostscrolldzoqy0m.IconCompatParcelizer) {
                long j = dispatchpostscrolldzoqy0m.read(i2);
                keyInputModifierKt.write(i, (j + j) ^ (j >> 63));
                i2++;
            }
            return;
        }
        keyInputModifierKt.read(i, 2);
        int iIconCompatParcelizer2 = 0;
        for (int i4 = 0; i4 < dispatchpostscrolldzoqy0m.IconCompatParcelizer; i4++) {
            long j2 = dispatchpostscrolldzoqy0m.read(i4);
            iIconCompatParcelizer2 += KeyInputModifierKt.IconCompatParcelizer((j2 + j2) ^ (j2 >> 63));
        }
        keyInputModifierKt.serializer(iIconCompatParcelizer2);
        while (i2 < dispatchpostscrolldzoqy0m.IconCompatParcelizer) {
            long j3 = dispatchpostscrolldzoqy0m.read(i2);
            keyInputModifierKt.read((j3 + j3) ^ (j3 >> 63));
            i2++;
        }
    }

    public static void MediaBrowserCompatMediaItem(int i, List list, getZenkakuHankaruEK5gGoQ getzenkakuhankaruek5ggoq, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        KeyInputModifierKt keyInputModifierKt = (KeyInputModifierKt) getzenkakuhankaruek5ggoq.write;
        int i2 = 0;
        if (!(list instanceof NestedScrollConnection)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    keyInputModifierKt.serializer(i, (iIntValue + iIntValue) ^ (iIntValue >> 31));
                    i2++;
                }
                return;
            }
            keyInputModifierKt.read(i, 2);
            int iIconCompatParcelizer = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iIconCompatParcelizer += KeyInputModifierKt.IconCompatParcelizer((iIntValue2 + iIntValue2) ^ (iIntValue2 >> 31));
            }
            keyInputModifierKt.serializer(iIconCompatParcelizer);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                keyInputModifierKt.serializer((iIntValue3 + iIntValue3) ^ (iIntValue3 >> 31));
                i2++;
            }
            return;
        }
        NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) list;
        if (!z) {
            while (i2 < nestedScrollConnection.read) {
                int i4 = nestedScrollConnection.read(i2);
                keyInputModifierKt.serializer(i, (i4 + i4) ^ (i4 >> 31));
                i2++;
            }
            return;
        }
        keyInputModifierKt.read(i, 2);
        int iIconCompatParcelizer2 = 0;
        for (int i5 = 0; i5 < nestedScrollConnection.read; i5++) {
            int i6 = nestedScrollConnection.read(i5);
            iIconCompatParcelizer2 += KeyInputModifierKt.IconCompatParcelizer((i6 + i6) ^ (i6 >> 31));
        }
        keyInputModifierKt.serializer(iIconCompatParcelizer2);
        while (i2 < nestedScrollConnection.read) {
            int i7 = nestedScrollConnection.read(i2);
            keyInputModifierKt.serializer((i7 + i7) ^ (i7 >> 31));
            i2++;
        }
    }

    public static void MediaDescriptionCompat(int i, List list, getZenkakuHankaruEK5gGoQ getzenkakuhankaruek5ggoq, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        KeyInputModifierKt keyInputModifierKt = (KeyInputModifierKt) getzenkakuhankaruek5ggoq.write;
        int i2 = 0;
        if (!(list instanceof NestedScrollConnection)) {
            if (!z) {
                while (i2 < list.size()) {
                    keyInputModifierKt.serializer(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            keyInputModifierKt.read(i, 2);
            int iIconCompatParcelizer = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iIconCompatParcelizer += KeyInputModifierKt.IconCompatParcelizer(((Integer) list.get(i3)).intValue());
            }
            keyInputModifierKt.serializer(iIconCompatParcelizer);
            while (i2 < list.size()) {
                keyInputModifierKt.serializer(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) list;
        if (!z) {
            while (i2 < nestedScrollConnection.read) {
                keyInputModifierKt.serializer(i, nestedScrollConnection.read(i2));
                i2++;
            }
            return;
        }
        keyInputModifierKt.read(i, 2);
        int iIconCompatParcelizer2 = 0;
        for (int i4 = 0; i4 < nestedScrollConnection.read; i4++) {
            iIconCompatParcelizer2 += KeyInputModifierKt.IconCompatParcelizer(nestedScrollConnection.read(i4));
        }
        keyInputModifierKt.serializer(iIconCompatParcelizer2);
        while (i2 < nestedScrollConnection.read) {
            keyInputModifierKt.serializer(nestedScrollConnection.read(i2));
            i2++;
        }
    }

    public static void MediaMetadataCompat(int i, List list, getZenkakuHankaruEK5gGoQ getzenkakuhankaruek5ggoq, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        KeyInputModifierKt keyInputModifierKt = (KeyInputModifierKt) getzenkakuhankaruek5ggoq.write;
        int i2 = 0;
        if (!(list instanceof dispatchPostScrollDzOQY0M)) {
            if (!z) {
                while (i2 < list.size()) {
                    keyInputModifierKt.IconCompatParcelizer(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            keyInputModifierKt.read(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            keyInputModifierKt.serializer(i3);
            while (i2 < list.size()) {
                keyInputModifierKt.serializer(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dispatchPostScrollDzOQY0M dispatchpostscrolldzoqy0m = (dispatchPostScrollDzOQY0M) list;
        if (!z) {
            while (i2 < dispatchpostscrolldzoqy0m.IconCompatParcelizer) {
                keyInputModifierKt.IconCompatParcelizer(i, dispatchpostscrolldzoqy0m.read(i2));
                i2++;
            }
            return;
        }
        keyInputModifierKt.read(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < dispatchpostscrolldzoqy0m.IconCompatParcelizer; i6++) {
            dispatchpostscrolldzoqy0m.read(i6);
            i5 += 8;
        }
        keyInputModifierKt.serializer(i5);
        while (i2 < dispatchpostscrolldzoqy0m.IconCompatParcelizer) {
            keyInputModifierKt.serializer(dispatchpostscrolldzoqy0m.read(i2));
            i2++;
        }
    }

    public static void MediaSessionCompatQueueItem(int i, List list, getZenkakuHankaruEK5gGoQ getzenkakuhankaruek5ggoq, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        KeyInputModifierKt keyInputModifierKt = (KeyInputModifierKt) getzenkakuhankaruek5ggoq.write;
        int i2 = 0;
        if (!(list instanceof NestedScrollConnection)) {
            if (!z) {
                while (i2 < list.size()) {
                    keyInputModifierKt.write(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            keyInputModifierKt.read(i, 2);
            int iIconCompatParcelizer = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iIconCompatParcelizer += KeyInputModifierKt.IconCompatParcelizer(((Integer) list.get(i3)).intValue());
            }
            keyInputModifierKt.serializer(iIconCompatParcelizer);
            while (i2 < list.size()) {
                keyInputModifierKt.read(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) list;
        if (!z) {
            while (i2 < nestedScrollConnection.read) {
                keyInputModifierKt.write(i, nestedScrollConnection.read(i2));
                i2++;
            }
            return;
        }
        keyInputModifierKt.read(i, 2);
        int iIconCompatParcelizer2 = 0;
        for (int i4 = 0; i4 < nestedScrollConnection.read; i4++) {
            iIconCompatParcelizer2 += KeyInputModifierKt.IconCompatParcelizer(nestedScrollConnection.read(i4));
        }
        keyInputModifierKt.serializer(iIconCompatParcelizer2);
        while (i2 < nestedScrollConnection.read) {
            keyInputModifierKt.read(nestedScrollConnection.read(i2));
            i2++;
        }
    }

    public static void MediaSessionCompatToken(int i, List list, getZenkakuHankaruEK5gGoQ getzenkakuhankaruek5ggoq, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        KeyInputModifierKt keyInputModifierKt = (KeyInputModifierKt) getzenkakuhankaruek5ggoq.write;
        int i2 = 0;
        if (!(list instanceof NestedScrollConnection)) {
            if (!z) {
                while (i2 < list.size()) {
                    keyInputModifierKt.IconCompatParcelizer(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            keyInputModifierKt.read(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            keyInputModifierKt.serializer(i3);
            while (i2 < list.size()) {
                keyInputModifierKt.RemoteActionCompatParcelizer(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) list;
        if (!z) {
            while (i2 < nestedScrollConnection.read) {
                keyInputModifierKt.IconCompatParcelizer(i, nestedScrollConnection.read(i2));
                i2++;
            }
            return;
        }
        keyInputModifierKt.read(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < nestedScrollConnection.read; i6++) {
            nestedScrollConnection.read(i6);
            i5 += 4;
        }
        keyInputModifierKt.serializer(i5);
        while (i2 < nestedScrollConnection.read) {
            keyInputModifierKt.RemoteActionCompatParcelizer(nestedScrollConnection.read(i2));
            i2++;
        }
    }

    public static void ParcelableVolumeInfo(int i, List list, getZenkakuHankaruEK5gGoQ getzenkakuhankaruek5ggoq, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        KeyInputModifierKt keyInputModifierKt = (KeyInputModifierKt) getzenkakuhankaruek5ggoq.write;
        int i2 = 0;
        if (!(list instanceof NestedScrollConnection)) {
            if (!z) {
                while (i2 < list.size()) {
                    keyInputModifierKt.write(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            keyInputModifierKt.read(i, 2);
            int iIconCompatParcelizer = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iIconCompatParcelizer += KeyInputModifierKt.IconCompatParcelizer(((Integer) list.get(i3)).intValue());
            }
            keyInputModifierKt.serializer(iIconCompatParcelizer);
            while (i2 < list.size()) {
                keyInputModifierKt.read(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) list;
        if (!z) {
            while (i2 < nestedScrollConnection.read) {
                keyInputModifierKt.write(i, nestedScrollConnection.read(i2));
                i2++;
            }
            return;
        }
        keyInputModifierKt.read(i, 2);
        int iIconCompatParcelizer2 = 0;
        for (int i4 = 0; i4 < nestedScrollConnection.read; i4++) {
            iIconCompatParcelizer2 += KeyInputModifierKt.IconCompatParcelizer(nestedScrollConnection.read(i4));
        }
        keyInputModifierKt.serializer(iIconCompatParcelizer2);
        while (i2 < nestedScrollConnection.read) {
            keyInputModifierKt.read(nestedScrollConnection.read(i2));
            i2++;
        }
    }

    public static void PlaybackStateCompat(int i, List list, getZenkakuHankaruEK5gGoQ getzenkakuhankaruek5ggoq, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        KeyInputModifierKt keyInputModifierKt = (KeyInputModifierKt) getzenkakuhankaruek5ggoq.write;
        int i2 = 0;
        if (list instanceof onKeyEvent) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                keyInputModifierKt.serializer(i << 3);
                keyInputModifierKt.read(zBooleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        keyInputModifierKt.read(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        keyInputModifierKt.serializer(i3);
        while (i2 < list.size()) {
            keyInputModifierKt.read(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void PlaybackStateCompatCustomAction(int i, List list, getZenkakuHankaruEK5gGoQ getzenkakuhankaruek5ggoq, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        KeyInputModifierKt keyInputModifierKt = (KeyInputModifierKt) getzenkakuhankaruek5ggoq.write;
        int i2 = 0;
        if (!(list instanceof NestedScrollConnection)) {
            if (!z) {
                while (i2 < list.size()) {
                    keyInputModifierKt.IconCompatParcelizer(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            keyInputModifierKt.read(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            keyInputModifierKt.serializer(i3);
            while (i2 < list.size()) {
                keyInputModifierKt.RemoteActionCompatParcelizer(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) list;
        if (!z) {
            while (i2 < nestedScrollConnection.read) {
                keyInputModifierKt.IconCompatParcelizer(i, nestedScrollConnection.read(i2));
                i2++;
            }
            return;
        }
        keyInputModifierKt.read(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < nestedScrollConnection.read; i6++) {
            nestedScrollConnection.read(i6);
            i5 += 4;
        }
        keyInputModifierKt.serializer(i5);
        while (i2 < nestedScrollConnection.read) {
            keyInputModifierKt.RemoteActionCompatParcelizer(nestedScrollConnection.read(i2));
            i2++;
        }
    }

    public static void RatingCompat(int i, List list, getZenkakuHankaruEK5gGoQ getzenkakuhankaruek5ggoq, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        KeyInputModifierKt keyInputModifierKt = (KeyInputModifierKt) getzenkakuhankaruek5ggoq.write;
        int i2 = 0;
        if (!(list instanceof dispatchPostScrollDzOQY0M)) {
            if (!z) {
                while (i2 < list.size()) {
                    keyInputModifierKt.IconCompatParcelizer(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            keyInputModifierKt.read(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            keyInputModifierKt.serializer(i3);
            while (i2 < list.size()) {
                keyInputModifierKt.serializer(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dispatchPostScrollDzOQY0M dispatchpostscrolldzoqy0m = (dispatchPostScrollDzOQY0M) list;
        if (!z) {
            while (i2 < dispatchpostscrolldzoqy0m.IconCompatParcelizer) {
                keyInputModifierKt.IconCompatParcelizer(i, dispatchpostscrolldzoqy0m.read(i2));
                i2++;
            }
            return;
        }
        keyInputModifierKt.read(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < dispatchpostscrolldzoqy0m.IconCompatParcelizer; i6++) {
            dispatchpostscrolldzoqy0m.read(i6);
            i5 += 8;
        }
        keyInputModifierKt.serializer(i5);
        while (i2 < dispatchpostscrolldzoqy0m.IconCompatParcelizer) {
            keyInputModifierKt.serializer(dispatchpostscrolldzoqy0m.read(i2));
            i2++;
        }
    }

    public static void RemoteActionCompatParcelizer(int i, List list, getZenkakuHankaruEK5gGoQ getzenkakuhankaruek5ggoq, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        KeyInputModifierKt keyInputModifierKt = (KeyInputModifierKt) getzenkakuhankaruek5ggoq.write;
        int i2 = 0;
        if (!(list instanceof dispatchPostScrollDzOQY0M)) {
            if (!z) {
                while (i2 < list.size()) {
                    keyInputModifierKt.write(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            keyInputModifierKt.read(i, 2);
            int iIconCompatParcelizer = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iIconCompatParcelizer += KeyInputModifierKt.IconCompatParcelizer(((Long) list.get(i3)).longValue());
            }
            keyInputModifierKt.serializer(iIconCompatParcelizer);
            while (i2 < list.size()) {
                keyInputModifierKt.read(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dispatchPostScrollDzOQY0M dispatchpostscrolldzoqy0m = (dispatchPostScrollDzOQY0M) list;
        if (!z) {
            while (i2 < dispatchpostscrolldzoqy0m.IconCompatParcelizer) {
                keyInputModifierKt.write(i, dispatchpostscrolldzoqy0m.read(i2));
                i2++;
            }
            return;
        }
        keyInputModifierKt.read(i, 2);
        int iIconCompatParcelizer2 = 0;
        for (int i4 = 0; i4 < dispatchpostscrolldzoqy0m.IconCompatParcelizer; i4++) {
            iIconCompatParcelizer2 += KeyInputModifierKt.IconCompatParcelizer(dispatchpostscrolldzoqy0m.read(i4));
        }
        keyInputModifierKt.serializer(iIconCompatParcelizer2);
        while (i2 < dispatchpostscrolldzoqy0m.IconCompatParcelizer) {
            keyInputModifierKt.read(dispatchpostscrolldzoqy0m.read(i2));
            i2++;
        }
    }

    public static void read(int i, List list, getZenkakuHankaruEK5gGoQ getzenkakuhankaruek5ggoq, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        KeyInputModifierKt keyInputModifierKt = (KeyInputModifierKt) getzenkakuhankaruek5ggoq.write;
        int i2 = 0;
        if (list instanceof onPreInterceptKeyBeforeSoftKeyboard) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                keyInputModifierKt.IconCompatParcelizer(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        keyInputModifierKt.read(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        keyInputModifierKt.serializer(i3);
        while (i2 < list.size()) {
            keyInputModifierKt.RemoteActionCompatParcelizer(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void serializer(int i, List list, getZenkakuHankaruEK5gGoQ getzenkakuhankaruek5ggoq, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        KeyInputModifierKt keyInputModifierKt = (KeyInputModifierKt) getzenkakuhankaruek5ggoq.write;
        int i2 = 0;
        if (list instanceof getNativeKeyCodeYVgTNJs) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                keyInputModifierKt.IconCompatParcelizer(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        keyInputModifierKt.read(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        keyInputModifierKt.serializer(i3);
        while (i2 < list.size()) {
            keyInputModifierKt.serializer(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void write(int i, List list, getZenkakuHankaruEK5gGoQ getzenkakuhankaruek5ggoq, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        KeyInputModifierKt keyInputModifierKt = (KeyInputModifierKt) getzenkakuhankaruek5ggoq.write;
        int i2 = 0;
        if (!(list instanceof dispatchPostScrollDzOQY0M)) {
            if (!z) {
                while (i2 < list.size()) {
                    keyInputModifierKt.write(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            keyInputModifierKt.read(i, 2);
            int iIconCompatParcelizer = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iIconCompatParcelizer += KeyInputModifierKt.IconCompatParcelizer(((Long) list.get(i3)).longValue());
            }
            keyInputModifierKt.serializer(iIconCompatParcelizer);
            while (i2 < list.size()) {
                keyInputModifierKt.read(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dispatchPostScrollDzOQY0M dispatchpostscrolldzoqy0m = (dispatchPostScrollDzOQY0M) list;
        if (!z) {
            while (i2 < dispatchpostscrolldzoqy0m.IconCompatParcelizer) {
                keyInputModifierKt.write(i, dispatchpostscrolldzoqy0m.read(i2));
                i2++;
            }
            return;
        }
        keyInputModifierKt.read(i, 2);
        int iIconCompatParcelizer2 = 0;
        for (int i4 = 0; i4 < dispatchpostscrolldzoqy0m.IconCompatParcelizer; i4++) {
            iIconCompatParcelizer2 += KeyInputModifierKt.IconCompatParcelizer(dispatchpostscrolldzoqy0m.read(i4));
        }
        keyInputModifierKt.serializer(iIconCompatParcelizer2);
        while (i2 < dispatchpostscrolldzoqy0m.IconCompatParcelizer) {
            keyInputModifierKt.read(dispatchpostscrolldzoqy0m.read(i2));
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
    public static void write(Object obj, Object obj2) {
        SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt = (SoftwareKeyboardInterceptionModifierKt) obj;
        NestedScrollNode nestedScrollNode = softwareKeyboardInterceptionModifierKt.read;
        NestedScrollNode nestedScrollNode2 = ((SoftwareKeyboardInterceptionModifierKt) obj2).read;
        NestedScrollNode nestedScrollNode3 = NestedScrollNode.RemoteActionCompatParcelizer;
        if (!nestedScrollNode3.equals(nestedScrollNode2)) {
            if (nestedScrollNode3.equals(nestedScrollNode)) {
                int i = nestedScrollNode.read + nestedScrollNode2.read;
                int[] iArrCopyOf = Arrays.copyOf(nestedScrollNode.IconCompatParcelizer, i);
                System.arraycopy(nestedScrollNode2.IconCompatParcelizer, 0, iArrCopyOf, nestedScrollNode.read, nestedScrollNode2.read);
                Object[] objArrCopyOf = Arrays.copyOf(nestedScrollNode.serializer, i);
                System.arraycopy(nestedScrollNode2.serializer, 0, objArrCopyOf, nestedScrollNode.read, nestedScrollNode2.read);
                nestedScrollNode = new NestedScrollNode(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                nestedScrollNode.getClass();
                if (!nestedScrollNode2.equals(nestedScrollNode3)) {
                    if (!nestedScrollNode.MediaSessionCompatQueueItem) {
                        getAlignmentLinesMap.write();
                        return;
                    }
                    int i2 = nestedScrollNode.read + nestedScrollNode2.read;
                    nestedScrollNode.IconCompatParcelizer(i2);
                    System.arraycopy(nestedScrollNode2.IconCompatParcelizer, 0, nestedScrollNode.IconCompatParcelizer, nestedScrollNode.read, nestedScrollNode2.read);
                    System.arraycopy(nestedScrollNode2.serializer, 0, nestedScrollNode.serializer, nestedScrollNode.read, nestedScrollNode2.read);
                    nestedScrollNode.read = i2;
                }
            }
        }
        softwareKeyboardInterceptionModifierKt.read = nestedScrollNode;
    }

    static {
        setCalculateNestedScrollScopeui setcalculatenestedscrollscopeui = setCalculateNestedScrollScopeui.serializer;
        write = new onInterceptKeyBeforeSoftKeyboard(6);
    }

    public static boolean RemoteActionCompatParcelizer(Object obj, Object obj2) {
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
        if (!(list instanceof NestedScrollConnection)) {
            int iIconCompatParcelizer = 0;
            while (i < size) {
                iIconCompatParcelizer += KeyInputModifierKt.IconCompatParcelizer(((Integer) list.get(i)).intValue());
                i++;
            }
            return iIconCompatParcelizer;
        }
        NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) list;
        int iIconCompatParcelizer2 = 0;
        while (i < size) {
            iIconCompatParcelizer2 += KeyInputModifierKt.IconCompatParcelizer(nestedScrollConnection.read(i));
            i++;
        }
        return iIconCompatParcelizer2;
    }

    public static int MediaBrowserCompatMediaItem(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof NestedScrollConnection)) {
            int iIconCompatParcelizer = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iIconCompatParcelizer += KeyInputModifierKt.IconCompatParcelizer((iIntValue + iIntValue) ^ (iIntValue >> 31));
                i++;
            }
            return iIconCompatParcelizer;
        }
        NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) list;
        int iIconCompatParcelizer2 = 0;
        while (i < size) {
            int i2 = nestedScrollConnection.read(i);
            iIconCompatParcelizer2 += KeyInputModifierKt.IconCompatParcelizer((i2 + i2) ^ (i2 >> 31));
            i++;
        }
        return iIconCompatParcelizer2;
    }

    public static int RatingCompat(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof NestedScrollConnection)) {
            int iIconCompatParcelizer = 0;
            while (i < size) {
                iIconCompatParcelizer += KeyInputModifierKt.IconCompatParcelizer(((Integer) list.get(i)).intValue());
                i++;
            }
            return iIconCompatParcelizer;
        }
        NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) list;
        int iIconCompatParcelizer2 = 0;
        while (i < size) {
            iIconCompatParcelizer2 += KeyInputModifierKt.IconCompatParcelizer(nestedScrollConnection.read(i));
            i++;
        }
        return iIconCompatParcelizer2;
    }

    public static int RemoteActionCompatParcelizer(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dispatchPostScrollDzOQY0M)) {
            int iIconCompatParcelizer = 0;
            while (i < size) {
                iIconCompatParcelizer += KeyInputModifierKt.IconCompatParcelizer(((Long) list.get(i)).longValue());
                i++;
            }
            return iIconCompatParcelizer;
        }
        dispatchPostScrollDzOQY0M dispatchpostscrolldzoqy0m = (dispatchPostScrollDzOQY0M) list;
        int iIconCompatParcelizer2 = 0;
        while (i < size) {
            iIconCompatParcelizer2 += KeyInputModifierKt.IconCompatParcelizer(dispatchpostscrolldzoqy0m.read(i));
            i++;
        }
        return iIconCompatParcelizer2;
    }

    public static int read(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof NestedScrollConnection)) {
            int iIconCompatParcelizer = 0;
            while (i < size) {
                iIconCompatParcelizer += KeyInputModifierKt.IconCompatParcelizer(((Integer) list.get(i)).intValue());
                i++;
            }
            return iIconCompatParcelizer;
        }
        NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) list;
        int iIconCompatParcelizer2 = 0;
        while (i < size) {
            iIconCompatParcelizer2 += KeyInputModifierKt.IconCompatParcelizer(nestedScrollConnection.read(i));
            i++;
        }
        return iIconCompatParcelizer2;
    }

    public static int serializer(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dispatchPostScrollDzOQY0M)) {
            int iIconCompatParcelizer = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iIconCompatParcelizer += KeyInputModifierKt.IconCompatParcelizer((jLongValue + jLongValue) ^ (jLongValue >> 63));
                i++;
            }
            return iIconCompatParcelizer;
        }
        dispatchPostScrollDzOQY0M dispatchpostscrolldzoqy0m = (dispatchPostScrollDzOQY0M) list;
        int iIconCompatParcelizer2 = 0;
        while (i < size) {
            long j = dispatchpostscrolldzoqy0m.read(i);
            iIconCompatParcelizer2 += KeyInputModifierKt.IconCompatParcelizer((j + j) ^ (j >> 63));
            i++;
        }
        return iIconCompatParcelizer2;
    }

    public static int write(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dispatchPostScrollDzOQY0M)) {
            int iIconCompatParcelizer = 0;
            while (i < size) {
                iIconCompatParcelizer += KeyInputModifierKt.IconCompatParcelizer(((Long) list.get(i)).longValue());
                i++;
            }
            return iIconCompatParcelizer;
        }
        dispatchPostScrollDzOQY0M dispatchpostscrolldzoqy0m = (dispatchPostScrollDzOQY0M) list;
        int iIconCompatParcelizer2 = 0;
        while (i < size) {
            iIconCompatParcelizer2 += KeyInputModifierKt.IconCompatParcelizer(dispatchpostscrolldzoqy0m.read(i));
            i++;
        }
        return iIconCompatParcelizer2;
    }

    public static int RemoteActionCompatParcelizer(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (KeyInputModifierKt.IconCompatParcelizer(i << 3) + 8) * size;
    }

    public static int read(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (KeyInputModifierKt.IconCompatParcelizer(i << 3) + 4) * size;
    }
}
