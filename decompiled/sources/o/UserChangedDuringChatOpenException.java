package o;

/* JADX INFO: loaded from: classes4.dex */
public final class UserChangedDuringChatOpenException extends getHostAppUserAgent {
    public final WebViewPreloadingTypeCompanion IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final accessgetDeviceUtilsp write;

    @Override // o.getHostAppUserAgent, o.logErrordefault
    public final provideRequest RatingCompat() {
        extractTokenFromHeader extracttokenfromheader = new extractTokenFromHeader();
        extracttokenfromheader.write(this.write);
        extracttokenfromheader.write(new accessgetDeviceUtilsp(this.RemoteActionCompatParcelizer));
        extracttokenfromheader.write(this.IconCompatParcelizer);
        DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(extracttokenfromheader, false);
        deliveryInfoCompanion.serializer = -1;
        return deliveryInfoCompanion;
    }

    public UserChangedDuringChatOpenException(ProvidernetworkModule1 providernetworkModule1) {
        this.write = accessgetDeviceUtilsp.RemoteActionCompatParcelizer(providernetworkModule1.IconCompatParcelizer(0));
        this.RemoteActionCompatParcelizer = accessgetDeviceUtilsp.RemoteActionCompatParcelizer(providernetworkModule1.IconCompatParcelizer(1)).read();
        this.IconCompatParcelizer = WebViewPreloadingTypeCompanion.serializer(providernetworkModule1.IconCompatParcelizer(2));
    }

    public static UserChangedDuringChatOpenException IconCompatParcelizer(Object obj) {
        if (obj instanceof UserChangedDuringChatOpenException) {
            return (UserChangedDuringChatOpenException) obj;
        }
        if (obj != null) {
            return new UserChangedDuringChatOpenException(ProvidernetworkModule1.RemoteActionCompatParcelizer(obj));
        }
        return null;
    }

    public UserChangedDuringChatOpenException(int i, WebViewPreloadingTypeCompanion webViewPreloadingTypeCompanion) {
        this.write = new accessgetDeviceUtilsp(0L);
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = webViewPreloadingTypeCompanion;
    }
}
