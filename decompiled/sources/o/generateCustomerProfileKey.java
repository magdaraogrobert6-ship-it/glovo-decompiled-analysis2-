package o;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class generateCustomerProfileKey implements PublicKey, java.security.Key {
    public transient accessgetHoldoutsWithLock IconCompatParcelizer;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NTRU";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return getBlue0d7_KjU.write(this.IconCompatParcelizer).MediaMetadataCompat();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.IconCompatParcelizer.serializer));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof generateCustomerProfileKey) {
            return Arrays.equals(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.IconCompatParcelizer.serializer), accessbootstrapIfNeeded.RemoteActionCompatParcelizer(((generateCustomerProfileKey) obj).IconCompatParcelizer.serializer));
        }
        return false;
    }
}
