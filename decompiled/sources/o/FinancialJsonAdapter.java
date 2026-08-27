package o;

/* JADX INFO: loaded from: classes4.dex */
public final class FinancialJsonAdapter extends getHostAppUserAgent {
    public byte[] IconCompatParcelizer;
    public byte[] MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public byte[] RemoteActionCompatParcelizer;
    public OrderJsonAdapter read;
    public byte[] serializer;
    public byte[] write;

    @Override // o.getHostAppUserAgent, o.logErrordefault
    public final provideRequest RatingCompat() {
        extractTokenFromHeader extracttokenfromheader = new extractTokenFromHeader();
        extracttokenfromheader.write(new accessgetDeviceUtilsp(this.MediaSessionCompatQueueItem));
        extracttokenfromheader.write(new UrlBuilderKt(this.IconCompatParcelizer, 0));
        extracttokenfromheader.write(new UrlBuilderKt(this.RemoteActionCompatParcelizer, 0));
        extracttokenfromheader.write(new UrlBuilderKt(this.write, 0));
        extracttokenfromheader.write(new UrlBuilderKt(this.serializer, 0));
        extracttokenfromheader.write(new UrlBuilderKt(this.MediaMetadataCompat, 0));
        OrderJsonAdapter orderJsonAdapter = this.read;
        if (orderJsonAdapter != null) {
            extracttokenfromheader.write(new OrderJsonAdapter(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(orderJsonAdapter.read)));
        }
        DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(extracttokenfromheader, false);
        deliveryInfoCompanion.serializer = -1;
        return deliveryInfoCompanion;
    }
}
