package o;

import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
public final class getDelayedInitializationAnalyticsBehavior implements getConfigurationValue {
    public boolean IconCompatParcelizer;
    public final r8lambdaBEyrNr8p6809BwlBoRO_sTaNs read = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
    public final /* synthetic */ getDeviceObjectAllowlist serializer;
    public boolean write;

    @Override // o.getConfigurationValue
    public final isPushDeepLinkBackStackActivityEnabled IconCompatParcelizer() {
        return this.serializer.MediaDescriptionCompat;
    }

    @Override // o.getConfigurationValue, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.serializer) {
            if (this.write) {
                return;
            }
            getDeviceObjectAllowlist getdeviceobjectallowlist = this.serializer;
            if (!getdeviceobjectallowlist.RatingCompat.IconCompatParcelizer) {
                if (this.read.serializer > 0) {
                    while (this.read.serializer > 0) {
                        serializer(true);
                    }
                } else {
                    getdeviceobjectallowlist.IconCompatParcelizer.read(getdeviceobjectallowlist.read, true, null, 0L);
                }
            }
            synchronized (this.serializer) {
                this.write = true;
            }
            this.serializer.IconCompatParcelizer.read();
            this.serializer.serializer();
        }
    }

    @Override // o.getConfigurationValue, java.io.Flushable
    public final void flush() throws IOException {
        synchronized (this.serializer) {
            this.serializer.read();
        }
        while (this.read.serializer > 0) {
            serializer(false);
            this.serializer.IconCompatParcelizer.read();
        }
    }

    public final void serializer(boolean z) throws IOException {
        getDeviceObjectAllowlist getdeviceobjectallowlist;
        long jMin;
        getDeviceObjectAllowlist getdeviceobjectallowlist2;
        synchronized (this.serializer) {
            this.serializer.MediaDescriptionCompat.MediaMetadataCompat();
            while (true) {
                try {
                    getdeviceobjectallowlist = this.serializer;
                    if (getdeviceobjectallowlist.write > 0 || this.IconCompatParcelizer || this.write || getdeviceobjectallowlist.ParcelableVolumeInfo != null) {
                        break;
                    }
                    try {
                        getdeviceobjectallowlist.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    this.serializer.MediaDescriptionCompat.MediaBrowserCompatMediaItem();
                    throw th;
                }
            }
            getdeviceobjectallowlist.MediaDescriptionCompat.MediaBrowserCompatMediaItem();
            this.serializer.read();
            jMin = Math.min(this.serializer.write, this.read.serializer);
            getdeviceobjectallowlist2 = this.serializer;
            getdeviceobjectallowlist2.write -= jMin;
        }
        getdeviceobjectallowlist2.MediaDescriptionCompat.MediaMetadataCompat();
        try {
            getDeviceObjectAllowlist getdeviceobjectallowlist3 = this.serializer;
            getdeviceobjectallowlist3.IconCompatParcelizer.read(getdeviceobjectallowlist3.read, z && jMin == this.read.serializer, this.read, jMin);
        } finally {
            this.serializer.MediaDescriptionCompat.MediaBrowserCompatMediaItem();
        }
    }

    public getDelayedInitializationAnalyticsBehavior(getDeviceObjectAllowlist getdeviceobjectallowlist) {
        this.serializer = getdeviceobjectallowlist;
    }

    @Override // o.getConfigurationValue
    public final void serializer(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, long j) throws IOException {
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans2 = this.read;
        r8lambdabeyrnr8p6809bwlboro_stans2.serializer(r8lambdabeyrnr8p6809bwlboro_stans, j);
        while (r8lambdabeyrnr8p6809bwlboro_stans2.serializer >= 16384) {
            serializer(false);
        }
    }
}
