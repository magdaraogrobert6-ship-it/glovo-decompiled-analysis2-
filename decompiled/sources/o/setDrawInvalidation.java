package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class setDrawInvalidation {
    public final String serializer;

    public final String read() {
        return this.serializer;
    }

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    public setDrawInvalidation(String str) {
        this.serializer = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setDrawInvalidation) && this.serializer.equals(((setDrawInvalidation) obj).serializer);
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("WebChatErrorMetadata(reason=null, error="), this.serializer, ')');
    }
}
