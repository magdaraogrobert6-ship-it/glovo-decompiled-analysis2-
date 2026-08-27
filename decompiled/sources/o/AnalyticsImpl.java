package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1OctetString;

/* JADX INFO: loaded from: classes4.dex */
public final class AnalyticsImpl extends getHostAppUserAgent {
    public final byte[] IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final byte[] MediaDescriptionCompat;
    public final byte[] MediaSessionCompatQueueItem;
    public final byte[] RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;
    public final byte[] write;

    @Override // o.getHostAppUserAgent, o.logErrordefault
    public final provideRequest RatingCompat() {
        extractTokenFromHeader extracttokenfromheader = new extractTokenFromHeader();
        int i = this.serializer;
        extracttokenfromheader.write(i >= 0 ? new accessgetDeviceUtilsp(1L) : new accessgetDeviceUtilsp(0L));
        extractTokenFromHeader extracttokenfromheader2 = new extractTokenFromHeader();
        extracttokenfromheader2.write(new accessgetDeviceUtilsp(this.read));
        extracttokenfromheader2.write(new UrlBuilderKt(this.MediaSessionCompatQueueItem, 0));
        extracttokenfromheader2.write(new UrlBuilderKt(this.MediaDescriptionCompat, 0));
        extracttokenfromheader2.write(new UrlBuilderKt(this.IconCompatParcelizer, 0));
        extracttokenfromheader2.write(new UrlBuilderKt(this.write, 0));
        if (i >= 0) {
            extracttokenfromheader2.write(new getBackendNamecustomerchat_release(false, 0, (logErrordefault) new accessgetDeviceUtilsp(i), 2));
        }
        DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(extracttokenfromheader2, false);
        deliveryInfoCompanion.serializer = -1;
        extracttokenfromheader.write(deliveryInfoCompanion);
        extracttokenfromheader.write(new getBackendNamecustomerchat_release(true, 0, (logErrordefault) new UrlBuilderKt(this.RemoteActionCompatParcelizer, 0), 2));
        DeliveryInfoCompanion deliveryInfoCompanion2 = new DeliveryInfoCompanion(extracttokenfromheader, false);
        deliveryInfoCompanion2.serializer = -1;
        return deliveryInfoCompanion2;
    }

    public AnalyticsImpl(ProvidernetworkModule1 providernetworkModule1) {
        int i;
        accessgetDeviceUtilsp accessgetdeviceutilspRemoteActionCompatParcelizer = accessgetDeviceUtilsp.RemoteActionCompatParcelizer(providernetworkModule1.IconCompatParcelizer(0));
        if (!accessgetdeviceutilspRemoteActionCompatParcelizer.serializer(0) && !accessgetdeviceutilspRemoteActionCompatParcelizer.serializer(1)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("unknown version of sequence");
            throw null;
        }
        this.MediaBrowserCompatMediaItem = accessgetdeviceutilspRemoteActionCompatParcelizer.read();
        if (providernetworkModule1.write() != 2 && providernetworkModule1.write() != 3) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("key sequence wrong size");
            throw null;
        }
        ProvidernetworkModule1 providernetworkModule1RemoteActionCompatParcelizer = ProvidernetworkModule1.RemoteActionCompatParcelizer(providernetworkModule1.IconCompatParcelizer(1));
        this.read = accessgetDeviceUtilsp.RemoteActionCompatParcelizer(providernetworkModule1RemoteActionCompatParcelizer.IconCompatParcelizer(0)).read();
        this.MediaSessionCompatQueueItem = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(ASN1OctetString.serializer(providernetworkModule1RemoteActionCompatParcelizer.IconCompatParcelizer(1)).IconCompatParcelizer);
        this.MediaDescriptionCompat = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(ASN1OctetString.serializer(providernetworkModule1RemoteActionCompatParcelizer.IconCompatParcelizer(2)).IconCompatParcelizer);
        this.IconCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(ASN1OctetString.serializer(providernetworkModule1RemoteActionCompatParcelizer.IconCompatParcelizer(3)).IconCompatParcelizer);
        this.write = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(ASN1OctetString.serializer(providernetworkModule1RemoteActionCompatParcelizer.IconCompatParcelizer(4)).IconCompatParcelizer);
        if (providernetworkModule1RemoteActionCompatParcelizer.write() == 6) {
            getBackendNamecustomerchat_release getbackendnamecustomerchat_releaseIconCompatParcelizer = getBackendNamecustomerchat_release.IconCompatParcelizer(providernetworkModule1RemoteActionCompatParcelizer.IconCompatParcelizer(5));
            if (getbackendnamecustomerchat_releaseIconCompatParcelizer.read != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("unknown tag in XMSSPrivateKey");
                throw null;
            }
            i = ((accessgetDeviceUtilsp) accessgetDeviceUtilsp.read.getContextInstance(getbackendnamecustomerchat_releaseIconCompatParcelizer, false)).read();
        } else {
            if (providernetworkModule1RemoteActionCompatParcelizer.write() != 5) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("keySeq should be 5 or 6 in length");
                throw null;
            }
            i = -1;
        }
        this.serializer = i;
        if (providernetworkModule1.write() != 3) {
            this.RemoteActionCompatParcelizer = null;
        } else {
            this.RemoteActionCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(((ASN1OctetString) ASN1OctetString.RemoteActionCompatParcelizer.getContextInstance(getBackendNamecustomerchat_release.IconCompatParcelizer(providernetworkModule1.IconCompatParcelizer(2)), true)).IconCompatParcelizer);
        }
    }

    public AnalyticsImpl(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i2) {
        this.MediaBrowserCompatMediaItem = 1;
        this.read = i;
        this.MediaSessionCompatQueueItem = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
        this.MediaDescriptionCompat = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr2);
        this.IconCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr3);
        this.write = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr4);
        this.RemoteActionCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr5);
        this.serializer = i2;
    }

    public AnalyticsImpl(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.MediaBrowserCompatMediaItem = 0;
        this.read = i;
        this.MediaSessionCompatQueueItem = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
        this.MediaDescriptionCompat = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr2);
        this.IconCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr3);
        this.write = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr4);
        this.RemoteActionCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr5);
        this.serializer = -1;
    }
}
