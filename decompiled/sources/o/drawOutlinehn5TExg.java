package o;

import android.net.NetworkRequest;

/* JADX INFO: loaded from: classes.dex */
public final class drawOutlinehn5TExg {
    public static final String IconCompatParcelizer = setRotationX.IconCompatParcelizer("NetworkRequestCompat");
    public final Object read;

    public drawOutlinehn5TExg(NetworkRequest networkRequest) {
        this.read = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drawOutlinehn5TExg)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, ((drawOutlinehn5TExg) obj).read}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return IconCompatParcelizer.RemoteActionCompatParcelizer(new StringBuilder("NetworkRequestCompat(wrapped="), this.read, ')');
    }

    public final int hashCode() {
        Object obj = this.read;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
