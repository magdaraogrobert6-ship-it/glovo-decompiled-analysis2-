package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class RetrofitBuilderKtcallAdapter2 extends provideMoshi {
    @Override // o.provideRequest
    public final void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) throws IOException {
        userAgentHeaderInterceptorKt.IconCompatParcelizer(z, 49, this.RemoteActionCompatParcelizer);
    }

    @Override // o.provideRequest
    public final int RemoteActionCompatParcelizer(boolean z) {
        int iRemoteActionCompatParcelizer = z ? 4 : 3;
        for (logErrordefault logerrordefault : this.RemoteActionCompatParcelizer) {
            iRemoteActionCompatParcelizer += logerrordefault.RatingCompat().RemoteActionCompatParcelizer(true);
        }
        return iRemoteActionCompatParcelizer;
    }

    public RetrofitBuilderKtcallAdapter2(boolean z, logErrordefault[] logerrordefaultArr) {
        super(z, logerrordefaultArr);
    }

    public RetrofitBuilderKtcallAdapter2(extractTokenFromHeader extracttokenfromheader) {
        super(extracttokenfromheader);
    }
}
