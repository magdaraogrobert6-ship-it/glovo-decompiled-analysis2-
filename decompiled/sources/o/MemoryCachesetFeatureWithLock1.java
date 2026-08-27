package o;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCachesetFeatureWithLock1 implements PublicKey, java.security.Key {
    public transient ICache serializer;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "LMS";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return getBlue0d7_KjU.write(this.serializer).MediaMetadataCompat();
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
            return accessbootstrapIfNeeded.read(this.serializer.MediaMetadataCompat());
        } catch (IOException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MemoryCachesetFeatureWithLock1)) {
            return false;
        }
        try {
            return Arrays.equals(this.serializer.MediaMetadataCompat(), ((MemoryCachesetFeatureWithLock1) obj).serializer.MediaMetadataCompat());
        } catch (IOException unused) {
            return false;
        }
    }
}
