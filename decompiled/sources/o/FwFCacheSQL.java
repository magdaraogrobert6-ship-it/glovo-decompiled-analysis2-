package o;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class FwFCacheSQL implements PublicKey {
    public transient MemoryCachedecodeHoldouts11 IconCompatParcelizer;
    public transient getNetworkModule read;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return getBlue0d7_KjU.write(this.IconCompatParcelizer).MediaMetadataCompat();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        try {
            return (accessbootstrapIfNeeded.read(this.IconCompatParcelizer.MediaMetadataCompat()) * 37) + accessbootstrapIfNeeded.read(this.read.serializer);
        } catch (IOException unused) {
            return accessbootstrapIfNeeded.read(this.read.serializer);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FwFCacheSQL)) {
            return false;
        }
        FwFCacheSQL fwFCacheSQL = (FwFCacheSQL) obj;
        try {
            return this.read.write(fwFCacheSQL.read) && Arrays.equals(this.IconCompatParcelizer.MediaMetadataCompat(), fwFCacheSQL.IconCompatParcelizer.MediaMetadataCompat());
        } catch (IOException unused) {
            return false;
        }
    }
}
