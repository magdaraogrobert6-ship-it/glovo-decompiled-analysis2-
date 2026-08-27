package o;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class isSdkAuthenticationEnabled implements getResourceConfigurationValue {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int serializer = 0;
    public final /* synthetic */ Object write;

    public isSdkAuthenticationEnabled(isPushDeepLinkBackStackActivityEnabled ispushdeeplinkbackstackactivityenabled, InputStream inputStream) {
        this.IconCompatParcelizer = ispushdeeplinkbackstackactivityenabled;
        this.write = inputStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.serializer;
        Object obj = this.write;
        if (i != 0) {
            ((InputStream) obj).close();
            return;
        }
        getConfigurationCache getconfigurationcache = (getConfigurationCache) obj;
        getconfigurationcache.MediaMetadataCompat();
        try {
            try {
                ((isSdkAuthenticationEnabled) this.IconCompatParcelizer).close();
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

    @Override // o.getResourceConfigurationValue
    public final long read(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, long j) throws IOException {
        int i = this.serializer;
        Object obj = this.write;
        Object obj2 = this.IconCompatParcelizer;
        if (i == 0) {
            getConfigurationCache getconfigurationcache = (getConfigurationCache) obj;
            getconfigurationcache.MediaMetadataCompat();
            try {
                try {
                    long j2 = ((isSdkAuthenticationEnabled) obj2).read(r8lambdabeyrnr8p6809bwlboro_stans, 8192L);
                    getconfigurationcache.RemoteActionCompatParcelizer(true);
                    return j2;
                } catch (IOException e) {
                    if (getconfigurationcache.RatingCompat()) {
                        throw getconfigurationcache.write(e);
                    }
                    throw e;
                }
            } catch (Throwable th) {
                getconfigurationcache.RemoteActionCompatParcelizer(false);
                throw th;
            }
        }
        try {
            ((isPushDeepLinkBackStackActivityEnabled) obj2).RemoteActionCompatParcelizer();
            resetCachelambda0 resetcachelambda0IconCompatParcelizer = r8lambdabeyrnr8p6809bwlboro_stans.IconCompatParcelizer(1);
            int i2 = ((InputStream) obj).read(resetcachelambda0IconCompatParcelizer.serializer, resetcachelambda0IconCompatParcelizer.read, (int) Math.min(8192L, 8192 - resetcachelambda0IconCompatParcelizer.read));
            if (i2 == -1) {
                if (resetcachelambda0IconCompatParcelizer.IconCompatParcelizer == resetcachelambda0IconCompatParcelizer.read) {
                    r8lambdabeyrnr8p6809bwlboro_stans.read = resetcachelambda0IconCompatParcelizer.IconCompatParcelizer();
                    getColorValue.IconCompatParcelizer(resetcachelambda0IconCompatParcelizer);
                }
                return -1L;
            }
            resetcachelambda0IconCompatParcelizer.read += i2;
            long j3 = i2;
            r8lambdabeyrnr8p6809bwlboro_stans.serializer += j3;
            return j3;
        } catch (AssertionError e2) {
            if (e2.getCause() == null || e2.getMessage() == null || !e2.getMessage().contains("getsockname failed")) {
                throw e2;
            }
            throw new IOException(e2);
        }
    }

    public final String toString() {
        if (this.serializer != 0) {
            return "source(" + ((InputStream) this.write) + ")";
        }
        return "AsyncTimeout.source(" + ((isSdkAuthenticationEnabled) this.IconCompatParcelizer) + ")";
    }

    @Override // o.getResourceConfigurationValue
    public final isPushDeepLinkBackStackActivityEnabled IconCompatParcelizer() {
        return this.serializer != 0 ? (isPushDeepLinkBackStackActivityEnabled) this.IconCompatParcelizer : (getConfigurationCache) this.write;
    }

    public isSdkAuthenticationEnabled(getConfigurationCache getconfigurationcache, isSdkAuthenticationEnabled issdkauthenticationenabled) {
        this.write = getconfigurationcache;
        this.IconCompatParcelizer = issdkauthenticationenabled;
    }
}
