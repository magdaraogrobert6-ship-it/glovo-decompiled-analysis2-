package o;

/* JADX INFO: loaded from: classes4.dex */
public final class Screen extends getHostAppUserAgent {
    public byte[] RemoteActionCompatParcelizer;

    @Override // o.getHostAppUserAgent, o.logErrordefault
    public final provideRequest RatingCompat() {
        extractTokenFromHeader extracttokenfromheader = new extractTokenFromHeader();
        extracttokenfromheader.write(new UrlBuilderKt(this.RemoteActionCompatParcelizer, 0));
        DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(extracttokenfromheader, false);
        deliveryInfoCompanion.serializer = -1;
        return deliveryInfoCompanion;
    }

    public Screen(byte[] bArr) {
        this.RemoteActionCompatParcelizer = bArr;
    }

    public Screen() {
    }
}
