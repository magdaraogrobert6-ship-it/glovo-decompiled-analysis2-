package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class getSlotIdAtIndex {
    public final String serializer;

    public final int hashCode() {
        return ((((this.serializer.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public getSlotIdAtIndex(String str) {
        this.serializer = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof getSlotIdAtIndex) && this.serializer.equals(((getSlotIdAtIndex) obj).serializer);
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m("MLKitLoggingOptions{libraryName=", this.serializer, ", enableFirelog=true, firelogEventType=1}");
    }
}
