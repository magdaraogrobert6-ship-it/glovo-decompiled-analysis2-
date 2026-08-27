package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class Providerclient2 extends provideRequest {
    public static final ConcurrentHashMap read = new ConcurrentHashMap();
    public final byte[] IconCompatParcelizer;
    public String RemoteActionCompatParcelizer = null;

    @Override // o.provideRequest
    public final boolean R_() {
        return false;
    }

    @Override // o.provideRequest
    public final int RemoteActionCompatParcelizer(boolean z) {
        return UserAgentHeaderInterceptorKt.write(this.IconCompatParcelizer.length, z);
    }

    @Override // o.provideRequest, o.getHostAppUserAgent
    public final int hashCode() {
        return accessbootstrapIfNeeded.read(this.IconCompatParcelizer);
    }

    @Override // o.provideRequest
    public final void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) {
        userAgentHeaderInterceptorKt.read(z, 13, this.IconCompatParcelizer);
    }

    public final String toString() {
        String str;
        synchronized (this) {
            if (this.RemoteActionCompatParcelizer == null) {
                byte[] bArr = this.IconCompatParcelizer;
                StringBuffer stringBuffer = new StringBuffer();
                boolean z = true;
                BigInteger bigIntegerShiftLeft = null;
                long j = 0;
                for (int i = 0; i != bArr.length; i++) {
                    byte b = bArr[i];
                    if (j <= 72057594037927808L) {
                        long j2 = j + ((long) (b & 127));
                        if ((b & 128) == 0) {
                            if (z) {
                                z = false;
                            } else {
                                stringBuffer.append('.');
                            }
                            stringBuffer.append(j2);
                            j = 0;
                        } else {
                            j = j2 << 7;
                        }
                    } else {
                        if (bigIntegerShiftLeft == null) {
                            bigIntegerShiftLeft = BigInteger.valueOf(j);
                        }
                        BigInteger bigIntegerOr = bigIntegerShiftLeft.or(BigInteger.valueOf(b & 127));
                        if ((b & 128) == 0) {
                            if (z) {
                                z = false;
                            } else {
                                stringBuffer.append('.');
                            }
                            stringBuffer.append(bigIntegerOr);
                            bigIntegerShiftLeft = null;
                            j = 0;
                        } else {
                            bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                        }
                    }
                }
                this.RemoteActionCompatParcelizer = stringBuffer.toString();
            }
            str = this.RemoteActionCompatParcelizer;
        }
        return str;
    }

    public Providerclient2(byte[] bArr) {
        this.IconCompatParcelizer = bArr;
    }

    @Override // o.provideRequest
    public final boolean serializer(provideRequest providerequest) {
        if (this == providerequest) {
            return true;
        }
        if (providerequest instanceof Providerclient2) {
            return Arrays.equals(this.IconCompatParcelizer, ((Providerclient2) providerequest).IconCompatParcelizer);
        }
        return false;
    }

    public static void write(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int iBitLength = (bigInteger.bitLength() + 6) / 7;
        if (iBitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[iBitLength];
        int i = iBitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) (bigInteger.intValue() | androidx.compose.ui.graphics.Fields.SpotShadowColor);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & 127);
        byteArrayOutputStream.write(bArr, 0, iBitLength);
    }

    public static boolean IconCompatParcelizer(byte[] bArr) {
        if (bArr.length < 1) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            if (z && (bArr[i] & 255) == 128) {
                return false;
            }
            z = (bArr[i] & 128) == 0;
        }
        return z;
    }

    public static Providerclient2 read(byte[] bArr, boolean z) {
        if (bArr.length > 4096) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("exceeded relative OID contents length limit");
            return null;
        }
        Providerclient2 providerclient2 = (Providerclient2) read.get(new getClientcustomerchat_release(bArr));
        if (providerclient2 != null) {
            return providerclient2;
        }
        if (!IconCompatParcelizer(bArr)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("invalid relative OID contents");
            return null;
        }
        if (z) {
            bArr = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
        }
        return new Providerclient2(bArr);
    }

    public static boolean write(int i, String str) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            int i3 = length - 1;
            if (i3 < i) {
                if (i2 == 0 || (i2 > 1 && str.charAt(length) == '0')) {
                    break;
                }
                return true;
            }
            char cCharAt = str.charAt(i3);
            if (cCharAt == '.') {
                if (i2 == 0 || (i2 > 1 && str.charAt(length) == '0')) {
                    break;
                }
                i2 = 0;
                length = i3;
            } else {
                if ('0' > cCharAt || cCharAt > '9') {
                    break;
                }
                i2++;
                length = i3;
            }
        }
        return false;
    }

    public static void write(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) (((int) j) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }
}
