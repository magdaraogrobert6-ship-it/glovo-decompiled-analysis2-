package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class shouldRetryWithExistingToken extends provideRequest {
    public static final shouldRetryWithExistingToken[] IconCompatParcelizer = new shouldRetryWithExistingToken[12];
    public final byte[] write;

    @Override // o.provideRequest
    public final boolean R_() {
        return false;
    }

    @Override // o.provideRequest
    public final int RemoteActionCompatParcelizer(boolean z) {
        return UserAgentHeaderInterceptorKt.write(this.write.length, z);
    }

    @Override // o.provideRequest, o.getHostAppUserAgent
    public final int hashCode() {
        return accessbootstrapIfNeeded.read(this.write);
    }

    @Override // o.provideRequest
    public final void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) {
        userAgentHeaderInterceptorKt.read(z, 10, this.write);
    }

    public shouldRetryWithExistingToken(byte[] bArr, boolean z) {
        if (accessgetDeviceUtilsp.serializer(bArr)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("malformed enumerated");
            throw null;
        }
        int i = 0;
        if ((bArr[0] & 128) != 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("enumerated must be non-negative");
            throw null;
        }
        this.write = z ? accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr) : bArr;
        int length = bArr.length;
        while (i < length - 1) {
            byte b = bArr[i];
            i++;
            if (b != (bArr[i] >> 7)) {
                return;
            }
        }
    }

    public static shouldRetryWithExistingToken IconCompatParcelizer(byte[] bArr, boolean z) {
        if (bArr.length > 1) {
            return new shouldRetryWithExistingToken(bArr, z);
        }
        if (bArr.length == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ENUMERATED has zero length");
            return null;
        }
        int i = bArr[0] & 255;
        if (i >= 12) {
            return new shouldRetryWithExistingToken(bArr, z);
        }
        shouldRetryWithExistingToken[] shouldretrywithexistingtokenArr = IconCompatParcelizer;
        shouldRetryWithExistingToken shouldretrywithexistingtoken = shouldretrywithexistingtokenArr[i];
        if (shouldretrywithexistingtoken != null) {
            return shouldretrywithexistingtoken;
        }
        shouldRetryWithExistingToken shouldretrywithexistingtoken2 = new shouldRetryWithExistingToken(bArr, z);
        shouldretrywithexistingtokenArr[i] = shouldretrywithexistingtoken2;
        return shouldretrywithexistingtoken2;
    }

    @Override // o.provideRequest
    public final boolean serializer(provideRequest providerequest) {
        if (providerequest instanceof shouldRetryWithExistingToken) {
            return Arrays.equals(this.write, ((shouldRetryWithExistingToken) providerequest).write);
        }
        return false;
    }
}
