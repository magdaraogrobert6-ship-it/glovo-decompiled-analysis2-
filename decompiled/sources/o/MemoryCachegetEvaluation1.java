package o;

import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCachegetEvaluation1 implements PublicKey, java.security.Key {
    public transient byte[] IconCompatParcelizer;
    public transient String RemoteActionCompatParcelizer;
    public transient ChatService write;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MemoryCachegetEvaluation1) {
            return Arrays.equals(getEncoded(), ((MemoryCachegetEvaluation1) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = getTransparent0d7_KjUannotations.write(this.write);
        }
        return accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
    }

    public final int hashCode() {
        return accessbootstrapIfNeeded.read(getEncoded());
    }
}
