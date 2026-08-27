package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class measurePending extends accessgetPlaceOuterCoordinatorLayerp {
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String serializer;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        return ((((iHashCode ^ 1000003) * 1000003) ^ this.RemoteActionCompatParcelizer.hashCode()) * 1000003) ^ this.serializer.hashCode();
    }

    public measurePending(String str, String str2, String str3) {
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.serializer = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessgetPlaceOuterCoordinatorLayerp)) {
            return false;
        }
        measurePending measurepending = (measurePending) ((accessgetPlaceOuterCoordinatorLayerp) obj);
        return this.IconCompatParcelizer.equals(measurepending.IconCompatParcelizer) && this.RemoteActionCompatParcelizer.equals(measurepending.RemoteActionCompatParcelizer) && this.serializer.equals(measurepending.serializer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", libraryName=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", buildId=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.serializer, "}");
    }
}
