package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1OctetString;

/* JADX INFO: loaded from: classes4.dex */
public final class updateUserPropertiesToDataStore extends getHostAppUserAgent {
    public final long IconCompatParcelizer;
    public final byte[] MediaDescriptionCompat;
    public final byte[] MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final byte[] RemoteActionCompatParcelizer;
    public final byte[] read;
    public final byte[] serializer;
    public final long write;

    @Override // o.getHostAppUserAgent, o.logErrordefault
    public final provideRequest RatingCompat() {
        extractTokenFromHeader extracttokenfromheader = new extractTokenFromHeader();
        long j = this.write;
        extracttokenfromheader.write(j >= 0 ? new accessgetDeviceUtilsp(1L) : new accessgetDeviceUtilsp(0L));
        extractTokenFromHeader extracttokenfromheader2 = new extractTokenFromHeader();
        extracttokenfromheader2.write(new accessgetDeviceUtilsp(this.IconCompatParcelizer));
        extracttokenfromheader2.write(new UrlBuilderKt(this.MediaMetadataCompat, 0));
        extracttokenfromheader2.write(new UrlBuilderKt(this.MediaDescriptionCompat, 0));
        extracttokenfromheader2.write(new UrlBuilderKt(this.RemoteActionCompatParcelizer, 0));
        extracttokenfromheader2.write(new UrlBuilderKt(this.serializer, 0));
        if (j >= 0) {
            extracttokenfromheader2.write(new getBackendNamecustomerchat_release(false, 0, (logErrordefault) new accessgetDeviceUtilsp(j), 2));
        }
        DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(extracttokenfromheader2, false);
        deliveryInfoCompanion.serializer = -1;
        extracttokenfromheader.write(deliveryInfoCompanion);
        extracttokenfromheader.write(new getBackendNamecustomerchat_release(true, 0, (logErrordefault) new UrlBuilderKt(this.read, 0), 2));
        DeliveryInfoCompanion deliveryInfoCompanion2 = new DeliveryInfoCompanion(extracttokenfromheader, false);
        deliveryInfoCompanion2.serializer = -1;
        return deliveryInfoCompanion2;
    }

    public updateUserPropertiesToDataStore(ProvidernetworkModule1 providernetworkModule1) {
        long jRemoteActionCompatParcelizer;
        accessgetDeviceUtilsp accessgetdeviceutilspRemoteActionCompatParcelizer = accessgetDeviceUtilsp.RemoteActionCompatParcelizer(providernetworkModule1.IconCompatParcelizer(0));
        if (!accessgetdeviceutilspRemoteActionCompatParcelizer.serializer(0) && !accessgetdeviceutilspRemoteActionCompatParcelizer.serializer(1)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("unknown version of sequence");
            throw null;
        }
        this.MediaSessionCompatQueueItem = accessgetdeviceutilspRemoteActionCompatParcelizer.read();
        if (providernetworkModule1.write() != 2 && providernetworkModule1.write() != 3) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("key sequence wrong size");
            throw null;
        }
        ProvidernetworkModule1 providernetworkModule1RemoteActionCompatParcelizer = ProvidernetworkModule1.RemoteActionCompatParcelizer(providernetworkModule1.IconCompatParcelizer(1));
        this.IconCompatParcelizer = accessgetDeviceUtilsp.RemoteActionCompatParcelizer(providernetworkModule1RemoteActionCompatParcelizer.IconCompatParcelizer(0)).RemoteActionCompatParcelizer();
        this.MediaMetadataCompat = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(ASN1OctetString.serializer(providernetworkModule1RemoteActionCompatParcelizer.IconCompatParcelizer(1)).IconCompatParcelizer);
        this.MediaDescriptionCompat = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(ASN1OctetString.serializer(providernetworkModule1RemoteActionCompatParcelizer.IconCompatParcelizer(2)).IconCompatParcelizer);
        this.RemoteActionCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(ASN1OctetString.serializer(providernetworkModule1RemoteActionCompatParcelizer.IconCompatParcelizer(3)).IconCompatParcelizer);
        this.serializer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(ASN1OctetString.serializer(providernetworkModule1RemoteActionCompatParcelizer.IconCompatParcelizer(4)).IconCompatParcelizer);
        if (providernetworkModule1RemoteActionCompatParcelizer.write() == 6) {
            getBackendNamecustomerchat_release getbackendnamecustomerchat_releaseIconCompatParcelizer = getBackendNamecustomerchat_release.IconCompatParcelizer(providernetworkModule1RemoteActionCompatParcelizer.IconCompatParcelizer(5));
            if (getbackendnamecustomerchat_releaseIconCompatParcelizer.read != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("unknown tag in XMSSPrivateKey");
                throw null;
            }
            jRemoteActionCompatParcelizer = ((accessgetDeviceUtilsp) accessgetDeviceUtilsp.read.getContextInstance(getbackendnamecustomerchat_releaseIconCompatParcelizer, false)).RemoteActionCompatParcelizer();
        } else {
            if (providernetworkModule1RemoteActionCompatParcelizer.write() != 5) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("keySeq should be 5 or 6 in length");
                throw null;
            }
            jRemoteActionCompatParcelizer = -1;
        }
        this.write = jRemoteActionCompatParcelizer;
        if (providernetworkModule1.write() != 3) {
            this.read = null;
        } else {
            this.read = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(((ASN1OctetString) ASN1OctetString.RemoteActionCompatParcelizer.getContextInstance(getBackendNamecustomerchat_release.IconCompatParcelizer(providernetworkModule1.IconCompatParcelizer(2)), true)).IconCompatParcelizer);
        }
    }

    public updateUserPropertiesToDataStore(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j2) {
        this.MediaSessionCompatQueueItem = 1;
        this.IconCompatParcelizer = j;
        this.MediaMetadataCompat = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
        this.MediaDescriptionCompat = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr2);
        this.RemoteActionCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr3);
        this.serializer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr4);
        this.read = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr5);
        this.write = j2;
    }

    public updateUserPropertiesToDataStore(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.MediaSessionCompatQueueItem = 0;
        this.IconCompatParcelizer = j;
        this.MediaMetadataCompat = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
        this.MediaDescriptionCompat = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr2);
        this.RemoteActionCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr3);
        this.serializer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr4);
        this.read = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr5);
        this.write = -1L;
    }
}
