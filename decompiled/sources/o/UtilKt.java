package o;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class UtilKt implements PublicKey, java.security.Key {
    public transient setInitialDataFeatures read;
    public transient getNetworkModule serializer;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            setInitialDataFeatures setinitialdatafeatures = this.read;
            Object obj = setinitialdatafeatures.RemoteActionCompatParcelizer;
            return getBlue0d7_KjU.write(setinitialdatafeatures).MediaMetadataCompat();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return (accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.read.IconCompatParcelizer)) * 37) + accessbootstrapIfNeeded.read(this.serializer.serializer);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UtilKt)) {
            return false;
        }
        UtilKt utilKt = (UtilKt) obj;
        return this.serializer.write(utilKt.serializer) && Arrays.equals(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.read.IconCompatParcelizer), accessbootstrapIfNeeded.RemoteActionCompatParcelizer(utilKt.read.IconCompatParcelizer));
    }
}
