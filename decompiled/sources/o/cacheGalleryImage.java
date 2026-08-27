package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class cacheGalleryImage extends provideRequest {
    public final byte[] read;

    @Override // o.provideRequest
    public final boolean R_() {
        return false;
    }

    @Override // o.provideRequest
    public final int RemoteActionCompatParcelizer(boolean z) {
        return UserAgentHeaderInterceptorKt.write(this.read.length, z);
    }

    @Override // o.provideRequest, o.getHostAppUserAgent
    public final int hashCode() {
        return accessbootstrapIfNeeded.read(this.read);
    }

    @Override // o.provideRequest
    public final void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) {
        userAgentHeaderInterceptorKt.read(z, 12, this.read);
    }

    public final String toString() {
        int i = evaluateFeaturefwf_client_releasedefault.RemoteActionCompatParcelizer;
        byte[] bArr = this.read;
        int length = bArr.length;
        char[] cArr = new char[length];
        short[] sArr = getEvaluationfwf_client_releasedefault.IconCompatParcelizer;
        int length2 = bArr.length;
        int i2 = 0;
        int i3 = 0;
        loop0: while (i3 < length2) {
            int i4 = i3 + 1;
            byte b = bArr[i3];
            if (b < 0) {
                short s = getEvaluationfwf_client_releasedefault.IconCompatParcelizer[b & 127];
                int i5 = s >>> 8;
                byte b2 = (byte) s;
                while (true) {
                    if (b2 >= 0) {
                        if (i4 < length2) {
                            byte b3 = bArr[i4];
                            i5 = (i5 << 6) | (b3 & 63);
                            b2 = getEvaluationfwf_client_releasedefault.RemoteActionCompatParcelizer[b2 + ((b3 & 255) >>> 4)];
                            i4++;
                        }
                    } else if (b2 != -2) {
                        if (i5 <= 65535) {
                            if (i2 < length) {
                                cArr[i2] = (char) i5;
                                i2++;
                                i3 = i4;
                            }
                        } else if (i2 < length - 1) {
                            cArr[i2] = (char) ((i5 >>> 10) + 55232);
                            cArr[i2 + 1] = (char) ((i5 & 1023) | 56320);
                            i2 += 2;
                            i3 = i4;
                        }
                    }
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            cArr[i2] = (char) b;
            i2++;
            i3 = i4;
        }
        if (i2 >= 0) {
            return new String(cArr, 0, i2);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid UTF-8 input");
        return null;
    }

    public cacheGalleryImage(byte[] bArr) {
        this.read = bArr;
    }

    @Override // o.provideRequest
    public final boolean serializer(provideRequest providerequest) {
        if (providerequest instanceof cacheGalleryImage) {
            return Arrays.equals(this.read, ((cacheGalleryImage) providerequest).read);
        }
        return false;
    }
}
