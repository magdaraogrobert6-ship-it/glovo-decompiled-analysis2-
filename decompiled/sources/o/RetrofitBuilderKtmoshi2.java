package o;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class RetrofitBuilderKtmoshi2 extends provideRequest {
    public final char[] RemoteActionCompatParcelizer;

    @Override // o.provideRequest
    public final boolean R_() {
        return false;
    }

    @Override // o.provideRequest
    public final int RemoteActionCompatParcelizer(boolean z) {
        return UserAgentHeaderInterceptorKt.write(this.RemoteActionCompatParcelizer.length * 2, z);
    }

    @Override // o.provideRequest, o.getHostAppUserAgent
    public final int hashCode() {
        char[] cArr = this.RemoteActionCompatParcelizer;
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    @Override // o.provideRequest
    public final void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) throws IOException {
        char[] cArr = this.RemoteActionCompatParcelizer;
        int length = cArr.length;
        userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(30, z);
        userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(length * 2);
        byte[] bArr = new byte[8];
        int i = 0;
        while (i < (length & (-4))) {
            char c = cArr[i];
            char c2 = cArr[i + 1];
            char c3 = cArr[i + 2];
            char c4 = cArr[i + 3];
            i += 4;
            bArr[0] = (byte) (c >> '\b');
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> '\b');
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> '\b');
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> '\b');
            bArr[7] = (byte) c4;
            userAgentHeaderInterceptorKt.IconCompatParcelizer(bArr, 0, 8);
        }
        if (i >= length) {
            return;
        }
        int i2 = 0;
        while (true) {
            char c5 = cArr[i];
            i++;
            bArr[i2] = (byte) (c5 >> '\b');
            int i3 = i2 + 2;
            bArr[i2 + 1] = (byte) c5;
            if (i >= length) {
                userAgentHeaderInterceptorKt.IconCompatParcelizer(bArr, 0, i3);
                return;
            }
            i2 = i3;
        }
    }

    public final String toString() {
        return new String(this.RemoteActionCompatParcelizer);
    }

    public RetrofitBuilderKtmoshi2(char[] cArr) {
        this.RemoteActionCompatParcelizer = cArr;
    }

    @Override // o.provideRequest
    public final boolean serializer(provideRequest providerequest) {
        if (providerequest instanceof RetrofitBuilderKtmoshi2) {
            return Arrays.equals(this.RemoteActionCompatParcelizer, ((RetrofitBuilderKtmoshi2) providerequest).RemoteActionCompatParcelizer);
        }
        return false;
    }
}
