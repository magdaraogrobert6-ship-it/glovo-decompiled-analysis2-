package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1OctetString;

/* JADX INFO: loaded from: classes4.dex */
public final class UserPropertiesDataStoreHelperImpl extends getHostAppUserAgent {
    public final byte[] read;
    public final byte[] serializer;

    @Override // o.getHostAppUserAgent, o.logErrordefault
    public final provideRequest RatingCompat() {
        extractTokenFromHeader extracttokenfromheader = new extractTokenFromHeader();
        extracttokenfromheader.write(new accessgetDeviceUtilsp(0L));
        extracttokenfromheader.write(new UrlBuilderKt(this.read, 0));
        extracttokenfromheader.write(new UrlBuilderKt(this.serializer, 0));
        DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(extracttokenfromheader, false);
        deliveryInfoCompanion.serializer = -1;
        return deliveryInfoCompanion;
    }

    public UserPropertiesDataStoreHelperImpl(ProvidernetworkModule1 providernetworkModule1) {
        if (!accessgetDeviceUtilsp.RemoteActionCompatParcelizer(providernetworkModule1.IconCompatParcelizer(0)).serializer(0)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("unknown version of sequence");
            throw null;
        }
        this.read = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(ASN1OctetString.serializer(providernetworkModule1.IconCompatParcelizer(1)).IconCompatParcelizer);
        this.serializer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(ASN1OctetString.serializer(providernetworkModule1.IconCompatParcelizer(2)).IconCompatParcelizer);
    }

    public UserPropertiesDataStoreHelperImpl(byte[] bArr, byte[] bArr2) {
        this.read = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
        this.serializer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr2);
    }
}
