package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import kotlin.TuplesKt;
import kotlin.collections.AbstractList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setCarryoverInAppMessage extends resumeWebviewIfNecessaryandroid_sdk_ui_release {
    public static Long ParcelableVolumeInfo(String str) {
        boolean z;
        str.getClass();
        TuplesKt.RemoteActionCompatParcelizer(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (removeNodeAtDepth.serializer(cCharAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
                i = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = j / 10;
                if (j2 < j3) {
                    return null;
                }
            }
            long j4 = j2 * 10;
            long j5 = iDigit;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i++;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }

    public static Integer MediaSessionCompatQueueItem(int i, String str) {
        int i2;
        boolean z;
        int i3;
        str.getClass();
        TuplesKt.RemoteActionCompatParcelizer(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char cCharAt = str.charAt(0);
        int i5 = -2147483647;
        if (removeNodeAtDepth.serializer(cCharAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                i2 = 1;
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i5 = Integer.MIN_VALUE;
                i2 = 1;
            }
        } else {
            i2 = 0;
            z = false;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), i);
            if (iDigit < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + iDigit) {
                return null;
            }
            i4 = i3 - iDigit;
            i2++;
        }
        return z ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    public static byte[] RatingCompat(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(ensureSubscribedToInAppMessageEvents.write);
        bytes.getClass();
        return bytes;
    }

    public static boolean RemoteActionCompatParcelizer(int i, int i2, int i3, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static boolean RemoteActionCompatParcelizer(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.startsWith(str2) : RemoteActionCompatParcelizer(0, 0, str2.length(), str, str2, z);
    }

    public static boolean read(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        if (!z) {
            return str.endsWith(str2);
        }
        return str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    public static String serializer(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str, str2, 0, false, 2);
        return iWrite < 0 ? str : hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(str, iWrite, str2.length() + iWrite, str3).toString();
    }

    public static String write(String str, String str2, String str3) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        int iRemoteActionCompatParcelizer = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer((CharSequence) str, str2, 0, false);
        if (iRemoteActionCompatParcelizer < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iRemoteActionCompatParcelizer);
            sb.append(str3);
            i2 = iRemoteActionCompatParcelizer + length;
            if (iRemoteActionCompatParcelizer >= str.length()) {
                break;
            }
            iRemoteActionCompatParcelizer = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer((CharSequence) str, str2, iRemoteActionCompatParcelizer + i, false);
        } while (iRemoteActionCompatParcelizer > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    public static String RemoteActionCompatParcelizer(byte[] bArr) {
        bArr.getClass();
        return new String(bArr, ensureSubscribedToInAppMessageEvents.write);
    }

    public static String serializer(byte[] bArr, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        bArr.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
        int length = bArr.length;
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.write(i, i2, length);
        return new String(bArr, i, i2 - i, ensureSubscribedToInAppMessageEvents.write);
    }

    public static final void PlaybackStateCompatCustomAction(String str) {
        throw new NumberFormatException(m1$$ExternalSyntheticOutline0.m('\'', "Invalid number format: '", str));
    }

    public static String RemoteActionCompatParcelizer(int i, String str) {
        str.getClass();
        if (i < 0) {
            DrawableTransformation.serializer((Object) m1$$ExternalSyntheticOutline0.m("Count 'n' must be non-negative, but was ", i, '.'));
            return null;
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length != 1) {
            StringBuilder sb = new StringBuilder(str.length() * i);
            if (1 <= i) {
                while (true) {
                    sb.append((CharSequence) str);
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            return sb.toString();
        }
        char cCharAt = str.charAt(0);
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = cCharAt;
        }
        return new String(cArr);
    }

    public static boolean serializer(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static boolean RemoteActionCompatParcelizer(int i, String str, String str2, boolean z) {
        str.getClass();
        if (!z) {
            return str.startsWith(str2, i);
        }
        return RemoteActionCompatParcelizer(i, 0, str2.length(), str, str2, z);
    }

    public static Integer PlaybackStateCompat(String str) {
        str.getClass();
        return MediaSessionCompatQueueItem(10, str);
    }
}
