package o;

/* JADX INFO: loaded from: classes4.dex */
public final class Product extends getHostAppUserAgent {
    public byte[] IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public Screen read;
    public byte[] serializer;
    public byte[] write;

    @Override // o.getHostAppUserAgent, o.logErrordefault
    public final provideRequest RatingCompat() {
        extractTokenFromHeader extracttokenfromheader = new extractTokenFromHeader();
        extracttokenfromheader.write(new accessgetDeviceUtilsp(this.RemoteActionCompatParcelizer));
        extracttokenfromheader.write(new UrlBuilderKt(this.write, 0));
        extracttokenfromheader.write(new UrlBuilderKt(this.serializer, 0));
        extracttokenfromheader.write(new UrlBuilderKt(this.IconCompatParcelizer, 0));
        Screen screen = this.read;
        if (screen != null) {
            extracttokenfromheader.write(new Screen(screen.RemoteActionCompatParcelizer));
        }
        DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(extracttokenfromheader, false);
        deliveryInfoCompanion.serializer = -1;
        return deliveryInfoCompanion;
    }
}
