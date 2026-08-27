package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCachegetFeature21 implements PrivateKey, java.security.Key {
    public transient provideMoshi IconCompatParcelizer;
    public transient String read;
    public transient byte[] serializer;
    public transient insertItem write;

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
        if (obj instanceof MemoryCachegetFeature21) {
            return Arrays.equals(getEncoded(), ((MemoryCachegetFeature21) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.serializer == null) {
            insertItem insertitem = this.write;
            provideMoshi providemoshi = this.IconCompatParcelizer;
            byte[] bArrMediaBrowserCompatMediaItem = null;
            if (!insertitem.read) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("public key found");
                return null;
            }
            try {
                bArrMediaBrowserCompatMediaItem = accessgetColorcp.RemoteActionCompatParcelizer(insertitem, providemoshi).MediaBrowserCompatMediaItem();
            } catch (Exception unused) {
            }
            this.serializer = bArrMediaBrowserCompatMediaItem;
        }
        return accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.serializer);
    }

    public final int hashCode() {
        return accessbootstrapIfNeeded.read(getEncoded());
    }
}
