package o;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class generateProfileAttributesKey implements PublicKey {
    public transient getNetworkModule read;
    public transient setProfileAttributesfwf_client_release serializer;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
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
        return (accessbootstrapIfNeeded.read(this.serializer.RemoteActionCompatParcelizer()) * 37) + accessbootstrapIfNeeded.read(this.read.serializer);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof generateProfileAttributesKey)) {
            return false;
        }
        generateProfileAttributesKey generateprofileattributeskey = (generateProfileAttributesKey) obj;
        return this.read.write(generateprofileattributeskey.read) && Arrays.equals(this.serializer.RemoteActionCompatParcelizer(), generateprofileattributeskey.serializer.RemoteActionCompatParcelizer());
    }
}
