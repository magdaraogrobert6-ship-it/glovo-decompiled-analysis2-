package o;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class getDoesHandlePushDeepLinksAutomatically implements getResourceConfigurationValue {
    public int IconCompatParcelizer;
    public short MediaMetadataCompat;
    public byte RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public final r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k write;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // o.getResourceConfigurationValue
    public final isPushDeepLinkBackStackActivityEnabled IconCompatParcelizer() {
        return this.write.IconCompatParcelizer();
    }

    @Override // o.getResourceConfigurationValue
    public final long read(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, long j) {
        int i;
        int iParcelableVolumeInfo;
        do {
            int i2 = this.serializer;
            r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k r8lambdaoorzolqoybc_uxebbkbnmvlvm7k = this.write;
            if (i2 == 0) {
                r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.IconCompatParcelizer(this.MediaMetadataCompat);
                this.MediaMetadataCompat = (short) 0;
                if ((this.RemoteActionCompatParcelizer & 4) == 0) {
                    i = this.IconCompatParcelizer;
                    int iRemoteActionCompatParcelizer = getDefaultNotificationAccentColor.RemoteActionCompatParcelizer(r8lambdaoorzolqoybc_uxebbkbnmvlvm7k);
                    this.serializer = iRemoteActionCompatParcelizer;
                    this.read = iRemoteActionCompatParcelizer;
                    byte bMediaBrowserCompatMediaItem = (byte) (r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.MediaBrowserCompatMediaItem() & 255);
                    this.RemoteActionCompatParcelizer = (byte) (r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.MediaBrowserCompatMediaItem() & 255);
                    java.util.logging.Logger logger = getDefaultNotificationAccentColor.RemoteActionCompatParcelizer;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(getContextandroid_sdk_base_releaseannotations.write(true, this.IconCompatParcelizer, this.read, bMediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer));
                    }
                    iParcelableVolumeInfo = r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.ParcelableVolumeInfo() & Integer.MAX_VALUE;
                    this.IconCompatParcelizer = iParcelableVolumeInfo;
                    if (bMediaBrowserCompatMediaItem != 9) {
                        getContextandroid_sdk_base_releaseannotations.write("%s != TYPE_CONTINUATION", Byte.valueOf(bMediaBrowserCompatMediaItem));
                        throw null;
                    }
                }
            } else {
                long j2 = r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.read(r8lambdabeyrnr8p6809bwlboro_stans, Math.min(8192L, i2));
                if (j2 != -1) {
                    this.serializer = (int) (((long) this.serializer) - j2);
                    return j2;
                }
            }
            return -1L;
        } while (iParcelableVolumeInfo == i);
        getContextandroid_sdk_base_releaseannotations.write("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    public getDoesHandlePushDeepLinksAutomatically(r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k r8lambdaoorzolqoybc_uxebbkbnmvlvm7k) {
        this.write = r8lambdaoorzolqoybc_uxebbkbnmvlvm7k;
    }
}
