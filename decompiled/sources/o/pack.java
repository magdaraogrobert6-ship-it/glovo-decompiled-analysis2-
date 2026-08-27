package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class pack extends getPowersOfTen {
    public final String read;

    public pack(String str) {
        super(str, " ");
        this.read = str;
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pack) && this.read.equals(((pack) obj).read);
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m("DefaultScreen(defaultName=", this.read, ")");
    }
}
