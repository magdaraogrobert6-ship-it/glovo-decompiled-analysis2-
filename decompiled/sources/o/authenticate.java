package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class authenticate extends provideRequest {
    public final byte[] IconCompatParcelizer;

    @Override // o.provideRequest
    public final boolean R_() {
        return false;
    }

    public final boolean IconCompatParcelizer(int i) {
        byte b;
        byte[] bArr = this.IconCompatParcelizer;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }

    @Override // o.provideRequest
    public int RemoteActionCompatParcelizer(boolean z) {
        return UserAgentHeaderInterceptorKt.write(this.IconCompatParcelizer.length, z);
    }

    @Override // o.provideRequest, o.getHostAppUserAgent
    public final int hashCode() {
        return accessbootstrapIfNeeded.read(this.IconCompatParcelizer);
    }

    @Override // o.provideRequest
    public void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) {
        userAgentHeaderInterceptorKt.read(z, 24, this.IconCompatParcelizer);
    }

    @Override // o.provideRequest
    public provideRequest toDERObject() {
        return new canParse(this.IconCompatParcelizer);
    }

    public authenticate(byte[] bArr) {
        if (bArr.length < 4) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("GeneralizedTime string too short");
            throw null;
        }
        this.IconCompatParcelizer = bArr;
        if (IconCompatParcelizer(0) && IconCompatParcelizer(1) && IconCompatParcelizer(2) && IconCompatParcelizer(3)) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("illegal characters in GeneralizedTime string");
        throw null;
    }

    @Override // o.provideRequest
    public final boolean serializer(provideRequest providerequest) {
        if (!(providerequest instanceof authenticate)) {
            return false;
        }
        return Arrays.equals(this.IconCompatParcelizer, ((authenticate) providerequest).IconCompatParcelizer);
    }
}
