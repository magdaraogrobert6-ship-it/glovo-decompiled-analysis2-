package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorPropertyScaleX {
    public final boolean IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final String read;
    public final boolean serializer;
    public final VectorPropertyPivotY write;

    public final int hashCode() {
        String str = this.read;
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.RemoteActionCompatParcelizer), 31, this.IconCompatParcelizer);
        VectorPropertyPivotY vectorPropertyPivotY = this.write;
        return Boolean.hashCode(this.serializer) + ((iM + (vectorPropertyPivotY != null ? vectorPropertyPivotY.hashCode() : 0)) * 31);
    }

    public VectorPropertyScaleX(String str, boolean z, boolean z2, VectorPropertyPivotY vectorPropertyPivotY, boolean z3) {
        this.read = str;
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = z2;
        this.write = vectorPropertyPivotY;
        this.serializer = z3;
    }

    public static VectorPropertyScaleX serializer(VectorPropertyScaleX vectorPropertyScaleX, String str, boolean z, boolean z2, VectorPropertyPivotY vectorPropertyPivotY, boolean z3, int i) {
        if ((i & 1) != 0) {
            str = vectorPropertyScaleX.read;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            z = vectorPropertyScaleX.RemoteActionCompatParcelizer;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = vectorPropertyScaleX.IconCompatParcelizer;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            vectorPropertyPivotY = vectorPropertyScaleX.write;
        }
        VectorPropertyPivotY vectorPropertyPivotY2 = vectorPropertyPivotY;
        if ((i & 16) != 0) {
            z3 = vectorPropertyScaleX.serializer;
        }
        vectorPropertyScaleX.getClass();
        return new VectorPropertyScaleX(str2, z4, z5, vectorPropertyPivotY2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VectorPropertyScaleX)) {
            return false;
        }
        VectorPropertyScaleX vectorPropertyScaleX = (VectorPropertyScaleX) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, vectorPropertyScaleX.read}, getCieXyz.write())).booleanValue() || this.RemoteActionCompatParcelizer != vectorPropertyScaleX.RemoteActionCompatParcelizer || this.IconCompatParcelizer != vectorPropertyScaleX.IconCompatParcelizer) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, vectorPropertyScaleX.write}, getCieXyz.write())).booleanValue() && this.serializer == vectorPropertyScaleX.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UiState(url=");
        sb.append(this.read);
        sb.append(", isBridgeInitialized=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", isLoading=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", error=");
        sb.append(this.write);
        sb.append(", isReloadRequest=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.serializer, ')');
    }

    public static VectorPropertyScaleX write() {
        return new VectorPropertyScaleX(null, false, true, null, false);
    }

    public /* synthetic */ VectorPropertyScaleX() {
        this(null, false, false, null, false);
    }
}
