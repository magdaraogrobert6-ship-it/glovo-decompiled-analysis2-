package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class r8lambda1XDFQ87DMU0Pr1CSBqiV4PdF6bM {
    public final String serializer;

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    public r8lambda1XDFQ87DMU0Pr1CSBqiV4PdF6bM(String str) {
        this.serializer = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r8lambda1XDFQ87DMU0Pr1CSBqiV4PdF6bM) && this.serializer.equals(((r8lambda1XDFQ87DMU0Pr1CSBqiV4PdF6bM) obj).serializer);
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("OpaqueKey(key="), this.serializer, ')');
    }
}
