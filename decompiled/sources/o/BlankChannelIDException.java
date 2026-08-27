package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class BlankChannelIDException extends getHostAppUserAgent {
    public byte[] IconCompatParcelizer;
    public int MediaDescriptionCompat;
    public WebViewPreloadingTypeCompanion RemoteActionCompatParcelizer;
    public byte[] read;
    public int serializer;
    public byte[] write;

    @Override // o.getHostAppUserAgent, o.logErrordefault
    public final provideRequest RatingCompat() {
        extractTokenFromHeader extracttokenfromheader = new extractTokenFromHeader();
        extracttokenfromheader.write(new accessgetDeviceUtilsp(this.MediaDescriptionCompat));
        extracttokenfromheader.write(new accessgetDeviceUtilsp(this.serializer));
        extracttokenfromheader.write(new UrlBuilderKt(this.write, 0));
        extracttokenfromheader.write(new UrlBuilderKt(this.IconCompatParcelizer, 0));
        extracttokenfromheader.write(new UrlBuilderKt(this.read, 0));
        extracttokenfromheader.write(this.RemoteActionCompatParcelizer);
        DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(extracttokenfromheader, false);
        deliveryInfoCompanion.serializer = -1;
        return deliveryInfoCompanion;
    }

    public final C0184logger serializer() {
        byte[] bArr = this.write;
        C0184logger c0184logger = new C0184logger();
        c0184logger.IconCompatParcelizer = 0;
        if (bArr.length != 4) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("byte array is not an encoded finite field");
            return null;
        }
        int i = 2;
        int i2 = ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
        c0184logger.write = i2;
        if (i2 != 0) {
            int iSerializer = setPlacementApproachInProgress.serializer(i2);
            for (int i3 = 0; i3 < (iSerializer >>> 1); i3++) {
                i = setPlacementApproachInProgress.read(i, i, i2);
                int i4 = i ^ 2;
                int i5 = i2;
                while (i5 != 0) {
                    int iSerializer2 = setPlacementApproachInProgress.serializer(i4, i5);
                    i4 = i5;
                    i5 = iSerializer2;
                }
                if (i4 == 1) {
                }
            }
            c0184logger.IconCompatParcelizer = setPlacementApproachInProgress.serializer(c0184logger.write);
            return c0184logger;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("byte array is not an encoded finite field");
        return null;
    }
}
