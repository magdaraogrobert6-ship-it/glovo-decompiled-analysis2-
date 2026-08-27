package o;

import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCachegetHoldoutKeys11 implements PublicKey, java.security.Key {
    public transient String IconCompatParcelizer;
    public transient byte[] read;
    public transient accessgetDriver serializer;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.IconCompatParcelizer;
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MemoryCachegetHoldoutKeys11) {
            return Arrays.equals(getEncoded(), ((MemoryCachegetHoldoutKeys11) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.read == null) {
            this.read = getTransparent0d7_KjUannotations.write(this.serializer);
        }
        return accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.read);
    }

    public final int hashCode() {
        return accessbootstrapIfNeeded.read(getEncoded());
    }
}
