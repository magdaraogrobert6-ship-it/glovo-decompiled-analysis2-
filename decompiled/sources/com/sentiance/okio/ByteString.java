package com.sentiance.okio;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import o.DrawableTransformation;
import o.isAppSetIdReadingEnabled;
import o.isInAppMessageAccessibilityExclusiveModeEnabled;
import o.isTouchModeRequiredForHtmlInAppMessages;
import o.r8lambdaBEyrNr8p6809BwlBoRO_sTaNs;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes3.dex */
public class ByteString implements Serializable, Comparable<ByteString> {
    private static final long serialVersionUID = 1;
    public transient String RemoteActionCompatParcelizer;
    final byte[] data;
    public transient int serializer;
    public static final char[] read = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final ByteString write = write(new byte[0]);

    public ByteString serializer() {
        int i = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new ByteString(bArr2);
            }
            i++;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    public String IconCompatParcelizer() {
        byte[] bArr;
        byte[] bArr2 = this.data;
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (true) {
            bArr = isTouchModeRequiredForHtmlInAppMessages.read;
            if (i >= length) {
                break;
            }
            bArr3[i2] = bArr[(bArr2[i] & 255) >> 2];
            int i3 = i + 1;
            bArr3[i2 + 1] = bArr[((bArr2[i] & 3) << 4) | ((bArr2[i3] & 255) >> 4)];
            byte b = bArr2[i3];
            int i4 = i + 2;
            bArr3[i2 + 2] = bArr[((b & 15) << 2) | ((bArr2[i4] & 255) >> 6)];
            bArr3[i2 + 3] = bArr[bArr2[i4] & 63];
            i += 3;
            i2 += 4;
        }
        int length2 = bArr2.length % 3;
        if (length2 == 1) {
            bArr3[i2] = bArr[(bArr2[length] & 255) >> 2];
            bArr3[i2 + 1] = bArr[(bArr2[length] & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            bArr3[i2] = bArr[(bArr2[length] & 255) >> 2];
            byte b2 = bArr2[length];
            int i5 = length + 1;
            bArr3[i2 + 1] = bArr[((b2 & 3) << 4) | ((bArr2[i5] & 255) >> 4)];
            bArr3[i2 + 2] = bArr[(bArr2[i5] & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(e);
            return null;
        }
    }

    public byte[] MediaBrowserCompatMediaItem() {
        return (byte[]) this.data.clone();
    }

    public ByteString RemoteActionCompatParcelizer() {
        byte[] bArr = this.data;
        if (64 > bArr.length) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(this.data.length, ")", new StringBuilder("endIndex > length(")));
            return null;
        }
        if (64 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, 64);
        return new ByteString(bArr2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(ByteString byteString) {
        ByteString byteString2 = byteString;
        int iWrite = write();
        int iWrite2 = byteString2.write();
        int iMin = Math.min(iWrite, iWrite2);
        for (int i = 0; i < iMin; i++) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i) & 255;
            int iRemoteActionCompatParcelizer2 = byteString2.RemoteActionCompatParcelizer(i) & 255;
            if (iRemoteActionCompatParcelizer != iRemoteActionCompatParcelizer2) {
                return iRemoteActionCompatParcelizer < iRemoteActionCompatParcelizer2 ? -1 : 1;
            }
        }
        if (iWrite == iWrite2) {
            return 0;
        }
        return iWrite < iWrite2 ? -1 : 1;
    }

    public String read() {
        byte[] bArr = this.data;
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            byte b = bArr[i2];
            char[] cArr2 = read;
            cArr[i] = cArr2[(b >> 4) & 15];
            cArr[i + 1] = cArr2[b & 15];
            i2++;
            i += 2;
        }
        return new String(cArr);
    }

    public String toString() {
        if (this.data.length == 0) {
            return "[size=0]";
        }
        String strRatingCompat = RatingCompat();
        int length = strRatingCompat.length();
        int length2 = 0;
        int i = 0;
        while (true) {
            if (length2 >= length) {
                length2 = strRatingCompat.length();
                break;
            }
            if (i != 64) {
                int iCodePointAt = strRatingCompat.codePointAt(length2);
                if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                    length2 = -1;
                    break;
                }
                i++;
                length2 += Character.charCount(iCodePointAt);
            } else {
                break;
            }
        }
        if (length2 != -1) {
            String strReplace = strRatingCompat.substring(0, length2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (length2 >= strRatingCompat.length()) {
                return ff$$ExternalSyntheticOutline0.m("[text=", strReplace, "]");
            }
            return "[size=" + this.data.length + " text=" + strReplace + "…]";
        }
        if (this.data.length <= 64) {
            return "[hex=" + read() + "]";
        }
        return "[size=" + this.data.length + " hex=" + RemoteActionCompatParcelizer().read() + "…]";
    }

    public int write() {
        return this.data.length;
    }

    public ByteString(byte[] bArr) {
        this.data = bArr;
    }

    public static ByteString IconCompatParcelizer(String str) {
        if (str != null) {
            ByteString byteString = new ByteString(str.getBytes(isInAppMessageAccessibilityExclusiveModeEnabled.RemoteActionCompatParcelizer));
            byteString.RemoteActionCompatParcelizer = str;
            return byteString;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("s == null");
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int iWrite = byteString.write();
            byte[] bArr = this.data;
            if (iWrite == bArr.length && byteString.serializer(bArr, 0, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public final ByteString serializer(String str) {
        try {
            return write(MessageDigest.getInstance(str).digest(this.data));
        } catch (NoSuchAlgorithmException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(e);
            return null;
        }
    }

    public int hashCode() {
        int i = this.serializer;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.data);
        this.serializer = iHashCode;
        return iHashCode;
    }

    public static ByteString RemoteActionCompatParcelizer(String str) {
        if (str.length() % 2 != 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (RemoteActionCompatParcelizer(str.charAt(i2 + 1)) + (RemoteActionCompatParcelizer(str.charAt(i2)) << 4));
        }
        return write(bArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        int i = objectInputStream.readInt();
        if (i < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "byteCount < 0: "));
            return;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = objectInputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                DrawableTransformation.IconCompatParcelizer();
                return;
            }
            i2 += i3;
        }
        ByteString byteString = new ByteString(bArr);
        try {
            Field declaredField = ByteString.class.getDeclaredField(RemoteMessageConst.DATA);
            declaredField.setAccessible(true);
            try {
                declaredField.set(this, byteString.data);
            } catch (IllegalAccessException unused) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, isAppSetIdReadingEnabled.serializer());
            } catch (NoSuchFieldException unused2) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, isAppSetIdReadingEnabled.serializer());
            }
        } catch (IllegalAccessException unused3) {
        } catch (NoSuchFieldException unused4) {
        }
    }

    public String RatingCompat() {
        String str = this.RemoteActionCompatParcelizer;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.data, isInAppMessageAccessibilityExclusiveModeEnabled.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = str2;
        return str2;
    }

    public static ByteString write(byte... bArr) {
        if (bArr != null) {
            return new ByteString((byte[]) bArr.clone());
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("data == null");
        return null;
    }

    public static int RemoteActionCompatParcelizer(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(c, "Unexpected hex digit: ");
        return 0;
    }

    public byte RemoteActionCompatParcelizer(int i) {
        return this.data[i];
    }

    public void write(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans) {
        byte[] bArr = this.data;
        r8lambdabeyrnr8p6809bwlboro_stans.write(bArr, 0, bArr.length);
    }

    public boolean IconCompatParcelizer(ByteString byteString, int i) {
        return byteString.serializer(this.data, 0, 0, i);
    }

    public boolean serializer(byte[] bArr, int i, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.data;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                Charset charset = isInAppMessageAccessibilityExclusiveModeEnabled.RemoteActionCompatParcelizer;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (bArr2[i4 + i] == bArr[i4 + i2]) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}
