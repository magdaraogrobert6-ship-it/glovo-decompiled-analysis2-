package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCachesetEvaluation1 implements PrivateKey, java.security.Key {
    public transient ICache RemoteActionCompatParcelizer;
    public transient provideMoshi read;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "LMS";
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
        try {
            return accessbootstrapIfNeeded.read(this.RemoteActionCompatParcelizer.MediaMetadataCompat());
        } catch (IOException unused) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("unable to calculate hashCode");
            return 0;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MemoryCachesetEvaluation1)) {
            return false;
        }
        try {
            return Arrays.equals(this.RemoteActionCompatParcelizer.MediaMetadataCompat(), ((MemoryCachesetEvaluation1) obj).RemoteActionCompatParcelizer.MediaMetadataCompat());
        } catch (IOException unused) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("unable to perform equals");
            return false;
        }
    }
}
