package o;

import bo.app.af$$ExternalSyntheticOutline0;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public final class getXorb3I0S0c implements getReverseDifferenceb3I0S0c {
    public final AutoCloseable IconCompatParcelizer;
    public final Object MediaBrowserCompatMediaItem = new Object();
    public GifDrawableTransformation MediaMetadataCompat;
    public final RecyclableBufferedInputStream RemoteActionCompatParcelizer;
    public final String read;
    public boolean serializer;
    public final HttpUrlFetcher write;

    @Override // o.getReverseDifferenceb3I0S0c
    public final HttpUrlFetcher read() {
        return this.write;
    }

    public final String serializer() {
        return this.read;
    }

    @Override // o.getReverseDifferenceb3I0S0c
    public final getIntersectb3I0S0c write() {
        return null;
    }

    @Override // o.getReverseDifferenceb3I0S0c
    public final RegistryNoSourceEncoderAvailableException IconCompatParcelizer() {
        synchronized (this.MediaBrowserCompatMediaItem) {
            if (this.serializer) {
                throw new IllegalStateException("closed");
            }
            GifDrawableTransformation gifDrawableTransformation = this.MediaMetadataCompat;
            if (gifDrawableTransformation != null) {
                return gifDrawableTransformation;
            }
            GifDrawableTransformation gifDrawableTransformationRemoteActionCompatParcelizer = Okio.RemoteActionCompatParcelizer(this.write.MediaSessionCompatToken(this.RemoteActionCompatParcelizer));
            this.MediaMetadataCompat = gifDrawableTransformationRemoteActionCompatParcelizer;
            return gifDrawableTransformationRemoteActionCompatParcelizer;
        }
    }

    @Override // o.getReverseDifferenceb3I0S0c
    public final RecyclableBufferedInputStream RemoteActionCompatParcelizer() {
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        synchronized (this.MediaBrowserCompatMediaItem) {
            if (this.serializer) {
                throw new IllegalStateException("closed");
            }
            recyclableBufferedInputStream = this.RemoteActionCompatParcelizer;
        }
        return recyclableBufferedInputStream;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.MediaBrowserCompatMediaItem) {
            try {
                this.serializer = true;
                GifDrawableTransformation gifDrawableTransformation = this.MediaMetadataCompat;
                if (gifDrawableTransformation != null) {
                    try {
                        gifDrawableTransformation.close();
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused) {
                    }
                }
                AutoCloseable autoCloseable = this.IconCompatParcelizer;
                if (autoCloseable != null) {
                    try {
                        af$$ExternalSyntheticOutline0.m(autoCloseable);
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public getXorb3I0S0c(RecyclableBufferedInputStream recyclableBufferedInputStream, HttpUrlFetcher httpUrlFetcher, String str, AutoCloseable autoCloseable) {
        this.RemoteActionCompatParcelizer = recyclableBufferedInputStream;
        this.write = httpUrlFetcher;
        this.read = str;
        this.IconCompatParcelizer = autoCloseable;
    }
}
