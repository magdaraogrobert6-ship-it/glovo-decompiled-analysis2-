package o;

import org.bouncycastle.asn1.ASN1OctetString;

/* JADX INFO: loaded from: classes4.dex */
public final class UserJsonAdapter extends getHostAppUserAgent {
    public byte[] IconCompatParcelizer;
    public byte[] write;

    @Override // o.getHostAppUserAgent, o.logErrordefault
    public final provideRequest RatingCompat() {
        extractTokenFromHeader extracttokenfromheader = new extractTokenFromHeader();
        extracttokenfromheader.write(new UrlBuilderKt(this.IconCompatParcelizer, 0));
        extracttokenfromheader.write(new UrlBuilderKt(this.write, 0));
        DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(extracttokenfromheader, false);
        deliveryInfoCompanion.serializer = -1;
        return deliveryInfoCompanion;
    }

    public static UserJsonAdapter read(provideRequest providerequest) {
        if (providerequest == null) {
            return null;
        }
        ProvidernetworkModule1 providernetworkModule1RemoteActionCompatParcelizer = ProvidernetworkModule1.RemoteActionCompatParcelizer(providerequest);
        UserJsonAdapter userJsonAdapter = new UserJsonAdapter();
        userJsonAdapter.IconCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(ASN1OctetString.serializer(providernetworkModule1RemoteActionCompatParcelizer.IconCompatParcelizer(0)).IconCompatParcelizer);
        userJsonAdapter.write = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(ASN1OctetString.serializer(providernetworkModule1RemoteActionCompatParcelizer.IconCompatParcelizer(1)).IconCompatParcelizer);
        return userJsonAdapter;
    }
}
