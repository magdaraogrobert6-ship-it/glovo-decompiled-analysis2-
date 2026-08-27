package o;

import android.os.Process;

/* JADX INFO: loaded from: classes4.dex */
public final class UserPropertiesSerializer extends getHostAppUserAgent {
    public static int read;
    public static int serializer;
    public final byte[] IconCompatParcelizer;
    public final byte[] RemoteActionCompatParcelizer;

    @Override // o.getHostAppUserAgent, o.logErrordefault
    public final provideRequest RatingCompat() {
        extractTokenFromHeader extracttokenfromheader = new extractTokenFromHeader();
        extracttokenfromheader.write(new accessgetDeviceUtilsp(0L));
        extracttokenfromheader.write(new UrlBuilderKt(this.IconCompatParcelizer, 0));
        extracttokenfromheader.write(new UrlBuilderKt(this.RemoteActionCompatParcelizer, 0));
        DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(extracttokenfromheader, false);
        deliveryInfoCompanion.serializer = -1;
        return deliveryInfoCompanion;
    }

    public UserPropertiesSerializer(byte[] bArr, byte[] bArr2) {
        this.IconCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
        this.RemoteActionCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr2);
    }

    public static int read() {
        int i = serializer;
        int i2 = i % 9348317;
        serializer = i + 1;
        if (i2 != 0) {
            return read;
        }
        int iMyUid = Process.myUid();
        read = iMyUid;
        return iMyUid;
    }
}
