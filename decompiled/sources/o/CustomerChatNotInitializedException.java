package o;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomerChatNotInitializedException extends getHostAppUserAgent {
    public final accessgetDeviceUtilsp IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final WebViewPreloadingTypeCompanion serializer;

    @Override // o.getHostAppUserAgent, o.logErrordefault
    public final provideRequest RatingCompat() {
        extractTokenFromHeader extracttokenfromheader = new extractTokenFromHeader();
        extracttokenfromheader.write(this.IconCompatParcelizer);
        extracttokenfromheader.write(new accessgetDeviceUtilsp(this.RemoteActionCompatParcelizer));
        extracttokenfromheader.write(new accessgetDeviceUtilsp(this.read));
        extracttokenfromheader.write(this.serializer);
        DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(extracttokenfromheader, false);
        deliveryInfoCompanion.serializer = -1;
        return deliveryInfoCompanion;
    }

    public CustomerChatNotInitializedException(ProvidernetworkModule1 providernetworkModule1) {
        this.IconCompatParcelizer = accessgetDeviceUtilsp.RemoteActionCompatParcelizer(providernetworkModule1.IconCompatParcelizer(0));
        this.RemoteActionCompatParcelizer = accessgetDeviceUtilsp.RemoteActionCompatParcelizer(providernetworkModule1.IconCompatParcelizer(1)).read();
        this.read = accessgetDeviceUtilsp.RemoteActionCompatParcelizer(providernetworkModule1.IconCompatParcelizer(2)).read();
        this.serializer = WebViewPreloadingTypeCompanion.serializer(providernetworkModule1.IconCompatParcelizer(3));
    }

    public static CustomerChatNotInitializedException RemoteActionCompatParcelizer(Object obj) {
        if (obj instanceof CustomerChatNotInitializedException) {
            return (CustomerChatNotInitializedException) obj;
        }
        if (obj != null) {
            return new CustomerChatNotInitializedException(ProvidernetworkModule1.RemoteActionCompatParcelizer(obj));
        }
        return null;
    }

    public CustomerChatNotInitializedException(int i, int i2, WebViewPreloadingTypeCompanion webViewPreloadingTypeCompanion) {
        this.IconCompatParcelizer = new accessgetDeviceUtilsp(0L);
        this.RemoteActionCompatParcelizer = i;
        this.read = i2;
        this.serializer = webViewPreloadingTypeCompanion;
    }
}
