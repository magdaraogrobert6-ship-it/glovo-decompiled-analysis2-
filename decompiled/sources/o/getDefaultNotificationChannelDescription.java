package o;

import com.sentiance.okhttp3.internal.http2.ErrorCode;
import com.sentiance.okhttp3.internal.http2.StreamResetException;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
public final class getDefaultNotificationChannelDescription implements getResourceConfigurationValue {
    public final long IconCompatParcelizer;
    public final /* synthetic */ getDeviceObjectAllowlist MediaMetadataCompat;
    public boolean RemoteActionCompatParcelizer;
    public final r8lambdaBEyrNr8p6809BwlBoRO_sTaNs read = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
    public final r8lambdaBEyrNr8p6809BwlBoRO_sTaNs serializer = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
    public boolean write;

    @Override // o.getResourceConfigurationValue
    public final isPushDeepLinkBackStackActivityEnabled IconCompatParcelizer() {
        return this.MediaMetadataCompat.MediaBrowserCompatMediaItem;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        synchronized (this.MediaMetadataCompat) {
            this.write = true;
            r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = this.serializer;
            j = r8lambdabeyrnr8p6809bwlboro_stans.serializer;
            r8lambdabeyrnr8p6809bwlboro_stans.serializer();
            this.MediaMetadataCompat.serializer.isEmpty();
            this.MediaMetadataCompat.notifyAll();
        }
        if (j > 0) {
            this.MediaMetadataCompat.IconCompatParcelizer.serializer(j);
        }
        this.MediaMetadataCompat.serializer();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    @Override // o.getResourceConfigurationValue
    public final long read(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, long j) throws StreamResetException {
        ErrorCode errorCode;
        long j2;
        while (true) {
            synchronized (this.MediaMetadataCompat) {
                this.MediaMetadataCompat.MediaBrowserCompatMediaItem.MediaMetadataCompat();
                try {
                    getDeviceObjectAllowlist getdeviceobjectallowlist = this.MediaMetadataCompat;
                    errorCode = getdeviceobjectallowlist.ParcelableVolumeInfo;
                    if (errorCode == null) {
                        errorCode = null;
                    }
                    if (this.write) {
                        throw new IOException("stream closed");
                    }
                    getdeviceobjectallowlist.serializer.isEmpty();
                    r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans2 = this.serializer;
                    long j3 = r8lambdabeyrnr8p6809bwlboro_stans2.serializer;
                    if (j3 > 0) {
                        j2 = r8lambdabeyrnr8p6809bwlboro_stans2.read(r8lambdabeyrnr8p6809bwlboro_stans, Math.min(8192L, j3));
                        getDeviceObjectAllowlist getdeviceobjectallowlist2 = this.MediaMetadataCompat;
                        long j4 = getdeviceobjectallowlist2.RemoteActionCompatParcelizer + j2;
                        getdeviceobjectallowlist2.RemoteActionCompatParcelizer = j4;
                        if (errorCode != null || j4 < getdeviceobjectallowlist2.IconCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer() / 2) {
                            break;
                            break;
                        }
                        getDeviceObjectAllowlist getdeviceobjectallowlist3 = this.MediaMetadataCompat;
                        getdeviceobjectallowlist3.IconCompatParcelizer.read(getdeviceobjectallowlist3.read, getdeviceobjectallowlist3.RemoteActionCompatParcelizer);
                        this.MediaMetadataCompat.RemoteActionCompatParcelizer = 0L;
                        break;
                    }
                    if (this.RemoteActionCompatParcelizer || errorCode != null) {
                        j2 = -1;
                        break;
                    }
                    try {
                        this.MediaMetadataCompat.wait();
                        this.MediaMetadataCompat.MediaBrowserCompatMediaItem.MediaBrowserCompatMediaItem();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    this.MediaMetadataCompat.MediaBrowserCompatMediaItem.MediaBrowserCompatMediaItem();
                    throw th;
                }
            }
            if (j2 != -1) {
                this.MediaMetadataCompat.IconCompatParcelizer.serializer(j2);
                return j2;
            }
            if (errorCode == null) {
                return -1L;
            }
            throw new StreamResetException(errorCode);
        }
        this.MediaMetadataCompat.MediaBrowserCompatMediaItem.MediaBrowserCompatMediaItem();
        if (j2 != -1) {
            this.MediaMetadataCompat.IconCompatParcelizer.serializer(j2);
            return j2;
        }
        if (errorCode == null) {
            return -1L;
        }
        throw new StreamResetException(errorCode);
    }

    public getDefaultNotificationChannelDescription(getDeviceObjectAllowlist getdeviceobjectallowlist, long j) {
        this.MediaMetadataCompat = getdeviceobjectallowlist;
        this.IconCompatParcelizer = j;
    }
}
