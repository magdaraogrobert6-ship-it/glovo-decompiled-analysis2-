package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class ShadowCompanion implements copyqcb84PMdefault {
    public final int serializer;

    public final int hashCode() {
        return Integer.hashCode(this.serializer);
    }

    public final String toString() {
        return d$$ExternalSyntheticOutline0.m(this.serializer, "Pixels(px=", ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ShadowCompanion) {
            return this.serializer == ((ShadowCompanion) obj).serializer;
        }
        return false;
    }
}
