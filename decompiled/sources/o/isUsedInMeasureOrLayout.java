package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class isUsedInMeasureOrLayout extends accessgetPlaceOuterCoordinatorLayerBlockp {
    public final List IconCompatParcelizer;
    public final String write;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        String str = this.write;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public isUsedInMeasureOrLayout(List list, String str) {
        this.IconCompatParcelizer = list;
        this.write = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessgetPlaceOuterCoordinatorLayerBlockp)) {
            return false;
        }
        isUsedInMeasureOrLayout isusedinmeasureorlayout = (isUsedInMeasureOrLayout) ((accessgetPlaceOuterCoordinatorLayerBlockp) obj);
        if (!this.IconCompatParcelizer.equals(isusedinmeasureorlayout.IconCompatParcelizer)) {
            return false;
        }
        String str = isusedinmeasureorlayout.write;
        String str2 = this.write;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", orgId=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.write, "}");
    }
}
