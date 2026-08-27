package o;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCachegetFeatures1 implements PrivateKey, java.security.Key {
    public transient provideMoshi RemoteActionCompatParcelizer;
    public transient FwFDataQueriesSelectItemQueryexecute1 read;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return evaluateFeaturefwf_client_releasedefault.IconCompatParcelizer(((selectItems) this.read.serializer).serializer);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return accessgetColorcp.RemoteActionCompatParcelizer(this.read, this.RemoteActionCompatParcelizer).MediaMetadataCompat();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.read.RemoteActionCompatParcelizer));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MemoryCachegetFeatures1) {
            return Arrays.equals(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.read.RemoteActionCompatParcelizer), accessbootstrapIfNeeded.RemoteActionCompatParcelizer(((MemoryCachegetFeatures1) obj).read.RemoteActionCompatParcelizer));
        }
        return false;
    }
}
