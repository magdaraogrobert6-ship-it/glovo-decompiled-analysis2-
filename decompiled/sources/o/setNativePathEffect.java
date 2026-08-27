package o;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class setNativePathEffect {
    public final String RemoteActionCompatParcelizer;
    public final String read;

    static {
        new LinkedHashMap();
    }

    public final int hashCode() {
        return this.read.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
    }

    public final String toString() {
        return this.RemoteActionCompatParcelizer + ": " + this.read;
    }

    public setNativePathEffect(String str, String str2) {
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!setNativePathEffect.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        setNativePathEffect setnativepatheffect = (setNativePathEffect) obj;
        return this.RemoteActionCompatParcelizer.equals(setnativepatheffect.RemoteActionCompatParcelizer) && this.read.equals(setnativepatheffect.read);
    }
}
