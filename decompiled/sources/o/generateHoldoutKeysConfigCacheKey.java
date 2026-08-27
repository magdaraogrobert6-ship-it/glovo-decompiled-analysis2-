package o;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class generateHoldoutKeysConfigCacheKey implements PrivateKey {
    public transient provideMoshi IconCompatParcelizer;
    public transient getNetworkModule serializer;
    public transient setFeatures write;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return accessgetColorcp.RemoteActionCompatParcelizer(this.write, this.IconCompatParcelizer).MediaMetadataCompat();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (accessbootstrapIfNeeded.read(this.write.serializer()) * 37) + accessbootstrapIfNeeded.read(this.serializer.serializer);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof generateHoldoutKeysConfigCacheKey)) {
            return false;
        }
        generateHoldoutKeysConfigCacheKey generateholdoutkeysconfigcachekey = (generateHoldoutKeysConfigCacheKey) obj;
        return this.serializer.write(generateholdoutkeysconfigcachekey.serializer) && Arrays.equals(this.write.serializer(), generateholdoutkeysconfigcachekey.write.serializer());
    }
}
