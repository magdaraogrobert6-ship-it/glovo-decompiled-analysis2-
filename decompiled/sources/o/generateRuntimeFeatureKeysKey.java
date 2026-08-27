package o;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class generateRuntimeFeatureKeysKey implements PrivateKey, java.security.Key {
    public transient deleteFeature IconCompatParcelizer;
    public transient provideMoshi write;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS+";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return accessgetColorcp.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.write).MediaMetadataCompat();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return accessbootstrapIfNeeded.read(this.IconCompatParcelizer.serializer());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof generateRuntimeFeatureKeysKey) {
            return Arrays.equals(this.IconCompatParcelizer.serializer(), ((generateRuntimeFeatureKeysKey) obj).IconCompatParcelizer.serializer());
        }
        return false;
    }
}
