package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCachegetFeature1 implements PrivateKey, java.security.Key {
    public transient byte[] IconCompatParcelizer;
    public transient String read;
    public transient FwFDataQueries serializer;
    public transient provideMoshi write;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.read;
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MemoryCachegetFeature1) {
            return Arrays.equals(getEncoded(), ((MemoryCachegetFeature1) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.IconCompatParcelizer == null) {
            FwFDataQueries fwFDataQueries = this.serializer;
            provideMoshi providemoshi = this.write;
            byte[] bArrMediaBrowserCompatMediaItem = null;
            if (!fwFDataQueries.read) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("public key found");
                return null;
            }
            try {
                bArrMediaBrowserCompatMediaItem = accessgetColorcp.RemoteActionCompatParcelizer(fwFDataQueries, providemoshi).MediaBrowserCompatMediaItem();
            } catch (Exception unused) {
            }
            this.IconCompatParcelizer = bArrMediaBrowserCompatMediaItem;
        }
        return accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
    }

    public final int hashCode() {
        return accessbootstrapIfNeeded.read(getEncoded());
    }
}
