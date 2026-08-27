package o;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCachegetCustomerProfile11 implements PublicKey, java.security.Key {
    public transient accessfetchUserFeatureFlags read;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return evaluateFeaturefwf_client_releasedefault.IconCompatParcelizer(((getUserFeatureFlags) this.read.RemoteActionCompatParcelizer).PlaybackStateCompatCustomAction);
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MemoryCachegetCustomerProfile11) {
            return Arrays.equals(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.read.serializer), accessbootstrapIfNeeded.RemoteActionCompatParcelizer(((MemoryCachegetCustomerProfile11) obj).read.serializer));
        }
        return false;
    }
}
