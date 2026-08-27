package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class CacheGalleryImageUseCaseImpl extends provideRequest {
    public static final char[] RemoteActionCompatParcelizer = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] IconCompatParcelizer;

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
        userAgentHeaderInterceptorKt.read(z, 28, this.IconCompatParcelizer);
    }

    public final String toString() {
        int i;
        byte[] bArr = this.IconCompatParcelizer;
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer(((UserAgentHeaderInterceptorKt.read(length) + length) * 2) + 3);
        stringBuffer.append("#1C");
        if (length < 128) {
            serializer(stringBuffer, length);
        } else {
            byte[] bArr2 = new byte[5];
            int i2 = length;
            int i3 = 5;
            while (true) {
                i = i3 - 1;
                bArr2[i] = (byte) i2;
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i3 = i;
            }
            int i4 = i3 - 2;
            bArr2[i4] = (byte) (128 | (5 - i));
            while (true) {
                int i5 = i4 + 1;
                serializer(stringBuffer, bArr2[i4]);
                if (i5 >= 5) {
                    break;
                }
                i4 = i5;
            }
        }
        for (byte b : bArr) {
            serializer(stringBuffer, b);
        }
        return stringBuffer.toString();
    }

    public CacheGalleryImageUseCaseImpl(byte[] bArr) {
        this.IconCompatParcelizer = bArr;
    }

    public static void serializer(StringBuffer stringBuffer, int i) {
        char[] cArr = RemoteActionCompatParcelizer;
        stringBuffer.append(cArr[(i >>> 4) & 15]);
        stringBuffer.append(cArr[i & 15]);
    }

    @Override // o.provideRequest
    public final boolean serializer(provideRequest providerequest) {
        if (providerequest instanceof CacheGalleryImageUseCaseImpl) {
            return Arrays.equals(this.IconCompatParcelizer, ((CacheGalleryImageUseCaseImpl) providerequest).IconCompatParcelizer);
        }
        return false;
    }
}
