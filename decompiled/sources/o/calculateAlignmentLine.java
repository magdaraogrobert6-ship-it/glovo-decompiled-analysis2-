package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class calculateAlignmentLine extends replaceAll {
    public final int IconCompatParcelizer;
    public final HitTestResultSubList serializer;

    public calculateAlignmentLine(int i, HitTestResultSubList hitTestResultSubList) {
        this.IconCompatParcelizer = i;
        this.serializer = hitTestResultSubList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(this.serializer);
        sb.append(", ");
        return af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, "-byte key)", sb);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof calculateAlignmentLine)) {
            return false;
        }
        calculateAlignmentLine calculatealignmentline = (calculateAlignmentLine) obj;
        return calculatealignmentline.IconCompatParcelizer == this.IconCompatParcelizer && calculatealignmentline.serializer == this.serializer;
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        return Objects.hash(Integer.valueOf(i), this.serializer);
    }
}
