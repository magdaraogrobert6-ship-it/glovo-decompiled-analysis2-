package o;

import android.os.Process;
import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCachegetHoldoutsWithLock1 implements PublicKey, java.security.Key {
    public static int RemoteActionCompatParcelizer;
    public static int read;
    public transient FwFDataQueriesselectItem1 IconCompatParcelizer;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return evaluateFeaturefwf_client_releasedefault.IconCompatParcelizer(((selectItems) this.IconCompatParcelizer.serializer).serializer);
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
        return accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.IconCompatParcelizer.IconCompatParcelizer));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MemoryCachegetHoldoutsWithLock1) {
            return Arrays.equals(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.IconCompatParcelizer.IconCompatParcelizer), accessbootstrapIfNeeded.RemoteActionCompatParcelizer(((MemoryCachegetHoldoutsWithLock1) obj).IconCompatParcelizer.IconCompatParcelizer));
        }
        return false;
    }

    public static int write() {
        int i = RemoteActionCompatParcelizer;
        int i2 = i % 5528780;
        RemoteActionCompatParcelizer = i + 1;
        if (i2 != 0) {
            return read;
        }
        int iMyUid = Process.myUid();
        read = iMyUid;
        return iMyUid;
    }
}
