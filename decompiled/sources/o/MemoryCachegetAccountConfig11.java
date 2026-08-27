package o;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCachegetAccountConfig11 implements PrivateKey, java.security.Key {
    public transient provideMoshi RemoteActionCompatParcelizer;
    public transient FWFRequestJsonAdapter read;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return evaluateFeaturefwf_client_releasedefault.IconCompatParcelizer(((Custom) this.read.serializer).IconCompatParcelizer);
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
        FWFRequestJsonAdapter fWFRequestJsonAdapter = this.read;
        return accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(fWFRequestJsonAdapter.RemoteActionCompatParcelizer, fWFRequestJsonAdapter.write, fWFRequestJsonAdapter.IconCompatParcelizer));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MemoryCachegetAccountConfig11)) {
            return false;
        }
        FWFRequestJsonAdapter fWFRequestJsonAdapter = this.read;
        byte[] bArrRemoteActionCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(fWFRequestJsonAdapter.RemoteActionCompatParcelizer, fWFRequestJsonAdapter.write, fWFRequestJsonAdapter.IconCompatParcelizer);
        FWFRequestJsonAdapter fWFRequestJsonAdapter2 = ((MemoryCachegetAccountConfig11) obj).read;
        return Arrays.equals(bArrRemoteActionCompatParcelizer, accessbootstrapIfNeeded.RemoteActionCompatParcelizer(fWFRequestJsonAdapter2.RemoteActionCompatParcelizer, fWFRequestJsonAdapter2.write, fWFRequestJsonAdapter2.IconCompatParcelizer));
    }
}
