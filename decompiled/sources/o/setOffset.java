package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class setOffset {
    public static final setOffset write = new setOffset(null);
    public final String IconCompatParcelizer;

    public setOffset(String str) {
        this.IconCompatParcelizer = str;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("User(uid:"), this.IconCompatParcelizer, ")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || setOffset.class != obj.getClass()) {
            return false;
        }
        String str = ((setOffset) obj).IconCompatParcelizer;
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            return str2.equals(str);
        }
        return str == null;
    }
}
