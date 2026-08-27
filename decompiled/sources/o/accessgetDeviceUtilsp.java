package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetDeviceUtilsp extends provideRequest {
    public static final ProvidernetworkModule12 read = new ProvidernetworkModule12(accessgetDeviceUtilsp.class, 3);
    public final byte[] RemoteActionCompatParcelizer;
    public final int serializer;

    @Override // o.provideRequest
    public final boolean R_() {
        return false;
    }

    @Override // o.provideRequest
    public final void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) {
        userAgentHeaderInterceptorKt.read(z, 2, this.RemoteActionCompatParcelizer);
    }

    public static accessgetDeviceUtilsp RemoteActionCompatParcelizer(Object obj) {
        if (obj == null || (obj instanceof accessgetDeviceUtilsp)) {
            return (accessgetDeviceUtilsp) obj;
        }
        if (!(obj instanceof byte[])) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("illegal object in getInstance: ".concat(obj.getClass().getName()));
            return null;
        }
        try {
            return (accessgetDeviceUtilsp) read.fromByteArray((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
        }
    }

    @Override // o.provideRequest
    public final int RemoteActionCompatParcelizer(boolean z) {
        return UserAgentHeaderInterceptorKt.write(this.RemoteActionCompatParcelizer.length, z);
    }

    public final long RemoteActionCompatParcelizer() {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        int length = bArr.length;
        int i = this.serializer;
        if (length - i > 8) {
            throw new ArithmeticException("ASN.1 Integer out of long range");
        }
        int length2 = bArr.length;
        int iMax = Math.max(i, length2 - 8);
        long j = bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length2) {
                return j;
            }
            j = (j << 8) | ((long) (bArr[iMax] & 255));
        }
    }

    @Override // o.provideRequest, o.getHostAppUserAgent
    public final int hashCode() {
        return accessbootstrapIfNeeded.read(this.RemoteActionCompatParcelizer);
    }

    public final int read() {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        int length = bArr.length;
        int i = this.serializer;
        if (length - i <= 4) {
            return write(i, bArr);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    public final boolean serializer(int i) {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        int length = bArr.length;
        int i2 = this.serializer;
        return length - i2 <= 4 && write(i2, bArr) == i;
    }

    public final String toString() {
        return new BigInteger(this.RemoteActionCompatParcelizer).toString();
    }

    public accessgetDeviceUtilsp(byte[] bArr) {
        if (serializer(bArr)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("malformed integer");
            throw null;
        }
        this.RemoteActionCompatParcelizer = bArr;
        int length = bArr.length;
        int i = 0;
        while (i < length - 1) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            } else {
                i = i2;
            }
        }
        this.serializer = i;
    }

    public static int write(int i, byte[] bArr) {
        int length = bArr.length;
        int iMax = Math.max(i, length - 4);
        int i2 = bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length) {
                return i2;
            }
            i2 = (i2 << 8) | (bArr[iMax] & 255);
        }
    }

    @Override // o.provideRequest
    public final boolean serializer(provideRequest providerequest) {
        if (providerequest instanceof accessgetDeviceUtilsp) {
            return Arrays.equals(this.RemoteActionCompatParcelizer, ((accessgetDeviceUtilsp) providerequest).RemoteActionCompatParcelizer);
        }
        return false;
    }

    public static boolean serializer(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            return (length == 1 || bArr[0] != (bArr[1] >> 7) || accessstartUpdater.IconCompatParcelizer("org.bouncycastle.asn1.allow_unsafe_integer")) ? false : true;
        }
        return true;
    }

    public accessgetDeviceUtilsp(BigInteger bigInteger) {
        this.RemoteActionCompatParcelizer = bigInteger.toByteArray();
        this.serializer = 0;
    }

    public accessgetDeviceUtilsp(long j) {
        this.RemoteActionCompatParcelizer = BigInteger.valueOf(j).toByteArray();
        this.serializer = 0;
    }
}
