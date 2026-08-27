package o;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCachegetEvaluations1 implements PublicKey, java.security.Key {
    public transient UserPropertiesCompanion serializer;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return evaluateFeaturefwf_client_releasedefault.IconCompatParcelizer(((Custom) this.serializer.serializer).IconCompatParcelizer);
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
        return accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.serializer.write));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MemoryCachegetEvaluations1) {
            return Arrays.equals(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.serializer.write), accessbootstrapIfNeeded.RemoteActionCompatParcelizer(((MemoryCachegetEvaluations1) obj).serializer.write));
        }
        return false;
    }
}
