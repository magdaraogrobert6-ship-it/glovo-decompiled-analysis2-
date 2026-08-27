package o;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1OctetString;

/* JADX INFO: loaded from: classes4.dex */
public final class getMoshiConverter extends ProvidernetworkModule1 {
    @Override // o.ProvidernetworkModule1
    public final TokenRefreshAuthenticator MediaDescriptionCompat() {
        return new getCallAdapter(read());
    }

    @Override // o.ProvidernetworkModule1
    public final ASN1OctetString MediaSessionCompatToken() {
        ASN1OctetString[] aSN1OctetStringArrSerializer = serializer();
        return new RetrofitBuilderKtDefaultRetrofitBuilder2(RetrofitBuilderKtDefaultRetrofitBuilder2.serializer(aSN1OctetStringArrSerializer), aSN1OctetStringArrSerializer);
    }

    @Override // o.provideRequest
    public final void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) throws IOException {
        userAgentHeaderInterceptorKt.IconCompatParcelizer(z, 48, this.RemoteActionCompatParcelizer);
    }

    @Override // o.ProvidernetworkModule1
    public final provideMoshi PlaybackStateCompatCustomAction() {
        return new RetrofitBuilderKtcallAdapter2(false, this.RemoteActionCompatParcelizer);
    }

    @Override // o.provideRequest
    public final int RemoteActionCompatParcelizer(boolean z) {
        int iRemoteActionCompatParcelizer = z ? 4 : 3;
        int length = this.RemoteActionCompatParcelizer.length;
        for (int i = 0; i < length; i++) {
            iRemoteActionCompatParcelizer += this.RemoteActionCompatParcelizer[i].RatingCompat().RemoteActionCompatParcelizer(true);
        }
        return iRemoteActionCompatParcelizer;
    }

    public getMoshiConverter() {
    }

    public getMoshiConverter(logErrordefault logerrordefault) {
        super(logerrordefault);
    }

    public getMoshiConverter(extractTokenFromHeader extracttokenfromheader) {
        super(extracttokenfromheader);
    }
}
