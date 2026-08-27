package o;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class isSessionStartBasedTimeoutEnabled implements getConfigurationValue {
    public final /* synthetic */ int IconCompatParcelizer = 0;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public isSessionStartBasedTimeoutEnabled(isPushDeepLinkBackStackActivityEnabled ispushdeeplinkbackstackactivityenabled, OutputStream outputStream) {
        this.write = ispushdeeplinkbackstackactivityenabled;
        this.serializer = outputStream;
    }

    @Override // o.getConfigurationValue, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.IconCompatParcelizer;
        Object obj = this.serializer;
        if (i != 0) {
            ((OutputStream) obj).close();
            return;
        }
        getConfigurationCache getconfigurationcache = (getConfigurationCache) obj;
        getconfigurationcache.MediaMetadataCompat();
        try {
            try {
                ((isSessionStartBasedTimeoutEnabled) this.write).close();
                getconfigurationcache.RemoteActionCompatParcelizer(true);
            } catch (IOException e) {
                if (!getconfigurationcache.RatingCompat()) {
                    throw e;
                }
                throw getconfigurationcache.write(e);
            }
        } catch (Throwable th) {
            getconfigurationcache.RemoteActionCompatParcelizer(false);
            throw th;
        }
    }

    @Override // o.getConfigurationValue, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.IconCompatParcelizer;
        Object obj = this.serializer;
        if (i != 0) {
            ((OutputStream) obj).flush();
            return;
        }
        getConfigurationCache getconfigurationcache = (getConfigurationCache) obj;
        getconfigurationcache.MediaMetadataCompat();
        try {
            try {
                ((isSessionStartBasedTimeoutEnabled) this.write).flush();
                getconfigurationcache.RemoteActionCompatParcelizer(true);
            } catch (IOException e) {
                if (!getconfigurationcache.RatingCompat()) {
                    throw e;
                }
                throw getconfigurationcache.write(e);
            }
        } catch (Throwable th) {
            getconfigurationcache.RemoteActionCompatParcelizer(false);
            throw th;
        }
    }

    @Override // o.getConfigurationValue
    public final void serializer(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, long j) throws IOException {
        int i = this.IconCompatParcelizer;
        Object obj = this.serializer;
        Object obj2 = this.write;
        if (i != 0) {
            isInAppMessageAccessibilityExclusiveModeEnabled.IconCompatParcelizer(r8lambdabeyrnr8p6809bwlboro_stans.serializer, 0L, j);
            while (j > 0) {
                ((isPushDeepLinkBackStackActivityEnabled) obj2).RemoteActionCompatParcelizer();
                resetCachelambda0 resetcachelambda0 = r8lambdabeyrnr8p6809bwlboro_stans.read;
                int iMin = (int) Math.min(j, resetcachelambda0.read - resetcachelambda0.IconCompatParcelizer);
                ((OutputStream) obj).write(resetcachelambda0.serializer, resetcachelambda0.IconCompatParcelizer, iMin);
                int i2 = resetcachelambda0.IconCompatParcelizer + iMin;
                resetcachelambda0.IconCompatParcelizer = i2;
                long j2 = iMin;
                j -= j2;
                r8lambdabeyrnr8p6809bwlboro_stans.serializer -= j2;
                if (i2 == resetcachelambda0.read) {
                    r8lambdabeyrnr8p6809bwlboro_stans.read = resetcachelambda0.IconCompatParcelizer();
                    getColorValue.IconCompatParcelizer(resetcachelambda0);
                }
            }
            return;
        }
        getConfigurationCache getconfigurationcache = (getConfigurationCache) obj;
        isInAppMessageAccessibilityExclusiveModeEnabled.IconCompatParcelizer(r8lambdabeyrnr8p6809bwlboro_stans.serializer, 0L, j);
        while (j > 0) {
            resetCachelambda0 resetcachelambda1 = r8lambdabeyrnr8p6809bwlboro_stans.read;
            long j3 = 0;
            while (j3 < 65536) {
                j3 += (long) (resetcachelambda1.read - resetcachelambda1.IconCompatParcelizer);
                if (j3 >= j) {
                    j3 = j;
                    break;
                }
                resetcachelambda1 = resetcachelambda1.RatingCompat;
            }
            getconfigurationcache.MediaMetadataCompat();
            try {
                try {
                    ((isSessionStartBasedTimeoutEnabled) obj2).serializer(r8lambdabeyrnr8p6809bwlboro_stans, j3);
                    j -= j3;
                    getconfigurationcache.RemoteActionCompatParcelizer(true);
                } catch (IOException e) {
                    if (!getconfigurationcache.RatingCompat()) {
                        throw e;
                    }
                    throw getconfigurationcache.write(e);
                }
            } catch (Throwable th) {
                getconfigurationcache.RemoteActionCompatParcelizer(false);
                throw th;
            }
        }
    }

    public final String toString() {
        if (this.IconCompatParcelizer != 0) {
            return "sink(" + ((OutputStream) this.serializer) + ")";
        }
        return "AsyncTimeout.sink(" + ((isSessionStartBasedTimeoutEnabled) this.write) + ")";
    }

    @Override // o.getConfigurationValue
    public final isPushDeepLinkBackStackActivityEnabled IconCompatParcelizer() {
        return this.IconCompatParcelizer != 0 ? (isPushDeepLinkBackStackActivityEnabled) this.write : (getConfigurationCache) this.serializer;
    }

    public isSessionStartBasedTimeoutEnabled(getConfigurationCache getconfigurationcache, isSessionStartBasedTimeoutEnabled issessionstartbasedtimeoutenabled) {
        this.serializer = getconfigurationcache;
        this.write = issessionstartbasedtimeoutenabled;
    }
}
