package o;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCachesetEvaluations1 implements PrivateKey, java.security.Key {
    public transient accessmigrateHoldoutKeys RemoteActionCompatParcelizer;
    public transient provideMoshi write;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NTRU";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return accessgetColorcp.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.write).MediaMetadataCompat();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.serializer));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MemoryCachesetEvaluations1) {
            return Arrays.equals(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.serializer), accessbootstrapIfNeeded.RemoteActionCompatParcelizer(((MemoryCachesetEvaluations1) obj).RemoteActionCompatParcelizer.serializer));
        }
        return false;
    }
}
