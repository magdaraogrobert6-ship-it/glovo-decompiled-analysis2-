package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetRenderEffectjd {
    public final Uri serializer;
    public final boolean write;

    public final Uri RemoteActionCompatParcelizer() {
        return this.serializer;
    }

    public final boolean write() {
        return this.write;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.write) + (this.serializer.hashCode() * 31);
    }

    public accessgetRenderEffectjd(boolean z, Uri uri) {
        this.serializer = uri;
        this.write = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!accessgetRenderEffectjd.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        accessgetRenderEffectjd accessgetrendereffectjd = (accessgetRenderEffectjd) obj;
        return this.serializer.equals(accessgetrendereffectjd.serializer) && this.write == accessgetrendereffectjd.write;
    }
}
