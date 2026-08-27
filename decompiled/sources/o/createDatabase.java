package o;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class createDatabase implements PrivateKey {
    public transient MemoryCachebootstrapInitialData1 RemoteActionCompatParcelizer;
    public transient provideMoshi read;
    public transient getNetworkModule serializer;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return accessgetColorcp.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.read).MediaMetadataCompat();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (accessbootstrapIfNeeded.read(this.RemoteActionCompatParcelizer.read()) * 37) + accessbootstrapIfNeeded.read(this.serializer.serializer);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof createDatabase)) {
            return false;
        }
        createDatabase createdatabase = (createDatabase) obj;
        return this.serializer.write(createdatabase.serializer) && Arrays.equals(this.RemoteActionCompatParcelizer.read(), createdatabase.RemoteActionCompatParcelizer.read());
    }
}
