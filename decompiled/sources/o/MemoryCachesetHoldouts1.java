package o;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCachesetHoldouts1 implements java.security.Key, PublicKey {
    public transient accessgetFeaturesWithLock read;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MemoryCachesetHoldouts1)) {
            return false;
        }
        return Arrays.equals(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.read.serializer), accessbootstrapIfNeeded.RemoteActionCompatParcelizer(((MemoryCachesetHoldouts1) obj).read.serializer));
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return getBlue0d7_KjU.write(this.read).MediaMetadataCompat();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.read.serializer));
    }
}
