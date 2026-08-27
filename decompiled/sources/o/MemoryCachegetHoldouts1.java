package o;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCachegetHoldouts1 implements PrivateKey, java.security.Key {
    public transient provideMoshi read;
    public transient String serializer;
    public transient FwFCacheItem write;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.serializer;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return accessgetColorcp.RemoteActionCompatParcelizer(this.write, this.read).MediaMetadataCompat();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MemoryCachegetHoldouts1) {
            return Arrays.equals(getEncoded(), ((MemoryCachegetHoldouts1) obj).getEncoded());
        }
        return false;
    }

    public final int hashCode() {
        return accessbootstrapIfNeeded.read(getEncoded());
    }
}
