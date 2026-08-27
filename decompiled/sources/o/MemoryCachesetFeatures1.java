package o;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCachesetFeatures1 implements java.security.Key, PrivateKey {
    public transient provideMoshi RemoteActionCompatParcelizer;
    public transient accessgetFeatureWithLock read;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return accessgetColorcp.RemoteActionCompatParcelizer(this.read, this.RemoteActionCompatParcelizer).MediaMetadataCompat();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        short[] sArrIconCompatParcelizer = accessbootstrapIfNeeded.IconCompatParcelizer(this.read.write);
        if (sArrIconCompatParcelizer == null) {
            return 0;
        }
        int length = sArrIconCompatParcelizer.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ (sArrIconCompatParcelizer[length] & 255);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MemoryCachesetFeatures1) {
            return Arrays.equals(accessbootstrapIfNeeded.IconCompatParcelizer(this.read.write), accessbootstrapIfNeeded.IconCompatParcelizer(((MemoryCachesetFeatures1) obj).read.write));
        }
        return false;
    }
}
