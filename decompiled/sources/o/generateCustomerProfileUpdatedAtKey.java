package o;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class generateCustomerProfileUpdatedAtKey implements PrivateKey, java.security.Key {
    public transient provideMoshi IconCompatParcelizer;
    public transient migrateHoldoutKeys RemoteActionCompatParcelizer;
    public transient getNetworkModule serializer;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            migrateHoldoutKeys migrateholdoutkeys = this.RemoteActionCompatParcelizer;
            Object obj = migrateholdoutkeys.RemoteActionCompatParcelizer;
            return accessgetColorcp.RemoteActionCompatParcelizer(migrateholdoutkeys, this.IconCompatParcelizer).MediaMetadataCompat();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.IconCompatParcelizer)) * 37) + accessbootstrapIfNeeded.read(this.serializer.serializer);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof generateCustomerProfileUpdatedAtKey)) {
            return false;
        }
        generateCustomerProfileUpdatedAtKey generatecustomerprofileupdatedatkey = (generateCustomerProfileUpdatedAtKey) obj;
        return this.serializer.write(generatecustomerprofileupdatedatkey.serializer) && Arrays.equals(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.IconCompatParcelizer), accessbootstrapIfNeeded.RemoteActionCompatParcelizer(generatecustomerprofileupdatedatkey.RemoteActionCompatParcelizer.IconCompatParcelizer));
    }
}
