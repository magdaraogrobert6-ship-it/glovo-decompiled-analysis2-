package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorPropertyFill extends VectorPainterKtRenderVectorGroupconfig2 {
    public final String read;

    public final int hashCode() {
        return this.read.hashCode();
    }

    public VectorPropertyFill(String str) {
        this.read = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VectorPropertyFill) && this.read.equals(((VectorPropertyFill) obj).read);
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("HostMessage(serializedMessage="), this.read, ')');
    }
}
