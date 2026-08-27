package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setAccountConfigfwf_client_release {
    public final long MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final int write;

    public byte[] serializer() {
        byte[] bArr = new byte[32];
        createCache.read(bArr, this.MediaDescriptionCompat, 0);
        createCache.RemoteActionCompatParcelizer(4, this.MediaBrowserCompatMediaItem, bArr);
        createCache.read(bArr, this.MediaMetadataCompat, 12);
        createCache.read(bArr, this.write, 28);
        return bArr;
    }

    public setAccountConfigfwf_client_release(setFeaturesUpdateTimefwf_client_release setfeaturesupdatetimefwf_client_release) {
        this.MediaDescriptionCompat = setfeaturesupdatetimefwf_client_release.serializer;
        this.MediaBrowserCompatMediaItem = setfeaturesupdatetimefwf_client_release.MediaBrowserCompatMediaItem;
        this.MediaMetadataCompat = setfeaturesupdatetimefwf_client_release.MediaMetadataCompat;
        this.write = setfeaturesupdatetimefwf_client_release.IconCompatParcelizer;
    }
}
