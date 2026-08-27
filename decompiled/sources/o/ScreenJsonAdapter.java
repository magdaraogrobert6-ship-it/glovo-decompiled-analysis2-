package o;

import org.bouncycastle.asn1.ASN1OctetString;

/* JADX INFO: loaded from: classes4.dex */
public final class ScreenJsonAdapter extends getHostAppUserAgent {
    public final accessgetFwfDataQueriesp IconCompatParcelizer;
    public final WebViewPreloadingTypeCompanion RemoteActionCompatParcelizer;
    public final int serializer;
    public final int write;

    @Override // o.getHostAppUserAgent, o.logErrordefault
    public final provideRequest RatingCompat() {
        extractTokenFromHeader extracttokenfromheader = new extractTokenFromHeader();
        extracttokenfromheader.write(new accessgetDeviceUtilsp(this.write));
        extracttokenfromheader.write(new accessgetDeviceUtilsp(this.serializer));
        extracttokenfromheader.write(new UrlBuilderKt(this.IconCompatParcelizer.IconCompatParcelizer(), 0));
        extracttokenfromheader.write(this.RemoteActionCompatParcelizer);
        DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(extracttokenfromheader, false);
        deliveryInfoCompanion.serializer = -1;
        return deliveryInfoCompanion;
    }

    public ScreenJsonAdapter(ProvidernetworkModule1 providernetworkModule1) {
        this.write = ((accessgetDeviceUtilsp) providernetworkModule1.IconCompatParcelizer(0)).read();
        this.serializer = ((accessgetDeviceUtilsp) providernetworkModule1.IconCompatParcelizer(1)).read();
        this.IconCompatParcelizer = new accessgetFwfDataQueriesp(((ASN1OctetString) providernetworkModule1.IconCompatParcelizer(2)).IconCompatParcelizer);
        this.RemoteActionCompatParcelizer = WebViewPreloadingTypeCompanion.serializer(providernetworkModule1.IconCompatParcelizer(3));
    }

    public ScreenJsonAdapter(int i, int i2, accessgetFwfDataQueriesp accessgetfwfdataqueriesp, WebViewPreloadingTypeCompanion webViewPreloadingTypeCompanion) {
        this.write = i;
        this.serializer = i2;
        this.IconCompatParcelizer = new accessgetFwfDataQueriesp(accessgetfwfdataqueriesp.IconCompatParcelizer());
        this.RemoteActionCompatParcelizer = webViewPreloadingTypeCompanion;
    }
}
