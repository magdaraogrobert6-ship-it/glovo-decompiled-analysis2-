package o;

import org.bouncycastle.asn1.ASN1OctetString;

/* JADX INFO: loaded from: classes4.dex */
public final class clearEvaluationsfwf_client_release {
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ clearEvaluationsfwf_client_release(int i) {
        this.IconCompatParcelizer = i;
    }

    public static ChatService serializer(getStructure getstructure, TokenRefreshAuthenticator tokenRefreshAuthenticator) {
        try {
            provideRequest providerequestRemoteActionCompatParcelizer = provideRequest.RemoteActionCompatParcelizer(tokenRefreshAuthenticator.serializer());
            if (!(providerequestRemoteActionCompatParcelizer instanceof ProvidernetworkModule1)) {
                return new ChatService(getstructure, ASN1OctetString.serializer((Object) providerequestRemoteActionCompatParcelizer).IconCompatParcelizer);
            }
            ProvidernetworkModule1 providernetworkModule1RemoteActionCompatParcelizer = ProvidernetworkModule1.RemoteActionCompatParcelizer(providerequestRemoteActionCompatParcelizer);
            return new ChatService(getstructure, ASN1OctetString.serializer(providernetworkModule1RemoteActionCompatParcelizer.IconCompatParcelizer(0)).IconCompatParcelizer, ASN1OctetString.serializer(providernetworkModule1RemoteActionCompatParcelizer.IconCompatParcelizer(1)).IconCompatParcelizer);
        } catch (Exception unused) {
            return new ChatService(getstructure, tokenRefreshAuthenticator.serializer());
        }
    }
}
