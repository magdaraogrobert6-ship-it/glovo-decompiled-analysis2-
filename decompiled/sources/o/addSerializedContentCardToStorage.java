package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class addSerializedContentCardToStorage implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Boolean write;

    public final int hashCode() {
        return (this.write.hashCode() ^ 16777619) * (-2128831035);
    }

    public addSerializedContentCardToStorage(applyPendingRuntimeConfiguration applypendingruntimeconfiguration) {
        this.write = applypendingruntimeconfiguration.read;
    }

    public final String toString() {
        return c8$$ExternalSyntheticOutline0.m(new StringBuilder("ActivityRecognitionPermissionEvent{granted="), "}", this.write);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof addSerializedContentCardToStorage)) {
            return false;
        }
        Object obj2 = ((addSerializedContentCardToStorage) obj).write;
        Boolean bool = this.write;
        return bool == obj2 || bool.equals(obj2);
    }
}
