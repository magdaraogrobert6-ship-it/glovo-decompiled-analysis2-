package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class getCallAdapter extends TokenRefreshAuthenticator {
    public final int IconCompatParcelizer;
    public final TokenRefreshAuthenticator[] serializer;

    public getCallAdapter(TokenRefreshAuthenticator[] tokenRefreshAuthenticatorArr) {
        super(read(tokenRefreshAuthenticatorArr));
        this.serializer = tokenRefreshAuthenticatorArr;
        this.IconCompatParcelizer = 1000;
    }

    @Override // o.provideRequest
    public final boolean R_() {
        return this.serializer != null || this.write.length > this.IconCompatParcelizer;
    }

    @Override // o.provideRequest
    public final int RemoteActionCompatParcelizer(boolean z) {
        boolean zR_ = R_();
        byte[] bArr = this.write;
        if (!zR_) {
            return UserAgentHeaderInterceptorKt.write(bArr.length, z);
        }
        int iRemoteActionCompatParcelizer = z ? 4 : 3;
        TokenRefreshAuthenticator[] tokenRefreshAuthenticatorArr = this.serializer;
        if (tokenRefreshAuthenticatorArr != null) {
            for (TokenRefreshAuthenticator tokenRefreshAuthenticator : tokenRefreshAuthenticatorArr) {
                iRemoteActionCompatParcelizer += tokenRefreshAuthenticator.RemoteActionCompatParcelizer(true);
            }
            return iRemoteActionCompatParcelizer;
        }
        if (bArr.length < 2) {
            return iRemoteActionCompatParcelizer;
        }
        int length = bArr.length;
        int i = this.IconCompatParcelizer;
        int i2 = i - 1;
        int i3 = (length - 2) / i2;
        return UserAgentHeaderInterceptorKt.write(bArr.length - (i2 * i3), true) + (UserAgentHeaderInterceptorKt.write(i, true) * i3) + iRemoteActionCompatParcelizer;
    }

    @Override // o.provideRequest
    public final void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) throws IOException {
        boolean zR_ = R_();
        byte[] bArr = this.write;
        if (!zR_) {
            int length = bArr.length;
            userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(3, z);
            userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(length);
            userAgentHeaderInterceptorKt.IconCompatParcelizer(bArr, 0, length);
            return;
        }
        userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(35, z);
        userAgentHeaderInterceptorKt.write(androidx.compose.ui.graphics.Fields.SpotShadowColor);
        TokenRefreshAuthenticator[] tokenRefreshAuthenticatorArr = this.serializer;
        if (tokenRefreshAuthenticatorArr != null) {
            userAgentHeaderInterceptorKt.serializer(tokenRefreshAuthenticatorArr);
        } else if (bArr.length >= 2) {
            byte b = bArr[0];
            int length2 = bArr.length;
            int i = length2 - 1;
            int i2 = this.IconCompatParcelizer;
            int i3 = i2 - 1;
            while (i > i3) {
                userAgentHeaderInterceptorKt.write(3);
                userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(i2);
                userAgentHeaderInterceptorKt.write(0);
                userAgentHeaderInterceptorKt.IconCompatParcelizer(bArr, length2 - i, i3);
                i -= i3;
            }
            userAgentHeaderInterceptorKt.write(3);
            userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(i + 1);
            userAgentHeaderInterceptorKt.write(b);
            userAgentHeaderInterceptorKt.IconCompatParcelizer(bArr, length2 - i, i);
        }
        userAgentHeaderInterceptorKt.write(0);
        userAgentHeaderInterceptorKt.write(0);
    }

    public static byte[] read(TokenRefreshAuthenticator[] tokenRefreshAuthenticatorArr) {
        int length = tokenRefreshAuthenticatorArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return tokenRefreshAuthenticatorArr[0].write;
        }
        int i = length - 1;
        int length2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArr = tokenRefreshAuthenticatorArr[i2].write;
            if (bArr[0] != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("only the last nested bitstring can have padding");
                return null;
            }
            length2 += bArr.length - 1;
        }
        byte[] bArr2 = tokenRefreshAuthenticatorArr[i].write;
        byte b = bArr2[0];
        byte[] bArr3 = new byte[length2 + bArr2.length];
        bArr3[0] = b;
        int i3 = 1;
        for (TokenRefreshAuthenticator tokenRefreshAuthenticator : tokenRefreshAuthenticatorArr) {
            byte[] bArr4 = tokenRefreshAuthenticator.write;
            int length3 = bArr4.length - 1;
            System.arraycopy(bArr4, 1, bArr3, i3, length3);
            i3 += length3;
        }
        return bArr3;
    }

    public getCallAdapter(byte[] bArr, int i) {
        super(bArr, i);
        this.serializer = null;
        this.IconCompatParcelizer = 1000;
    }
}
