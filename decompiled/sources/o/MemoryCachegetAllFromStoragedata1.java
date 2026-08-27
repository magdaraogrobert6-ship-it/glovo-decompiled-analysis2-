package o;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCachegetAllFromStoragedata1 implements PrivateKey, java.security.Key {
    public transient provideMoshi serializer;
    public transient FeatureInfo write;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return evaluateFeaturefwf_client_releasedefault.IconCompatParcelizer(((getUserFeatureFlags) this.write.RemoteActionCompatParcelizer).PlaybackStateCompatCustomAction);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return accessgetColorcp.RemoteActionCompatParcelizer(this.write, this.serializer).MediaMetadataCompat();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.write.IconCompatParcelizer));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MemoryCachegetAllFromStoragedata1) {
            return Arrays.equals(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.write.IconCompatParcelizer), accessbootstrapIfNeeded.RemoteActionCompatParcelizer(((MemoryCachegetAllFromStoragedata1) obj).write.IconCompatParcelizer));
        }
        return false;
    }
}
