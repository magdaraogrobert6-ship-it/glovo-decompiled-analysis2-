package o;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class generateFeaturesUpdatedAtKey implements PublicKey, java.security.Key {
    public transient setRuntimeFeatureKeys read;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS+-".concat(evaluateFeaturefwf_client_releasedefault.IconCompatParcelizer(((bootstrapInitialDatafwf_client_release) this.read.serializer).ensureViewModelStore));
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
        r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = this.read.RemoteActionCompatParcelizer;
        return accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.read((byte[]) r8lambda1mnczrzuv4owduwgkg6cjtsws.write, (byte[]) r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof generateFeaturesUpdatedAtKey)) {
            return false;
        }
        r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = this.read.RemoteActionCompatParcelizer;
        byte[] bArr = accessbootstrapIfNeeded.read((byte[]) r8lambda1mnczrzuv4owduwgkg6cjtsws.write, (byte[]) r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer);
        r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws2 = ((generateFeaturesUpdatedAtKey) obj).read.RemoteActionCompatParcelizer;
        return Arrays.equals(bArr, accessbootstrapIfNeeded.read((byte[]) r8lambda1mnczrzuv4owduwgkg6cjtsws2.write, (byte[]) r8lambda1mnczrzuv4owduwgkg6cjtsws2.IconCompatParcelizer));
    }
}
