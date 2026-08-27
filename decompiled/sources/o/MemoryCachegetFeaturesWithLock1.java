package o;

import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCachegetFeaturesWithLock1 implements PublicKey, java.security.Key {
    public transient byte[] read;
    public transient String serializer;
    public transient accesscreateArguments write;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.serializer;
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MemoryCachegetFeaturesWithLock1) {
            return Arrays.equals(getEncoded(), ((MemoryCachegetFeaturesWithLock1) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.read == null) {
            this.read = getTransparent0d7_KjUannotations.write(this.write);
        }
        return accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.read);
    }

    public final int hashCode() {
        return accessbootstrapIfNeeded.read(getEncoded());
    }
}
