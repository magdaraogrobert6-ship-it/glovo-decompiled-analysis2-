package o;

import org.bouncycastle.asn1.ASN1UniversalType;

/* JADX INFO: loaded from: classes4.dex */
public final class ProvidernetworkModule12 extends ASN1UniversalType {
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProvidernetworkModule12(Class cls, int i) {
        super(0, cls);
        this.serializer = i;
    }

    @Override // org.bouncycastle.asn1.ASN1UniversalType
    public provideRequest fromImplicitConstructed(ProvidernetworkModule1 providernetworkModule1) {
        int i = this.serializer;
        if (i == 0) {
            return providernetworkModule1.PlaybackStateCompatCustomAction();
        }
        if (i == 1) {
            return providernetworkModule1.MediaDescriptionCompat();
        }
        if (i != 5) {
            return i != 6 ? super.fromImplicitConstructed(providernetworkModule1) : providernetworkModule1;
        }
        return providernetworkModule1.MediaSessionCompatToken();
    }

    @Override // org.bouncycastle.asn1.ASN1UniversalType
    public provideRequest fromImplicitPrimitive(UrlBuilderKt urlBuilderKt) {
        int i = this.serializer;
        if (i == 1) {
            return TokenRefreshAuthenticator.write(urlBuilderKt.IconCompatParcelizer);
        }
        if (i == 2) {
            return new PushNotificationParserObj(urlBuilderKt.IconCompatParcelizer);
        }
        if (i == 3) {
            return new accessgetDeviceUtilsp(urlBuilderKt.IconCompatParcelizer);
        }
        if (i != 4) {
            return i != 5 ? super.fromImplicitPrimitive(urlBuilderKt) : urlBuilderKt;
        }
        return getNetworkModule.RemoteActionCompatParcelizer(urlBuilderKt.IconCompatParcelizer, false);
    }
}
