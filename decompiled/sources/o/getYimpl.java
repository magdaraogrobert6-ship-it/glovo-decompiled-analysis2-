package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class getYimpl {
    /* JADX WARN: Code duplicated, block: B:44:0x0131  */
    /* JADX WARN: Code duplicated, block: B:49:0x0140  */
    /* JADX WARN: Code duplicated, block: B:50:0x014c  */
    /* JADX WARN: Code duplicated, block: B:51:0x015c  */
    /* JADX WARN: Code duplicated, block: B:52:0x016c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0173  */
    /* JADX WARN: Code duplicated, block: B:54:0x017a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0186  */
    /* JADX WARN: Code duplicated, block: B:57:0x018a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0195  */
    /* JADX WARN: Code duplicated, block: B:59:0x019d  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:67:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:72:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:74:0x0201  */
    /* JADX WARN: Code duplicated, block: B:80:0x013c A[SYNTHETIC] */
    public static int read(Object obj, int i, Object obj2) {
        int iIconCompatParcelizer;
        int iMediaSessionCompatToken;
        int iWrite;
        getHeight getheight;
        int iSerializer;
        int iMediaSessionCompatToken2;
        int iWrite2;
        getYannotations getyannotations = (getYannotations) obj;
        getXimpl getximpl = (getXimpl) obj2;
        if (getyannotations.isEmpty()) {
            return 0;
        }
        int iM = 0;
        for (Map.Entry entry : getyannotations.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            getximpl.getClass();
            int iSerializer2 = RequestChildFocusKt.serializer(i);
            androidx.emoji2.text.EmojiProcessor emojiProcessor = getximpl.IconCompatParcelizer;
            getHeight getheight2 = (getHeight) emojiProcessor.serializer;
            int i2 = beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.write;
            int iIconCompatParcelizer2 = 1;
            int iSerializer3 = RequestChildFocusKt.serializer(1);
            getHeight getheight3 = getHeight.GROUP;
            if (getheight2 == getheight3) {
                iSerializer3 *= 2;
            }
            int[] iArr = bottomRight.read;
            switch (iArr[getheight2.ordinal()]) {
                case 1:
                    ((Double) key).getClass();
                    iIconCompatParcelizer = 8;
                    getheight = (getHeight) emojiProcessor.read;
                    iSerializer = RequestChildFocusKt.serializer(2);
                    if (getheight == getheight3) {
                        iSerializer *= 2;
                    }
                    switch (iArr[getheight.ordinal()]) {
                        case 1:
                            ((Double) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i3 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i3, i3, iSerializer2, iM);
                            break;
                        case 2:
                            ((Float) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i4 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i4, i4, iSerializer2, iM);
                            break;
                        case 3:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i5 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i5, i5, iSerializer2, iM);
                            break;
                        case 4:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i6 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i6, i6, iSerializer2, iM);
                            break;
                        case 5:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i7 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i7, i7, iSerializer2, iM);
                            break;
                        case 6:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i8 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i8, i8, iSerializer2, iM);
                            break;
                        case 7:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i9 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i9, i9, iSerializer2, iM);
                            break;
                        case 8:
                            ((Boolean) value).getClass();
                            int i10 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i10, i10, iSerializer2, iM);
                            break;
                        case 9:
                            iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            int i11 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11, i11, iSerializer2, iM);
                            break;
                        case 10:
                            iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i12 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i12, i12, iSerializer2, iM);
                            break;
                        case 11:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            } else {
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                            }
                            int i13 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i13, i13, iSerializer2, iM);
                            break;
                        case 12:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            } else {
                                iMediaSessionCompatToken2 = ((byte[]) value).length;
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            }
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i14 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i14, i14, iSerializer2, iM);
                            break;
                        case 13:
                            iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                            int i15 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i15, i15, iSerializer2, iM);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i16 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i16, i16, iSerializer2, iM);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i17 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i17, i17, iSerializer2, iM);
                            break;
                        case 16:
                            int iIntValue = ((Integer) value).intValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue << 1) ^ (iIntValue >> 31));
                            int i18 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i18, i18, iSerializer2, iM);
                            break;
                        case 17:
                            long jLongValue = ((Long) value).longValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue << 1) ^ (jLongValue >> 63));
                            int i19 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i19, i19, iSerializer2, iM);
                            break;
                        case 18:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i110, i110, iSerializer2, iM);
                            break;
                        default:
                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 2:
                    ((Float) key).getClass();
                    iIconCompatParcelizer = 4;
                    getheight = (getHeight) emojiProcessor.read;
                    iSerializer = RequestChildFocusKt.serializer(2);
                    if (getheight == getheight3) {
                        iSerializer *= 2;
                    }
                    switch (iArr[getheight.ordinal()]) {
                        case 1:
                            ((Double) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111, i111, iSerializer2, iM);
                            break;
                        case 2:
                            ((Float) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i112, i112, iSerializer2, iM);
                            break;
                        case 3:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i113, i113, iSerializer2, iM);
                            break;
                        case 4:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i114, i114, iSerializer2, iM);
                            break;
                        case 5:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i115, i115, iSerializer2, iM);
                            break;
                        case 6:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i116, i116, iSerializer2, iM);
                            break;
                        case 7:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i117, i117, iSerializer2, iM);
                            break;
                        case 8:
                            ((Boolean) value).getClass();
                            int i118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i118, i118, iSerializer2, iM);
                            break;
                        case 9:
                            iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            int i119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i119, i119, iSerializer2, iM);
                            break;
                        case 10:
                            iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i1110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1110, i1110, iSerializer2, iM);
                            break;
                        case 11:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            } else {
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                            }
                            int i1111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111, i1111, iSerializer2, iM);
                            break;
                        case 12:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            } else {
                                iMediaSessionCompatToken2 = ((byte[]) value).length;
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            }
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i1112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1112, i1112, iSerializer2, iM);
                            break;
                        case 13:
                            iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                            int i1113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1113, i1113, iSerializer2, iM);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i1114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1114, i1114, iSerializer2, iM);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i1115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1115, i1115, iSerializer2, iM);
                            break;
                        case 16:
                            int iIntValue2 = ((Integer) value).intValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue2 << 1) ^ (iIntValue2 >> 31));
                            int i1116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1116, i1116, iSerializer2, iM);
                            break;
                        case 17:
                            long jLongValue2 = ((Long) value).longValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue2 << 1) ^ (jLongValue2 >> 63));
                            int i1117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1117, i1117, iSerializer2, iM);
                            break;
                        case 18:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i1118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1118, i1118, iSerializer2, iM);
                            break;
                        default:
                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 3:
                    iIconCompatParcelizer = RequestChildFocusKt.IconCompatParcelizer(((Long) key).longValue());
                    getheight = (getHeight) emojiProcessor.read;
                    iSerializer = RequestChildFocusKt.serializer(2);
                    if (getheight == getheight3) {
                        iSerializer *= 2;
                    }
                    switch (iArr[getheight.ordinal()]) {
                        case 1:
                            ((Double) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i1119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1119, i1119, iSerializer2, iM);
                            break;
                        case 2:
                            ((Float) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i11110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11110, i11110, iSerializer2, iM);
                            break;
                        case 3:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i11111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111, i11111, iSerializer2, iM);
                            break;
                        case 4:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i11112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11112, i11112, iSerializer2, iM);
                            break;
                        case 5:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i11113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11113, i11113, iSerializer2, iM);
                            break;
                        case 6:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i11114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11114, i11114, iSerializer2, iM);
                            break;
                        case 7:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i11115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11115, i11115, iSerializer2, iM);
                            break;
                        case 8:
                            ((Boolean) value).getClass();
                            int i11116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11116, i11116, iSerializer2, iM);
                            break;
                        case 9:
                            iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            int i11117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11117, i11117, iSerializer2, iM);
                            break;
                        case 10:
                            iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i11118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11118, i11118, iSerializer2, iM);
                            break;
                        case 11:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            } else {
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                            }
                            int i11119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11119, i11119, iSerializer2, iM);
                            break;
                        case 12:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            } else {
                                iMediaSessionCompatToken2 = ((byte[]) value).length;
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            }
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111110, i111110, iSerializer2, iM);
                            break;
                        case 13:
                            iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                            int i111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111, i111111, iSerializer2, iM);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111112, i111112, iSerializer2, iM);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111113, i111113, iSerializer2, iM);
                            break;
                        case 16:
                            int iIntValue3 = ((Integer) value).intValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue3 << 1) ^ (iIntValue3 >> 31));
                            int i111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111114, i111114, iSerializer2, iM);
                            break;
                        case 17:
                            long jLongValue3 = ((Long) value).longValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue3 << 1) ^ (jLongValue3 >> 63));
                            int i111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111115, i111115, iSerializer2, iM);
                            break;
                        case 18:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111116, i111116, iSerializer2, iM);
                            break;
                        default:
                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 4:
                    iIconCompatParcelizer = RequestChildFocusKt.IconCompatParcelizer(((Long) key).longValue());
                    getheight = (getHeight) emojiProcessor.read;
                    iSerializer = RequestChildFocusKt.serializer(2);
                    if (getheight == getheight3) {
                        iSerializer *= 2;
                    }
                    switch (iArr[getheight.ordinal()]) {
                        case 1:
                            ((Double) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111117, i111117, iSerializer2, iM);
                            break;
                        case 2:
                            ((Float) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111118, i111118, iSerializer2, iM);
                            break;
                        case 3:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111119, i111119, iSerializer2, iM);
                            break;
                        case 4:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i1111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111110, i1111110, iSerializer2, iM);
                            break;
                        case 5:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i1111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111, i1111111, iSerializer2, iM);
                            break;
                        case 6:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i1111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111112, i1111112, iSerializer2, iM);
                            break;
                        case 7:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i1111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111113, i1111113, iSerializer2, iM);
                            break;
                        case 8:
                            ((Boolean) value).getClass();
                            int i1111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111114, i1111114, iSerializer2, iM);
                            break;
                        case 9:
                            iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            int i1111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111115, i1111115, iSerializer2, iM);
                            break;
                        case 10:
                            iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i1111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111116, i1111116, iSerializer2, iM);
                            break;
                        case 11:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            } else {
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                            }
                            int i1111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111117, i1111117, iSerializer2, iM);
                            break;
                        case 12:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            } else {
                                iMediaSessionCompatToken2 = ((byte[]) value).length;
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            }
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i1111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111118, i1111118, iSerializer2, iM);
                            break;
                        case 13:
                            iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                            int i1111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111119, i1111119, iSerializer2, iM);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i11111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111110, i11111110, iSerializer2, iM);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i11111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111, i11111111, iSerializer2, iM);
                            break;
                        case 16:
                            int iIntValue4 = ((Integer) value).intValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue4 << 1) ^ (iIntValue4 >> 31));
                            int i11111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111112, i11111112, iSerializer2, iM);
                            break;
                        case 17:
                            long jLongValue4 = ((Long) value).longValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue4 << 1) ^ (jLongValue4 >> 63));
                            int i11111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111113, i11111113, iSerializer2, iM);
                            break;
                        case 18:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i11111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111114, i11111114, iSerializer2, iM);
                            break;
                        default:
                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 5:
                    iIconCompatParcelizer = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) key).intValue());
                    getheight = (getHeight) emojiProcessor.read;
                    iSerializer = RequestChildFocusKt.serializer(2);
                    if (getheight == getheight3) {
                        iSerializer *= 2;
                    }
                    switch (iArr[getheight.ordinal()]) {
                        case 1:
                            ((Double) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i11111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111115, i11111115, iSerializer2, iM);
                            break;
                        case 2:
                            ((Float) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i11111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111116, i11111116, iSerializer2, iM);
                            break;
                        case 3:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i11111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111117, i11111117, iSerializer2, iM);
                            break;
                        case 4:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i11111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111118, i11111118, iSerializer2, iM);
                            break;
                        case 5:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i11111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111119, i11111119, iSerializer2, iM);
                            break;
                        case 6:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111110, i111111110, iSerializer2, iM);
                            break;
                        case 7:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111, i111111111, iSerializer2, iM);
                            break;
                        case 8:
                            ((Boolean) value).getClass();
                            int i111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111112, i111111112, iSerializer2, iM);
                            break;
                        case 9:
                            iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            int i111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111113, i111111113, iSerializer2, iM);
                            break;
                        case 10:
                            iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111114, i111111114, iSerializer2, iM);
                            break;
                        case 11:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            } else {
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                            }
                            int i111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111115, i111111115, iSerializer2, iM);
                            break;
                        case 12:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            } else {
                                iMediaSessionCompatToken2 = ((byte[]) value).length;
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            }
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111116, i111111116, iSerializer2, iM);
                            break;
                        case 13:
                            iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                            int i111111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111117, i111111117, iSerializer2, iM);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i111111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111118, i111111118, iSerializer2, iM);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i111111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111119, i111111119, iSerializer2, iM);
                            break;
                        case 16:
                            int iIntValue5 = ((Integer) value).intValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue5 << 1) ^ (iIntValue5 >> 31));
                            int i1111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111110, i1111111110, iSerializer2, iM);
                            break;
                        case 17:
                            long jLongValue5 = ((Long) value).longValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue5 << 1) ^ (jLongValue5 >> 63));
                            int i1111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111, i1111111111, iSerializer2, iM);
                            break;
                        case 18:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i1111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111112, i1111111112, iSerializer2, iM);
                            break;
                        default:
                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 6:
                    ((Long) key).getClass();
                    iIconCompatParcelizer = 8;
                    getheight = (getHeight) emojiProcessor.read;
                    iSerializer = RequestChildFocusKt.serializer(2);
                    if (getheight == getheight3) {
                        iSerializer *= 2;
                    }
                    switch (iArr[getheight.ordinal()]) {
                        case 1:
                            ((Double) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i1111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111113, i1111111113, iSerializer2, iM);
                            break;
                        case 2:
                            ((Float) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i1111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111114, i1111111114, iSerializer2, iM);
                            break;
                        case 3:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i1111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111115, i1111111115, iSerializer2, iM);
                            break;
                        case 4:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i1111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111116, i1111111116, iSerializer2, iM);
                            break;
                        case 5:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i1111111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111117, i1111111117, iSerializer2, iM);
                            break;
                        case 6:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i1111111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111118, i1111111118, iSerializer2, iM);
                            break;
                        case 7:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i1111111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111119, i1111111119, iSerializer2, iM);
                            break;
                        case 8:
                            ((Boolean) value).getClass();
                            int i11111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111110, i11111111110, iSerializer2, iM);
                            break;
                        case 9:
                            iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            int i11111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111, i11111111111, iSerializer2, iM);
                            break;
                        case 10:
                            iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i11111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111112, i11111111112, iSerializer2, iM);
                            break;
                        case 11:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            } else {
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                            }
                            int i11111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111113, i11111111113, iSerializer2, iM);
                            break;
                        case 12:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            } else {
                                iMediaSessionCompatToken2 = ((byte[]) value).length;
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            }
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i11111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111114, i11111111114, iSerializer2, iM);
                            break;
                        case 13:
                            iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                            int i11111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111115, i11111111115, iSerializer2, iM);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i11111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111116, i11111111116, iSerializer2, iM);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i11111111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111117, i11111111117, iSerializer2, iM);
                            break;
                        case 16:
                            int iIntValue6 = ((Integer) value).intValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue6 << 1) ^ (iIntValue6 >> 31));
                            int i11111111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111118, i11111111118, iSerializer2, iM);
                            break;
                        case 17:
                            long jLongValue6 = ((Long) value).longValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue6 << 1) ^ (jLongValue6 >> 63));
                            int i11111111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111119, i11111111119, iSerializer2, iM);
                            break;
                        case 18:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i111111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111110, i111111111110, iSerializer2, iM);
                            break;
                        default:
                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 7:
                    ((Integer) key).getClass();
                    iIconCompatParcelizer = 4;
                    getheight = (getHeight) emojiProcessor.read;
                    iSerializer = RequestChildFocusKt.serializer(2);
                    if (getheight == getheight3) {
                        iSerializer *= 2;
                    }
                    switch (iArr[getheight.ordinal()]) {
                        case 1:
                            ((Double) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i111111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111, i111111111111, iSerializer2, iM);
                            break;
                        case 2:
                            ((Float) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i111111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111112, i111111111112, iSerializer2, iM);
                            break;
                        case 3:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i111111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111113, i111111111113, iSerializer2, iM);
                            break;
                        case 4:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i111111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111114, i111111111114, iSerializer2, iM);
                            break;
                        case 5:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i111111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111115, i111111111115, iSerializer2, iM);
                            break;
                        case 6:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i111111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111116, i111111111116, iSerializer2, iM);
                            break;
                        case 7:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i111111111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111117, i111111111117, iSerializer2, iM);
                            break;
                        case 8:
                            ((Boolean) value).getClass();
                            int i111111111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111118, i111111111118, iSerializer2, iM);
                            break;
                        case 9:
                            iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            int i111111111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111119, i111111111119, iSerializer2, iM);
                            break;
                        case 10:
                            iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i1111111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111110, i1111111111110, iSerializer2, iM);
                            break;
                        case 11:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            } else {
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                            }
                            int i1111111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111, i1111111111111, iSerializer2, iM);
                            break;
                        case 12:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            } else {
                                iMediaSessionCompatToken2 = ((byte[]) value).length;
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            }
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i1111111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111112, i1111111111112, iSerializer2, iM);
                            break;
                        case 13:
                            iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                            int i1111111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111113, i1111111111113, iSerializer2, iM);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i1111111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111114, i1111111111114, iSerializer2, iM);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i1111111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111115, i1111111111115, iSerializer2, iM);
                            break;
                        case 16:
                            int iIntValue7 = ((Integer) value).intValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue7 << 1) ^ (iIntValue7 >> 31));
                            int i1111111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111116, i1111111111116, iSerializer2, iM);
                            break;
                        case 17:
                            long jLongValue7 = ((Long) value).longValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue7 << 1) ^ (jLongValue7 >> 63));
                            int i1111111111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111117, i1111111111117, iSerializer2, iM);
                            break;
                        case 18:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i1111111111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111118, i1111111111118, iSerializer2, iM);
                            break;
                        default:
                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 8:
                    ((Boolean) key).getClass();
                    iIconCompatParcelizer = 1;
                    getheight = (getHeight) emojiProcessor.read;
                    iSerializer = RequestChildFocusKt.serializer(2);
                    if (getheight == getheight3) {
                        iSerializer *= 2;
                    }
                    switch (iArr[getheight.ordinal()]) {
                        case 1:
                            ((Double) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i1111111111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111119, i1111111111119, iSerializer2, iM);
                            break;
                        case 2:
                            ((Float) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i11111111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111110, i11111111111110, iSerializer2, iM);
                            break;
                        case 3:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i11111111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111, i11111111111111, iSerializer2, iM);
                            break;
                        case 4:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i11111111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111112, i11111111111112, iSerializer2, iM);
                            break;
                        case 5:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i11111111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111113, i11111111111113, iSerializer2, iM);
                            break;
                        case 6:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i11111111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111114, i11111111111114, iSerializer2, iM);
                            break;
                        case 7:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i11111111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111115, i11111111111115, iSerializer2, iM);
                            break;
                        case 8:
                            ((Boolean) value).getClass();
                            int i11111111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111116, i11111111111116, iSerializer2, iM);
                            break;
                        case 9:
                            iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            int i11111111111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111117, i11111111111117, iSerializer2, iM);
                            break;
                        case 10:
                            iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i11111111111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111118, i11111111111118, iSerializer2, iM);
                            break;
                        case 11:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            } else {
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                            }
                            int i11111111111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111119, i11111111111119, iSerializer2, iM);
                            break;
                        case 12:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            } else {
                                iMediaSessionCompatToken2 = ((byte[]) value).length;
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            }
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i111111111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111110, i111111111111110, iSerializer2, iM);
                            break;
                        case 13:
                            iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                            int i111111111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111, i111111111111111, iSerializer2, iM);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i111111111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111112, i111111111111112, iSerializer2, iM);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i111111111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111113, i111111111111113, iSerializer2, iM);
                            break;
                        case 16:
                            int iIntValue8 = ((Integer) value).intValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue8 << 1) ^ (iIntValue8 >> 31));
                            int i111111111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111114, i111111111111114, iSerializer2, iM);
                            break;
                        case 17:
                            long jLongValue8 = ((Long) value).longValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue8 << 1) ^ (jLongValue8 >> 63));
                            int i111111111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111115, i111111111111115, iSerializer2, iM);
                            break;
                        case 18:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i111111111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111116, i111111111111116, iSerializer2, iM);
                            break;
                        default:
                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 9:
                    iIconCompatParcelizer = ((PlatformFocusOwner) key).MediaSessionCompatToken();
                    getheight = (getHeight) emojiProcessor.read;
                    iSerializer = RequestChildFocusKt.serializer(2);
                    if (getheight == getheight3) {
                        iSerializer *= 2;
                    }
                    switch (iArr[getheight.ordinal()]) {
                        case 1:
                            ((Double) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i111111111111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111117, i111111111111117, iSerializer2, iM);
                            break;
                        case 2:
                            ((Float) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i111111111111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111118, i111111111111118, iSerializer2, iM);
                            break;
                        case 3:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i111111111111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111119, i111111111111119, iSerializer2, iM);
                            break;
                        case 4:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i1111111111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111110, i1111111111111110, iSerializer2, iM);
                            break;
                        case 5:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i1111111111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111, i1111111111111111, iSerializer2, iM);
                            break;
                        case 6:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i1111111111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111112, i1111111111111112, iSerializer2, iM);
                            break;
                        case 7:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i1111111111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111113, i1111111111111113, iSerializer2, iM);
                            break;
                        case 8:
                            ((Boolean) value).getClass();
                            int i1111111111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111114, i1111111111111114, iSerializer2, iM);
                            break;
                        case 9:
                            iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            int i1111111111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111115, i1111111111111115, iSerializer2, iM);
                            break;
                        case 10:
                            iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i1111111111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111116, i1111111111111116, iSerializer2, iM);
                            break;
                        case 11:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            } else {
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                            }
                            int i1111111111111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111117, i1111111111111117, iSerializer2, iM);
                            break;
                        case 12:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            } else {
                                iMediaSessionCompatToken2 = ((byte[]) value).length;
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            }
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i1111111111111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111118, i1111111111111118, iSerializer2, iM);
                            break;
                        case 13:
                            iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                            int i1111111111111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111119, i1111111111111119, iSerializer2, iM);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i11111111111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111110, i11111111111111110, iSerializer2, iM);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i11111111111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111, i11111111111111111, iSerializer2, iM);
                            break;
                        case 16:
                            int iIntValue9 = ((Integer) value).intValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue9 << 1) ^ (iIntValue9 >> 31));
                            int i11111111111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111112, i11111111111111112, iSerializer2, iM);
                            break;
                        case 17:
                            long jLongValue9 = ((Long) value).longValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue9 << 1) ^ (jLongValue9 >> 63));
                            int i11111111111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111113, i11111111111111113, iSerializer2, iM);
                            break;
                        case 18:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i11111111111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111114, i11111111111111114, iSerializer2, iM);
                            break;
                        default:
                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 10:
                    iMediaSessionCompatToken = ((PlatformFocusOwner) key).MediaSessionCompatToken();
                    iWrite = RequestChildFocusKt.write(iMediaSessionCompatToken);
                    iIconCompatParcelizer = iMediaSessionCompatToken + iWrite;
                    getheight = (getHeight) emojiProcessor.read;
                    iSerializer = RequestChildFocusKt.serializer(2);
                    if (getheight == getheight3) {
                        iSerializer *= 2;
                    }
                    switch (iArr[getheight.ordinal()]) {
                        case 1:
                            ((Double) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i11111111111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111115, i11111111111111115, iSerializer2, iM);
                            break;
                        case 2:
                            ((Float) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i11111111111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111116, i11111111111111116, iSerializer2, iM);
                            break;
                        case 3:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i11111111111111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111117, i11111111111111117, iSerializer2, iM);
                            break;
                        case 4:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i11111111111111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111118, i11111111111111118, iSerializer2, iM);
                            break;
                        case 5:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i11111111111111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111119, i11111111111111119, iSerializer2, iM);
                            break;
                        case 6:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i111111111111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111110, i111111111111111110, iSerializer2, iM);
                            break;
                        case 7:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i111111111111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111, i111111111111111111, iSerializer2, iM);
                            break;
                        case 8:
                            ((Boolean) value).getClass();
                            int i111111111111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111112, i111111111111111112, iSerializer2, iM);
                            break;
                        case 9:
                            iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            int i111111111111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111113, i111111111111111113, iSerializer2, iM);
                            break;
                        case 10:
                            iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i111111111111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111114, i111111111111111114, iSerializer2, iM);
                            break;
                        case 11:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            } else {
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                            }
                            int i111111111111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111115, i111111111111111115, iSerializer2, iM);
                            break;
                        case 12:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            } else {
                                iMediaSessionCompatToken2 = ((byte[]) value).length;
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            }
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i111111111111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111116, i111111111111111116, iSerializer2, iM);
                            break;
                        case 13:
                            iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                            int i111111111111111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111117, i111111111111111117, iSerializer2, iM);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i111111111111111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111118, i111111111111111118, iSerializer2, iM);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i111111111111111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111119, i111111111111111119, iSerializer2, iM);
                            break;
                        case 16:
                            int iIntValue10 = ((Integer) value).intValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue10 << 1) ^ (iIntValue10 >> 31));
                            int i1111111111111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111110, i1111111111111111110, iSerializer2, iM);
                            break;
                        case 17:
                            long jLongValue10 = ((Long) value).longValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue10 << 1) ^ (jLongValue10 >> 63));
                            int i1111111111111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111, i1111111111111111111, iSerializer2, iM);
                            break;
                        case 18:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i1111111111111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111112, i1111111111111111112, iSerializer2, iM);
                            break;
                        default:
                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 11:
                    if (key instanceof moveFocusInChildren3ESFkO8) {
                        iMediaSessionCompatToken = ((moveFocusInChildren3ESFkO8) key).write();
                        iWrite = RequestChildFocusKt.write(iMediaSessionCompatToken);
                        iIconCompatParcelizer = iMediaSessionCompatToken + iWrite;
                    } else {
                        iIconCompatParcelizer = RequestChildFocusKt.RemoteActionCompatParcelizer((String) key);
                    }
                    getheight = (getHeight) emojiProcessor.read;
                    iSerializer = RequestChildFocusKt.serializer(2);
                    if (getheight == getheight3) {
                        iSerializer *= 2;
                    }
                    switch (iArr[getheight.ordinal()]) {
                        case 1:
                            ((Double) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i1111111111111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111113, i1111111111111111113, iSerializer2, iM);
                            break;
                        case 2:
                            ((Float) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i1111111111111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111114, i1111111111111111114, iSerializer2, iM);
                            break;
                        case 3:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i1111111111111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111115, i1111111111111111115, iSerializer2, iM);
                            break;
                        case 4:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i1111111111111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111116, i1111111111111111116, iSerializer2, iM);
                            break;
                        case 5:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i1111111111111111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111117, i1111111111111111117, iSerializer2, iM);
                            break;
                        case 6:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i1111111111111111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111118, i1111111111111111118, iSerializer2, iM);
                            break;
                        case 7:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i1111111111111111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111119, i1111111111111111119, iSerializer2, iM);
                            break;
                        case 8:
                            ((Boolean) value).getClass();
                            int i11111111111111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111110, i11111111111111111110, iSerializer2, iM);
                            break;
                        case 9:
                            iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            int i11111111111111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111, i11111111111111111111, iSerializer2, iM);
                            break;
                        case 10:
                            iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i11111111111111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111112, i11111111111111111112, iSerializer2, iM);
                            break;
                        case 11:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            } else {
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                            }
                            int i11111111111111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111113, i11111111111111111113, iSerializer2, iM);
                            break;
                        case 12:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            } else {
                                iMediaSessionCompatToken2 = ((byte[]) value).length;
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            }
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i11111111111111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111114, i11111111111111111114, iSerializer2, iM);
                            break;
                        case 13:
                            iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                            int i11111111111111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111115, i11111111111111111115, iSerializer2, iM);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i11111111111111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111116, i11111111111111111116, iSerializer2, iM);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i11111111111111111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111117, i11111111111111111117, iSerializer2, iM);
                            break;
                        case 16:
                            int iIntValue11 = ((Integer) value).intValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue11 << 1) ^ (iIntValue11 >> 31));
                            int i11111111111111111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111118, i11111111111111111118, iSerializer2, iM);
                            break;
                        case 17:
                            long jLongValue11 = ((Long) value).longValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue11 << 1) ^ (jLongValue11 >> 63));
                            int i11111111111111111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111119, i11111111111111111119, iSerializer2, iM);
                            break;
                        case 18:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i111111111111111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111110, i111111111111111111110, iSerializer2, iM);
                            break;
                        default:
                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 12:
                    if (key instanceof moveFocusInChildren3ESFkO8) {
                        iMediaSessionCompatToken = ((moveFocusInChildren3ESFkO8) key).write();
                        iWrite = RequestChildFocusKt.write(iMediaSessionCompatToken);
                    } else {
                        iMediaSessionCompatToken = ((byte[]) key).length;
                        iWrite = RequestChildFocusKt.write(iMediaSessionCompatToken);
                    }
                    iIconCompatParcelizer = iMediaSessionCompatToken + iWrite;
                    getheight = (getHeight) emojiProcessor.read;
                    iSerializer = RequestChildFocusKt.serializer(2);
                    if (getheight == getheight3) {
                        iSerializer *= 2;
                    }
                    switch (iArr[getheight.ordinal()]) {
                        case 1:
                            ((Double) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i111111111111111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111, i111111111111111111111, iSerializer2, iM);
                            break;
                        case 2:
                            ((Float) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i111111111111111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111112, i111111111111111111112, iSerializer2, iM);
                            break;
                        case 3:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i111111111111111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111113, i111111111111111111113, iSerializer2, iM);
                            break;
                        case 4:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i111111111111111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111114, i111111111111111111114, iSerializer2, iM);
                            break;
                        case 5:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i111111111111111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111115, i111111111111111111115, iSerializer2, iM);
                            break;
                        case 6:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i111111111111111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111116, i111111111111111111116, iSerializer2, iM);
                            break;
                        case 7:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i111111111111111111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111117, i111111111111111111117, iSerializer2, iM);
                            break;
                        case 8:
                            ((Boolean) value).getClass();
                            int i111111111111111111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111118, i111111111111111111118, iSerializer2, iM);
                            break;
                        case 9:
                            iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            int i111111111111111111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111119, i111111111111111111119, iSerializer2, iM);
                            break;
                        case 10:
                            iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i1111111111111111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111110, i1111111111111111111110, iSerializer2, iM);
                            break;
                        case 11:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            } else {
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                            }
                            int i1111111111111111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111, i1111111111111111111111, iSerializer2, iM);
                            break;
                        case 12:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            } else {
                                iMediaSessionCompatToken2 = ((byte[]) value).length;
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            }
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i1111111111111111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111112, i1111111111111111111112, iSerializer2, iM);
                            break;
                        case 13:
                            iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                            int i1111111111111111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111113, i1111111111111111111113, iSerializer2, iM);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i1111111111111111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111114, i1111111111111111111114, iSerializer2, iM);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i1111111111111111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111115, i1111111111111111111115, iSerializer2, iM);
                            break;
                        case 16:
                            int iIntValue12 = ((Integer) value).intValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue12 << 1) ^ (iIntValue12 >> 31));
                            int i1111111111111111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111116, i1111111111111111111116, iSerializer2, iM);
                            break;
                        case 17:
                            long jLongValue12 = ((Long) value).longValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue12 << 1) ^ (jLongValue12 >> 63));
                            int i1111111111111111111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111117, i1111111111111111111117, iSerializer2, iM);
                            break;
                        case 18:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i1111111111111111111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111118, i1111111111111111111118, iSerializer2, iM);
                            break;
                        default:
                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 13:
                    iIconCompatParcelizer = RequestChildFocusKt.write(((Integer) key).intValue());
                    getheight = (getHeight) emojiProcessor.read;
                    iSerializer = RequestChildFocusKt.serializer(2);
                    if (getheight == getheight3) {
                        iSerializer *= 2;
                    }
                    switch (iArr[getheight.ordinal()]) {
                        case 1:
                            ((Double) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i1111111111111111111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111119, i1111111111111111111119, iSerializer2, iM);
                            break;
                        case 2:
                            ((Float) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i11111111111111111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111110, i11111111111111111111110, iSerializer2, iM);
                            break;
                        case 3:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i11111111111111111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111, i11111111111111111111111, iSerializer2, iM);
                            break;
                        case 4:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i11111111111111111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111112, i11111111111111111111112, iSerializer2, iM);
                            break;
                        case 5:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i11111111111111111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111113, i11111111111111111111113, iSerializer2, iM);
                            break;
                        case 6:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i11111111111111111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111114, i11111111111111111111114, iSerializer2, iM);
                            break;
                        case 7:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i11111111111111111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111115, i11111111111111111111115, iSerializer2, iM);
                            break;
                        case 8:
                            ((Boolean) value).getClass();
                            int i11111111111111111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111116, i11111111111111111111116, iSerializer2, iM);
                            break;
                        case 9:
                            iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            int i11111111111111111111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111117, i11111111111111111111117, iSerializer2, iM);
                            break;
                        case 10:
                            iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i11111111111111111111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111118, i11111111111111111111118, iSerializer2, iM);
                            break;
                        case 11:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            } else {
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                            }
                            int i11111111111111111111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111119, i11111111111111111111119, iSerializer2, iM);
                            break;
                        case 12:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            } else {
                                iMediaSessionCompatToken2 = ((byte[]) value).length;
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            }
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i111111111111111111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111110, i111111111111111111111110, iSerializer2, iM);
                            break;
                        case 13:
                            iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                            int i111111111111111111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111, i111111111111111111111111, iSerializer2, iM);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i111111111111111111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111112, i111111111111111111111112, iSerializer2, iM);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i111111111111111111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111113, i111111111111111111111113, iSerializer2, iM);
                            break;
                        case 16:
                            int iIntValue13 = ((Integer) value).intValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue13 << 1) ^ (iIntValue13 >> 31));
                            int i111111111111111111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111114, i111111111111111111111114, iSerializer2, iM);
                            break;
                        case 17:
                            long jLongValue13 = ((Long) value).longValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue13 << 1) ^ (jLongValue13 >> 63));
                            int i111111111111111111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111115, i111111111111111111111115, iSerializer2, iM);
                            break;
                        case 18:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i111111111111111111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111116, i111111111111111111111116, iSerializer2, iM);
                            break;
                        default:
                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 14:
                    ((Integer) key).getClass();
                    iIconCompatParcelizer = 4;
                    getheight = (getHeight) emojiProcessor.read;
                    iSerializer = RequestChildFocusKt.serializer(2);
                    if (getheight == getheight3) {
                        iSerializer *= 2;
                    }
                    switch (iArr[getheight.ordinal()]) {
                        case 1:
                            ((Double) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i111111111111111111111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111117, i111111111111111111111117, iSerializer2, iM);
                            break;
                        case 2:
                            ((Float) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i111111111111111111111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111118, i111111111111111111111118, iSerializer2, iM);
                            break;
                        case 3:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i111111111111111111111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111119, i111111111111111111111119, iSerializer2, iM);
                            break;
                        case 4:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i1111111111111111111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111110, i1111111111111111111111110, iSerializer2, iM);
                            break;
                        case 5:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i1111111111111111111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111111, i1111111111111111111111111, iSerializer2, iM);
                            break;
                        case 6:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i1111111111111111111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111112, i1111111111111111111111112, iSerializer2, iM);
                            break;
                        case 7:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i1111111111111111111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111113, i1111111111111111111111113, iSerializer2, iM);
                            break;
                        case 8:
                            ((Boolean) value).getClass();
                            int i1111111111111111111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111114, i1111111111111111111111114, iSerializer2, iM);
                            break;
                        case 9:
                            iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            int i1111111111111111111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111115, i1111111111111111111111115, iSerializer2, iM);
                            break;
                        case 10:
                            iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i1111111111111111111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111116, i1111111111111111111111116, iSerializer2, iM);
                            break;
                        case 11:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            } else {
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                            }
                            int i1111111111111111111111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111117, i1111111111111111111111117, iSerializer2, iM);
                            break;
                        case 12:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            } else {
                                iMediaSessionCompatToken2 = ((byte[]) value).length;
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            }
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i1111111111111111111111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111118, i1111111111111111111111118, iSerializer2, iM);
                            break;
                        case 13:
                            iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                            int i1111111111111111111111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111119, i1111111111111111111111119, iSerializer2, iM);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i11111111111111111111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111110, i11111111111111111111111110, iSerializer2, iM);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i11111111111111111111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111111, i11111111111111111111111111, iSerializer2, iM);
                            break;
                        case 16:
                            int iIntValue14 = ((Integer) value).intValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue14 << 1) ^ (iIntValue14 >> 31));
                            int i11111111111111111111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111112, i11111111111111111111111112, iSerializer2, iM);
                            break;
                        case 17:
                            long jLongValue14 = ((Long) value).longValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue14 << 1) ^ (jLongValue14 >> 63));
                            int i11111111111111111111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111113, i11111111111111111111111113, iSerializer2, iM);
                            break;
                        case 18:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i11111111111111111111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111114, i11111111111111111111111114, iSerializer2, iM);
                            break;
                        default:
                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 15:
                    ((Long) key).getClass();
                    iIconCompatParcelizer = 8;
                    getheight = (getHeight) emojiProcessor.read;
                    iSerializer = RequestChildFocusKt.serializer(2);
                    if (getheight == getheight3) {
                        iSerializer *= 2;
                    }
                    switch (iArr[getheight.ordinal()]) {
                        case 1:
                            ((Double) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i11111111111111111111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111115, i11111111111111111111111115, iSerializer2, iM);
                            break;
                        case 2:
                            ((Float) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i11111111111111111111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111116, i11111111111111111111111116, iSerializer2, iM);
                            break;
                        case 3:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i11111111111111111111111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111117, i11111111111111111111111117, iSerializer2, iM);
                            break;
                        case 4:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i11111111111111111111111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111118, i11111111111111111111111118, iSerializer2, iM);
                            break;
                        case 5:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i11111111111111111111111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111119, i11111111111111111111111119, iSerializer2, iM);
                            break;
                        case 6:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i111111111111111111111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111110, i111111111111111111111111110, iSerializer2, iM);
                            break;
                        case 7:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i111111111111111111111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111111, i111111111111111111111111111, iSerializer2, iM);
                            break;
                        case 8:
                            ((Boolean) value).getClass();
                            int i111111111111111111111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111112, i111111111111111111111111112, iSerializer2, iM);
                            break;
                        case 9:
                            iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            int i111111111111111111111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111113, i111111111111111111111111113, iSerializer2, iM);
                            break;
                        case 10:
                            iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i111111111111111111111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111114, i111111111111111111111111114, iSerializer2, iM);
                            break;
                        case 11:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            } else {
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                            }
                            int i111111111111111111111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111115, i111111111111111111111111115, iSerializer2, iM);
                            break;
                        case 12:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            } else {
                                iMediaSessionCompatToken2 = ((byte[]) value).length;
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            }
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i111111111111111111111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111116, i111111111111111111111111116, iSerializer2, iM);
                            break;
                        case 13:
                            iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                            int i111111111111111111111111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111117, i111111111111111111111111117, iSerializer2, iM);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i111111111111111111111111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111118, i111111111111111111111111118, iSerializer2, iM);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i111111111111111111111111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111119, i111111111111111111111111119, iSerializer2, iM);
                            break;
                        case 16:
                            int iIntValue15 = ((Integer) value).intValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue15 << 1) ^ (iIntValue15 >> 31));
                            int i1111111111111111111111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111111110, i1111111111111111111111111110, iSerializer2, iM);
                            break;
                        case 17:
                            long jLongValue15 = ((Long) value).longValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue15 << 1) ^ (jLongValue15 >> 63));
                            int i1111111111111111111111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111111111, i1111111111111111111111111111, iSerializer2, iM);
                            break;
                        case 18:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i1111111111111111111111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111111112, i1111111111111111111111111112, iSerializer2, iM);
                            break;
                        default:
                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 16:
                    int iIntValue16 = ((Integer) key).intValue();
                    iIconCompatParcelizer = RequestChildFocusKt.write((iIntValue16 << 1) ^ (iIntValue16 >> 31));
                    getheight = (getHeight) emojiProcessor.read;
                    iSerializer = RequestChildFocusKt.serializer(2);
                    if (getheight == getheight3) {
                        iSerializer *= 2;
                    }
                    switch (iArr[getheight.ordinal()]) {
                        case 1:
                            ((Double) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i1111111111111111111111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111111113, i1111111111111111111111111113, iSerializer2, iM);
                            break;
                        case 2:
                            ((Float) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i1111111111111111111111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111111114, i1111111111111111111111111114, iSerializer2, iM);
                            break;
                        case 3:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i1111111111111111111111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111111115, i1111111111111111111111111115, iSerializer2, iM);
                            break;
                        case 4:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i1111111111111111111111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111111116, i1111111111111111111111111116, iSerializer2, iM);
                            break;
                        case 5:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i1111111111111111111111111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111111117, i1111111111111111111111111117, iSerializer2, iM);
                            break;
                        case 6:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i1111111111111111111111111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111111118, i1111111111111111111111111118, iSerializer2, iM);
                            break;
                        case 7:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i1111111111111111111111111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111111119, i1111111111111111111111111119, iSerializer2, iM);
                            break;
                        case 8:
                            ((Boolean) value).getClass();
                            int i11111111111111111111111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111111110, i11111111111111111111111111110, iSerializer2, iM);
                            break;
                        case 9:
                            iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            int i11111111111111111111111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111111111, i11111111111111111111111111111, iSerializer2, iM);
                            break;
                        case 10:
                            iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i11111111111111111111111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111111112, i11111111111111111111111111112, iSerializer2, iM);
                            break;
                        case 11:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            } else {
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                            }
                            int i11111111111111111111111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111111113, i11111111111111111111111111113, iSerializer2, iM);
                            break;
                        case 12:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            } else {
                                iMediaSessionCompatToken2 = ((byte[]) value).length;
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            }
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i11111111111111111111111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111111114, i11111111111111111111111111114, iSerializer2, iM);
                            break;
                        case 13:
                            iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                            int i11111111111111111111111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111111115, i11111111111111111111111111115, iSerializer2, iM);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i11111111111111111111111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111111116, i11111111111111111111111111116, iSerializer2, iM);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i11111111111111111111111111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111111117, i11111111111111111111111111117, iSerializer2, iM);
                            break;
                        case 16:
                            int iIntValue17 = ((Integer) value).intValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue17 << 1) ^ (iIntValue17 >> 31));
                            int i11111111111111111111111111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111111118, i11111111111111111111111111118, iSerializer2, iM);
                            break;
                        case 17:
                            long jLongValue16 = ((Long) value).longValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue16 << 1) ^ (jLongValue16 >> 63));
                            int i11111111111111111111111111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111111119, i11111111111111111111111111119, iSerializer2, iM);
                            break;
                        case 18:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i111111111111111111111111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111111110, i111111111111111111111111111110, iSerializer2, iM);
                            break;
                        default:
                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 17:
                    long jLongValue17 = ((Long) key).longValue();
                    iIconCompatParcelizer = RequestChildFocusKt.IconCompatParcelizer((jLongValue17 << 1) ^ (jLongValue17 >> 63));
                    getheight = (getHeight) emojiProcessor.read;
                    iSerializer = RequestChildFocusKt.serializer(2);
                    if (getheight == getheight3) {
                        iSerializer *= 2;
                    }
                    switch (iArr[getheight.ordinal()]) {
                        case 1:
                            ((Double) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i111111111111111111111111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111111111, i111111111111111111111111111111, iSerializer2, iM);
                            break;
                        case 2:
                            ((Float) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i111111111111111111111111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111111112, i111111111111111111111111111112, iSerializer2, iM);
                            break;
                        case 3:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i111111111111111111111111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111111113, i111111111111111111111111111113, iSerializer2, iM);
                            break;
                        case 4:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i111111111111111111111111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111111114, i111111111111111111111111111114, iSerializer2, iM);
                            break;
                        case 5:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i111111111111111111111111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111111115, i111111111111111111111111111115, iSerializer2, iM);
                            break;
                        case 6:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i111111111111111111111111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111111116, i111111111111111111111111111116, iSerializer2, iM);
                            break;
                        case 7:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i111111111111111111111111111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111111117, i111111111111111111111111111117, iSerializer2, iM);
                            break;
                        case 8:
                            ((Boolean) value).getClass();
                            int i111111111111111111111111111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111111118, i111111111111111111111111111118, iSerializer2, iM);
                            break;
                        case 9:
                            iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            int i111111111111111111111111111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111111119, i111111111111111111111111111119, iSerializer2, iM);
                            break;
                        case 10:
                            iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i1111111111111111111111111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111111111110, i1111111111111111111111111111110, iSerializer2, iM);
                            break;
                        case 11:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            } else {
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                            }
                            int i1111111111111111111111111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111111111111, i1111111111111111111111111111111, iSerializer2, iM);
                            break;
                        case 12:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            } else {
                                iMediaSessionCompatToken2 = ((byte[]) value).length;
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            }
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i1111111111111111111111111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111111111112, i1111111111111111111111111111112, iSerializer2, iM);
                            break;
                        case 13:
                            iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                            int i1111111111111111111111111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111111111113, i1111111111111111111111111111113, iSerializer2, iM);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i1111111111111111111111111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111111111114, i1111111111111111111111111111114, iSerializer2, iM);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i1111111111111111111111111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111111111115, i1111111111111111111111111111115, iSerializer2, iM);
                            break;
                        case 16:
                            int iIntValue18 = ((Integer) value).intValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue18 << 1) ^ (iIntValue18 >> 31));
                            int i1111111111111111111111111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111111111116, i1111111111111111111111111111116, iSerializer2, iM);
                            break;
                        case 17:
                            long jLongValue18 = ((Long) value).longValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue18 << 1) ^ (jLongValue18 >> 63));
                            int i1111111111111111111111111111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111111111117, i1111111111111111111111111111117, iSerializer2, iM);
                            break;
                        case 18:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i1111111111111111111111111111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111111111118, i1111111111111111111111111111118, iSerializer2, iM);
                            break;
                        default:
                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 18:
                    iIconCompatParcelizer = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) key).intValue());
                    getheight = (getHeight) emojiProcessor.read;
                    iSerializer = RequestChildFocusKt.serializer(2);
                    if (getheight == getheight3) {
                        iSerializer *= 2;
                    }
                    switch (iArr[getheight.ordinal()]) {
                        case 1:
                            ((Double) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i1111111111111111111111111111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i1111111111111111111111111111119, i1111111111111111111111111111119, iSerializer2, iM);
                            break;
                        case 2:
                            ((Float) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i11111111111111111111111111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111111111110, i11111111111111111111111111111110, iSerializer2, iM);
                            break;
                        case 3:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i11111111111111111111111111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111111111111, i11111111111111111111111111111111, iSerializer2, iM);
                            break;
                        case 4:
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                            int i11111111111111111111111111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111111111112, i11111111111111111111111111111112, iSerializer2, iM);
                            break;
                        case 5:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i11111111111111111111111111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111111111113, i11111111111111111111111111111113, iSerializer2, iM);
                            break;
                        case 6:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i11111111111111111111111111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111111111114, i11111111111111111111111111111114, iSerializer2, iM);
                            break;
                        case 7:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i11111111111111111111111111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111111111115, i11111111111111111111111111111115, iSerializer2, iM);
                            break;
                        case 8:
                            ((Boolean) value).getClass();
                            int i11111111111111111111111111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111111111116, i11111111111111111111111111111116, iSerializer2, iM);
                            break;
                        case 9:
                            iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            int i11111111111111111111111111111117 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111111111117, i11111111111111111111111111111117, iSerializer2, iM);
                            break;
                        case 10:
                            iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                            iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i11111111111111111111111111111118 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111111111118, i11111111111111111111111111111118, iSerializer2, iM);
                            break;
                        case 11:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            } else {
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                            }
                            int i11111111111111111111111111111119 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i11111111111111111111111111111119, i11111111111111111111111111111119, iSerializer2, iM);
                            break;
                        case 12:
                            if (value instanceof moveFocusInChildren3ESFkO8) {
                                iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            } else {
                                iMediaSessionCompatToken2 = ((byte[]) value).length;
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                            }
                            iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                            int i111111111111111111111111111111110 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111111111110, i111111111111111111111111111111110, iSerializer2, iM);
                            break;
                        case 13:
                            iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                            int i111111111111111111111111111111111 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111111111111, i111111111111111111111111111111111, iSerializer2, iM);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iIconCompatParcelizer2 = 4;
                            int i111111111111111111111111111111112 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111111111112, i111111111111111111111111111111112, iSerializer2, iM);
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iIconCompatParcelizer2 = 8;
                            int i111111111111111111111111111111113 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111111111113, i111111111111111111111111111111113, iSerializer2, iM);
                            break;
                        case 16:
                            int iIntValue19 = ((Integer) value).intValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue19 << 1) ^ (iIntValue19 >> 31));
                            int i111111111111111111111111111111114 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111111111114, i111111111111111111111111111111114, iSerializer2, iM);
                            break;
                        case 17:
                            long jLongValue19 = ((Long) value).longValue();
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue19 << 1) ^ (jLongValue19 >> 63));
                            int i111111111111111111111111111111115 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111111111115, i111111111111111111111111111111115, iSerializer2, iM);
                            break;
                        case 18:
                            iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                            int i111111111111111111111111111111116 = iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer3;
                            iM = c8$$ExternalSyntheticOutline0.m(i111111111111111111111111111111116, i111111111111111111111111111111116, iSerializer2, iM);
                            break;
                        default:
                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                default:
                    ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                    return 0;
            }
        }
        return iM;
    }

    public static getYannotations serializer(Object obj, Object obj2) {
        getYannotations getyannotations = (getYannotations) obj;
        getYannotations getyannotations2 = (getYannotations) obj2;
        if (!getyannotations2.isEmpty()) {
            if (!getyannotations.write) {
                getyannotations = getyannotations.read();
            }
            getyannotations.RemoteActionCompatParcelizer();
            if (!getyannotations2.isEmpty()) {
                getyannotations.putAll(getyannotations2);
            }
        }
        return getyannotations;
    }
}
