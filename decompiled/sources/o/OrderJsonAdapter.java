package o;

import org.bouncycastle.asn1.ASN1OctetString;

/* JADX INFO: loaded from: classes4.dex */
public final class OrderJsonAdapter extends getHostAppUserAgent {
    public byte[] read;

    @Override // o.getHostAppUserAgent, o.logErrordefault
    public final provideRequest RatingCompat() {
        extractTokenFromHeader extracttokenfromheader = new extractTokenFromHeader();
        extracttokenfromheader.write(new UrlBuilderKt(this.read, 0));
        DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(extracttokenfromheader, false);
        deliveryInfoCompanion.serializer = -1;
        return deliveryInfoCompanion;
    }

    public OrderJsonAdapter(byte[] bArr) {
        this.read = bArr;
    }

    public static OrderJsonAdapter IconCompatParcelizer(logErrordefault logerrordefault) {
        if (logerrordefault instanceof OrderJsonAdapter) {
            return (OrderJsonAdapter) logerrordefault;
        }
        if (logerrordefault == null) {
            return null;
        }
        ProvidernetworkModule1 providernetworkModule1RemoteActionCompatParcelizer = ProvidernetworkModule1.RemoteActionCompatParcelizer(logerrordefault);
        OrderJsonAdapter orderJsonAdapter = new OrderJsonAdapter();
        orderJsonAdapter.read = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(ASN1OctetString.serializer(providernetworkModule1RemoteActionCompatParcelizer.IconCompatParcelizer(0)).IconCompatParcelizer);
        return orderJsonAdapter;
    }

    public OrderJsonAdapter() {
    }
}
